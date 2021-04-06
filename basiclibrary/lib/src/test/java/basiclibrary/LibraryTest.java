/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static basiclibrary.Library.calculateAveragesOfWeeklyLowestMonthTemperature;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    //roll dice test
    @Test public void testRolledDice() {
        int numberOfRolls=20;
        System.out.println(Library.roll(numberOfRolls));
        assertEquals("The Dice is rolled "+ numberOfRolls+" time/s" , numberOfRolls , Library.roll(numberOfRolls).size());
    }
    //contains Duplicates test
    @Test public void containsDuplicates(){
        int[] testMe = {0,1,5,3,3};
        int[] testMe2 = {0,1,5,3};
       // System.out.println(Library.containsDuplicates(testMe));
        assertEquals("expects true, false is giving " ,true,Library.containsDuplicates(testMe));
       // System.out.println(Library.containsDuplicates(testMe2));
        assertEquals("expects false, true is giving " ,false ,Library.containsDuplicates(testMe2));
    }
    //calculate Averages test
    @Test public void calculateAverages() {
        int[] calculateTheAverageOfMe = {0, 1, 5, 3, 3};//2.4
        double EPSILON = 1e-1;

       System.out.println(Library.calculateAverages(calculateTheAverageOfMe));

        assertEquals(2.4  ,Library.calculateAverages(calculateTheAverageOfMe), EPSILON);

    }
    //calculate Averages Of WeeklyLowest Temperature test
    @Test public void calculateAveragesOfWeeklyLowestTemperature() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 52}
        };
        int[] expect ={65, 56, 55, 52, 55, 62, 52};
    assertArrayEquals("expects {65, 56, 55, 52, 55, 62, 52}" ,expect
            ,Library.calculateAveragesOfWeeklyLowestMonthTemperature(weeklyMonthTemperatures));

    }

    @Test public void analyzingWeatherData() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String expected="High: 72\n" + "Low: 51\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69\n";
        Library.analyzingWeatherData(weeklyMonthTemperatures);
        assertEquals("what happend",expected, Library.analyzingWeatherData(weeklyMonthTemperatures));
    }

    @Test public void tally() {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = Library.tally(votes);
        String expected="Bush";
        System.out.println(winner + " received the most votes!");
        assertEquals("Bush received the most votes!",expected,Library.tally(votes));
    }


}

package inheritance;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class Theater implements ReviewInterface{

    private String name;




    private LinkedList<Review> allReviews = new LinkedList<>();
    private LinkedList<String> allMovies = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        public String getMovies() {
        return Arrays.toString(this.allMovies.toArray());
    }

    public void setMovie(String movie) {
        this.allMovies.add(movie);
    }
    //constructor
    public Theater(String name) {
        setName(name);

    }


    @Override
    public void addReview (Review review){
        review.setName(this.getName());
        this.allReviews.add(review);
    }


    public boolean removeMovie (String movie){

        if(allMovies.size() == 0) {
            System.out.println("There are no movies Today");
            return false;
        } else {
            this.allMovies.remove(movie);
            return true;
        }

    }

    public String toString() {
        return String.format(
                "The Movies are %s in Theater %s",
                this.getMovies(), this.getName());
    }
}

   // JNI error has occurred, please check your installation and try again

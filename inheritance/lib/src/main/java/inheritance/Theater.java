package inheritance;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class Theater implements ReviewInterface{

    private String name;
    private LinkedList<Review> allTheaterReviews = new LinkedList<>();
    private LinkedList<Review> allMoviesReviews = new LinkedList<>();
    private LinkedList<String> allMovies = new LinkedList<>();

    //constructor
    public Theater(String name) {
        setName(name);
    }
    //add movie
    public void addMovie(String movie) {
        this.allMovies.add(movie);
    }

    //remove movie
    public boolean removeMovie (String movie){
        if(allMovies.size() == 0) {
            System.out.println("There are no movies Today");
            return false;
        } else {
            this.allMovies.remove(movie);
            return true;
        }

    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getMovies() {
        return Arrays.toString(this.allMovies.toArray());
    }



@Override
    public void addReview (Review review ){
        review.setName(this.getName());
        this.allTheaterReviews.add(review);
    }




    public boolean addReview (Review review ,String movieName){
        if(allMovies.contains(movieName)) {
            review.setName(movieName);
            this.allMoviesReviews.add(review);
            return true;
        }else{
            System.out.println("The reviewed movie does not exists in "+ this.getName());
            return false;
        }
    }


    

    public String toString() {
        return String.format(
                "The Movies are %s in Theater %s and the reviewed movies are %s",
                this.getMovies(), this.getName(), allMoviesReviews);
    }


}



package inheritance;

import java.util.LinkedList;

public class Restaurant implements ReviewInterface {
    // Instance Variables
    private String name;
    private double starsRating;
    private double totalRating=0;
    private double avgRating=0;
    private LinkedList<Review> allReviews = new LinkedList<>();


    // Constructor
    public Restaurant (String name, double starRating) {
        setName(name);
        setStarsRating(starRating);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStarsRating() {

        return starsRating;
    }

    public void setStarsRating(double starsRating) {
        if (starsRating > 5.0 || starsRating < 0.0 )
            throw new IllegalArgumentException(" Your Rating have must be between 0 & 5");
        this.starsRating = starsRating;
    }

    @Override
    public void addReview (Review review){
        review.setName(this.getName());
        this.allReviews.add(review);
        this.totalRating+=review.getStarsRating();
        this.avgRating=totalRating/allReviews.size();
        setStarsRating(avgRating);
    }


    public String toString() {
        return String.format(
                "The restaurant %s has an average rate of  %s stars",
                this.getName(), this.getStarsRating());
    }
}

package inheritance;

import java.util.LinkedList;

public class Shop implements ReviewInterface {

    private String  name;
    private String description;
    private int numOfDollerSign;

    private LinkedList<Review> allReviews = new LinkedList<>();

    Shop(String  name, String description,int numOfDollerSign){
        setName(name);
        setDescription(description);
        setNumOfDollerSign(numOfDollerSign);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumOfDollerSign() {
        return numOfDollerSign;
    }

    public void setNumOfDollerSign(int numOfDollerSign) {
        this.numOfDollerSign = numOfDollerSign;
    }

    @Override
    public void addReview (Review review){
        review.setName(this.getName());
        this.allReviews.add(review);


    }
    public String toString() {
        return String.format(
                "The shop %s is %s with a price scale of %s.",
                this.getName(), this.getDescription(),this.getNumOfDollerSign());
    }
}

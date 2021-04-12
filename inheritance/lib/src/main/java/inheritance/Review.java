package inheritance;

public class Review {

    // Instance Variables
    private String body;
    private String author;
    private String name;
    private double starsRating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getStarsRating() {
        return starsRating;
    }

    public void setStarsRating(double starsRating) {
        if (starsRating > (double) 5.0 || starsRating < (double) 0.0 )
            throw new IllegalArgumentException(" Your Rating  must be between 0 & 5");
        this.starsRating = starsRating;
    }



    // Constructor
    public Review (String body, String Author, double starRating) {

        setAuthor(Author);
        setBody(body);
        setStarsRating(starRating);

    }


    public String toString() {
        return String.format(
                "Author %s has reviewed %s with %s stars and said: %s",
                this.getAuthor(),this.getName(),this.getStarsRating(),this.getBody());
    }
}

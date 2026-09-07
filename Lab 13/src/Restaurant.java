
public class Restaurant {
	 // Private instance variables
    private String name;
    private String location;
    private String phoneNumber;
    private double rating;

    // --- Constructor ---
    public Restaurant() {
    	name = "N/A";
    	location = "N/A";
    	phoneNumber = "N/A";
    	rating = 0;
    }
    
    // --- Setters ---
    // Sets the restaurant's name
    public void setName(String name) {
        this.name = name;
    }

    // Sets the restaurant's location
    public void setLocation(String location) {
        this.location = location;
    }

    // Sets the restaurant's phone number
    public void setPhoneNumber(String phoneNumber) {
    	this.phoneNumber = phoneNumber;
    }

    // Sets the restaurant's rating
    public void setRating(double rating) {
    	this.rating = rating;
    }

    // --- Getters ---
    // Gets the restaurant's name
    public String getName() {
        return name;
    }

    // Gets the restaurant's location
    public String getLocation() {
    	return location;
    }

    // Gets the restaurant's phone number
    public String getPhoneNumber() {
    	return phoneNumber;
    }

    // Gets the restaurant's rating
    public double getRating() {
    	return rating;
    }
}

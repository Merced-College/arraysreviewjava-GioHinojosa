// Course.java checking the Name of course, number of credits and if course is required
public class Course {

    private String courseName; //Name of Course
    private int credits; //Number of credit
    private boolean required; //If the course is required

    public Course() {
        courseName = "Unknown Course"; // Default course name
        credits = 0; // Default credits
        required = false; // Default requirement status
    }

    public Course(String courseName, int credits, boolean required) {
        this.courseName = courseName; // Assigns the course name
        this.credits = credits; // Assigns the number of credits
        this.required = required; // Assigns required status
    }

    public String getCourseName() {
        return courseName; 
        // Getter for courseName
        // Returns the current value of courseName
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName; 
        // Setter for courseName
        // Updates the course name
    }

    public int getCredits() {
        return credits; 
        // Getter for credits
        // Returns the number of credits
    }

    public void setCredits(int credits) {
        if (credits >= 0) {  // Validation check
            this.credits = credits; 
            // Setter for credits
            // Rule enforced: credits can't be negative
        }
    }

    public boolean isRequired() {
        return required; 
        // Getter for required
        // Returns whether the course is required
    }

    public void setRequired(boolean required) {
        this.required = required; 
        // Setter for required
        // Updates whether the course is required
    }

    @Override
    public String toString() {
        return "Course{name= '"+ courseName +"', credits=" + credits + ", required=" + required + "}";
    }
}

public class Student {
    int rating;
    private String name;
    static int countOfStudent;
    static int summaryRating;

    // TODO implement Student class according to the instructions providede in the README.md file

    public Student(String name) {
        this.name = name;
        countOfStudent++;
    }

    public static double getAvgRating() {
        // TODO return average rating of all students
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // TODO set student's name
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
        summaryRating = summaryRating + rating;
        // TODO initialize rating;
    }

    public boolean betterStudent(Student student) {
        // TODO return the result of comparing this.student's rating with student's rating
        return false;
    }

    public void changeRating(int rating) {
        // TODO change this student's rating and average raiting of all students
    }

    public static void removeStudent(Student student) {
        // TODO remove student = count - rating from allRating
    }

    @Override
    public String toString() {
        // TODO return String with name and rating of this student
        return "";
    }
}
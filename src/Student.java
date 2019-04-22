public class Student {
    private int rating;
    private String name;
    static int countOfStudent;
    static double summaryRating;

    // TODO implement Student class according to the instructions providede in the README.md file

    public Student(String name) {
        this.name = name;
        countOfStudent++;
    }

    public static double getAvgRating() {
        // TODO return average rating of all students
        if (countOfStudent > 0) {
            return summaryRating / countOfStudent;
        } else return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // TODO set student's name
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        // TODO initialize rating
        this.rating = rating;
        summaryRating = summaryRating + this.rating;
    }


    public boolean betterStudent(Student student) {
        // TODO return the result of comparing this.student's rating with student's rating
        return getRating() > student.getRating();
        //return this.rating > student.rating;
    }

    public void changeRating(int rating) {
        // TODO change this student's rating and average raiting of all students
        double a = getRating();
        summaryRating = summaryRating - a;
        this.setRating(rating);
    }

    public static void removeStudent(Student student) {
        // TODO remove student = count - rating from summaryRating
        countOfStudent--;
        summaryRating = summaryRating - student.rating;
        getAvgRating();
    }

    @Override
    public String toString() {
        // TODO return String with name and rating of this student
        return "name and rating: " + getName() + getRating();
    }
}
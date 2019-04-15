public class Student {
    private int rating;
    private String name;
    static int countOfStudent;
    static double summaryRating;

    // TODO implement Student class according to the instructions providede in the README.md file - done

    public Student(String name) {
        this.name = name;
        countOfStudent++;
    }

    public static double getAvgRating() {
        // TODO return average rating of all students - done
        if (countOfStudent > 0){
            return summaryRating / countOfStudent;
        }
        else return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // TODO set student's name - done
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
        summaryRating = summaryRating + this.rating;
        // TODO initialize rating; - done
    }


    public boolean betterStudent(Student student) {
        if (this.rating > student.rating) {
          return true;
        }
        // TODO return the result of comparing this.student's rating with student's rating - done
        else return false;
    }

    public void changeRating(int rating) {
        double a = getRating();
        summaryRating = summaryRating - a;
        this.setRating(rating);
        // TODO change this student's rating and average raiting of all students
    }

    public static void removeStudent(Student student) {
        // TODO remove student = count - rating from summaryRating
        countOfStudent--;
        student.summaryRating = student.summaryRating - student.rating;
        getAvgRating();
    }

    @Override
    public String toString() {
        // TODO return String with name and rating of this student
        return "name and rating: " + getName() + getRating();
    }
}
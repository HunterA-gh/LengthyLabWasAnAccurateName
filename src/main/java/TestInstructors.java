import java.util.Arrays;

public class TestInstructors {


    public static void main(String[] args) {

        Instructors cohort9Instructor = Instructors.getInstance();
        System.out.println(cohort9Instructor);
        System.out.println(Arrays.toString(cohort9Instructor.toArray()));

    }
}
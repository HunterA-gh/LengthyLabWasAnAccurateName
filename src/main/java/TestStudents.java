import java.util.Arrays;

public class TestStudents {

    public static void main(String[] args) {

        Students cohort9 = Students.getInstance();
        System.out.println(Arrays.toString(cohort9.toArray()));

    }
}

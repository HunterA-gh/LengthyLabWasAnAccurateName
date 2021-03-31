public class TestYearUpWilmington {


    public static void main(String[] args) {
        Students s = YearUpWilmington.getInstanceOfStudents();
        Instructors i = YearUpWilmington.getInstanceOfInstructors();


        System.out.println(i.findByID(1000000).getName() + " did some teaching..." );
        testHostLecture();
        YearUpWilmington.getStudyMap().forEach((key, value) -> System.out.println(key + " learned for " + value + " hours. "));

        System.out.println(Educator.JAVAINSTRUCTOR.getInstructor().getName() + " did some more teaching..." );
        YearUpWilmington.hostLecture(Educator.JAVAINSTRUCTOR, 50);
        YearUpWilmington.getStudyMap().forEach((key, value) -> System.out.println(key + " learned for " + value + " hours. "));

    }

    static void testHostLecture(){
        YearUpWilmington.hostLecture(1000000, 62);
    }
}

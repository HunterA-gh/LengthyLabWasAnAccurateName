public class TestEducator {



    public static void main(String[] args) {
        Educator e = Educator.JAVAINSTRUCTOR;
        System.out.println(e instanceof Teacher);

        Student s = (Student)Students.getInstance().findByID(1000001);

        testTeach(e, s, 5);

        testLecture(e, Students.getInstance().toArray(), 44);



    }

    static void testTeach(Educator e, Student s, double hoursTaught){
        e.teach(s, hoursTaught);
        System.out.println(s.getName() + " has learned for " + s.getTotalStudyTime() + " hours.");
    }

    static void testLecture(Educator e, Student[] s, double hoursLectured){
        e.lecture(s, hoursLectured);

        for(int x = 0; x < s.length; x++){
            System.out.println(s[x].getName() + " has learned for " + s[x].getTotalStudyTime() + " hours.");
        }
    }
}

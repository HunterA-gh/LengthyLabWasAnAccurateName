public class TestInstructor {


    public static void main(String[] args) {
        Student s1 = new Student(1232324, "John");
        Instructor i1 = new Instructor(12312389, "Bob");
        System.out.println(i1 instanceof Teacher);
        System.out.println(i1 instanceof Person);

        testTeach(i1, s1, 7);

        Student s2 = new Student(5674747, "Kate");
        Student[] sArr = {s1, s2};

        testLecture(i1, sArr, 16);

    }

    static void testTeach(Instructor i, Student s, double hoursTaught){
        i.teach(s, hoursTaught);
        System.out.println(s.getName() + " has learned for " + s.getTotalStudyTime() + " hours.");
    }

    static void testLecture(Instructor i, Student[] s, double hoursLectured){
        i.lecture(s, hoursLectured);

        for(int x = 0; x < s.length; x++){
            System.out.println(s[x].getName() + " has learned for " + s[x].getTotalStudyTime() + " hours.");
        }
    }
}

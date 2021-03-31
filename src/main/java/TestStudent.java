public class TestStudent {

    public static void main(String[] args) {
        Student s1 = new Student(124213890, "John");
        System.out.println(s1 instanceof Learner);
        System.out.println(s1 instanceof Person);
        s1.learn(10);
        System.out.println(s1.getName() + " has learned for " + s1.getTotalStudyTime() + " hours.");

    }
}

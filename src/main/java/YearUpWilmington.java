import java.util.HashMap;

public final class YearUpWilmington extends People{
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();

    public static void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public static void hostLecture(long ID, double numberOfHours) {
        hostLecture((Instructor)instructors.findByID(ID), numberOfHours);

    }

    public static HashMap getStudyMap(){
        HashMap<String, Double> studentsAndHours = new HashMap<String, Double>();
        for(Student s : students.toArray()){
            studentsAndHours.put(s.getName(), s.getTotalStudyTime());

        }
        return studentsAndHours;
    }

    public static Instructors getInstanceOfInstructors(){
        return instructors;
    }
    public static Students getInstanceOfStudents(){
        return students;
    }

    @Override
    public Person[] toArray() {
        return null;
    }
}

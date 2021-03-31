public class Student extends Person implements Learner{
    private double totalStudyTime;

    public Student(long personsID, String personsName) {
        super(personsID, personsName);
    }

    @Override
    public void learn(double numberOfHours){
        totalStudyTime += numberOfHours;
    };

    @Override
    public double getTotalStudyTime(){
        return this.totalStudyTime;
    };
}

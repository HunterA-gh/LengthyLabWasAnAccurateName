public enum Educator implements Teacher{
   JAVAINSTRUCTOR(new Instructor(1000000, "Mikaila"), 0);

   private final Instructor instructor;
   private double timeWorked;

    Educator(Instructor instructor, double timeWorked) {
        this.instructor = instructor;
        this.timeWorked = timeWorked;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner, numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        this.instructor.lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;
    }
}

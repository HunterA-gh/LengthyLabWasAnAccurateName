public final class Instructors extends People<Instructor>{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        this.addPerson(Educator.JAVAINSTRUCTOR.getInstructor());
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        Instructor[] instrArray = new Instructor[INSTANCE.count()];
        int j = 0;
        for(Instructor i : INSTANCE){
            instrArray[j] = i;
            j++;
        }
        return instrArray;
    }
}

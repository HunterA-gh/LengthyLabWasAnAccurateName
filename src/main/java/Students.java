public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students() {
        this.addPerson(new Student(1000001, "Michael"));
        this.addPerson(new Student(1000002, "Myles"));
        this.addPerson(new Student(1000003, "Dawar"));
        this.addPerson(new Student(1000004, "Jared"));
        this.addPerson(new Student(1000005, "Jonathin"));
        this.addPerson(new Student(1000006, "Hunter"));
        this.addPerson(new Student(1000007, "Mekhi"));
        this.addPerson(new Student(1000008, "Kam"));
        this.addPerson(new Student(1000009, "Caesar"));
        this.addPerson(new Student(1000010, "Juliana"));
    }


    public static Students getInstance() {
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        Student[] studentArray = new Student[INSTANCE.count()];
        int i = 0;
        for(Student s : INSTANCE){
            studentArray[i] = s;
            i++;
        }
        return studentArray;
    }

}


public class Person {
    private final long ID;
    private String name;

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(long personsID, String personsName){
        this.ID = personsID;
        this.name = personsName;
    }


}

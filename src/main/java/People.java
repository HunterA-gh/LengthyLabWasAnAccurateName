import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <E extends Person> implements Iterable<E>{
    private List<E> personList = new ArrayList<E>();

    public void addPerson(E p){
        this.personList.add(p);
    }

    public Person findByID(long ID) {
        for (E p : this.personList) {
            if (p.getID() == ID) {
                return p;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        return this.personList.contains(person);
    }

    public void remove(Person p){
        this.personList.remove(p);
    }

    public void remove(long ID){
        this.personList.removeIf(p -> p.getID() == ID);
    }

    public void removeAll(){
        this.personList.clear();
    }

    public int count(){
        return this.personList.size();
    }

    public abstract E[] toArray();


    public Iterator<E> iterator(){
        return this.personList.iterator();
    }


}

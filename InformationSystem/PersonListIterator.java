package InformationSystem;

import java.util.Iterator;
import java.util.List;

public class PersonListIterator implements Iterator<Person> {
    private int counter;
    private final List<Person> itemList;

    public PersonListIterator(List<Person> itemList) {
        this.counter = 0;
        this.itemList = itemList;
    }

    @Override
    public boolean hasNext() {
        return counter < itemList.size();
    }

    @Override
    public Person next() {
        if (!hasNext()) {
            return null;
        }
        return itemList.get(counter++);
    }
}

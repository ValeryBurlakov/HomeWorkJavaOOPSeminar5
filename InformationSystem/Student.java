package InformationSystem;


public class Student extends Person {
    private final Integer average;

    Student(String name, String lastName, Integer average) {
        super(name, lastName);
        this.average = average;
    }

    public Integer getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return String.format("Средний балл: %d %s", average, super.toString());
    }

}

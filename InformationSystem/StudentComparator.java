package InformationSystem;

import java.util.Comparator;

public class StudentComparator implements Comparator<Person> {
    public int compare(Person human, Person anotherHuman) {
        if (human instanceof Student && anotherHuman instanceof Student) {
            Student student = (Student) human;
            Student anotherStudent = (Student) anotherHuman;
            if (student.getAverage() > anotherStudent.getAverage())
                return -1;
            if (student.getAverage() < anotherStudent.getAverage())
                return 1;
            if (student.getLastName().length() > anotherStudent.getLastName().length())
                return -1;
            if (student.getLastName().length() < anotherStudent.getLastName().length())
                return 1;
        }
        return 0; // IlligalArgumentException...
    }
}
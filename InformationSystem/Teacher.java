package InformationSystem;

import java.util.HashSet;
import java.util.Set;

public class Teacher extends Person {
    private final Set<StudentGroup> studentGroupList = new HashSet<>();

    public Teacher(String name, String lastName) {
        super(name, lastName);
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        studentGroupList.add(studentGroup);
    }

    public void removeStudentGroup(StudentGroup studentGroup) {
        studentGroupList.remove(studentGroup);
    }

    public Set<StudentGroup> getStudentGroupSet() {
        return studentGroupList;
    }

    @Override
    public String toString() {
        return String.format("%s, студентов: %d", super.toString(), studentGroupList.size());
    }

}

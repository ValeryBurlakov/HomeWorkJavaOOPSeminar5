package InformationSystem;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Person> {
    public int compare(Person human, Person anotherHuman) {
        if (human instanceof Teacher && anotherHuman instanceof Teacher) {
            Teacher teacher = (Teacher) human;
            Teacher anotherTeacher = (Teacher) anotherHuman;
            return teacher.getStudentGroupSet().size() > anotherTeacher.getStudentGroupSet().size() ? -1
                    : (teacher.getStudentGroupSet().size() < anotherTeacher.getStudentGroupSet().size() ? 1 : 0);
        }
        return 0; // IlligalArgumentException
    }
}

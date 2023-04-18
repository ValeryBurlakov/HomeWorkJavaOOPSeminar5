package InformationSystem;


import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Иван", "Петров");
        Teacher teacher2 = new Teacher("Семен", "Сидоров");
        Teacher teacher3 = new Teacher("Дима", "Васин");
        Teacher teacher4 = new Teacher("Степан", "Лучников");

        StudentGroup studentGroup01 = new StudentGroup("Группа1", 0, teacher1);
        StudentGroup studentGroup02 = new StudentGroup("Группа2", 1, teacher2);
        StudentGroup studentGroup03 = new StudentGroup("Группа3", 2, teacher3);
        StudentGroup studentGroup04 = new StudentGroup("Группа4", 3, teacher4);
        StudentGroup studentGroup05 = new StudentGroup("Группа5", 4, teacher4);
        StudentGroup studentGroup06 = new StudentGroup("Группа6", 5, teacher4);
        StudentGroup studentGroup07 = new StudentGroup("Группа7", 6, teacher3);

        List<Person> students = new ArrayList<>();
        students.add(new Student("Витя", "Пупкин", 3));
        students.add(new Student("Валерия", "Лесова", 2));
        students.add(new Student("Олег", "Путин", 3));
        students.add(new Student("Константин", "Зайченко", 4));
        students.add(new Student("Дмитрий", "Честнов", 5));
        students.add(new Student("Светлана", "Лобода", 4));

        students.sort(new StudentComparator());
        PersonListIterator studentListIter = new PersonListIterator(students);
        while (studentListIter.hasNext()) {
            System.out.println(studentListIter.next());
        }

        List<Person> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);

        teachers.sort(new TeacherComparator());
        PersonListIterator teacherListIter = new PersonListIterator(teachers);
        while (teacherListIter.hasNext()) {
            System.out.println(teacherListIter.next());
        }

    }
}

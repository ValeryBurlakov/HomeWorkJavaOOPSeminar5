package InformationSystem;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private final String groupName;
    private final Integer groupId;
    private final List<Student> studentList = new ArrayList<>();
    private Teacher teacher;

    StudentGroup(String groupName, Integer groupId, Teacher teacher) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.teacher = teacher;
        teacher.addStudentGroup(this);
    }

    public void addStudent(Student student) {
        if (!studentList.contains(student)) {
            studentList.add(student);
        }
    }

    public void setTeacher(Teacher teacher) {
        if (this.teacher != null) {
            this.teacher.removeStudentGroup(this);
        }
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof StudentGroup && ((StudentGroup) obj).groupId.equals(groupId);
    }

    @Override
    public String toString() {
        return String.format("Группа: %s Номер: %d Преподаватель: %s", groupName, groupId, teacher);
    }
}

package povtor.stream.lesson;

import java.util.ArrayList;
import java.util.List;

public class TaskSeven {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 7.4);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathmatics");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOfFaculty().stream())
                .forEach(el-> System.out.println(el.getName()));

    }
}
class Faculty{
    String name;
    List<Student> studentsOfFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOfFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOfFaculty() {
        return studentsOfFaculty;
    }
    public void addStudentToFaculty(Student st){
        getStudentsOfFaculty().add(st);
    }
}

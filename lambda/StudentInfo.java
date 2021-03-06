package povtor.lambda;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class StudentInfo {
    void testStudents(ArrayList<Student> al, Predicate<Student> predicate) {
        for (Student s : al) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }

//    void printStudentsOverGrade(ArrayList<Student> al, double grade) {
//        for (Student s : al) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> al, int age) {
//        for (Student s : al) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
//        for (Student s : al) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();

        Function<Student, Double> function = student -> student.avgGrade;
        double resAvg = avgOfSmth(students, stud -> stud.avgGrade);
        System.out.println("Средняя оценка: "+resAvg);
        double resAge = avgOfSmth(students, stud -> (double)stud.age);
        System.out.println("Средний возраст: "+resAge);
        double resCourse = avgOfSmth(students, stud -> (double)stud.course);
        System.out.println("Средний курс: "+resCourse);

    }


    private static double avgOfSmth(List<Student> list, Function<Student, Double> function) {
        double result = 0;
        for (Student st : list) {
            result += function.apply(st);
        }
        result = result / list.size();
        return result;
    }

//        Collections.sort(students, (o1, o2) -> o1.course - o2.course);
    //System.out.println(students);

//        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
//        Predicate<Student> p2 = student -> student.sex == 'm';

//        info.testStudents(students, p1);
//        info.testStudents(students, p2);

    //methods Predicate
//        info.testStudents(students, p1.and(p2));
//        info.testStudents(students, p1.or(p2));
//        info.testStudents(students, p1.negate());


//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.course-o2.course;
//            }
//        });
//        System.out.println(students);


//        info.testStudents(students, (Student s) -> {return s.avgGrade > 8;});
//        System.out.println("-------");
//        info.testStudents(students, s -> s.age< 30);
//        System.out.println("-------");
//        info.testStudents(students, (Student s) -> {return s.age>20 && s.avgGrade<9.3 && s.sex=='f' ;});

//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("-------");
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 30;
//            }
//        });
//        info.printStudentsOverGrade(students, 8);
//        System.out.println("-------");
//        info.printStudentsUnderAge(students, 30);
//        System.out.println("-------");
//        info.printStudentsMixCondition(students, 20, 9.5, 'f');
}


//interface StudentChecks {
//    boolean check(Student s);
//}
//
//class CheckOverGrade implements StudentChecks {
//
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 8;
//    }
//}
package сourses.zaurTregulov.lamda06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

interface StudentChecks {
    boolean check(Student s);
}
class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "m", 19, 1, 7.6);
        Student student2 = new Student("Sergey", "m", 21, 2, 5.2);
        Student student3 = new Student("Evgeny", "m", 42, 5, 8.1);
        Student student4 = new Student("Pavel", "m", 54, 3, 2.6);
        Student student5 = new Student("Tatiana", "f", 32, 6, 9.2);

        ArrayList<Student> studentArrayList = new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5));

        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.testStudents(studentArrayList, new CheckOverGrade()); // class
//        System.out.println("-----------------------------------------");
//        studentInfo.testStudents(studentArrayList, new StudentChecks() {   // anon class
//            @Override
//            public boolean check(Student s) {
//                return s.getAge() < 30;
//            }
//        });
        System.out.println("-----------------------------------------"); // lambda
    //    studentInfo.testStudents(studentArrayList, (Student s) -> {return s.getAge() < 30;});
        studentInfo.testStudents(studentArrayList, (s) -> s.getAge() < 30);
    }
}

class StudentInfo {
    void testStudents(ArrayList<Student> studentArrayList, Predicate<Student> studentPredicate) {
        for (Student student : studentArrayList) {
            if (studentPredicate.test(student)) {
                System.out.println("Student Info:   " + student);
            }
        }
    }

}

//class CheckOverGrade implements StudentChecks {
//    @Override
//    public boolean check(Student s) {
//        return s.getAvgGrade() > 8;
//    }
//}


class Student {
    public Student(String name, String sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    private final String name;
    private final String sex;
    private final int age;
    private final int course;
    private final double avgGrade;

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
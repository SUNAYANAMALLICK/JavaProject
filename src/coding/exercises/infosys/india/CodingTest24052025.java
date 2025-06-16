package coding.exercises.infosys.india;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

enum Gender{
    FEMALE, MALE, OTHERS
}

enum Status{
    PASS, FAIL
}

public class CodingTest24052025 {

    record Student(String name, Double marks, Gender gender, Status status){

        public boolean hasPassed() {
            return status.equals(Status.PASS);
        }
    }
    public static void main(String[] args) {


        // Student class (name, marks, gender, status (PASSED/FAIL))
        // List<Student>
        // List<Students> - MALE PASSED

        List<Student> studentList = new ArrayList<>(); // List.of()
        studentList.add(new Student("Sunayana", 92.4, Gender.FEMALE, Status.PASS));
        studentList.add(new Student("Spriha", 99.4, Gender.FEMALE, Status.PASS));
        studentList.add(new Student("Pinki", 28.4, Gender.FEMALE, Status.FAIL));
        studentList.add(new Student("Tuhin", 98.4, Gender.MALE, Status.PASS));
        studentList.add(new Student("Subrata", 92.4, Gender.MALE, Status.PASS));
        studentList.add(new Student("Tatha", 24.4, Gender.MALE, Status.FAIL));

        System.out.println(studentList);


      //  studentList.stream().filter(student -> student.gender.equals("MALE") && student.status.equals("PASS")).toList();

        System.out.println(studentList.stream().filter(student -> "MALE".equals(student.gender) && "PASS".equals(student.status)).toList());

        //Map(MALE, TotalMarks of male students who have passes)
        //Map(FEMALE, TotalMarks of male students who have passes)

        Map<Gender, DoubleSummaryStatistics> result = studentList.stream()
                .filter(Student::hasPassed) // Filtering only students who have passed
                .collect(Collectors.groupingBy(Student::gender, Collectors.summarizingDouble(Student::marks))); // Summing their marks

        System.out.println(result);

    }
}

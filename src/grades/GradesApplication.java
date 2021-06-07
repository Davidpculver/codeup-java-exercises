package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("David");
        students.put("Chili dog", student1);
        student1.addGrade(55);
        student1.addGrade(80);
        student1.addGrade(100);

        Student student2 = new Student("Bob");
        students.put("B-diddy", student2);
        student2.addGrade(90);
        student2.addGrade(85);
        student2.addGrade(78);

        Student student3 = new Student("Tim T");
        students.put("Tim Tight Pants", student3);
        student3.addGrade(33);
        student3.addGrade(51);
        student3.addGrade(62);

        System.out.println(students.get("Chili dog").getName());
        System.out.println(student1.getGradeAverage(student1.getGrades()));
        System.out.println(students.get("B-diddy").getName());
        System.out.println(student1.getGradeAverage(student2.getGrades()));
        System.out.println(students.get("Tim Tight Pants").getName());
        System.out.println(student1.getGradeAverage(student3.getGrades()));

//       Prints the "array" of keys
        System.out.println(students.keySet());
        System.out.println(students);
//      This will print every key individually
        for(String key: students.keySet()){
            System.out.print("|" + key + "| ");
        }
    }
}

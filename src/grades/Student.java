package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, int grade) {
        this.name = name;
        this.grades = new ArrayList<>();
        addGrade(grade);
    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(ArrayList<Integer> grades){
        double sum = 0;
        for(Integer grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }



    public static void main(String[] args) {
        Student student1 = new Student("David", 45);
//        System.out.println(student1.grades);
        student1.addGrade(55);
        student1.addGrade(80);
        student1.addGrade(100);
//        System.out.println(student1.grades);
        System.out.printf("Student %s has grades of %s%n" ,student1.getName(), student1.grades);
        System.out.printf("%s's grade average: %s", student1.getName(),student1.getGradeAverage(student1.grades));
    }


}

package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return name;
    }


    public void addGrade(int grade){
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

//    public double getGradeAverage(ArrayList<Integer> grades){
//        double sum = 0;
//        for(Integer grade : grades){
//            sum += grade;
//        }
//        return sum / grades.size();
//    }

    public double getGradeAverage(){
        double sum = 0;
        for(Integer grade : this.grades){
            sum += grade;
        }
        return sum / this.grades.size();
    }


    public static void main(String[] args) {
        Student student1 = new Student("David");
        student1.addGrade(55);
        student1.addGrade(80);
        student1.addGrade(100);
        System.out.printf("Student %s has grades of %s%n" ,student1.getName(), student1.grades);
        System.out.printf("%s's grade average: %s%n", student1.getName(),student1.getGradeAverage());

        Student student2 = new Student("Jim");
        student2.addGrade(85);
        student2.addGrade(90);
        student2.addGrade(60);
        System.out.printf("Student %s has grades of %s%n" ,student2.getName(), student2.grades);
        System.out.printf("%s's grade average: %s", student2.getName(),student2.getGradeAverage());



    }


}

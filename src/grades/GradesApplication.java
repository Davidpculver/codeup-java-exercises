package grades;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("David");
        student1.addGrade(55);
        student1.addGrade(80);
        student1.addGrade(100);
        students.put("Chili dog", student1);

        Student student2 = new Student("Bob");
        student2.addGrade(90);
        student2.addGrade(85);
        student2.addGrade(78);
        students.put("B-diddy", student2);

        Student student3 = new Student("Tim T");
        student3.addGrade(33);
        student3.addGrade(51);
        student3.addGrade(62);
        students.put("Tim Tight Pants", student3);

        Student student4 = new Student("Ms Sparkle");
        student4.addGrade(33);
        student4.addGrade(51);
        student4.addGrade(62);
        students.put("Yo momma", student4);

//        System.out.println(students.get("Chili dog").getName());
//        System.out.println(student1.getGradeAverage(student1.getGrades()));
//        System.out.println(students.get("B-diddy").getName());
//        System.out.println(student1.getGradeAverage(student2.getGrades()));
//        System.out.println(students.get("Tim Tight Pants").getName());
//        System.out.println(student1.getGradeAverage(student3.getGrades()));
        System.out.println(students.get("Yo momma").getName());
        System.out.println(student4.getGradeAverage(student4.getGrades()));
        System.out.println(students.get("B-diddy").getGradeAverage());


//       Prints the "array" of keys
//        System.out.println(students.keySet());

        System.out.println("Welcome!\nHere are the GitHub usernames of our students:\n");

//      This will print every key individually
        for(String key: students.keySet()){
            System.out.print("|");
            System.out.print(key + "| ");
        }



        String userInput;
        boolean response;
        Scanner scanner = new Scanner(System.in);

        do{
            response = true;
            System.out.println("\nWhat student would you like to see more information on?\n");
            userInput = scanner.nextLine();
            if(!students.containsKey(userInput)){
                System.out.printf("Sorry, no student found with the GitHub username of %s.%nWould you like to see another student? (Y/N)", userInput);
                userInput = scanner.nextLine();
                if(userInput.toLowerCase().startsWith("y")){
                    continue;
                } else {
                    System.out.println("Goodbye, and have a wonderful day!");
                    break;
                }
            } else{
//                Unable to access getGradAverage. However, able to print out getGrades.
                System.out.println("Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput + "\nCurrent average: " + students.get("B-diddy").getGradeAverage() + "\n");
            }
            System.out.println("Would you like to see another student?");
            userInput = scanner.nextLine();
//            System.out.println();
            if(userInput.toLowerCase().startsWith("y")){
                continue;
            } else {
                System.out.println("Goodbye, and have a wonderful day!");
                break;
            }
        } while (response = true);
    }
}

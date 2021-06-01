package oopLecture;

import java.util.Scanner;

//car object
public class Car {
    public static Scanner scanner = new Scanner(System.in);
//    fields setting up for class of car
    public String model;
    public int year;
    public String color;
//    setting up a run method
    public void run(){
        System.out.println("The car is running.");
    }

    public static void main(String[] args) {
//        instantiate the object with new keyword and what type of object: Car class. (Like built in scanner)
        Car car1 = new Car();
        System.out.println(car1);

//        Assign values to properties.
        car1.color = "Red";
        car1.year = 1984;
        car1.model = "Camaro";

        System.out.println(car1.color);

        Car car2 = new Car();

        car2.color = "Green";
        car2.year = 2007;
        car2.model = "Astro";
        car2.run();

    }

}

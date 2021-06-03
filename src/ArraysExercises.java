import java.util.Arrays;

public class ArraysExercises{

    public static Person[] addPerson(Person[] arr, Person newPerson){
        Person[] newArray = Arrays.copyOf(arr, arr.length + 1);
        newArray[arr.length] = newPerson;
        return newArray;
    }



    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

//        Creating new instances of Person objects from Person class in src folder.
        Person firstPerson = new Person("David");
        Person secondPerson = new Person("Jackie");
        Person thirdPerson = new Person("Winston");


//        Creating array containing each person
        Person[] people = new Person[3];
        people[0] = firstPerson;
        people[1] = secondPerson;
        people[2] = thirdPerson;

//        Iterate over each person object
        for(Person person : people){
//        Utilizing the getName() method from Person class
            System.out.println(person.getName());
        }

        Person fourthPerson = new Person("Steve");
        people = addPerson(people, fourthPerson);

        for(Person person : people){
//        Utilizing the getName() method from Person class
            System.out.println(person.getName());
        }




    }
}

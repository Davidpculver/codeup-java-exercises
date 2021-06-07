import shapes.Square;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLecture {

    public static void main(String[] args) {
//      This is how we create an array w/o arraylist
//        int[] numbers = {1, 2, 3, 4};


//        Can't create arraylist of primitive data types. Use different reference types.
//        Dont have to set length of arraylist, as we did when creating new array as above.
        ArrayList<Integer> collectionOfNums = new ArrayList<>();
        collectionOfNums.add(16);
        collectionOfNums.add(44);
        collectionOfNums.add(32);
        collectionOfNums.add(44);

//          Uses .size rather than .length (making use of size method rather than length property)
//          Use .get method and pass in specific index.
//        for(int i = 0; i < collectionOfNums.size(); i++){
//            System.out.println(collectionOfNums.get(i));
//        }
//        Enhanced for loop
        for (Integer collectionOfNum : collectionOfNums) {
            System.out.println(collectionOfNum);
        }

//        Can use second argument. (index where to add, what to add)
        collectionOfNums.add(1, 21);
        for (Integer collectionOfNum : collectionOfNums) {
            System.out.println(collectionOfNum);
        }
//      Has build in .toString() method, so it converts it in to something readable.
        System.out.println(collectionOfNums);

//        Other methods from ArrayList:
//        .contains: if element exists in ArrayList that matches will return true/false
        System.out.println(collectionOfNums.contains(44));

        System.out.println(collectionOfNums.indexOf(44));
        System.out.println(collectionOfNums.lastIndexOf(44));

//        Check to see if list is empty .isempty()
        ArrayList<String> studentNames = new ArrayList<>();
        if(studentNames.isEmpty()){
            System.out.println("The arrayList is empty. No students.");
        }

//         .remove pass in element value, and index
//        The return value we get back from .remove is boolean. If does not exist, will return false.
        System.out.println(collectionOfNums);
//        Since a number, had to pass in the integer reference type
        collectionOfNums.remove((Integer) 44);
        System.out.println(collectionOfNums);

//      to replace element at index of: replace index of 2 with 88.
        collectionOfNums.set(2, 88);
        System.out.println(collectionOfNums);

//        studentNames.remove("Bob");


        ArrayList<Double> collectionOfDoubles = new ArrayList<>();
        collectionOfDoubles.add(3.14);
        collectionOfDoubles.add(50.87);
        collectionOfDoubles.add(7.7777);
        collectionOfDoubles.add((double) 2);
        System.out.println(collectionOfDoubles);
//        This removes the element at index of 2, not the double 2.
//        collectionOfDoubles.remove(2);
//        Pass in either value of specific value, or the index of what you want to remove. For a number, have to cast Integer to reference type.
        collectionOfDoubles.remove((double) 2);
        System.out.println(collectionOfDoubles);






//Casting data into object. essentially javascript. Not a good idea, lose out on functionality of objects
//        ArrayList stuff = new ArrayList();
//        stuff.add("BOB");
//        stuff.add(55);
//
//        for(Object thing : stuff){
//            System.out.println(thing);
//        }


//        HASHMAPS
//        use for: application to iterate thru string and count up number of instances of word in string.


//collection of key: value pairs. (Key essentially is us defining the index name)
        HashMap<Character, Square> squares = new HashMap<>();
        squares.put('A', new Square(5));
        squares.put('B', new Square(10));
//        'B' is not absent, so new square(4) is not added.
        squares.putIfAbsent('B', new Square(4));
        System.out.println(squares.get('A').getArea());
//        Gets either the value, or set a new default value for the key. If we didnt have line 97; this would return 0.
        System.out.println(squares.getOrDefault('B', new Square(0)).getArea());

//         Returns true
//        System.out.println(squares.containsKey('B'));
//        Returns false; identical twins just born, not named, are not the same person. 'new square', new twins just born... one exists in memory before the other.
//        squares.containsValue(new Square(5));

        squares.replace('B', new Square(4));
        System.out.println(squares.get('B').getArea());


//       .remove method: Key and value has to match, other wise it will skip

    }
}

import java.util.Arrays;

public class ArrayLec {
    public static void main(String[] args) {
//        must dictate data type. all elements contained in this way are going to be this specific data type. Has to be same data type
        int[] numbers = {14, 64, 34, 44};
        System.out.println(numbers); //prints location of array in memory - not human readable.

//        One way to print out the numbers, can iterate through it with for loop.
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
//        Enhanced for loop (like for each loop in js)
        for(int number : numbers){
            System.out.println(number);
        }

//        Arrays different from js. Length in java is defined. Js has push/pull to add to array; arrays are static in Java.
//        Can change number at a specific index
        numbers[1] = 33;
//        Cannot change the length of the array. It will throw an exception.
//        numbers[4] = 15;

//        enter how long you want array to be. We could set array to be a longer length, but if nothing added at that index it will return null. Dealing with reference data type; dealing with objects.
        String[] topFiveBoyNames = new String[5];
        topFiveBoyNames[0] = "Greg";
        topFiveBoyNames[1] = "Jim";
        topFiveBoyNames[2] = "Bob";
        topFiveBoyNames[3] = "Joe";
        topFiveBoyNames[4] = "Richard";

        for(String name : topFiveBoyNames){
            System.out.println(name);
        }

//        No 'empty array' in java; default values assigned to each specific index.
        boolean[] lookAtDefaultVals = new boolean[3];
        for (boolean boo : lookAtDefaultVals){
            System.out.println(boo);
        }

//        Array methods (Using the Arrays class imported)
//        fill the entire array with the element value true. good to use to fill in default value
        Arrays.fill(lookAtDefaultVals, true);

        for (boolean boo : lookAtDefaultVals){
            System.out.println(boo);
        }

//        fill the entire array with the element value John
        Arrays.fill(topFiveBoyNames, "John");
        topFiveBoyNames[2] = "Winston";
        for (String name : topFiveBoyNames){
            System.out.println(name);
        }

        int[] alsoNum = {14, 33, 34, 44};

        for(int number : numbers){
            System.out.println(number);
        }

        for(int number : alsoNum){
            System.out.println(number);
        }

//  returns false. same numbers, but different objects
        System.out.println(numbers == alsoNum);

        System.out.println(Arrays.equals(numbers, alsoNum));

//  How to add to array

//        change the arrays length
        int[] yetMoreNums = Arrays.copyOf(numbers, 5);

        for(int number : yetMoreNums){
            System.out.println(number);
        }

//        set up alias for numbers; numbersAgain does equal number.
        int[] numbersAgain = numbers;

//        returns false: Made a copy - new object yetMoreNums, not equal to numbers
        System.out.println(yetMoreNums == numbers);


        int[] unsortedNumbers = {99, -19, 88, 0, 3, 44, 13};

        Arrays.sort(unsortedNumbers);
//        Static method toString from arrays class. Returns a readable array thats sorted
//        System.out.println(unsortedNumbers.toString());  This does not work
        System.out.println(Arrays.toString(unsortedNumbers));

// denotes arrays inside of an array - have to define for 2D arrays.
        char[][] letters = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
                {'J', 'K', 'L'}
        };

// row represents each individual array
        for (char[] row : letters){
            System.out.println("+---+---+---+");
            System.out.print("| ");
// for each character in each array
            for (char n : row){
                System.out.print(n + " | ");
            }
// work as new line character at the end
            System.out.println();
        }

        System.out.println("+---+---+---+");




    }
}

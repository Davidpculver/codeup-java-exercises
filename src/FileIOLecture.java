
// * imports everything inside of java.nio.file

// nio class: pattern/protocols for creating objects have states and behaviors.
//nio library of classes. Reaching files that are stored on our system below. Each file is defined by a path.
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//nio relies heavily on Paths, Files, Path classes. (pop up when start to type java.nio.file...)

//when go to computer terminal.. type in cd / = this goes to root directory. Hard drive contains the file system.




public class FileIOLecture {

//    All we need to know is the path to the file that we want to read
    public void readFileAndOutput(Path pathToFile){
        List<String> currentList = new ArrayList<>();
        try{
//            all lines from toOurDataFile written to currentList, but no output yet.
            currentList = Files.readAllLines(pathToFile);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        for(String line: currentList){
            System.out.println(line);
        }
    }


    public static void main(String[] args) {

//        Path path = Paths.get("src");
////        represents path object, not a string
//        System.out.println(path);
////        prints out the entire path of the src. Need so we can pass and read files
//        System.out.println(path.toAbsolutePath());

//        usually inside intellij - only need to go back as far as src since it doesnt reach back to the systems root
//        Paths.get takes in strings as arguments
        Path path = Paths.get("src", "FileIOLecture.java");
        System.out.println(path);
//        express path's knowledge by passing it methods.
        System.out.println(path.toAbsolutePath());

//        Can convert a path to a string, but cannot directly pass in an object to paths.get
//        Path thisWillWork = Paths.get(String.valueOf(path), "FileIOLecture.java");

//        under Paths.get - ("src/data"): src specifies location, data the name of directory. Can also specify other locations on the system by specifying the direct path name. ex. ("/Users/David/Documents/Codeup-java-exercises/src/placehere")
        Path toOurDataPlace = Paths.get("src", "data"); // or ("src/data")
        System.out.println(toOurDataPlace);
//        Create a new directory
//            io exceptions are checked. So have to be set up to catch.

//        try {
////            an extra step to check if it already exists. Nothing will happen if it already exists, but advisable to check.
//            if (Files.notExists(toOurDataPlace)){
//                Files.createDirectories(toOurDataPlace);
//            } else {
//                System.out.println("The " + toOurDataPlace + " directory already exists.");
//            }
//        } catch (IOException ioe){
//            ioe.printStackTrace();
//        }



//        Create new file
        Path toOurDataFile = Paths.get(String.valueOf(toOurDataPlace), "data.txt");
//Static method, so dont instantiate new File
        System.out.println(toOurDataFile);
        try{
            if(Files.notExists(toOurDataFile)){
                Files.createFile(toOurDataFile);
            } else {
                System.out.println("The " + toOurDataFile + " file already exists.");
            }

        } catch(IOException ioe){
            ioe.printStackTrace();
        }


//        Write to a file

//        Arrays.asList places everything on its own line
        List<String> dogs = Arrays.asList("Winston", "Riley", "Bandit", "Gizmo");

        try {
//            Takes 2 arguments; path to file you want, and data you want to write. must use try catch
            Files.write(toOurDataFile, dogs);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

//        Read from a file

//        Define: create a place to put info we read from the file
//        List<String> currentList = new ArrayList<>();
//Pass it the path to our list
//        Read info from the file in try/catch
//        try{
////            all lines from toOurDataFile written to currentList, but no output yet.
//            currentList = Files.readAllLines(toOurDataFile);
//        } catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//
////       Loop through the arrayList and output each item
//        for(String line: currentList){
//            System.out.println(line);
//        }

//        Created method above main class.
//   ***************************************************

//        Have to create a new instance of FileIOLecture object.
//        Unless the method is defined as static.
        FileIOLecture io = new FileIOLecture();
//        io.readFileAndOutput(toOurDataFile);

//        Append single item to our list.
        try {
//            StandardOpenOption: Option to append on the end. Without it, this would overwrite the list to just "new doggy"
            Files.writeString(toOurDataFile, "New doggy\n", StandardOpenOption.APPEND);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

//        must recall the iow.readFileANOutput to get new list
//        io.readFileAndOutput(toOurDataFile);

//        Append new list to a list
        List<String> newDogNames = new ArrayList<>();
        newDogNames.add("Spot");
        newDogNames.add("Barky");
        newDogNames.add("Fuzzy");

        try {
            Files.write(toOurDataFile, newDogNames, StandardOpenOption.APPEND);
        } catch(IOException ioe){
            ioe.printStackTrace();
        }

//        io.readFileAndOutput(toOurDataFile);


//  Remove item
//        Iterate over list and remove "spot"
        List<String> currentList = new ArrayList<>();
        try{
            currentList = Files.readAllLines(toOurDataFile);
        } catch(IOException ioe){
            ioe.printStackTrace();
        }
//        java api iterator - google
//        iterator object to iterate over the currentlist
        Iterator<String> listIterator = currentList.iterator();
        while(listIterator.hasNext()){
            String dog = listIterator.next();
            if(dog.equals("Spot")){
                listIterator.remove();
            }
        }
//        Have to re-write the new toourdatafile
        try{
            Files.write(toOurDataFile, currentList);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }

//        Add spotty
        try {
                       Files.writeString(toOurDataFile, "Spotty\n", StandardOpenOption.APPEND);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

        io.readFileAndOutput(toOurDataFile);



// List is an interface - set of behaviors implemented by other specific classes.

    }
}

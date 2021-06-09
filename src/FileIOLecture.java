
// * imports everything inside of java.nio.file
import java.nio.file.*;

//nio relies heavily on Paths, Files, Path classes. (pop up when start to type java.nio.file...)

//when go to computer terminal.. type in cd / = this goes to root directory. Hard drive contains the file system.




public class FileIOLecture {


    public static void main(String[] args) {

//        Path path = Paths.get("src");
////        represents path object, not a string
//        System.out.println(path);
////        prints out the entire path of the src. Need so we can pass and read files
//        System.out.println(path.toAbsolutePath());

        Path path = Paths.get("src", "FileIOLecture.java");
        System.out.println(path);
        System.out.println(path.toAbsolutePath());
    }
}

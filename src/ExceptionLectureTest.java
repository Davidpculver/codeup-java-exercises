public class ExceptionLectureTest {
    //You can look up to see what exceptions are thrown with each method for ex. parseInt
//    Checked and unchecked. Compiler will not catch runtime exceptions. lets you compile, but gives exception when program is run.
    public static void main(String[] args) {

//        try {
////        study is instantiation of exceptionsLecture object - lives in memory called heap
//            ExceptionsLecture study = new ExceptionsLecture();
////        parseInt static method, dont have to instantiate the class of Integer.
//            System.out.println(Integer.parseInt(study.maybeAnInteger));
//            System.out.println(study.notAnInteger);
////        Below gives error, cant parse the string. Will THROW an error at us.
//        System.out.println(Integer.parseInt(study.notAnInteger));
//        } catch (NumberFormatException nfe){ //all exceptions inherit class exception. Can use catch (Exception e)
////            **** What happens if exception is thrown at me. ****
////            System.out.println("Uh... nope you can't do that to a string.");
////            System.out.println("I received an exception: " + nfe);
//            System.out.println(nfe.getMessage());
////            nfe.printStackTrace();
//        }
//
        ExceptionsLecture study = new ExceptionsLecture();
//        code in try and finally block runs. Dont usually have finally
//        study.askForAnInteger();
study.aMoreComplexAskFor();

    }

}

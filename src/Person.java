public class Person {


//    private String name;
//
//    public Person(){}
//
//    public Person(String name) {
//        this.name = name;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void sayHello(){
//        System.out.println("Hello from " + this.name);
//    }
//
//    public static void main(String[] args) {
//        Person firstPerson = new Person();
//////        firstPerson.name = "David";
//////        System.out.println(firstPerson.name);
//        firstPerson.setName("David");
//        System.out.println(firstPerson.getName());
//        firstPerson.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
////        true because the values are the same
//        System.out.println(person1.getName().equals(person2.getName()));
////        False - in java cant compare two strings within objects. They are both named John, but they are different people
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        True because its equal since its defined as being the same object.
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        Because person2 is set equal to person1, changing person2's name also impacts person1 name.
//    }




//    INSTRUCTOR EXAMPLE

    private String name;

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
//        instance method: instance of the object so dont need the this. keyword on name.
        System.out.println("Hello, " + name);
    }

//    Constructor
    public Person(String name){
        this.name = name;
    }

public Person (){};


    public static void main(String[] args){
//        Create new Person object
        Person p = new Person("Rudy");
//        testing constructors
        System.out.println(p.getName());
        p.setName("Roger");
        System.out.println(p.getName());
        p.sayHello();
        p.setName("Bryan");
        System.out.println(p.getName());
        p.sayHello();

    }

}

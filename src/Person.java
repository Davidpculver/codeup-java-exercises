public class Person {


    private String name;


    public Person(){}

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello from " + this.name);
    }

    public static void main(String[] args) {
//        Person firstPerson = new Person();
////        firstPerson.name = "David";
////        System.out.println(firstPerson.name);
//        firstPerson.setName("David");
//        System.out.println(firstPerson.getName());
//        firstPerson.sayHello();
//        Person person1 = new Person();
//        person1.setName("john");
//        Person person2 = new Person();
//        person2.setName("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
    }

}

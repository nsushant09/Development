package Random;

public class Person {
    private String name;
    private String age;

    Person(String name, String age){
        this.name = name;
        this.age = age;
    }

    String showDetails(){
        return "Name" + this.name + "  age : " + this.age;
    }

}

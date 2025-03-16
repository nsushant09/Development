package Random;

public class Student extends Person {
    private String course;


    Student(String name, String age, String course) {
        super(name, age);
        this.course = course;
    }

    @Override
    String showDetails() {
        return super.showDetails() + "  course" + this.course;

    }
}

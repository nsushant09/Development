package designpatterns.factory;

public class Windows  implements OS{

    @Override
    public void spec() {
        System.out.println("I am about to die...");
    }
}

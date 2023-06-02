package designpatterns.factory;

public class OperatingSystemFactory {
    public OS getInstance(String str){
        switch(str){
            case "Open" -> { return new Android();}
            case "Closed" -> {return new IOS();}
            default -> {return new Windows();}
        }
    }
}

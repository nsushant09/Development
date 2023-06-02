package Kushwaha.OOP.OOP5.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();
    public NiceCar(){
        engine = new PowerEngine();
    }
    public NiceCar(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void acc(){
        engine.acc();
    }
    public void brake(){
        System.out.println("Brakes applied.");
    }
    public void MediaStart(){
        player.start();
    }
    public void MediaStop(){
        player.stop();
    }
}

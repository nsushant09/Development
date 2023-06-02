package designpatterns.builder;

public class Phone {
    String os;
    String processor;
    double screenSize;
    int battery;
    int camera;

    Phone(){

    }
    Phone(String os , String processor , double screenSize, int battery, int camera){

        this.os = os;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
        this.camera = camera;
    }

    static class Builder{
        String os;
        String processor;
        double screenSize;
        int battery;
        int camera;

        public Builder os(String str){
            this.os = str;
            return this;
        }

        public Builder processor(String str){
            this.processor = str;
            return this;
        }

        public Builder screenSize(Double value){
            this.screenSize = value;
            return this;
        }

        public Builder battery(int value){
            this.battery = value;
            return this;
        }

        public Builder camera(int value){
            this.camera = value;
            return this;
        }

        public Phone build(){
            return new Phone(this.os, this.processor, this.screenSize, this.battery, this.camera);
        }
    }
}

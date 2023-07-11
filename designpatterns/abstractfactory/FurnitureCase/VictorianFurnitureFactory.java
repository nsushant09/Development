package designpatterns.abstractfactory.FurnitureCase;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VFChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VFCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VFSofa();
    }
}

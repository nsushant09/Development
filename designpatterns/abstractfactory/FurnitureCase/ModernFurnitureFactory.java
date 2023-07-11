package designpatterns.abstractfactory.FurnitureCase;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new MFChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new MFCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new MFSofa();
    }
}

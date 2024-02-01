package AbstractFactory;

public class BrownRice implements Rice{
    @Override
    public void sizePackage() {
        System.out.println("Brown rice - 1Kg");
    }
    
    @Override
    public String getBrand() {
        return "Tio Joao";
    }
}

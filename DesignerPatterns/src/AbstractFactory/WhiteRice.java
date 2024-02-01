package AbstractFactory;

public class WhiteRice implements Rice{
    @Override
    public void sizePackage() {
        System.out.println("White Rice 3Kg");
    }
    
    @Override
    public String getBrand() {
        return "Camil";
    }
}

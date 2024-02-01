package AbstractFactory;

public class Implementation {
    
    public static void main(String[] args) {
        FoodFactory factory = new WhiteFactory();
        Rice whiteRice = factory.createRice();
        whiteRice.sizePackage();
    }
}

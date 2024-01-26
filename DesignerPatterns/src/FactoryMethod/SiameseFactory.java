package FactoryMethod;

public class SiameseFactory implements CatFactory {
    @Override
    public Cat createCat() {
        return new Siamese();
    }
    
    @Override
    public void colorCat() {
        System.out.println("My color is grey");
    }
}

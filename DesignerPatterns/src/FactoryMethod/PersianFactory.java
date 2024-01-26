package FactoryMethod;

public class PersianFactory implements CatFactory {
    @Override
    public Cat createCat() {
        return new Persian();
    }
    
    @Override
    public void colorCat() {
        System.out.println("My color is undefined");
    }
}

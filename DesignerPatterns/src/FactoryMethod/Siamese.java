package FactoryMethod;

public class Siamese implements Cat {
    
    @Override
    public void breath() {
        System.out.println("uhmmm");
    }
    
    @Override
    public void meow() {
        System.out.println("meawunnnnn");
    }
    
    @Override
    public void walk() {
        System.out.println();
    }
}

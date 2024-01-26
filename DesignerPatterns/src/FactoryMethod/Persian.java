package FactoryMethod;

public class Persian implements Cat {
    
    @Override
    public void breath() {
        System.out.println("123");
    }
    
    @Override
    public void meow() {
        System.out.println("MEAU");
    }
    
    @Override
    public void walk() {
        System.out.println("1 step, 2 steps");
    }
}

import FactoryMethod.Cat;
import FactoryMethod.CatFactory;
import FactoryMethod.PersianFactory;
import FactoryMethod.Siamese;
import FactoryMethod.SiameseFactory;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        CatFactory catFactory = new PersianFactory();
        Cat cat = catFactory.createCat();
        cat.meow();
        
    }
    
}
package AbstractFactory;

public class WhiteFactory implements FoodFactory{
    @Override
    public Rice createRice() {
        return new WhiteRice();
    }
    
    @Override
    public Bean createBean() {
        return new WhiteBean();
    }
}

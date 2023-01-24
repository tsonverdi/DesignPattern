package StructuralDP.DecoratorDP;

public class Iphone11 extends PhoneDecorator{
    public Iphone11(Iphone basicPhone) {
        super(basicPhone);//Minimum ozelliklere sahip bi Iphone.
    }

    @Override
    public String getName() {
        return super.getName() + " 11"; //Iphone 11
    }
}

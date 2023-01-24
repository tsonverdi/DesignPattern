package StructuralDP.DecoratorDP;

public class Iphone11Pro extends PhoneDecorator{
    public Iphone11Pro(Iphone basicPhone) {
        super(basicPhone);//base telefona gittik
    }

    @Override
    public String getName() {
        return super.getName() + " 11Pro";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 3000.0;
    }

    @Override
    public int cameraCount() {
        return super.cameraCount() + 2;
    }
}

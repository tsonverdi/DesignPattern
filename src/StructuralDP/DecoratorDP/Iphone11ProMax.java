package StructuralDP.DecoratorDP;

public class Iphone11ProMax extends Iphone11Pro{
    public Iphone11ProMax(Iphone basicPhone) {
        super(basicPhone);//Base Iphone 11Pro oldu
    }

    @Override
    public String getName() {
        return super.getName() + " Max";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 4000.0;
    }
    public String extraMethod(){
        return "Gold Renk";
    }
}

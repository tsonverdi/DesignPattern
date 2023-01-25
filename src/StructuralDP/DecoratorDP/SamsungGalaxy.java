package StructuralDP.DecoratorDP;

public class SamsungGalaxy extends PhoneDecorator{
    public SamsungGalaxy(Samsung basicSamsungPhone) {
        super(basicSamsungPhone);
    }

    @Override
    public String getName() {
        return super.getName() + " Galaxy";
    }
}

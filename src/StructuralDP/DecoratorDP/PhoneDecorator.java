package StructuralDP.DecoratorDP;

public class PhoneDecorator implements Phone{

    protected Phone basicPhone;//Buraya interface i yazmamin nedeni ozellikler isimler degisirse problem olmasin diye.

    //Constructor


    public PhoneDecorator(Iphone basicPhone) {
        this.basicPhone = basicPhone;
    }//Burada Iphone phone cesidi oldugu icin COnstructora yazdik.

    @Override
    public String getName() {
        return basicPhone.getName();
    }

    @Override
    public int cameraCount() {
        return basicPhone.cameraCount();
    }

    @Override
    public double getPrice() {
        return basicPhone.getPrice();
    }
}

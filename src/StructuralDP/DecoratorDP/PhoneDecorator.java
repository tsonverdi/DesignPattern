package StructuralDP.DecoratorDP;

public class PhoneDecorator implements Phone{

    protected Phone basicPhone;//Buraya interface i yazmamin nedeni ozellikler isimler degisirse problem olmasin diye.

    protected Phone basicSamsungPhone;

    //Constructor

    public PhoneDecorator(Samsung basicSamsungPhone) {
        this.basicSamsungPhone = basicSamsungPhone;
    }

    public PhoneDecorator(Iphone basicPhone) {
        this.basicPhone = basicPhone;
    }//Burada Iphone phone cesidi oldugu icin Constructora yazdik.

    @Override
    public String getName() {
      return basicSamsungPhone.getName();
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


package StructuralDP.DecoratorDP;

public class DecoratorRunner {
    public static void main(String[] args) {
        Phone phone = new Iphone11ProMax(new Iphone()); //Base telefonu cunku constructorda boyle yaziyordu

        System.out.println("Name : " + phone.getName());
        System.out.println("Price : " + phone.getPrice());
        System.out.println("Camera count : " + phone.cameraCount());



    }
}

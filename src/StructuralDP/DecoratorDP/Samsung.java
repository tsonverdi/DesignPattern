package StructuralDP.DecoratorDP;

public class Samsung implements Phone{
    @Override
    public String getName() {
        return "Samsung";
    }

    @Override
    public int cameraCount() {
        return 2;
    }

    @Override
    public double getPrice() {
        return 7000.9;
    }
}

package StructuralDP.ProxyDP;

public class ProxyClass implements ImageGenerator{

    private RealClass realClass;//bu classin proxysisi

    private String fullPath;

    public ProxyClass(String fullPath) {
        this.fullPath = fullPath;
    }

    @Override
    public void showImage() {
        if (realClass==null){
            realClass = new RealClass(fullPath);
            realClass.showImage();
        }
    }
}

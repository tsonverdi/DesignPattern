package StructuralDP.ProxyDP;

public class ProxyRunner {
    public static void main(String[] args) {
        ProxyClass proxyClass = new ProxyClass("c:\\resim.jpg");
        ProxyClass proxyClass2 = new ProxyClass("c:\\resim2.jpg");
        
        proxyClass.showImage();// Burada sadece ihtiyac duyulan methodu aciyorum.
    }
}

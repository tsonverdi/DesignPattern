package CreationalDP.Singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
       // SingletonObject obj1 = new SingletonObject(); HATA

        SingletonObject obj2 = SingletonObject.getInstance();
        System.out.println(obj2.message);
        obj2.changeMessage();

        //Test etmek icin tekrar olusturuyorum

        SingletonObject obj3 = SingletonObject.getInstance();
        System.out.println("obj3 icin : " + obj3.message);
    }
}

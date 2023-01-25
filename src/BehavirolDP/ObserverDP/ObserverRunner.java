package BehavirolDP.ObserverDP;

public class ObserverRunner {
    public static void main(String[] args) {
ObserverRunner observerRunner = new ObserverRunner();
observerRunner.observerDemo();
    }
    void observerDemo(){
        Channel channel1 = new NewsChannel();
        Channel channel2 = new NewsChannel();
        Channel channel3 = new NewsChannel();

        NewsAgency agency = new NewsAgency();
        agency.addObserver(channel1);
        agency.addObserver(channel2);
        agency.addObserver(channel3);

        agency.sendNews(" Java dili artik TechPro ile cok daha kolay");
        agency.sendNews(" SpringBoot artik TechPro ile kolay");
        agency.sendNews(" SpringSecurity artik sac beyazlatir");

        System.out.println("Channel 1 haberleri");
        channel1.printNews();
        System.out.println("Channel 2 haberleri");
        channel2.printNews();
        System.out.println("Channel 3 haberleri");
        channel3.printNews();
    }

}

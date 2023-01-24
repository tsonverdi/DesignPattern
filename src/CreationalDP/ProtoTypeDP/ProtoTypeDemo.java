package CreationalDP.ProtoTypeDP;

public class ProtoTypeDemo {
    public static void main(String[] args) {
        Soldier availableSoldier = new Soldier(100,45,
                20,50,60,5,"Kilic",true);

        Soldier notAvailableSoldier = new Soldier(100,45,
                20,50,60,5,"Kilic",false);

        Soldier notAvailableSoldier2 = availableSoldier.clone();
        notAvailableSoldier2.setAvailableForWar(false);

        System.out.println("*******************");
        System.out.println("botAvailableSoldier1 icin cikti : ");
        notAvailableSoldier.showSoldierInfo();

        System.out.println("*******************");
        System.out.println("botAvailableSoldier2 icin cikti : ");
        notAvailableSoldier2.showSoldierInfo();
    }
}

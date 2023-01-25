package BehavirolDP.ChainOfResponsibilityDP;

public class ChainOfResponsibilityDemo {


    public static void main(String[] args) {
        ChainOfResponsibilityDemo chainOfResponsibilityDemo = new ChainOfResponsibilityDemo();
        chainOfResponsibilityDemo.chainOfResponsitibiltyDemo();

    }

    void chainOfResponsitibiltyDemo(){

       Approver genelMudur = new GenelMudur();
       Approver mudur = new Mudur(genelMudur);
       Approver memur = new Memur(mudur);

        System.out.println("Kredi verme limitleri : ");
        System.out.println("Memur icin maksimim : <100");
        System.out.println("Mudur icin maksimim : <500");
        System.out.println("Genel Mudur icin sinir yok\n**********");
        System.out.println("Istenen limit : 50");
        memur.approveLoan(50);
        System.out.println("Istenen limit : 450");
        memur.approveLoan(450);
        System.out.println("Istenen limit : 1050");
        memur.approveLoan(1050);






    }
}


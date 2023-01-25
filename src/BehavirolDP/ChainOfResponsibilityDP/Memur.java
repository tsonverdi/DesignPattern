package BehavirolDP.ChainOfResponsibilityDP;

public class Memur extends Approver{
    public Memur(Approver chief) {//Sefinin kim oldugunu gosterecegiz runnerda parametresi ile
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount<100){//100un altinda ise memur verebilir
            System.out.println("Memur onayladi\n*************");

        } else if (chief!=null) {//memurun veremeyecegi bir durumu asarsa chefe gider ve loan methodunu kullanarak onu alir.
            System.out.println("Miktar memurun onaylama sinirini asti, Sefe yonlendiriliyorsunuz");
            return chief.approveLoan(amount);
        }

        return false;
    }
}

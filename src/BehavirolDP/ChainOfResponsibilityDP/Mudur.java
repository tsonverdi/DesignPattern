package BehavirolDP.ChainOfResponsibilityDP;

public class Mudur extends Approver{
    public Mudur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount<500){//100un altinda ise memur verebilir
            System.out.println("Mudur onayladi\n*************");

        } else if (chief!=null) {//memurun veremeyecegi bir durumu asarsa chefe gider ve loan methodunu kullanarak onu alir.
            System.out.println("Miktar mudurun onaylama sinirini asti, Sefe yonlendiriliyorsunuz");
            return chief.approveLoan(amount);
        }
        return false;
    }
}

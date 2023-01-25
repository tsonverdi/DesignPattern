package BehavirolDP.ChainOfResponsibilityDP;

public class GenelMudur extends Approver{
    public GenelMudur() {
        super(null);
    }

    @Override
    boolean approveLoan(int amount) {
        System.out.println("Genel mudur onayladi\n*************");
        return true;
    }
}

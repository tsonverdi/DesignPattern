package BehavirolDP.ChainOfResponsibilityDP;

public abstract class Approver {
    Approver chief;

    public Approver(Approver chief) {//Bunu extend eden classlarin hepsi chiefini setlemeli
        this.chief = chief;
    }
    abstract boolean approveLoan(int amount);//krediyi onaylayacak mi icindeki miktara gore onu beliliyoruz

}

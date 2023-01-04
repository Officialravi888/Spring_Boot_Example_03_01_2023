package Org.Bank;

public class AllDetels {
    AllDetels(){

    }
    private Bank bank;
    AllDetels(Bank bank){
        this.bank=bank;
    }
    public void Imp(){
        bank.Hdfc();
    }
}

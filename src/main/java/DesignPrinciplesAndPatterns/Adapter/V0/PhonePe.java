package DesignPrinciplesAndPatterns.Adapter.V0;

import DesignPrinciplesAndPatterns.Adapter.V0.BankAPIs.YesBankAPI;

public class PhonePe {
    private FastTagRecharge fastTagRecharge;
    private PhonePeLoan phonePeLoan;
    private YesBankAPI yesBankAPI; // if we got to change from Yes Bank to ICICI, we got to change this line

    public PhonePe() {
        this.fastTagRecharge = new FastTagRecharge();
        this.phonePeLoan = new PhonePeLoan();
        this.yesBankAPI = new YesBankAPI(); // if we got to change from Yes Bank to ICICI, we got to change this line
    }

    public boolean rechargeFastTag(int amount) {
        return fastTagRecharge.recharge(amount, yesBankAPI); // if we got to change from Yes Bank to ICICI, we got to change this line
    }

    public boolean availLoan(int amount) {
        if(phonePeLoan.checkLoanEligibility(amount, yesBankAPI)) { // if we got to change from Yes Bank to ICICI, we got to change this line
            System.out.println("Let's disburse the loan!");
            return true;
        }
        else {
            System.out.println("Sorry you don't have enough money!");
            return false;
        }
    }
}

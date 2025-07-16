package DesignPrinciplesAndPatterns.Adapter.V3;

public class PhonePe {
    private FastTagRecharge fastTagRecharge;
    private PhonePeLoan phonePeLoan;
    private BankAPI bankAPI; // using interface / adapter instead

    public PhonePe(BankAPI bankAPI) {
        this.fastTagRecharge = new FastTagRecharge();
        this.phonePeLoan = new PhonePeLoan();
        this.bankAPI = bankAPI; // Now, to change the bank, changing this line alone is enough.
    }

    public boolean rechargeFastTag(int amount) {
        return fastTagRecharge.recharge(amount, bankAPI); // using interface / adapter instead
    }

    public boolean availLoan(int amount) {
        if(phonePeLoan.checkLoanEligibility(amount, bankAPI)) { // using interface / adapter instead
            System.out.println("Let's disburse the loan!");
            return true;
        }
        else {
            System.out.println("Sorry you don't have enough money!");
            return false;
        }
    }
}

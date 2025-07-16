package DesignPrinciplesAndPatterns.Adapter.V3;

public class FastTagRecharge {
    public boolean recharge(int amount, BankAPI bankAPI) { // using interface / adapter instead
        if(bankAPI.checkBalance() > amount) { // using interface / adapter instead
            System.out.println("Successful!");
            return true;
        }
        return false;
    }
}

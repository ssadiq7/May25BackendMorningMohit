package DesignPrinciplesAndPatterns.Adapter.V1;

import DesignPrinciplesAndPatterns.Adapter.V1.BankAPIs.YesBankAPI;

public class FastTagRecharge {
    public boolean recharge(int amount, BankAPI bankAPI) { // using interface / adapter instead
        if(bankAPI.checkBalance() > amount) { // using interface / adapter instead
            System.out.println("Successful!");
            return true;
        }
        return false;
    }
}

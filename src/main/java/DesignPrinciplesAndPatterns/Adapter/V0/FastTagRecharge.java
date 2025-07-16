package DesignPrinciplesAndPatterns.Adapter.V0;

import DesignPrinciplesAndPatterns.Adapter.V0.BankAPIs.YesBankAPI;

public class FastTagRecharge {
    public boolean recharge(int amount, YesBankAPI yesBankAPI) { // if we got to change from Yes Bank to ICICI, we got to change this line
        if(yesBankAPI.getBalance() > amount) { // if we got to change from Yes Bank to ICICI, we got to change this line
            System.out.println("Successful!");
            return true;
        }
        return false;
    }
}

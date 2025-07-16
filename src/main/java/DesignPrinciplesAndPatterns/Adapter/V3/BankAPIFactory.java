package DesignPrinciplesAndPatterns.Adapter.V3;

import DesignPrinciplesAndPatterns.Adapter.V3.BankAPIAdapter.ICICIBankAPIAdapter;
import DesignPrinciplesAndPatterns.Adapter.V3.BankAPIAdapter.YesBankAPIAdapter;

// Simple factory design implementation, creating one object based input String
public class BankAPIFactory {
    public static BankAPI getBankAPIByName(String bankName) {
        BankAPI bankAPI = null;
        if(bankName.equals("ICICI")) {
            bankAPI = new ICICIBankAPIAdapter();
        }
        else if(bankName.equals("YesBank")) {
            bankAPI = new YesBankAPIAdapter();
        }
        return bankAPI;
    }
}

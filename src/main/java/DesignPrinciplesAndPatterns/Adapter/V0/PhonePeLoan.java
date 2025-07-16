package DesignPrinciplesAndPatterns.Adapter.V0;

import DesignPrinciplesAndPatterns.Adapter.V0.BankAPIs.YesBankAPI;

public class PhonePeLoan {
    public boolean checkLoanEligibility(int amount, YesBankAPI yesBankAPI) { // if we got to change from Yes Bank to ICICI, we got to change this line
        // Loan will be given if you have 10% of the loan amount in your bank account
        if(yesBankAPI.getBalance() >= .1 * amount) { // if we got to change from Yes Bank to ICICI, we got to change this line
            System.out.println("Loan can be given!");
            return true;
        }
        return false;
    }
}

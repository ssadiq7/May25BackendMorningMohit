package DesignPrinciplesAndPatterns.Adapter.V3.BankAPIAdapter;

import DesignPrinciplesAndPatterns.Adapter.V3.BankAPI;
import DesignPrinciplesAndPatterns.Adapter.V3.BankAPIs.YesBankAPI;

public class YesBankAPIAdapter implements BankAPI {
    private YesBankAPI yesBankAPI =  new YesBankAPI();

    @Override
    public int checkBalance() {
        return yesBankAPI.getBalance();
    }

    @Override
    public void transferMoney(int amount) {
        yesBankAPI.transfer(amount);
    }
}

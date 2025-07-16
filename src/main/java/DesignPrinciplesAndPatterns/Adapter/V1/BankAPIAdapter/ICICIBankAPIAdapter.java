package DesignPrinciplesAndPatterns.Adapter.V1.BankAPIAdapter;

import DesignPrinciplesAndPatterns.Adapter.V1.BankAPI;
import DesignPrinciplesAndPatterns.Adapter.V1.BankAPIs.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankAPI {
    private ICICIBankAPI icicibankapi = new ICICIBankAPI();

    @Override
    public int checkBalance() {
        return icicibankapi.balanceCheck();
    }

    @Override
    public void transferMoney(int amount) {
        icicibankapi.moneyTransfer(amount);
    }
}

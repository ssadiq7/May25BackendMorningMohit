package DesignPrinciplesAndPatterns.Adapter.V2;

import DesignPrinciplesAndPatterns.Adapter.V2.BankAPI;
import DesignPrinciplesAndPatterns.Adapter.V2.BankAPIAdapter.YesBankAPIAdapter;
import DesignPrinciplesAndPatterns.Adapter.V2.BankAPIAdapter.ICICIBankAPIAdapter;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String bankName = scanner.nextLine();
        BankAPI bankAPI = null;
        if(bankName.equals("ICICI")) {
            bankAPI = new ICICIBankAPIAdapter();
        }
        else if(bankName.equals("YesBank")) {
            bankAPI = new YesBankAPIAdapter();
        }
        PhonePe phonePe =  new PhonePe(bankAPI);
        phonePe.rechargeFastTag(100);
    }
    // We will implement the above code in simple factory design pattern
}

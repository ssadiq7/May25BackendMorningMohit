package DesignPrinciplesAndPatterns.Adapter.V3;

import DesignPrinciplesAndPatterns.Adapter.V3.BankAPIAdapter.ICICIBankAPIAdapter;
import DesignPrinciplesAndPatterns.Adapter.V3.BankAPIAdapter.YesBankAPIAdapter;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String bankName = scanner.nextLine();
//        BankAPI bankAPI = null;
//        if(bankName.equals("ICICI")) {
//            bankAPI = new ICICIBankAPIAdapter();
//        }
//        else if(bankName.equals("YesBank")) {
//            bankAPI = new YesBankAPIAdapter();
//        }
        BankAPI bankAPI = BankAPIFactory.getBankAPIByName(bankName);
        PhonePe phonePe =  new PhonePe(bankAPI);
        phonePe.rechargeFastTag(100);
    }
}

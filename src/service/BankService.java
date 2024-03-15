package service;

import entities.Bank;

import java.util.List;
import java.util.Scanner;

public class BankService {
    public void display(Scanner scanner, List<Bank> banks){
        System.out.println("Moi ban nhap so luong ngan hang muon nhap ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Moi ban nhap ten ngan hang :");
            String name = scanner.nextLine();
            System.out.println("Moi ban nhap lai suat cua ngan hang : ");
            Double interestRate = Double.parseDouble(scanner.nextLine());
            Bank bank = new Bank(name,interestRate);
            banks.add(bank);
        }
        System.out.println(banks);
    }
    public Bank findBankById(Scanner scanner,List<Bank> banks,int idBank){
        for(Bank bank : banks){
            if(bank.getId() == idBank);
            return bank;
        }
        return null;
    }
}

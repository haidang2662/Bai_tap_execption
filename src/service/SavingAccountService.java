package service;

import entities.Bank;
import entities.Customer;
import entities.SavingAccount;

import java.util.List;
import java.util.Scanner;

public class SavingAccountService {



        public void display(Scanner scanner, List<SavingAccount> savingAccounts,List<Customer> customers,List<Bank> banks){
            CustomerService customerService = new CustomerService();
            SavingAccountService savingAccountService = new SavingAccountService();
            BankService bankService = new BankService();
            System.out.println("nhap so lương so tiet kiem muon luu ");
            int n = Integer.parseInt(scanner.nextLine());
            if(n>5){
                System.out.println("So luong luu toi da la 5 so vui long nhap lai ");
                savingAccountService.display(scanner,savingAccounts,customers,banks);
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhap thong tin cho so tiet kiem " +(i+1));
                    System.out.println("Nhap thong tin Id khach hang : ");
                    int idCustomer = Integer.parseInt(scanner.nextLine());
                    Customer customer = customerService.findCustomerrById(scanner,customers,idCustomer);
                    if(customer == null){
                        System.out.println("khach hang khong ton tai vui long nhap lai");
                        continue;
                    } else {
                        System.out.println("Nhap thong tin Id ngan hang : ");
                        int idBank = Integer.parseInt(scanner.nextLine());
                        Bank bank = bankService.findBankById(scanner,banks,idBank);
                        if(bank == null){
                            System.out.println("Ngan hang khong ton tai vui long nhap lai ");
                            continue;
                        } else {
                            System.out.println("vui long nhap so tien gui");
                            Double deposit = Double.parseDouble(scanner.nextLine());
                            SavingAccount savingAccount = new SavingAccount(customer,bank,deposit);
                            savingAccounts.add(savingAccount);
                        }
                    }
                }
                System.out.println(savingAccounts);
            }
        }
}

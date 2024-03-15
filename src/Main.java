import entities.Bank;
import entities.Customer;
import entities.SavingAccount;
import service.BankService;
import service.CustomerService;
import service.SavingAccountService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        CustomerService customerService = new CustomerService();
        List<Customer> customers = new ArrayList<>();
        BankService bankService = new BankService();
        List<Bank> banks = new ArrayList<>();
        SavingAccountService savingAccountService = new SavingAccountService();
        List<SavingAccount> savingAccounts = new ArrayList<>();
        customerService.display(scanner,customers);

    }
}
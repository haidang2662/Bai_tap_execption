package entities;

public class SavingAccount {
    private static int autoId;
    private int id;
    private Customer customer;
    private Bank bank;
    private double deposit;

    public SavingAccount() {
    }

    public SavingAccount(Customer customer, Bank bank, double deposit) {
        this.id = ++autoId;
        this.customer = customer;
        this.bank = bank;
        this.deposit = deposit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "savingAccount{" +
                "id=" + id +
                ", customer=" + customer +
                ", bank=" + bank +
                ", deposit=" + deposit +
                '}';
    }
}

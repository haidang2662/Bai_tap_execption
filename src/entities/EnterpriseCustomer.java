package entities;

public class EnterpriseCustomer extends Customer{
    public EnterpriseCustomer(String name, String address, int telephone) {
        super(name, address, telephone, "Enterprise");
    }
}

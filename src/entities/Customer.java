package entities;

public class Customer {
    private static  int autoId;
    private int id  ;
    private String name;
    private String address;
    private int telephone;
    private String typeCustomer;

    public Customer( String name, String address, int telephone, String typeCustomer) {
        this.id = 10000 + (++autoId);
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.typeCustomer = typeCustomer;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone=" + telephone +
                ", typeCustomer='" + typeCustomer + '\'' +
                '}';
    }
}

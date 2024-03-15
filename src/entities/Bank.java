package entities;

public class Bank {
    private static int autoId;
    private int id ;
    private String name ;
    private double interrestRate;

    public Bank( String name, double interrestRate) {
        this.id = 100 + (++autoId);
        this.name = name;
        this.interrestRate = interrestRate;
    }

    public Bank() {
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

    public double getInterrestRate() {
        return interrestRate;
    }

    public void setInterrestRate(double interrestRate) {
        this.interrestRate = interrestRate;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", interrestRate=" + interrestRate +
                '}';
    }
}

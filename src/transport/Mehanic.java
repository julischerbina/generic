package transport;

import java.util.Objects;

public class Mehanic {
    private String name;
    private String company;

    public Mehanic(String fullName, String company) {
        this.name = fullName;
        this.company = company;
    }

    public void maintenance() {
        System.out.println(name + " из компании " + company + " проводит техобслуживание");
    }

    public void fixing() {
        System.out.println(name + " из компании " + company + " чинит автомобиль");
    }

    public String getFullName() {
        return name;
    }

    public void setFullName(String fullName) {
        this.name = fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return name + " из компании " + company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mehanic mehanic = (Mehanic) o;
        return Objects.equals(name, mehanic.name) && Objects.equals(company, mehanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }
}

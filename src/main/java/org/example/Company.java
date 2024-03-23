package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public void addEmployee(int index, String name) {
        if (this.developerNames.length - 1 >= index && index > 0) {
            if (this.developerNames[index] == null) {
                this.developerNames[index] = name;
            } else {
                System.out.println("This developer names field not empty");
            }
        }
    }

    public Company(int id, String name, double giro, String[] developerNames) {
        setId(id);
        setName(name);
        setGiro(giro);
        setDeveloperNames(developerNames);
    }

    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
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

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = Math.max(giro, 0);
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }
}

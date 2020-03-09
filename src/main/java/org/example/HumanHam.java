package org.example;


import java.util.List;

public class HumanHam {

    private String name;
    private int age;
    private double weight;
    private List<String> jobs;

    public HumanHam(String name, int age, double weight, List<String> jobs) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.jobs = jobs;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public List<String> getJobs() {
        return jobs;
    }
}


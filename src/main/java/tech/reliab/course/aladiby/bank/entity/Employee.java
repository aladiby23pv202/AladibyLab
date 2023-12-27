package main.java.tech.reliab.course.aladiby.bank.entity;

import java.time.LocalDate;

public class Employee {
    // Id сотрудника
    private int id;
    //ФИО
    private String fullName;
    //Дата рождения
    private LocalDate dateOfBirth;
    //Должность
    private String jobPosition;
    //В каком банке работает
    private Bank bank;
    //Работает ли в банковском офисе или удаленно? (да/нет)
    private boolean isRemote;
    //Банковский офис, в котором работает
    private BankOffice office;
    //Может ли выдавать кредиты? (да/нет)
    private boolean canIssueCredit;
    //Размер зарплаты
    private double salary;

    //конструктор
    public Employee(int id, String fullName, LocalDate dateOfBirth, String jobPosition, Bank bank,
                    boolean isRemote, BankOffice office, boolean canIssueCredit, double salary) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.jobPosition = jobPosition;
        this.bank = bank;
        this.isRemote = isRemote;
        this.office = office;
        this.canIssueCredit = canIssueCredit;
        this.salary = salary;
    }

    //вывести всю информацию о сотруднике банка
    @Override
    public String toString() {
        return "---------------------------------------------" + "\n" +
                "Информация о сотруднике банка" + "\n" +
                "id: " + id + "\n" +
                "ФИО: " + fullName + "\n" +
                "Дата рождения: " + dateOfBirth + "\n" +
                "Должность: " + jobPosition + "\n" +
                "В каком банке работает: " + bank.getName() + "\n" +
                "Работает удаленно: " + isRemote + "\n" +
                "Банковский офис: " + office.getName() + "\n" +
                "Работник выдает кредиты: " + (canIssueCredit ? "да" : "нет") + "\n" +
                "Зарплата: " + String.format("%.2f", salary) + "\n\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public boolean getIsRemote() {
        return isRemote;
    }

    public void setIsRemote(boolean remote) {
        isRemote = remote;
    }

    public BankOffice getOffice() {
        return office;
    }

    public void setOffice(BankOffice office) {
        this.office = office;
    }

    public boolean getCanIssueCredit() {
        return canIssueCredit;
    }

    public void setCanIssueCredit(boolean canIssueCredit) {
        this.canIssueCredit = canIssueCredit;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
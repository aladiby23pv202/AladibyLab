package main.java.tech.reliab.course.aladiby.bank.entity;

import java.util.Random;
import java.util.ArrayList;

public class Bank {
    //Id банка
    private int id;
    //Имя банка
    private String name;
    //Кол-во офисов
    private ArrayList<BankOffice> bankOffices;      //private int numberOfOffices;
    //Кол-во банкоматов
    private ArrayList<BankAtm> bankAtms;            //private int numberOfAtms;
    //Кол-во сотрудников
    private ArrayList<Employee> employees;          //private int numberOfEmployees;
    //Кол-во клиентов
    private ArrayList<User> users;                  //private int numberOfClients;
    //Рейтинг банка
    private int bankRating;
    //Всего денег в банке
    private double totalMoney;
    //Процентная ставка
    private double interestRate;

    //конструктор
    public Bank(int id, String name) {
        this.id = id;
        this.name = name;
        this.bankOffices = new ArrayList<>();       //this.numberOfOffices = 0;
        this.bankAtms = new ArrayList<>();          //this.numberOfAtms = 0;
        this.employees = new ArrayList<>();         //this.numberOfEmployees = 0;
        this.users = new ArrayList<>();             //this.numberOfClients = 0;
        this.bankRating = generateRandomRating();
        this.totalMoney = generateRandomMoneyAmount();
        this.interestRate = generateRandomInterestRate();
    }

    //генерируется рандомно, от 0 до 100, где 100 наивысший балл,
    // чем выше рейтинг банка, тем меньше должна быть процентная ставка
    private int generateRandomRating() {
        return (int) (Math.random() * 101);
    }

    //генерируется рандомно, но не более 1 000 000
    private int generateRandomMoneyAmount() {
        return (int) (Math.random() * 1000000);
    }

    //генерируется рандомно, но не более 20%,
    // однако нужно учитывать рейтинг банка,
    // чем он выше, тем ставка должна сгенерироваться меньше
    private double generateRandomInterestRate() {
        Random random = new Random();
        return random.nextInt(21) * (1 - (double) this.interestRate / 100);
    }

    //вывести id и статус банкомата
    private String bankAtmsToString() {
        StringBuilder result = new StringBuilder();
        for (BankAtm atm : bankAtms) {
            result.append("  ID: ").append(atm.getId())
                    .append(", Статус: ").append(atm.getStatus())
                    .append("\n");
        }
        return result.toString();
    }

    //вывести id и Название офис банка
    private String bankOfficesToString() {
        StringBuilder result = new StringBuilder();
        for (BankOffice office : bankOffices) {
            result.append("  ID: ").append(office.getId())
                    .append(", Название: ").append(office.getName())
                    .append("\n");
        }
        return result.toString();
    }

    //вывести всю информацию о банке
    @Override
    public String toString() {
        return "---------------------------------------------" + "\n" +
                "Информация о банке" + "\n" +
                "id: " + id + "\n" +
                "Название: " + name + "\n" +
                "Количество офисов: " + bankOffices.size() + "\n" +
                "Офисы банка:\n" + bankOfficesToString() + "\n" +
                "Количество банкоматов: " + bankAtms.size() + "\n" +
                "Количество сотрудников: " + employees.size() + "\n" +
                "Количество клиентов: " + users.size() + "\n" +
                "Рейтинг банка: " + bankRating + "\n" +
                "Количество денег в банке: " + totalMoney + "\n" +
                "Процентная ставка: " + interestRate + "\n\n";
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

    public int getBankRating() {
        return bankRating;
    }

    public void setBankRating(int bankRating) {
        this.bankRating = bankRating;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public ArrayList<BankOffice> getBankOffices() {
        return bankOffices;
    }

    public void setBankOffices(ArrayList<BankOffice> bankOffices) {
        this.bankOffices = bankOffices;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<BankAtm> getBankAtms() {
        return bankAtms;
    }

    public void setBankAtms(ArrayList<BankAtm> bankAtms) {
        this.bankAtms = bankAtms;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

}
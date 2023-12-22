package main.java.tech.reliab.course.aladiby.bank.entity;

import java.util.Random;

public class Bank {
    //Id банка
    private int id;
    //Имя банка
    private String name;
    //Кол-во офисов
    private int numberOfOffices;
    //Кол-во банкоматов
    private int numberOfAtms;
    //Кол-во сотрудников
    private int numberOfEmployees;
    //Кол-во клиентов
    private int numberOfClients;
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
        this.numberOfOffices = 0;
        this.numberOfAtms = 0;
        this.numberOfEmployees = 0;
        this.numberOfClients = 0;
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

    //вывести всю информацию о банке
    @Override
    public String toString() {
        return "---------------------------------------------" + "\n" +
                "Информация о банке" + "\n" +
                "id: " + id + "\n" +
                "Название: " + name + "\n" +
                "Количество офисов: " + numberOfOffices + "\n" +
                "Количество банкоматов: " + numberOfAtms + "\n" +
                "Количество сотрудников: " + numberOfEmployees + "\n" +
                "Количество клиентов: " + numberOfClients + "\n" +
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

    public int getNumberOfOffices() {
        return numberOfOffices;
    }

    public void setNumberOfOffices(int numberOfOffices) {
        this.numberOfOffices = numberOfOffices;
    }

    public int getNumberOfAtms() {
        return numberOfAtms;
    }

    public void setNumberOfAtms(int numberOfAtms) {
        this.numberOfAtms = numberOfAtms;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
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

}
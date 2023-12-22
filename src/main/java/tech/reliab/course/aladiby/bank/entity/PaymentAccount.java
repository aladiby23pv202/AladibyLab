package main.java.tech.reliab.course.aladiby.bank.entity;


public class PaymentAccount {
    //Id платёжного счета
    private int id;
    //Пользователь, за которым закреплен этот платежный счет
    private User user;
    //Название банка, в котором открыт этот счет
    private Bank bank;
    //Сумма, которая лежит в данный момент на счету (по умолчанию 0)
    private double balance;

    //конструктор
    public PaymentAccount(int id, User user, Bank bank, double balance) {
        this.id = id;
        this.user = user;
        this.bank = bank;
        this.balance = balance;
    }

    //вывести всю информацию о  платежном счете
    @Override
    public String toString() {
        return "---------------------------------------------" + "\n" +
                "Информация о платежном счете" + "\n" +
                "id: " + id + "\n" +
                "Пользователь,: " + user.getFullName() + "\n" +
                "Название банка: " + bank.getName() + "\n" +
                "Сумма на счету: " + String.format("%.2f", balance) + "\n\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
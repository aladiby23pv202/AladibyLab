package main.java.tech.reliab.course.aladiby.bank.entity;

import java.time.LocalDate;

public class CreditAccount {
    // Id кредитного счета
    private int id;
    //Пользователь, за которым закреплен этот кредитный счет
    private User user;
    //Название банка, где взят кредит
    private Bank bank;
    //Дата начала кредита
    private LocalDate loanStartDate;
    //Дата окончания кредита
    private LocalDate loanExpirationDate;
    //Кол-во месяцев, на которые взят кредит
    private int months;
    //Сумма кредита
    private double amountOfCredit;
    //Ежемесячный платеж
    private double monthlyPayment;
    //Процентная ставка
    private double interestRate;
    //Сотрудник, который выдал кредит
    private Employee employee;
    //Платежный счет в банке с которого будет осуществляться погашение данного кредита
    private PaymentAccount paymentAccount;

    //конструктор
    public CreditAccount(int id, User user, Bank bank, LocalDate loanStartDate, LocalDate loanExpirationDate, int months,
                         double amountOfCredit, double monthlyPayment, double interestRate,
                         Employee employee, PaymentAccount paymentAccount) {
        this.id = id;
        this.user = user;
        this.bank = bank;
        this.loanStartDate = loanStartDate;
        this.loanExpirationDate = loanExpirationDate;
        this.months = months;
        this.amountOfCredit = amountOfCredit;
        this.monthlyPayment = monthlyPayment;
        this.interestRate = interestRate;
        this.employee = employee;
        this.paymentAccount = paymentAccount;
    }

    //вывести всю информацию о кредитном счете
    @Override
    public String toString() {
        return "---------------------------------------------" + "\n" +
                "Информация о кредитном счете" + "\n" +
                "id: " + id + "\n" +
                "Пользователь,: " + user.getFullName() + "\n" +
                "Банк: " + bank.getName() + "\n" +
                "Дата начала кредита: " + loanStartDate + "\n" +
                "Дата окончания кредита: " + loanExpirationDate + "\n" +
                "Количество месяцев кредита: " + months + "\n" +
                "Сумма кредита: " + String.format("%.2f",amountOfCredit) + "\n" +
                "Ежемесячный платеж " + String.format("%.2f", monthlyPayment) + "\n" +
                "Процентная ставка: " + String.format("%.2f", interestRate) + "\n" +
                "Сотрудник, который выдал кредит: " + employee + "\n" +
                "Платежный счет в банке: " + paymentAccount + "\n\n";
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

    public LocalDate getLoanStartDate() {
        return loanStartDate;
    }

    public void setLoanStartDate(LocalDate loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    public LocalDate getLoanExpirationDate() {
        return loanExpirationDate;
    }

    public void setLoanExpirationDate(LocalDate loanExpirationDate) {
        this.loanExpirationDate = loanExpirationDate;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public double getAmountOfCredit() {
        return amountOfCredit;
    }

    public void setAmountOfCredit(double amountOfCredit) {
        this.amountOfCredit = amountOfCredit;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getInterestRate() { return interestRate; }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

}

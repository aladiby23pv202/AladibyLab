package main.java.tech.reliab.course.aladiby.bank.service;

import main.java.tech.reliab.course.aladiby.bank.entity.*;

import java.time.LocalDate;

public interface CreditAccountService {
    //создать кредитный счет
    public CreditAccount createCreditAccount(CreditAccount creditAccount);
    //изменить процентную ставку
    public Boolean updateInterestRate(CreditAccount creditAccount, Bank bank);
    //Получение кредита от клиента
    void obtainingCredit(int id, User user, Bank bank,BankOffice bankOffice, LocalDate loanStartDate,
                    LocalDate loanExpirationDate, int months,  double amountOfCredit, double monthlyPayment,
                    double interestRate, Employee employee, PaymentAccount paymentAccount);
}
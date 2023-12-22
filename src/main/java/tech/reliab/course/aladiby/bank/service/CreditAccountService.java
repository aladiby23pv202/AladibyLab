package main.java.tech.reliab.course.aladiby.bank.service;

import main.java.tech.reliab.course.aladiby.bank.entity.CreditAccount;
import main.java.tech.reliab.course.aladiby.bank.entity.Bank;


public interface CreditAccountService {
    //создать кредитный счет
    public CreditAccount createCreditAccount(CreditAccount creditAccount);
    //изменить процентную ставку
    public Boolean updateInterestRate(CreditAccount creditAccount, Bank bank);
}
package main.java.tech.reliab.course.aladiby.bank.service.impl;

import main.java.tech.reliab.course.aladiby.bank.entity.CreditAccount;
import main.java.tech.reliab.course.aladiby.bank.entity.Bank;
import main.java.tech.reliab.course.aladiby.bank.service.CreditAccountService;


public class CreditAccountServiceImpl implements CreditAccountService {
    @Override
    public CreditAccount createCreditAccount(CreditAccount creditAccount) {
        CreditAccount newCreditAccount = new CreditAccount(creditAccount.getId(), creditAccount.getUser(),
                creditAccount.getBank(), creditAccount.getLoanStartDate(), creditAccount.getLoanExpirationDate(),
                creditAccount.getMonths(), creditAccount.getAmountOfCredit(), creditAccount.getMonthlyPayment(),
                creditAccount.getInterestRate(), creditAccount.getEmployee(),creditAccount.getPaymentAccount());
        return newCreditAccount;
    }

    @Override
    public Boolean updateInterestRate(CreditAccount creditAccount, Bank bank) {
        if (creditAccount != null && bank != null) {
            creditAccount.setInterestRate((bank.getInterestRate()));
            return true;
        }
        return false;
    }
}


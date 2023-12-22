package main.java.tech.reliab.course.aladiby.bank.service.impl;

import main.java.tech.reliab.course.aladiby.bank.entity.Bank;
import main.java.tech.reliab.course.aladiby.bank.entity.User;
import main.java.tech.reliab.course.aladiby.bank.entity.CreditAccount;
import main.java.tech.reliab.course.aladiby.bank.entity.PaymentAccount;
import main.java.tech.reliab.course.aladiby.bank.service.UserService;


public class UserServiceImpl implements UserService {

    @Override
    public User createUser(User user) {
        User newUser = new User(user.getId(), user.getFullName(), user.getDateOfBirth(),user.getWorkPlace());
        return newUser;
    }

    @Override
    public Boolean addBank(User user, Bank bank) {
        if (user != null && bank != null) {
            user.getBanks().add(bank);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteBank(User user, Bank bank) {
        if (user != null && bank != null) {
            return user.getBanks().remove(bank);
        }
        return false;
    }

    @Override
    public Boolean addCreditAccount(User user, CreditAccount creditAccount) {
        if (user != null && creditAccount != null) {
            user.getCreditAccounts().add(creditAccount);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteCreditAccount(User user, CreditAccount creditAccount) {
        if (user != null && creditAccount != null) {
            return user.getCreditAccounts().remove(creditAccount);
        }
        return false;
    }

    @Override
    public Boolean addPaymentAccount(User user, PaymentAccount paymentAccount) {
        if (user != null && paymentAccount != null) {
            user.getPaymentAccounts().add(paymentAccount);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deletePaymentAccount(User user, PaymentAccount paymentAccount) {
        if (user != null && paymentAccount != null) {
            return user.getPaymentAccounts().remove(paymentAccount);
        }
        return false;
    }
}
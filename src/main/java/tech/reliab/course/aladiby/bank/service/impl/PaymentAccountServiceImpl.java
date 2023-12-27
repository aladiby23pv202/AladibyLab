package main.java.tech.reliab.course.aladiby.bank.service.impl;

import main.java.tech.reliab.course.aladiby.bank.entity.PaymentAccount;
import main.java.tech.reliab.course.aladiby.bank.service.PaymentAccountService;



public class PaymentAccountServiceImpl implements PaymentAccountService {
    @Override
    public PaymentAccount createPaymentAccount(PaymentAccount paymentAccount) {
        PaymentAccount newPaymentAccount = new PaymentAccount(paymentAccount.getId(),
                paymentAccount.getUser(), paymentAccount.getBank(), paymentAccount.getBalance());
        return newPaymentAccount;
    }
}

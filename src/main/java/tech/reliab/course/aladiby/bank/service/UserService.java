package main.java.tech.reliab.course.aladiby.bank.service;

import main.java.tech.reliab.course.aladiby.bank.entity.Bank;
import main.java.tech.reliab.course.aladiby.bank.entity.CreditAccount;
import main.java.tech.reliab.course.aladiby.bank.entity.PaymentAccount;
import main.java.tech.reliab.course.aladiby.bank.entity.User;


public interface UserService {
    //Создать пользователя
    public User createUser(User user);
    //связь между пользователем и банком (добавить банк к пользователю)
    public Boolean addBank(User user, Bank bank);
    //удалить банк
    public Boolean deleteBank(User user, Bank bank);
    //связь между пользователем и кредитным счетом (добавление кредитного счета пользователю)
    public Boolean addCreditAccount(User user, CreditAccount creditAccount);
    //удалить кредитный счет
    public Boolean deleteCreditAccount(User user, CreditAccount creditAccount);
    //связь между пользователем и платежным аккаунтом (добавление платежного аккаунта пользователю)
    public Boolean addPaymentAccount(User user, PaymentAccount paymentAccount);
    //удалить платежный аккаунт
    public Boolean deletePaymentAccount(User user, PaymentAccount paymentAccount);
}

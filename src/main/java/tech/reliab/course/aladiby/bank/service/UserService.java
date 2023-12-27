package main.java.tech.reliab.course.aladiby.bank.service;

import main.java.tech.reliab.course.aladiby.bank.entity.Bank;
import main.java.tech.reliab.course.aladiby.bank.entity.CreditAccount;
import main.java.tech.reliab.course.aladiby.bank.entity.PaymentAccount;
import main.java.tech.reliab.course.aladiby.bank.entity.User;

import java.util.ArrayList;
import java.util.List;


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
    //получить информацию о пользователе
    String getInfo(User user);
    //получить пользователя по его id
    public User getUserById(ArrayList<User> users, int userId);
    //экспорт аккаунты пользователей
    public boolean exportUserAccounts(ArrayList<User> users, int userId, int bankId);
    //получить все кредитные счета
    public List<CreditAccount> getAllCreditAccounts(ArrayList<User> users, int userId);

}

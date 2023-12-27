package main.java.tech.reliab.course.aladiby.bank.service.impl;

import main.java.tech.reliab.course.aladiby.bank.entity.Bank;
import main.java.tech.reliab.course.aladiby.bank.entity.User;
import main.java.tech.reliab.course.aladiby.bank.entity.CreditAccount;
import main.java.tech.reliab.course.aladiby.bank.entity.PaymentAccount;
import main.java.tech.reliab.course.aladiby.bank.service.UserService;

import java.util.ArrayList;
import java.util.Collections;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public String getInfo(User user){
        String res = "";

        res += user.toString();

        res += "\n\nИнформация о платёжных счётах:\n";
        for (PaymentAccount paymentAccount: user.getPaymentAccounts()){
            res += paymentAccount.toString();
            res += "\n\n";
        }

        res += "\n\nИнформация о кредитных счётах:\n";
        for (CreditAccount creditAccount: user.getCreditAccounts()){
            res += creditAccount.toString();
            res += "\n\n";
        }
        return res;
    }

    @Override
    public User getUserById(ArrayList<User> users, int userId) {
        for (User user : users) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<CreditAccount> getAllCreditAccounts(ArrayList<User> users, int userId) {
        User user = getUserById(users, userId);
        if (user != null) {
            return user.getCreditAccounts();
        }
        return Collections.emptyList();
    }

    @Override
    public boolean exportUserAccounts(ArrayList<User> users, int userId, int bankId) {
        User user = getUserById(users, userId);
        if (user == null || (user.getCreditAccounts().isEmpty() && user.getPaymentAccounts().isEmpty())) {
            System.out.println("User or accounts not found.");
            return false;
        }
        try {
            List<CreditAccount> userCreditAccounts = getAllCreditAccounts(users, userId);

            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .excludeFieldsWithoutExposeAnnotation()
                    .create();
            PrintWriter out = new PrintWriter("user_" + userId + "_accounts_of_bank_" + bankId + ".txt");
            List<Object> allAccountInfos = new ArrayList<>();
            allAccountInfos.addAll(userCreditAccounts);
            allAccountInfos.addAll(user.getPaymentAccounts());
            out.println(gson.toJson(allAccountInfos));
            out.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            return false;
        }
    }

}
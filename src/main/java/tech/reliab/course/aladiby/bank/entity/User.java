package main.java.tech.reliab.course.aladiby.bank.entity;

import java.util.ArrayList;
import java.util.Random;
import java.time.LocalDate;

public class User {
    // Id клиента
    private int id;
    //ФИО
    private String fullName;
    //Дата рождения
    private LocalDate dateOfBirth;
    //Место работы
    private String workPlace;
    //Ежемесячный доход
    private double monthlyIncome;
    //Банки, которыми он пользуется
    private ArrayList<Bank> banks;
    //Кредитные счета (по умолчанию пусто)
    private ArrayList<CreditAccount> creditAccounts;
    //Платежные счета (по умолчанию пусто)
    private ArrayList<PaymentAccount> paymentAccounts;
    //Кредитный рейтинг для банка
    private int creditRating;

    //конструктор
    public User(int id, String fullName, LocalDate dateOfBirth, String workPlace) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.workPlace = workPlace;

        //Генерируем случайный ежемесячный доход от 0 до 10 000 (включительно)
        this.monthlyIncome = generateRandomMonthlyIncome();

        this.banks = new ArrayList<>();
        this.creditAccounts = new ArrayList<>();
        this.paymentAccounts = new ArrayList<>();

        // Генерация кредитного рейтинга на основе ежемесячного дохода
        if (monthlyIncome < 1000)
            this.creditRating = 100;
        else if (monthlyIncome >= 1000 && monthlyIncome < 2000)
            this.creditRating = 200;

    }

    //генерируется рандомно, но не более 10 000
    private double generateRandomMonthlyIncome() {
        return new Random().nextInt(10001);
    }

    //вывести Банки, которыми он пользуется
    private String banksToString() {
        StringBuilder result = new StringBuilder();
        for (Bank bank : banks) {
            result.append(bank.getName()).append(", ");
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }
        return result.toString();
    }

    //вывести Кредитные счета, которыми он пользуется
    private String creditAccountsToString() {
        StringBuilder result = new StringBuilder();
        for (CreditAccount creditAccount : creditAccounts) {
            result.append(creditAccount.getId()).append(", ");
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }
        return result.toString();
    }

    //вывести Платежные счета, которыми он пользуется
    private String paymentAccountsToString() {
        StringBuilder result = new StringBuilder();
        for (PaymentAccount paymentAccount : paymentAccounts) {
            result.append(paymentAccount.getId()).append(", ");
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }
        return result.toString();
    }

    //вывести всю информацию о клиенте банка
    @Override
    public String toString() {
        return "---------------------------------------------" + "\n" +
                "Информация о клиенте банка" + "\n" +
                "id: " + id + "\n" +
                "Пользователь,: " + fullName + "\n" +
                "День рождения: " + dateOfBirth + "\n" +
                "Место работы: " + workPlace + "\n" +
                "Ежемесячный доход: " + String.format("%.2f", monthlyIncome) + "\n" +
                "Банки: " + banksToString() + "\n" +
                "Кредитные счета: " + creditAccountsToString() + "\n" +
                "Платежные счета: " + paymentAccountsToString() + "\n\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public ArrayList<Bank> getBanks() {
        return banks;
    }

    public void setBanks(ArrayList<Bank> banks) {
        this.banks = banks;
    }

    public void addBank(Bank bank) {
        banks.add(bank);
    }

    public void removeBank(Bank bank) {
        banks.remove(bank);
    }

    public ArrayList<CreditAccount> getCreditAccounts() {
        return creditAccounts;
    }

    public void setCreditAccounts(ArrayList<CreditAccount> creditAccounts) {
        this.creditAccounts = creditAccounts;
    }

    public void addCreditAccount(CreditAccount creditAccount) {
        creditAccounts.add(creditAccount);
    }

    public void removeCreditAccount(CreditAccount creditAccount) {
        creditAccounts.remove(creditAccount);
    }

    public ArrayList<PaymentAccount> getPaymentAccounts() {
        return paymentAccounts;
    }

    public void setPaymentAccounts(ArrayList<PaymentAccount> paymentAccounts) {
        this.paymentAccounts = paymentAccounts;
    }

    public void addPaymentAccount(PaymentAccount paymentAccount) {
        paymentAccounts.add(paymentAccount);
    }

    public void removePaymentAccount(PaymentAccount paymentAccount) {
        paymentAccounts.remove(paymentAccount);
    }

    public int getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(int creditRating) {
        this.creditRating = creditRating;
    }

}
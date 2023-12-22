package main.java.tech.reliab.course.aladiby.bank;

import main.java.tech.reliab.course.aladiby.bank.entity.*;
import main.java.tech.reliab.course.aladiby.bank.service.impl.*;
import main.java.tech.reliab.course.aladiby.bank.utils.AtmStatus;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BankServiceImpl bankService = new BankServiceImpl();
        Bank bank = bankService.createBank(new Bank(1, "банк №1"));

        BankOfficeServiceImpl bankOfficeService = new BankOfficeServiceImpl();
        BankOffice bankOffice = bankOfficeService.createBankOffice(new BankOffice(1, "офис №1", "Белгород ул Костюкова 44", true,
                true, 10, true, true, true, 1, 15000));
        bankOfficeService.updateTotalMoney(bankOffice, bank);
        bankOfficeService.updateNumberOfAtms(bankOffice, bank);
        bankService.addOffice(bank, bankOffice);

        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        Employee employee = employeeService.createEmployee(new Employee(1, "Сотрудник №1", LocalDate.of(1999, 1, 1),
                "Кредитный специалист", bank, false, bankOffice, true, 35000));
        bankService.addEmployee(bank, employee);

        BankAtmServiceImpl bankAtmService = new BankAtmServiceImpl();
        BankAtm bankAtm = bankAtmService.createBankAtm(new BankAtm(1, "atm №1", "Белгород ул Костюкова 44", AtmStatus.WORKING,
                bank, bankOffice, employee, true, true, 100000, 15000));
        bankAtmService.updateTotalMoney(bankAtm, bank);
        bankAtmService.updateBankOfficeAddress(bankAtm, bankOffice);
        bankService.addAtm(bank, bankAtm);

        UserServiceImpl userService = new UserServiceImpl();
        User user = userService.createUser(new User(1, "пользователь №1", LocalDate.of(1998, 1, 1), "БГТУ"));

        bankService.addClient(bank, user);

        PaymentAccountServiceImpl paymentAccountService = new PaymentAccountServiceImpl();
        PaymentAccount paymentAccount = paymentAccountService.createPaymentAccount(new PaymentAccount(1, user, bank, 15390));

        CreditAccountServiceImpl creditAccountService = new CreditAccountServiceImpl();
        CreditAccount creditAccount = creditAccountService.createCreditAccount(new CreditAccount(1, user, bank, LocalDate.of(2023, 1, 1),
                LocalDate.of(2024, 1, 1), 12, 12000, 1100, 10, employee, paymentAccount));
        creditAccountService.updateInterestRate(creditAccount, bank);


        userService.addBank(user, bank);
        userService.addCreditAccount(user, creditAccount);
        userService.addPaymentAccount(user, paymentAccount);

        System.out.print(bank);
        System.out.print(bankAtm);
        System.out.print(employee);
        System.out.print(bankOffice);
        System.out.print(user);
        System.out.print(paymentAccount);
        System.out.print(creditAccount);

    }
}


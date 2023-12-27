package main.java.tech.reliab.course.aladiby.bank;

import main.java.tech.reliab.course.aladiby.bank.entity.*;
import main.java.tech.reliab.course.aladiby.bank.service.*;
import main.java.tech.reliab.course.aladiby.bank.service.impl.*;
import main.java.tech.reliab.course.aladiby.bank.utils.AtmStatus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static void getBanks(ArrayList <Bank> bank) {
        int size = bank.size();
        for (int i = 0; i < size; i++) {
            System.out.printf("Id:%d Название:%s%n", bank.get(i).getId(), bank.get(i).getName());
        }
    }
     static void lab_4() {

        ArrayList<Bank> banks = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();
        BankService bankService = new BankServiceImpl();
        BankAtmService atmService = new BankAtmServiceImpl();
        BankOfficeService bankOfficeService = new BankOfficeServiceImpl();
        EmployeeService employeeService = new EmployeeServiceImpl();
        CreditAccountService creditAccountService = new CreditAccountServiceImpl();
        PaymentAccountService paymentAccountService = new PaymentAccountServiceImpl();
        UserService userService = new UserServiceImpl();

        for (int i = 0; i < 5; i++) {
            Bank bank = bankService.createBank(new Bank(i, "Банк №" + i));
            banks.add(bank);
            for (int j = 0; j < 3; j++) {
                BankOffice bankOffice = bankOfficeService.createBankOffice(new BankOffice(j,
                        "Офис №" + j, "Белгород ул Костюкова 44", true, true, true, true, true, 1, 15000));
                bankService.addOffice(banks.get(i), bankOffice);
                bankOfficeService.updateTotalMoney(bankOffice, banks.get(i));
                bankOfficeService.updateNumberOfAtms(bankOffice, banks.get(i));
                bankOfficeService.updateNumberOfEmployees(bankOffice, banks.get(i));

                BankAtm bankAtm = atmService.createBankAtm(new BankAtm(j, "ATM №" + j,
                        AtmStatus.WORKING, bank, null, null, true, true, 15000));
                bankService.addAtm(banks.get(i), bankAtm);
                bankOfficeService.addAtm(banks.get(i).getBankOffices().get(j), bankAtm);
                atmService.updateTotalMoney(bankAtm, banks.get(i));
                atmService.updateBankOfficeAddress(bankAtm, banks.get(i).getBankOffices().get(j));

                for (int k = 0; k < 3; k++) {
                    int temp = 3 * (j + 3 * i) + k;
                    Employee employee = employeeService.createEmployee(new Employee(temp, "Сотрудник №" + temp
                            , LocalDate.of(1999, 1, 1), "Кредитный специалист", banks.get(i), false,
                            bankOffice, true, 35000));
                    bankService.addEmployee(banks.get(i), employee);
                }
            }
            for (int user_i = 0; user_i < 5; user_i++) {
                User user = userService.createUser(new User(user_i, "Пользователь №" + user_i,
                        LocalDate.of(1998, 1, 1), "БГТУ"));
                users.add(user);
                bankService.addClient(banks.get(i), user);

                for (int paymentAccountId = 0; paymentAccountId < 2; paymentAccountId++) {
                    PaymentAccount paymentAccount = paymentAccountService.createPaymentAccount(new PaymentAccount(
                            paymentAccountId, user, bank, 15390));
                    userService.addPaymentAccount(user, paymentAccount);
                }
                for (int creditAccountId = 0; creditAccountId < 2; creditAccountId++) {
                    CreditAccount creditAccount = creditAccountService.createCreditAccount(new CreditAccount(creditAccountId, user, bank,
                            LocalDate.of(2023, 1, 1), LocalDate.of(2024, 1, 1), 12, 12000, 1100, 10, null, null));
                    creditAccountService.updateInterestRate(creditAccount, bank);
                    userService.addCreditAccount(user, creditAccount);
                }
            }
        }

         Scanner sc = new Scanner(System.in);
         boolean flag = true;
         while (flag) {
             System.out.println("Что вы хотите сделать?\n" +
                     "1.Посмотреть информацию о банке\n" +
                     "2.Вывести все свои счета в консоль\n" +
                     "3.Открыть кредит\n" +
                     "4.Перевести пользователя в другой банк\n" +
                     "5.Экспортировать счета пользователя в текстовый файл\n" +
                     "6.Выйти");

             int number = sc.nextInt();
             switch (number) {
                 case 1:
                     getBanks(banks);
                     System.out.println("Введите Id банка");
                     int num = sc.nextInt();
                     if (num < 5)
                         System.out.println(bankService.getInfo(banks.get(num)));
                     else
                         System.out.println("Банка с таким Id не существует");
                     break;
                 case 2:
                     System.out.println("Введите Ваш id");
                     int us = sc.nextInt();
                     if (us < 5)
                         System.out.println(userService.getInfo(users.get(us)));
                     else
                         System.out.println("Пользователя с таким Id не существует");
                     break;
                 case 3:
                     System.out.println("Введите Id пользователя");
                     int userId = sc.nextInt();
                     User user = users.get(userId);
                     System.out.println("Введите Id банка");
                     int bankId = sc.nextInt();
                     Bank bank = banks.get(bankId);
                     System.out.println("Введите Id офиса банка");
                     int bankOfficeId = sc.nextInt();
                     BankOffice bankOffice = bank.getBankOffices().get(bankOfficeId);
                     System.out.println("Введите Id сотрудника, который оформит кредит");
                     int employeeId = sc.nextInt();
                     Employee employee = bank.getBankOffices().get(bankOfficeId).getBankOfficeEmployees().get(employeeId);
                     System.out.println("Введите сумму кредита");
                     double amountOfCredit = sc.nextDouble();
                     creditAccountService.obtainingCredit(users.size() + 1, user, bank, bankOffice, LocalDate.now(),
                             LocalDate.now().plusMonths(12), 12, amountOfCredit, 100.0, 100.0, employee,null);
                     break;
                 case 4:
                     System.out.println("Введите Id пользователя");
                     int userIdForTransfer = sc.nextInt();
                     User userForTransfer = users.get(userIdForTransfer);
                     System.out.println("Введите Id нового банка");
                     int newBankId = sc.nextInt();
                     bankService.transferClient(userForTransfer, newBankId, banks, bankService);
                     break;
                 case 5:
                     System.out.println("Введите Id пользователя");
                     int userIdForExport = sc.nextInt();
                     System.out.println("Введите Id банка");
                     int bankIdForExport = sc.nextInt();
                     userService.exportUserAccounts(users, userIdForExport, bankIdForExport);
                     break;
                 case 6:
                     flag = false;
                     break;
             }
        }
    }
    public static void main(String[] args) {
        lab_4();
    }
}

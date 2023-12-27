package main.java.tech.reliab.course.aladiby.bank.service.impl;

import main.java.tech.reliab.course.aladiby.bank.entity.*;
import main.java.tech.reliab.course.aladiby.bank.exception.*;
import main.java.tech.reliab.course.aladiby.bank.service.CreditAccountService;
import main.java.tech.reliab.course.aladiby.bank.utils.AtmStatus;

import java.time.LocalDate;
import java.util.ArrayList;

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

    @Override
    public void obtainingCredit(int id, User user, Bank bank,BankOffice bankOffice, LocalDate loanStartDate,
                           LocalDate loanExpirationDate, int months,  double amountOfCredit, double monthlyPayment,
                           double interestRate, Employee employee, PaymentAccount paymentAccount)
    {
        try {
            if (bankOffice.getStatus() == false)
                throw new BankOfficeNotWorkingException();
            if (bankOffice.getAtmPlacementAllowed() == false)
                throw new AtmNotAllowedException();
            if (bankOffice.getTotalMoney() < amountOfCredit)
                throw new NoMoneyInBankException();
            if (bankOffice.getCreditApplicationAllowed() == false)
                throw new BankOfficeApplicationException();
            if (user.getCreditRating() < 5000 && bank.getInterestRate() > 50)
                throw new LowRatingException();
            if (employee.getCanIssueCredit() == false)
                throw new EmployeeException();

            for (BankAtm bankAtm : bankOffice.getBankOfficeAtms()) {
                if (bankAtm.getStatus() == AtmStatus.WORKING && bankAtm.getTotalMoney() >= amountOfCredit) {
                    ArrayList<CreditAccount> creditAccounts;
                    CreditAccount creditAccount;
                    creditAccount = new CreditAccount(id, user, bank, loanStartDate, loanExpirationDate, months,
                            amountOfCredit, monthlyPayment, interestRate, employee, paymentAccount);

                    if (user.getCreditAccounts() != null) {
                        creditAccounts = user.getCreditAccounts();
                    } else
                        creditAccounts = new ArrayList<>();
                    creditAccounts.add(creditAccount);
                    user.setCreditAccounts(creditAccounts);
                    System.out.println("\nКредит оформлен");
                    return;
                }
            }
            throw new NoMoneyException();
        }catch (NoMoneyException | BankOfficeApplicationException | LowRatingException | EmployeeException |
                NoMoneyInBankException | AtmNotAllowedException e) {
            System.err.println(e.getMessage());
        }
    }
}


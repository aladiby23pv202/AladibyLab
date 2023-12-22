package main.java.tech.reliab.course.aladiby.bank.service.impl;

import main.java.tech.reliab.course.aladiby.bank.service.BankService;
import main.java.tech.reliab.course.aladiby.bank.entity.Bank;
import main.java.tech.reliab.course.aladiby.bank.entity.BankOffice;
import main.java.tech.reliab.course.aladiby.bank.entity.BankAtm;
import main.java.tech.reliab.course.aladiby.bank.entity.Employee;
import main.java.tech.reliab.course.aladiby.bank.entity.User;

public class BankServiceImpl implements BankService {

    @Override
    public Bank createBank(Bank bank) {
        return new Bank(bank.getId(), bank.getName());
    }

    public Boolean deleteBank(Bank bank) {
        if (bank != null) {
            bank = null;
            return true;
        }
        return false;
    }

    @Override
    public Boolean addAtm(Bank bank, BankAtm bankAtm) {
        if (bank != null && bankAtm != null) {
            bank.setNumberOfAtms(bank.getNumberOfAtms() + 1);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteAtm(Bank bank, BankAtm bankAtm) {
        if (bank != null && bankAtm != null) {
            if (bank.getNumberOfAtms() > 0) {
                bank.setNumberOfAtms(bank.getNumberOfAtms() - 1);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public Boolean addOffice(Bank bank, BankOffice bankOffice) {
        if (bank != null && bankOffice != null) {
            bank.setNumberOfOffices(bank.getNumberOfOffices() + 1);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteOffice(Bank bank, BankOffice bankOffice) {
        if (bank != null && bankOffice != null) {
            if (bank.getNumberOfAtms() > 0) {
                bank.setNumberOfAtms(bank.getNumberOfAtms() - 1);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public Boolean addClient(Bank bank, User user) {
        if (bank != null && user != null) {
            bank.setNumberOfClients(bank.getNumberOfClients() + 1);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteClient(Bank bank, User user) {
        if (bank != null && user != null) {
            if (bank.getNumberOfClients() > 0) {
                bank.setNumberOfClients(bank.getNumberOfClients() - 1);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public Boolean addEmployee(Bank bank, Employee employee) {
        if (bank != null && employee != null) {
            bank.setNumberOfEmployees(bank.getNumberOfEmployees() + 1);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteEmployee(Bank bank, Employee employee) {
        if (bank != null && employee != null) {
            if (bank.getNumberOfClients() > 0) {
                bank.setNumberOfClients(bank.getNumberOfClients() - 1);
                return true;
            }
            return false;
        }
        return false;
    }
}

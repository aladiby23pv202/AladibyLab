package main.java.tech.reliab.course.aladiby.bank.service.impl;

import main.java.tech.reliab.course.aladiby.bank.service.BankService;
import main.java.tech.reliab.course.aladiby.bank.entity.Bank;
import main.java.tech.reliab.course.aladiby.bank.entity.BankOffice;
import main.java.tech.reliab.course.aladiby.bank.entity.BankAtm;
import main.java.tech.reliab.course.aladiby.bank.entity.Employee;
import main.java.tech.reliab.course.aladiby.bank.entity.User;
import java.util.Random;

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
//            bank.setNumberOfAtms(bank.getNumberOfAtms() + 1);
            bank.getBankAtms().add(bankAtm);
            return true;
        }
        return false;
    }

//    @Override
//    public Boolean addAtm(Bank bank, BankAtm bankAtm) {
//        if (bank != null && bankAtm != null) {
//            bank.setNumberOfAtms(bank.getNumberOfAtms() + 1);
//            return true;
//        }
//        return false;
//    }

    @Override
    public Boolean deleteAtm(Bank bank, BankAtm bankAtm) {
        if (bank != null && bankAtm != null) {
            if (bank.getBankAtms().size() > 0) {
                bank.getBankAtms().remove(bankAtm);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public Boolean addOffice(Bank bank, BankOffice bankOffice) {
        if (bank != null && bankOffice != null) {
            bank.getBankOffices().add(bankOffice);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteOffice(Bank bank, BankOffice bankOffice) {
        if (bank != null && bankOffice != null) {
            if (bank.getBankOffices().size() > 0) {
                bank.getBankOffices().remove(bankOffice);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public Boolean addClient(Bank bank, User user) {
        if (bank != null && user != null) {
            bank.getUsers().add(user);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteClient(Bank bank, User user) {
        if (bank != null && user != null) {
            if (bank.getUsers().size() > 0) {
                bank.getUsers().remove(user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public Boolean addEmployee(Bank bank, Employee employee) {
        if (bank != null && employee != null) {
            bank.getEmployees().add(employee);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteEmployee(Bank bank, Employee employee) {
        if (bank != null && employee != null) {
            if (bank.getEmployees().size() > 0) {
                bank.getEmployees().remove(employee);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public String getInfo(Bank bank){
        String res = "";

        res += bank.toString();

        res += "\n\nИнформация об офисах:\n";

        for (BankOffice bankOffice: bank.getBankOffices()){
            res += bankOffice.toString();
            res += "\n\n";
        }

        res += "\n\nИнформация о банкоматах:\n";

        for (BankAtm bankATM: bank.getBankAtms()){
            res += bankATM.toString();
            res += "\n\n";
        }

        res += "\nИнформация о сотрудниках:\n";
        for (Employee employee: bank.getEmployees()){
            res += employee.toString();
            res += "\n\n";
        }

        res += "\nИнформация о клиетах:\n";
        for (User user: bank.getUsers()){
            res += user.toString();
            res += "\n\n";
        }
        return res;
    }
}

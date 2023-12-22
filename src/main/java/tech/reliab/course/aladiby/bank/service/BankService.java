package main.java.tech.reliab.course.aladiby.bank.service;
import main.java.tech.reliab.course.aladiby.bank.entity.Bank;
import main.java.tech.reliab.course.aladiby.bank.entity.BankOffice;
import main.java.tech.reliab.course.aladiby.bank.entity.BankAtm;
import main.java.tech.reliab.course.aladiby.bank.entity.Employee;
import main.java.tech.reliab.course.aladiby.bank.entity.User;



public interface BankService {
    //создать офис
    Bank createBank(Bank bank);
    //удалить банк
    Boolean deleteBank(Bank bank);
    //добавить офис
    Boolean addOffice(Bank bank, BankOffice bankOffice);
    //удалить офис
    Boolean deleteOffice(Bank bank, BankOffice bankOffice);
    //добавить банкомат
    Boolean addAtm(Bank bank, BankAtm bankAtm);
    //удалить банкомат
    Boolean deleteAtm(Bank bank, BankAtm bankAtm);
    //добавить сотрудника
    Boolean addEmployee(Bank bank, Employee employee);
    //удалить сотрудника
    Boolean deleteEmployee(Bank bank, Employee employee);
    //добавить клиента
    Boolean addClient(Bank bank, User user);
    //удалить клиента
    Boolean deleteClient(Bank bank, User user);
    //получить информацию о банке
    String getInfo(Bank bank);
}

package main.java.tech.reliab.course.aladiby.bank.service;

import main.java.tech.reliab.course.aladiby.bank.entity.Bank;
import main.java.tech.reliab.course.aladiby.bank.entity.BankAtm;
import main.java.tech.reliab.course.aladiby.bank.entity.BankOffice;

public interface BankOfficeService {
    //создать офис
    public BankOffice createBankOffice(BankOffice bankOffice);
    //добавить банкомат
    public Boolean addAtm(BankOffice bankOffice, BankAtm bankAtm);
    //удалить банкомат
    public Boolean deleteAtm(BankOffice bankOffice, BankAtm bankAtm);
    //связь между офисом и банком (общая сумма денег)
    public Boolean updateTotalMoney(BankOffice bankOffice, Bank bank);
    //связь между офисом и банком (количество банкоматов)
    public Boolean updateNumberOfAtms(BankOffice bankOffice, Bank bank);
    //связь между офисом и банком (количество сотрудников)
    public Boolean updateNumberOfEmployees(BankOffice bankOffice, Bank bank);
}

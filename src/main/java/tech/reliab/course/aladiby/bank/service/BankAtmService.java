package main.java.tech.reliab.course.aladiby.bank.service;

import main.java.tech.reliab.course.aladiby.bank.entity.Bank;
import main.java.tech.reliab.course.aladiby.bank.entity.BankAtm;
import main.java.tech.reliab.course.aladiby.bank.entity.BankOffice;
import main.java.tech.reliab.course.aladiby.bank.utils.AtmStatus;


public interface BankAtmService {
    //создать банкомат
    public BankAtm createBankAtm(BankAtm bankAtm) ;
    //отношения между банком и банкоматом (общая сумма денег)
    public Boolean updateTotalMoney(BankAtm bankAtm, Bank bank);
    //связь между офисом и банкоматом (адресом)
    public Boolean updateBankOfficeAddress(BankAtm bankAtm, BankOffice bankOffice);
    //изменить статус банкомата
    public Boolean updateAtmStatus(BankAtm bankAtm, AtmStatus status);
}

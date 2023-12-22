package main.java.tech.reliab.course.aladiby.bank.service.impl;

import main.java.tech.reliab.course.aladiby.bank.service.BankAtmService;
import main.java.tech.reliab.course.aladiby.bank.entity.Bank;
import main.java.tech.reliab.course.aladiby.bank.entity.BankAtm;
import main.java.tech.reliab.course.aladiby.bank.entity.BankOffice;
import main.java.tech.reliab.course.aladiby.bank.utils.AtmStatus;

public class BankAtmServiceImpl implements BankAtmService {

    @Override
    public BankAtm createBankAtm(BankAtm bankAtm) {
        BankAtm newBankAtm = new BankAtm(bankAtm.getId(), bankAtm.getName(), bankAtm.getStatus(),
                bankAtm.getBank(), bankAtm.getBankOffice(), bankAtm.getEmployee(), bankAtm.getCanIssueMoney(),
                bankAtm.getCanDepositMoney(), bankAtm.getMaintenance());
        return newBankAtm;
    }

    @Override
    public Boolean updateTotalMoney(BankAtm bankAtm, Bank bank) {
        if (bankAtm != null && bank != null) {
            bankAtm.setTotalMoney(bank.getTotalMoney());
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateBankOfficeAddress(BankAtm bankAtm, BankOffice bankOffice) {
        if (bankAtm != null && bankOffice != null) {
            bankAtm.setAddress(bankOffice.getAddress());
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateAtmStatus(BankAtm bankAtm, AtmStatus status) {
        if (bankAtm != null && status != null) {
            bankAtm.setStatus(status);
            return true;
        }
        return false;
    }
}




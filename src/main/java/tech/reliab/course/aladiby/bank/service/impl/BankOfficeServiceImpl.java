package main.java.tech.reliab.course.aladiby.bank.service.impl;

import main.java.tech.reliab.course.aladiby.bank.entity.Bank;
import main.java.tech.reliab.course.aladiby.bank.entity.BankAtm;
import main.java.tech.reliab.course.aladiby.bank.entity.BankOffice;
import main.java.tech.reliab.course.aladiby.bank.service.BankOfficeService;

public class BankOfficeServiceImpl implements BankOfficeService {
    @Override
    public BankOffice createBankOffice(BankOffice bankOffice) {
        BankOffice newBankOffice = new BankOffice(bankOffice.getId(), bankOffice.getName(), bankOffice.getAddress(),
                bankOffice.getStatus(), bankOffice.getAtmPlacementAllowed(),
                bankOffice.getCreditApplicationAllowed(), bankOffice.getCashWithdrawalEnabled(),
                bankOffice.getCashDepositEnabled(), bankOffice.getTotalMoney(), bankOffice.getRentCost());
        return newBankOffice;
    }

    @Override
    public Boolean addAtm(BankOffice bankOffice, BankAtm bankAtm) {
        if (bankOffice != null && bankAtm != null) {
            bankOffice.getBankOfficeAtms().add(bankAtm);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteAtm(BankOffice bankOffice, BankAtm bankAtm) {
        if (bankOffice != null && bankAtm != null) {
            if (bankOffice.getBankOfficeAtms().size() > 0) {
                bankOffice.getBankOfficeAtms().remove(bankAtm);
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean updateTotalMoney(BankOffice bankOffice, Bank bank) {
        if (bankOffice != null && bank != null) {
            bankOffice.setTotalMoney(bank.getTotalMoney());
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateNumberOfAtms(BankOffice bankOffice, Bank bank){
        if (bankOffice != null && bank != null) {
            bankOffice.setBankOfficeAtms(bank.getBankAtms());
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateNumberOfEmployees(BankOffice bankOffice, Bank bank){
        if (bankOffice != null && bank != null) {
            bankOffice.setBankOfficeEmployees(bank.getEmployees());
            return true;
        }
        return false;
    }

}

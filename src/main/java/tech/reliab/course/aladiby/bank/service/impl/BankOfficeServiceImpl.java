package main.java.tech.reliab.course.aladiby.bank.service.impl;

import main.java.tech.reliab.course.aladiby.bank.entity.Bank;
import main.java.tech.reliab.course.aladiby.bank.entity.BankAtm;
import main.java.tech.reliab.course.aladiby.bank.entity.BankOffice;
import main.java.tech.reliab.course.aladiby.bank.service.BankOfficeService;

public class BankOfficeServiceImpl implements BankOfficeService {
    @Override
    public BankOffice createBankOffice(BankOffice bankOffice) {
        BankOffice newBankOffice = new BankOffice(bankOffice.getId(), bankOffice.getName(), bankOffice.getAddress(),
                bankOffice.getStatus(), bankOffice.getAtmPlacementAllowed(), bankOffice.getNumberOfAtms(),
                bankOffice.getCreditApplicationAllowed(), bankOffice.getCashWithdrawalEnabled(),
                bankOffice.getCashDepositEnabled(), bankOffice.getTotalMoney(), bankOffice.getRentCost());
        return newBankOffice;
    }

    @Override
    public Boolean addAtm(BankOffice bankOffice, BankAtm bankAtm) {
        if (bankOffice != null && bankAtm != null) {
            bankOffice.setNumberOfAtms(bankOffice.getNumberOfAtms() + 1);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteAtm(BankOffice bankOffice, BankAtm bankAtm) {
        if (bankOffice != null && bankAtm != null) {
            if (bankOffice.getNumberOfAtms() > 0) {
                bankOffice.setNumberOfAtms(bankOffice.getNumberOfAtms() - 1);
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

    public Boolean updateNumberOfAtms(BankOffice bankOffice, Bank bank){
        if (bankOffice != null && bank != null) {
            bankOffice.setNumberOfAtms(bank.getNumberOfAtms());
            return true;
        }
        return false;
    }

}

package main.java.tech.reliab.course.aladiby.bank.exception;

public class BankOfficeNotWorkingException extends RuntimeException {
    public BankOfficeNotWorkingException() {
        super("заявки на получение кредита не принимаются в этом офисе");
    }
}

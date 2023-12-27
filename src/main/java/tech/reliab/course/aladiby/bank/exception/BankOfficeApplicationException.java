package main.java.tech.reliab.course.aladiby.bank.exception;

public class BankOfficeApplicationException extends RuntimeException {
    public BankOfficeApplicationException() {
        super("заявки на получение кредита не принимаются в этом офисе");
    }
}

package main.java.tech.reliab.course.aladiby.bank.exception;

public class NoMoneyInBankException extends RuntimeException {
    public NoMoneyInBankException() {
        super("в банке недостаточно денег, чтобы выдать вам этот кредит");
    }
}

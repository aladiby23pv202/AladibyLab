package main.java.tech.reliab.course.aladiby.bank.exception;

public class NoMoneyException extends RuntimeException {
    public NoMoneyException() {
        super("в банкоматах нет денег");
    }
}

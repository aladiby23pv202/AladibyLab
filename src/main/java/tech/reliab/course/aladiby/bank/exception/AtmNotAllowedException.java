package main.java.tech.reliab.course.aladiby.bank.exception;

public class AtmNotAllowedException extends RuntimeException {
    public AtmNotAllowedException() {
        super("в этом офисе нет банкоматов");
    }
}
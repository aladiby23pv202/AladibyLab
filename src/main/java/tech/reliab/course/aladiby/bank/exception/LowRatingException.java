package main.java.tech.reliab.course.aladiby.bank.exception;

public class LowRatingException extends RuntimeException {
    public LowRatingException() {
        super("ваш рейтинг недостаточно высок, чтобы получить кредит");
    }
}

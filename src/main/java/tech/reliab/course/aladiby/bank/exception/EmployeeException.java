package main.java.tech.reliab.course.aladiby.bank.exception;

public class EmployeeException extends  RuntimeException {
    public EmployeeException() {
        super("этот сотрудник не может выдать вам кредит");
    }
}

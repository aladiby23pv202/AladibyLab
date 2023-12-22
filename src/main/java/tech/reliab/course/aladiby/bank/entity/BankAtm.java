package main.java.tech.reliab.course.aladiby.bank.entity;

import main.java.tech.reliab.course.aladiby.bank.utils.AtmStatus;

public class BankAtm {
    // Id банкомата
    private int id;
    // Имя банкомата
    private String name;
    //Адрес
    private String address;
    //Статус
    private AtmStatus status;
    // Банк, которому принадлежит банкомат
    Bank bank;
    //Расположение банкомата
    BankOffice bankOffice;
    //Обслуживающий сотрудник
    Employee employee;
    //Работает ли на выдачу денег? (да/нет)
    boolean canIssueMoney;
    //Можно ли внести деньги? (да/нет)
    boolean canDepositMoney;
    //Кол-во денег в банкомате
    double totalMoney;
    //Стоимость обслуживания банкомата
    double costOfMaintenance;

    //конструктор
    public BankAtm(int id, String name, String address, AtmStatus status, Bank bank, BankOffice bankOffice,
                   Employee employee, boolean canIssueMoney, boolean canDepositMoney,
                   double totalMoney, double costOfMaintenance) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.address = bankOffice.getAddress();
        this.bank = bank;
        this.bankOffice = bankOffice;
        this.employee = employee;
        this.canIssueMoney = canIssueMoney;
        this.canDepositMoney = canDepositMoney;
        this.totalMoney = bank.getTotalMoney();
        this.costOfMaintenance = costOfMaintenance;
    }


    //вывести всю информацию о банкомате
    @Override
    public String toString() {
        return "---------------------------------------------" + "\n" +
                "Информация о банкомате " + "\n" +
                "id: " + id + "\n" +
                "Название: " + name + "\n" +
                "Адрес: " + address + "\n" +
                "Статус: " + (status == AtmStatus.WORKING ? "работает" : (status == AtmStatus.NOT_WORKING ?
                "не работает" : "нет денег")) + "\n" +
                "Банк: " + bank.getName() + "\n" +
                "Расположение банкомата: " + bankOffice.getName() + " " + bankOffice.getAddress() + "\n" +
                "Обслуживающий сотрудник: " + employee.getJobPosition() + "\n" +
                "Работает на выдачу денег? " + (canIssueMoney ? "да" : "нет") + "\n" +
                "Можно внести деньги? " + (canDepositMoney ? "да" : "нет") + "\n" +
                "Количество денег в банкомате: " + String.format("%.2f", totalMoney) + "\n" +
                "Стоимость обслуживания: " + String.format("%.2f", costOfMaintenance) + "\n\n";
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AtmStatus getStatus() {
        return status;
    }

    public void setStatus(AtmStatus status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BankOffice getBankOffice() {
        return bankOffice;
    }

    public void setBankOffice(BankOffice bankOffice) {
        this.bankOffice = bankOffice;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public boolean getCanIssueMoney() {
        return canIssueMoney;
    }

    public void setCanIssueMoney(boolean canIssueMoney) {
        this.canIssueMoney = canIssueMoney;
    }

    public boolean getCanDepositMoney() {
        return canDepositMoney;
    }

    public void setCanDepositMoney(boolean canDepositMoney) {
        this.canDepositMoney = canDepositMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getMaintenance() {
        return costOfMaintenance;
    }

    public void setMaintenance(double costOfMaintenance) {
        this.costOfMaintenance = costOfMaintenance;
    }

}

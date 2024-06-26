package main.java.tech.reliab.course.aladiby.bank.entity;

public class BankOffice {
    //Id банковского офиса
    private int id;
    //Название офиса
    private String name;
    //Адрес банковского офиса
    private String address;
    //Статус (работает/не работает)
    private boolean status;
    //Можно ли разместить банкомат? (да/нет)
    private boolean atmPlacementAllowed;
    //Кол-во банкоматов в данном офисе
    private int numberOfAtms;
    //Можно ли оформить кредит в данном офисе? (да/нет)
    private boolean creditApplicationAllowed;
    //Работает ли на выдачу денег? (да/нет)
    private boolean cashWithdrawalEnabled;
    //Можно ли внести деньги? (да/нет)
    private boolean cashDepositEnabled;
    //Кол-во денег в банковском офисе
    private double totalMoney;
    //Стоимость аренды банковского офиса
    private double rentCost;

    //конструктор
    public BankOffice(int id, String name, String address, boolean status,
                      boolean atmPlacementAllowed, int numberOfAtms, boolean creditApplicationAllowed,
                      boolean cashWithdrawalEnabled, boolean cashDepositEnabled, double totalMoney, double rentCost) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.status = status;
        this.atmPlacementAllowed = atmPlacementAllowed;
        this.numberOfAtms = numberOfAtms;
        this.creditApplicationAllowed = creditApplicationAllowed;
        this.cashWithdrawalEnabled = cashWithdrawalEnabled;
        this.cashDepositEnabled = cashDepositEnabled;
        this.rentCost = rentCost;
        this.totalMoney = totalMoney;
    }

    // вывести всю информацию об офисе банка
    @Override
    public String toString() {
        return "---------------------------------------------" + "\n" +
                "Информация об офисе банка" + "\n" +
                "id: " + id + "\n" +
                "Название: " + name + "\n" +
                "Адрес: " + address + "\n" +
                "Статус: " + (status ? "работает" : "не работает") + "\n" +
                "Можно разместить банкомат? " + (atmPlacementAllowed ? "да" : "нет") + "\n" +
                "Количество банкоматов: " + numberOfAtms + "\n" +
                "Можно оформить кредит? " + (creditApplicationAllowed ? "да" : "нет") + "\n" +
                "Работает на выдачу денег? " + (cashWithdrawalEnabled ? "да" : "нет") + "\n" +
                "Можно внести деньги? " + (cashDepositEnabled ? "да" : "нет") + "\n" +
                "Количество денег: " + String.format("%.2f", totalMoney) + "\n" +
                "Стоимость аренды: " + String.format("%.2f", rentCost) + "\n\n";
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getAtmPlacementAllowed() {
        return atmPlacementAllowed;
    }

    public void setAtmPlacementAllowed(boolean atmPlacementAllowed) {
        this.atmPlacementAllowed = atmPlacementAllowed;
    }

    public int getNumberOfAtms() {
        return numberOfAtms;
    }

    public void setNumberOfAtms(int numberOfAtms) {
        this.numberOfAtms = numberOfAtms;
    }

    public boolean getCreditApplicationAllowed() {
        return creditApplicationAllowed;
    }

    public void setCreditApplicationAllowed(boolean creditApplicationAllowed) {
        this.creditApplicationAllowed = creditApplicationAllowed;
    }

    public boolean getCashWithdrawalEnabled() {
        return cashWithdrawalEnabled;
    }

    public void setCashWithdrawalEnabled(boolean cashWithdrawalEnabled) {
        this.cashWithdrawalEnabled = cashWithdrawalEnabled;
    }

    public boolean getCashDepositEnabled() {
        return cashDepositEnabled;
    }

    public void setCashDepositEnabled(boolean cashDepositEnabled) {
        this.cashDepositEnabled = cashDepositEnabled;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

}

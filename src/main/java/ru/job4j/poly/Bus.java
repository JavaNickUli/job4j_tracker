package ru.job4j.poly;

public class Bus implements Transport {
    private int freePlace = 100;

    @Override
    public void drive() {
        System.out.println("Автобус отправляется в пункт назначения");
    }

    @Override
    public void passengers(int quantity) {
        if (freePlace >= quantity) {
            freePlace -= quantity;
            System.out.println("В автобусе " + (100 - freePlace) + " пассажир(а/ов)");
        } else {
            quantity -= freePlace;
            System.out.println("Автобус полный. " + quantity + " человек(а) не поместились.");
        }
    }

    @Override
    public double refuel(double fuel) {
        double cost = fuel * 49.54;
        System.out.println("Автобус запрвлен на " + fuel + " литр(а/ов).\n"
                + " Выдан чек на сумму: " + cost + "руб.");
        return cost;
    }
}

package ru.job4j.oop;

public class Transport {
    public static void main(String[] args) {
        Vehicle tu = new Airplane("Ту-154");
        Vehicle boeing = new Airplane("Boeing");
        Vehicle airbus = new Airplane("Airbus");
        Vehicle freight = new Train("товарный");
        Vehicle martin = new Train("Ласточка");
        Vehicle falcon = new Train("Сапсан");
        Vehicle liaz = new Bus("ЛиАЗ");
        Vehicle next = new Bus("Газель-NEXT");
        Vehicle ikarus = new Bus("Ikarus");
        Vehicle[] vehicle = new Vehicle[]{tu, boeing, airbus, freight, martin, falcon, liaz, next, ikarus};
        for (Vehicle transport : vehicle) {
            transport.name();
            transport.move();
        }
    }
}

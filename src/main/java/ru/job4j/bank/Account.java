package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает объект данных счетов клиента и используется в базе банковской системы {@link BankService}.
 */
public class Account {
    /**
     * Данные счетов представлены типами {@code String} реквизит и {@code double} баланс.
     */
    private String requisite;
    private double balance;

    /**
     * Конструктор принимает на вход реквизит и баланс счёта.
     *
     * @param requisite реквизит счёта
     * @param balance   баланс счёта
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод возвращает данные о реквизите счёта.
     *
     * @return реквизит счёта {@code requisite}
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод принимает на вход данные о реквизите счёта.
     * Метод присваивает новое значение реквизиту.
     *
     * @param requisite реквизит счёта
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод возвращает баланс счёта.
     *
     * @return ибаланс счёта {@code balance}
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод принимает на вход баланс счёта.
     * Метод присваивает новое значение балансу.
     *
     * @param balance баланс счёта
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод принимает на вход объект сравнения и возвращает состояние сравнения.
     * Проверяется тождественность ссылок, пустого объекта и соответствие типа классов
     * перед сравнением объектов по полю {@code requisite}.
     *
     * @param o объект сравнения
     * @return состояние {@code true : false}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Метод возвращает хеш-код от поля {@code requisite}.
     *
     * @return хеш-код {@code int}
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}

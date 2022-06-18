package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает объект данных клиента и используется в базе банковской системы {@link BankService}.
 */
public class User {
    /**
     * Данные клиента представлены типом {@code String} паспорт и имя.
     */
    private String passport;
    private String username;

    /**
     * Конструктор принимает на вход паспорт и имя клиента.
     *
     * @param passport паспорт клиента
     * @param username имя клиента
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод возвращает данные о паспорте клиента.
     *
     * @return паспорт {@code passport}
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод принимает на вход данные о паспорте.
     * Метод присваивает новое значение паспорту.
     *
     * @param passport паспорт
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод возвращает имя клиента.
     *
     * @return имя клиента {@code username}
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод принимает на вход имя клиента.
     * Метод присваивает новое значение имени.
     *
     * @param username имя клиента
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод принимает на вход объект сравнения и возвращает состояние сравнения.
     * Проверяется тождественность ссылок, пустого объекта и соответствие типа классов
     * перед сравнением объектов по полю {@code passport}.
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
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Метод возвращает хеш-код от поля {@code passport}.
     *
     * @return хеш-код {@code int}
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}

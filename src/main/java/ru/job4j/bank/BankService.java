package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает простейшую работу банковской системы,
 * осуществляя доступ к клиентской базе {@link User} и счетам {@link Account},
 * а также создание и управление.
 *
 * @author Nick Uli
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение клиентской базы и счетов осуществляется в коллекции HashMap.
     */
    public final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход данные клиента.
     * Если передаваемые данные не встречаются в базе,
     * метод добавляет нового клиента и создаёт пустой список счетов.
     *
     * @param user данные клиента
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод принимает на вход пасспорт клиента и добавляемый счёт.
     * Для поиска клиента по паспорту используется метод {@code findByPassport(String)}.
     * Если данный клиент присутствует в базе, а добавляемый счёт отсутствует в списке,
     * метод добавляет новый счёт клиенту.
     *
     * @param passport паспорт клиента
     * @param account  счет клиента
     * @see #findByPassport(String) findByPassport(String)
     */
    public void addAccount(String passport, Account account) {
        User pass = findByPassport(passport);
        if (pass != null) {
            List<Account> rsl = users.get(pass);
            if (!rsl.contains(account)) {
                rsl.add(account);
            }
        }
    }

    /**
     * Метод принимает на вход пасспорт клиента и возвращает данные о клиенте.
     * Если паспорт присутствует в базе,
     * метод возвращает данные о клинте.
     * В случае отсутствия клиента в базе,
     * метод возвращает {@code null}.
     *
     * @param passport паспорт клиента
     * @return данные клиента {@code User}
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод принимает на вход пасспорт клиента и реквизит счёта, возвращает данные о счетах.
     * Для поиска клиента по паспорту используется метод {@code findByPassport(String)}.
     * Если паспорт и реквизит счёта присутствуют в базе,
     * метод возвращает данные о счетах.
     * В случае отсутствия клиента в базе или искомого реквизита счёта,
     * метод возвращает {@code null}.
     *
     * @param passport  паспорт клиента
     * @param requisite реквизит счёта
     * @return данные о счетах {@code Account}
     * @see #findByPassport(String) findByPassport(String)
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (requisite.equals(account.getRequisite())) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод принимает на вход данные пасспорта(ов) клиента(ов), реквизиты счетов,
     * а также сумму транзакции и возвращает состояние выполненой работы.
     * Для поиска данных о счетах используется метод {@code findByRequisite(String, String)}.
     * Если оба счёта присутствуют в базе и переводимая сумма не превышает сумму со списываемого счёта,
     * метод осуществляет денежную транзакцию.
     *
     * @param srcPassport   паспорт клиента (списание)
     * @param srcRequisite  реквизит счёта (списание)
     * @param destPassport  паспорт клиента (пополнение)
     * @param destRequisite реквизит счёта (пополнение)
     * @param amount        сумма транзакции
     * @return состояние {@code true : false}
     * @see #findByRequisite(String, String) #findByRequisite(String, String)
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}

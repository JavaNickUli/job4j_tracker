package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        System.out.println("На столе " + count + " спичек.");
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            int possible = Math.min(count, 3);
            System.out.println(player + " введите число от 1 до " + possible + ":");
            int matches = Integer.parseInt(input.nextLine());
            if (matches > 0 && matches <= possible) {
                count -= matches;
                System.out.println("Осталось " + count + " спичек на столе.");
                turn = !turn;
            } else {
                System.out.println("Не верно введено количество. Попробуйте еще раз.");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}

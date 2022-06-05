package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Learn Java", 478);
        Book book2 = new Book("Algorithms", 293);
        Book book3 = new Book("Patterns", 318);
        Book book4 = new Book("Clean Code", 401);
        Book[] library = new Book[]{book1, book2, book3, book4};
        System.out.println("Список книг в библиотеке:");
        for (int index = 0; index < library.length; index++) {
            System.out.println(library[index].getName());
        }
        System.out.println("Смена позиций книг в библиотеке (id0, id3).");
        Book temp = library[0];
        library[0] = library[3];
        library[3] = temp;
        System.out.println("Изменённый список:");
        for (Book book : library) {
            System.out.println(book.getName());
        }
        System.out.println("Поиск книги \"Clean Code\":");
        for (int index = 0; index < library.length; index++) {
            if ("Clean Code".equals(library[index].getName())) {
                System.out.println("Книга \"Clean Code\" id" + index + ".");
                break;
            }
        }
    }
}

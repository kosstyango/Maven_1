package com.skillfactory;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
    /*
        Добавьте вывод меню с пунктами:
          1.- List Documents
          2. - Add Document
          3. - Show Document
          4. - Exit.
        Добавьте возможность выбирать данные пункты
    */
        System.out.println ("""
                                1. - Список документов;
                                2. - Добавить документ;
                                3. - Показать документ;
                                4. - Выход.""");
        DocumentProcessor dp = new DocumentProcessor();


        Scanner scan = new Scanner(System.in);
    boolean a = true;
    while (a) {
        char userInput = scan.nextLine().charAt(0); //принимаем строку, и только одну букву берём
        switch (userInput) {
            case '1' -> dp.listDoc();
            case '2' -> dp.addDoc();
            case '3' -> dp.showDoc();
            case '4' -> {
                System.out.println("До свидания, User");
                scan.close();
                a = false;
            }
            default -> System.out.println("Неправильный выбор");
        }
        }
    }
}

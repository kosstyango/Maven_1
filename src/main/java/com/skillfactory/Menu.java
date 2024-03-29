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
                                1. - List of documents;
                                2. - Add document;
                                3. - Show document;
                                4. - Exit.""");
        DocumentProcessor dp = new DocumentProcessor();


        Scanner scan = new Scanner(System.in);
    boolean a = true;
    while (a) {
        char userInput = scan.nextLine().charAt(0); //принимаем строку, и только одну первую букву берём
        switch (userInput) {
            case '1' -> dp.listDoc();
            case '2' -> dp.addDoc();
            case '3' -> dp.showDoc();
            case '4' -> {
                System.out.println("Good bye, User");
                scan.close();
                a = false;
            }
            default -> System.out.println("Wrong selection");
        }
        }
    }
}

package Uspadkuvannya.Homework2205.DocumentWorker;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*Потрібно: Створити клас DocumentWorker. У тілі класу створіть три методи openDocument(), editDocument(), saveDocument().
У тілі кожного з методів додайте виведення на екран відповідних рядків: "Документ відкритий",
"Правка документа доступна у версії Про", "Збереження документа доступне у версії Про".
Створіть похідний клас ProDocumentWorker. Перевизначте відповідні методи, при перевизначенні методів виводьте
наступні рядки: "Документ відредаговано", "Документ збережено у старому форматі, збереження в інших форматах доступне
у версії Експерт". Створіть похідний клас ExpertDocumentWorker від базового класу ProDocumentWorker.
Перевизначте відповідний метод. При викликі даного методу необхідно виводити на екран документ збережений в новому форматі.
*************************************************************************************************************************************************
У тілі методу main() реалізуйте можливість прийому від користувача номер ключа доступу pro і exp. Якщо користувач не
вводить ключ, він може користуватися тільки безкоштовною версією (створюється екземпляр базового класу), якщо
користувач ввів номери ключа доступу pro і exp, то повинен створити екземпляр відповідної версії класу, наведений до базового – DocumentWorker. */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть номер ключа доступу: ");
        String key = sc.next();
        if (key.equals("pro")){
            ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
            proDocumentWorker.editDocument();
        }else if (key.equals("exp")) {
            ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            expertDocumentWorker.openDocument();
        }else{
            DocumentWorker documentWorker = new DocumentWorker();
            documentWorker.saveDocument();
        }
    }
}

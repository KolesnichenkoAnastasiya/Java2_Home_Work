package com.company;
import java.util.*;

public class PhoneBook {
    public HashMap <String, HashSet<String>> PhoneBook = new HashMap<>();
    public  HashSet <String> PhoneNumber = new HashSet<>();
    public PhoneBook (){
        this.PhoneBook = new HashMap<String, HashSet<String>>();
    }
    public void add(String surname, String number) {
        HashSet<String> num = new HashSet<String>();
             if (this.PhoneBook.containsKey(surname)){
                 num=this.PhoneBook.get(surname);
                 num.add(number);
                 this.PhoneBook.put(surname, num);
                 }
             else {
                 num.add(number);
                 PhoneNumber.add(number);
                 this.PhoneBook.put(surname, num);
             }
         }
    public void get (String surname) {
        if (this.PhoneBook.containsKey(surname)){
        System.out.println("Контактные данные по вашему запросу: " + surname + " " + PhoneBook.get(surname));
        } else {
            System.out.println("В телефонном справочнике нет записи под фамилией " + surname);
        }
    }
}

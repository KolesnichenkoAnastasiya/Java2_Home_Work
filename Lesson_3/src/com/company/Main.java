package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Иван", "Артур", "Артур", "Фидель", "Артур",
                "Илья", "Николай", "Семён", "Андрей", "Иван", "Кирилл", "Антон", "Богдан",
                "Михаил", "Пётр", "Артур", "Богдан", "Николай", "Сергей", "Артур", "Богдан"));
        System.out.println("Входящий массив типа String: " + arrayList + "\n");
        uniqueArray(arrayList);
        numberOfRepetitions(arrayList);

        PhoneBook myPhone = new PhoneBook();
        myPhone.add("Петров",   "+72222222222");
        myPhone.add("Иванов",   "+72228855222");
        myPhone.add("Петров",   "+00000000000");
        myPhone.add("Петров",   "+00000000000");
        myPhone.add("Петров",   "+11111111111");
        myPhone.add("Сидоров",  "+79422552121");
        myPhone.add("Кузнецов", "+79785555555");
        myPhone.add("Петров",   "+72222222222");
        System.out.println(myPhone);
        myPhone.get("Петров");
    }

    public static void uniqueArray(ArrayList<String> arrayList) {
        Set<String> uniqueArrayList = new HashSet<>(arrayList);
        System.out.println("Количество уникальных значений составляет: " + uniqueArrayList.size()
                + "\nСписок уникальных значений: " + uniqueArrayList + "\n");
    }
    private static void numberOfRepetitions(ArrayList<String> arrayList) {
        Set<String> uniqueArrayList = new HashSet<>(arrayList);
        HashMap<String, Integer> hashMapRepetition = new HashMap<>();


        int repeatNumber = 0;
        Iterator<String> i = uniqueArrayList.iterator();
        while (i.hasNext()) {
            String str = i.next();
            for (String s : arrayList) {
                if (str.equals(s)) {
                    repeatNumber = repeatNumber + 1;
                }
            }
            hashMapRepetition.put(str, repeatNumber);
            repeatNumber = 0;
        }
        System.out.println("Количество повторений каждого элемента массива: \n" + hashMapRepetition + "\n");
    }
}

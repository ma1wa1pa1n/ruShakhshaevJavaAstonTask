package ru.ma1wa1pa1n;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task {
    public static int number;
    public static String name;
    public static int[] array = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введите число:.");
        number = Integer.parseInt(reader.readLine());
        checkNumber(number);

        System.out.println("Введите имя:.");
        name = reader.readLine();
        checkName(name);

        System.out.println("Начать проверку масива на числа кратные '3' :.");
        task3(array);

        System.out.print("Конец программы!");

    }
    public static void checkNumber(int number){
        if (number > 7)
            System.out.println("Привет!");
    }
    public static void checkName(String name){
        if (name.equalsIgnoreCase("Вячеслав")){
            System.out.println("Привет, Вячеслав!");
        }else {
            System.out.println("Нет такого имени");
        }
    }
    public static void task3(int[] array){
        for (int j : array) {
            if (j % 3 == 0)
                System.out.print(j + " ");
        }
    }
}
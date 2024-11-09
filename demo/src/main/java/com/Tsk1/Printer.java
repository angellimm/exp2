package com.Tsk1;

public class Printer {
    public static void main(String[] args) {
        String date;
        if (args.length > 0) {
            date = args[0];
        } else {
            date = "2024-09-01"; // Значение по умолчанию
        }
        String result = DateValidator.validateDate(date);
        System.out.println(result);
    }
}
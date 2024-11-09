package com.Tsk3;
import java.util.Arrays;

public class Printer {
    public static void main(String[] args) {
    String[] strings;
    if (args.length > 0) {
    strings = args[0].split(",");
    } else {
    strings = new String[]{"banana", "apple",
    "cherry"}; // Значение по умолчанию
    }
    String[] result = StringSorter.sortStrings(strings);
    System.out.println(Arrays.toString(result));
    }
    }
    

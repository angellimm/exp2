package com.Tsk3;

import java.util.Arrays;
class StringSorter {
public static String[] sortStrings(String[] strings) {
try {
if (strings == null) {
System.out.println("Input array is null. Returning an empty array.");
return new String[0];
}
Arrays.sort(strings);
return strings;
} catch (Exception e) {
// В случае ошибки сортировки, выведите сообщение об ошибке
System.out.println("An error occurred during sorting.");
return new String[0];
}
}
}

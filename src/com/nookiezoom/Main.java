/**
 *
 * Solution for task #2
 *
 * @version 1.0 01 Oct 2017
 * @author Svinarev Sergey
 */
package com.nookiezoom;

public class Main {

    public static void main(String[] args) {
        print(args);
        System.out.println();
        args = sort(args);
        print(args);

    }

    //метод print
    public static void print(String[] args) {

        //использование конструкции foreach
        for (String str : args) {
            System.out.println(str);
        }
    }

    //метод sort
    public static String[] sort(String[] args) {
        int min;
        for (int i = 0; i < args.length - 1; i++) {
            min = i;
            for (int j = args.length - 1; j > i; j--) {
                if (args[min].compareTo(args[j]) > 0) {
                    min = j;
                }
            }
            String temp = args[min];
            args[min] = args[i];
            args[i] = temp;
        }
        return args;
    }

}


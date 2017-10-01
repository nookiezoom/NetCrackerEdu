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

    }

//очень вовремя вспомнил про конструкцию foreach
    public static void print(String[] args) {
        for (String str : args) {
            System.out.println(str);
        }
    }


}


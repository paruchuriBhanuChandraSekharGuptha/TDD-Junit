package com.epam.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word:");
        String str = scan.next();
        String st = removeA.remov(str);
        System.out.println(st);
    }
}

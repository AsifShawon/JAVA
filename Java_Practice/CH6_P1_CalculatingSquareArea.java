/*
Create a class Square with a method to initialize its side,
calculating area, perimeter etc.
 */

package com.company;

import java.util.Scanner;

class Square{
    int side;
    int area(){
        return side*side;
    }
    int periMeter(){
        return  4*side;
    }
}
public class CH6_P1_CalculatingSquareArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square a = new Square();
        System.out.println("Enter side: ");
        a.side = sc.nextInt();
        System.out.println("Area: "+a.area());
        System.out.println("Perimter: "+a.periMeter());
    }
}

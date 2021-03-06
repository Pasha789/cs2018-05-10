package by.it.dgus.lesson03;

import java.util.Scanner;

/*
Lesson 03. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
class TaskB2 {
    public static void main(String[] args) {
        System.out.println("Ввод:");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        System.out.println("Вывод:");
        double x=(-b+Math.sqrt(dic(a,b,c)))/(2*a);
        double y=(-b-Math.sqrt(dic(a,b,c)))/(2*a);
        if (dic(a,b,c)>0) System.out.println(x+" "+y);
        if (dic(a,b,c)==0) System.out.println(x);
        if (dic(a,b,c)<0) System.out.println("Отрицательный дискриминант");
    }
    public static double dic(int a1, int b2, int c3) {
        double d;
        return d=b2*b2-4*a1*c3;

    }

}

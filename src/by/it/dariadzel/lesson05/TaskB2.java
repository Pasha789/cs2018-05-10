package by.it.dariadzel.lesson05;

/*
Один большой массив и два маленьких
1. Создать массив m на 20 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива a и b на 10 целых чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
    вторую половину во второй маленький.
5. Вывести массивы a и b на экран командами:
        System.out.println("a="+Arrays.toString(a));
        System.out.println("b="+Arrays.toString(b));

Например, для такого ввода
1 2 3 4 5 6 7 8 9 10 11 22 33 44 55 66 77 88 99 0

ожидается такой вывод:
a=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
b=[11, 22, 33, 44, 55, 66, 77, 88, 99, 0]

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        int m[] = new int[20];
        int i;
        Scanner sc = new Scanner(System.in);
        for (i = m.length; i < 19; i++) {
            m[i] = sc.nextInt();

        }
        int a[] = new int[10];
        int b[] = new int[10];
        int j = a.length-1;
        int k = b.length-1;

        for (i = 0; i < m.length; i++) {
           if (i < 10) {
                a[j] = m[i];

                }
             else if (i > 10) {
                b[k] = m[i];

                    System.out.println("a=" + Arrays.toString(a));
                    System.out.println("b=" + Arrays.toString(b));

                }
            }
        }
    }


/* int a[] = new int[10];
        int b[] = new int[10];

        for (int i = 0; i < m.length; i++) {
            if (i < 10) {
                for (int j = a.length; j >=0; j++) {
                    a[j] = m[i];

                }
            } else if (i > 10) {
                for (int k = b.length; k >=0; k++) {
                    a[k] = m[i];
                }


            }

        }*/


      /*  ArrayList<Integer> n = new ArrayList<Integer>();
        for (int i = 0; i < m.length; i++) {
            n.add(i);
        }


        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();

        for (int i = 0; i < n.size(); i++) {
            Integer j = n.get(i);
            if (j < 10) {
                a.add(j);
            } else {
                b.add(j);
            }

*/
      /*
      public class TaskB2 {
    public static void main(String[] args) {
        int m[] = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = m.length - 1; i >= 0; i--) {
            m[i] = sc.nextInt();

        }
        int a[] = new int[10];
        int b[] = new int[10];
        int j = a.length-1;
        int k = b.length-1;

        for (int i = 0; i < m.length; i++) {
           if (i < 10) {
                a[j] = m[i];

                }
             else if (i > 10) {
                b[k] = m[i];

                    System.out.println("a=" + Arrays.toString(a));
                    System.out.println("b=" + Arrays.toString(b));

                }
            }
        }
    }

       */
package ru.yandex.zebjuliara;

public class Main {

    public static void main(String[] args) {
	// write your code here

            int a = 6;
            int b = 8;
            sum(a, b);  // 14
            sum(3, a);  // 9
            sum(5, 23); // 28
        }
        static void sum(int x, int y){

            int z = x + y;
            System.out.println(z);
        }
    }

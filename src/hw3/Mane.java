package hw3;

import java.util.Random;
import java.util.Scanner;

public class Mane {
    static Scanner sc;
    static Random random;

    public static void main(String[] args) {
        //     1. Написать программу, которая загадывает случайное число от 0 до 9,
//        и пользователю дается 3 попытки угадать это число. При каждой попытке
//        компьютер должен сообщить больше ли указанное пользователем число чем загаданное,
//        или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
//        1 – да / 0 – нет»(1 – повторить, 0 – нет).
        gessNum();
        question();
    }
    public static void gessNum() {
        random = new Random();
        sc = new Scanner(System.in);
        int randomNumber = random.nextInt(10);
        System.out.println("Угодайте число от 0 до 9");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ввидите число");
            int inputedNumber = sc.nextInt();
            if (inputedNumber == randomNumber) {
                System.out.println("Вы угодали!!!");
                return;
            }
            if (inputedNumber < randomNumber) {
                System.out.println("Загадонное число больше");
            }
            if (inputedNumber > randomNumber) {
                System.out.println("Загадонное число меньше");
            }
        }
        System.out.println("Вы проиграли");
    }

    public static void question() {
        for (; ; ) {
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int more = sc.nextInt();
            if (more == 1) {
                gessNum();
            }else {
                return;
            }

        }
    }
}





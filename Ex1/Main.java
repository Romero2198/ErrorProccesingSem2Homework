package Part2.Homework.Ex1;

import Part2.Seminar.Ex4.NewException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(inputFloat());
    }
    public static float inputFloat(){
        Scanner scanner = new Scanner(System.in);
        float x;
        while (true) {
            System.out.printf("Введите дробное число: ");
            if(scanner.hasNextFloat()){
                x = scanner.nextFloat();
                break;
            }else {
                System.out.println("Ошибка ввода! Введите корректное число");
                scanner.next();
            }
        }
        return x;
    }
}

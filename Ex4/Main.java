package Part2.Homework.Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(inputString());
    }
    public static String inputString(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String str = scanner.nextLine();
        if(str.isEmpty()){
            throw new StringNullException();
        }
        return str;
    }
}

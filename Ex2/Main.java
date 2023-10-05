package Part2.Homework.Ex2;

public class Main {
    public static void main(String[] args) {
        //Код не стал исправлять, потому что хорошо работает
        //Просто добавил массив и проверил, ну и сменил название переменной
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            int d = 0;
            double resultDivision = intArray[8] / d;
            System.out.println("result of division = " + resultDivision);
        }catch (ArithmeticException e){
            System.out.println("Catching exception: " + e);
        }
    }
}

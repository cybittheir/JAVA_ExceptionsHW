import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.printf("\nВведено число: %.2f",getFloatNum("Введите дробное число: "));

    }

    static float getFloatNum(String text){
        boolean check = false;
        float num = 0;
        while(!check) {
            System.out.print(text);
            Scanner scanner = new Scanner(System.in);
            String inputVal = scanner.nextLine();
            try{
                if (inputVal != ""){                   // для Задания №4
                    num = Float.valueOf(inputVal);
                    check = true;
                } else {
                    System.out.println("Ввод пустой строки. Повторите ввод."); // для Задания №4
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Ошибка ввода. Повторите ввод.");
            }
        }
        return num;
    }
}
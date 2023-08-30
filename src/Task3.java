public class Task3 {

    public static void main(String[] args) throws Exception {

// Задание 2
        int[] intArray = {1,2,3,4,5,6,7,8,9,0};
        int d = 0; // замена значения на любое, отличное от 0
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

// без try/catch
        if (d != 0) {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } else {
            System.out.println("Catching exception: divide by zero");
        }


// Задание 3

        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2, 0, 0}; // чтобы не было IndexOutOfBoundsException увеличиваем размер массива
            abc[b] = 9; // замена: b = 3
            System.out.println(abc.length);
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }

    }
    // нет работы с файлами, в исключении FileNotFoundException нет необходимости
    // зато (в теории) любое слагаемое может оказаться null -> NullPointerException
    public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }

}

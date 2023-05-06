import java.time.LocalDate;

public class Main {

    public static void calculateYear(int year) {                        // К 1 задаче
        if ( year % 4 == 0 && year % 100 == 0 && year % 400 == 0 ) {
            System.out.println( + year + " год является високосным");
        } else if (year % 4 == 0 && year % 100 != 0 ) {
            System.out.println(+ year + " год является високосным");
        } else
        {
            System.out.println(+ year + " год не является високосным");
        }
    }

    public static void suggestAppVersion(int clientOS, int clientDeviceYear) {          // К 2 задаче
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static int calculateDeliveryDays(int distance) {       // К 3 задаче
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        }

        return -1;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int yearLearn = 2012;
        calculateYear(yearLearn);
        System.out.println();
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2016;
        suggestAppVersion(clientOS, clientDeviceYear);
        System.out.println();


    }
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 82;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        String result = deliveryDays == -1
                ? "Доставки нет"
                : "Доставка займет " + deliveryDays + " дней";
        System.out.println(result);
    }
}
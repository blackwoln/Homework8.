public class Main {

    static class Name {   // К первой задаче
        int year;

        void example() {
            if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0 ) {
                System.out.println( + year + " год является високосным");
            } else if (year % 4 == 0 && year % 100 != 0 ) {
                System.out.println(+ year + " год является високосным");
            } else
            {
                System.out.println(+ year + " год не является високосным");
            }

        }
    }

    static class TaskTwo {      // К задаче 2
        int client, data;

        void dataComparison() {
            if (client == 0) {
                if (data < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите  версию приложения для iOS по ссылке");
                }
            } else {
                if (data < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите  версию приложения для Android по ссылке");
                }
            }
        }
    }

    static class TaskThree {
        int distance, days = 1;

        void daysDistance() {
            if ( distance > 20 && distance <= 60 ) {
                days = 2;
            } else if ( distance >= 60 && distance <= 100 ) {
                days = 3;
            } else if (distance > 100) {
                days = -1;
            }
            String result = days == -1
                    ? "Доставки нет"
                    : "Доставка займет " + days + " дней";
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        Name yearAny = new Name();
        yearAny.year = 2030;
        yearAny.example();
        System.out.println();


    }

    public static void task2 () {
        System.out.println("Задача 2");
        TaskTwo telephone = new TaskTwo();
        telephone.client = 1;
        telephone.data = 2013;
        telephone.dataComparison();
        System.out.println();

    }
    public static void task3() {
        System.out.println("Задача 3");
        TaskThree delivery = new TaskThree();
        delivery.distance = 999;
        delivery.daysDistance();
    }
}
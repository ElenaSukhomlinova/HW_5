public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int clientOs = 0;

        if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2");

        int clientDeviceYear = 2014;

        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOs != 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 3");
        int year = 2020;

        if (year > 1584 && year %4 == 0) {
            System.out.println(year + " является високосным");
        } else if (year > 1584 && year %400 == 0) {
            System.out.println(year + " является високосным");
        }else if (year > 1584 && year %100 == 0) {
            System.out.println(year + " не является високосным");
        }else {
            System.out.println(year + " не является високосным");
        }

        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int day = 1;

        if  (deliveryDistance < 20) {
           System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance >=20 && deliveryDistance < 60) {
           System.out.println("Потребуется дней: " + (day + 1));
        } else if (deliveryDistance >=60 && deliveryDistance < 100) {
           System.out.println("Потребуется день: " + (day + 2));
        } else {
           System.out.println("Свыше 100 км доставки нет");
        }

        System.out.println("Задача 5");
        int monthNumber = 11;

        switch (monthNumber) {
            case 1:
                System.out.println("Сейчас - зима");
                break;
            case 2:
                System.out.println("Сейчас - зима");
                break;
            case 3:
                System.out.println("Сейчас - весна");
                break;
            case 4:
                System.out.println("Сейчас - весна");
                break;
            case 5:
                System.out.println("Сейчас - весна");
                break;
            case 6:
                System.out.println("Сейчас - лето");
                break;
            case 7:
                System.out.println("Сейчас - лето");
                break;
            case 8:
                System.out.println("Сейчас - лето");
                break;
            case 9:
                System.out.println("Сейчас - осень");
                break;
            case 10:
                System.out.println("Сейчас - осень");
                break;
            case 11:
                System.out.println("Сейчас - осень");
                break;
            case 12:
                System.out.println("Сейчас - зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
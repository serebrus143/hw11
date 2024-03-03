import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printInfoAboutYear(2024); // Задание 1


        printInfoAboutVersion(1, 2024); // Задание 2


        // Задание 3
        int deliveryDays = calculateDeliveryDays(95);
        if (deliveryDays != -1) {
            System.out.println("Кол-во дней доставки: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
    }
    static void printInfoAboutYear(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }
    static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    static void printInfoAboutVersion(int os, int productionYear) {
        if (os != 0 && os != 1) {
            System.out.println("Некорректная ОС!");
            return;
        }
        int current = LocalDate.now().getYear();
        StringBuilder result = new StringBuilder("Установите ");
        if (productionYear < current) {
            result.append("облегченную ");
        }
        result.append("версию для ");
        if (os == 0) {
            result.append("iOS");
        } else {
            result.append("Android");
        }
        System.out.println(result);
    }

    static int calculateDeliveryDays(int distance) {
        if (distance < 0 || distance > 100) {
            return -1;
        }
        int deliveryDays = 1;
        if (distance >= 20) {
            deliveryDays++;
        }
        if (distance >= 60) {
            deliveryDays++;
        }
        return deliveryDays;
    }
}
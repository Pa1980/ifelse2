public class Main {
    public static void main(String[] args) {
// 1-е задание
        byte clientOs = 1;
        switch (clientOs) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке\n");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке\n");
                break;
            default:
                System.out.println("Приложение не может работать в Вашей ОС\n");
        }

// 2-е задание
        short clientDeviceYear = 2014;
        switch (clientOs) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке\n"); }
                else { System.out.println("Установите версию приложения для iOS по ссылке\n"); }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке\n"); }
                else { System.out.println("Установите версию приложения для Android по ссылке\n"); }
                break;
            default:
                System.out.println("Приложение не может работать в Вашей ОС\n");
        }

// 3-е задание
        short year = 2384;
        year -= 1584;
        if ((year%4) == 0)
            if ((year%100) == 0)  //  определяет является данный год 100-летним
                if ((year%400) == 0) { // определяет является данный год 400-летним
                    System.out.println((year+1584)+" год является високосным\n"); }
                else { System.out.println((year+1584)+" год не високосный\n"); }
            else { System.out.println((year+1584)+" год является високосным\n"); }
        else {
            System.out.println((year+1584)+" год не високосный\n"); }

// 4-е задание
        byte deliveryDistance = 0;
        if (deliveryDistance > 0 && deliveryDistance <=20) {
            System.out.println("Потребуются сутки для доставки\n"); }
        else if (deliveryDistance <= 60 && deliveryDistance > 0) {
                System.out.println("Потребуются 2-е суток для доставки\n"); }
             else if (deliveryDistance <= 100 && deliveryDistance > 0) {
                     System.out.println("Потребуются 3-е суток для доставки\n"); }
                  else { System.out.println("Доставки нет\n"); }

// 5-е задание
        byte monthNumber = 13;
        switch (monthNumber) {
            case 12,1,2: System.out.println("сейчас зима\n");
            break;
            case 3,4,5: System.out.println("Сейчас весна\n");
            break;
            case 6,7,8: System.out.println("Сейчас лето\n");
            break;
            case 9,10,11: System.out.println("Сейчас осень\n");
            default: System.out.println("Такого месяца не существует"); }
    }
}
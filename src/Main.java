public class Main {
    public static void main(String[] args) {
// 1-е задание
        byte clientOs = 1;
        switch (clientOs) {
            case 0: System.out.println("Установите версию приложения для iOS по ссылке");
            break;
            case 1: System.out.println("Установите версию приложения для Android по ссылке");
            break;
            default: System.out.println("Приложение не может работать в Вашей ОС");
        }
    }
}
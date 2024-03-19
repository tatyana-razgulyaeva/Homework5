public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else {
            System.out.println("Данная версия OS не поддерживается");
        }

        int yearOfRelease = 2022;
        if (clientOS == 1) {
            if (yearOfRelease < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }else if (clientOS == 0) {
            if (yearOfRelease < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }else {
            System.out.println("Данная версия OS не поддерживается");
        }

        int year = 2100;
        if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        }else {
            System.out.println(year + " год не является високосным");
        }

        int days = 0;
        int distance = 55;
        if (distance < 20) {
            days = 1;
            System.out.println("Потребуется дней: " + days);
        }else if (distance < 60) {
            days = 2;
            System.out.println("Потребуется дней: " + days);
        }else if (distance < 100) {
            days = 3;
            System.out.println("Потребуется дней: " + days);
        }else {
            System.out.println("Доставки нет");
        }

        int monthNumber = 22;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит к сезану осень");
                break;
            default:
                System.out.println("Этот месяц не принадлежит ни к одному из сезонов");
        }
    }
}
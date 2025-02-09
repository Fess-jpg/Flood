import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /// шиза 1
        int age = 18;
        boolean creditCart = age >= 18;
        if (creditCart) ;
        {
            System.out.println(" мы готовы выдать вам карту ");
        }
        int day = 15;
        boolean noSanitaryDay = day != 15;
        if (!noSanitaryDay) {
            System.out.println(" сегодня санитарный день ");
        } else {
            System.out.println(" сегодня обычный рабочий день ");
        }
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two) {
            System.out.println(one + " большее число ");
        } else if (two > three) {
            System.out.println(two + " наибольшее число");
        } else {
            System.out.println(three + "  наибольшее число ");
        }
        ///
        int coach = 200;
        if (coach > 0 && coach <= 60) {
            System.out.println(" есть сидячие места");
        } else if (coach > 60 && coach <= 102) {
            System.out.println(" есть стоячие места ");
        } else {
            System.out.println(" мест нет ");
        }
        System.out.println(" задание 123 ");
        int age1 = 3;
        if (age1 >= 18) {
            System.out.println(" ты можешь праздновать ");
            if (age1 < 21) {
                System.out.println(" можешь выпить сливочного пива ");
            } else {
                System.out.println(" пей что хочешь, алкашина! ");
            }
        } else {
            if (age1 >= 7) {
                System.out.println(" иди в школу ");
            } else {
                System.out.println(" иди в дет сад ");
            }
        }
        System.out.println(" задание124");
        int dayWeek = 9;
        switch (dayWeek) {
            case 8:
                System.out.println(" понедельник ");
                break;
            case 2:
                System.out.println(" Вторник");
                break;
            case 3:
                System.out.println(" среда ");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println(" пчтница ");
                break;
            case 6:
                System.out.println(" суббота");
                break;
            case 7:
                System.out.println(" воскрусение");
                break;
            default:
                System.out.println(" нет такого дня ");
        }
        System.out.println(" задание125 ");
        int workWeek = 9;
        switch (workWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println(" рабочий день ");
                break;
            case 6:
            case 7:
                System.out.println(" выходной ");
                break;
            default:
                System.out.println(" нету дня такого ");
        }


    }
}


            













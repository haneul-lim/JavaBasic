package sky.basic.day06;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {

    //computeBirth();
    computeChange();

    }//main

    public static void computeBirth() {
        Scanner sc = new Scanner(System.in);
        String birth;
        int yourBirth;

        System.out.println("생년월일 8자리 입력하세요: ");
        birth = sc.next();

        birth = (String)birth.substring(0, 4);

        yourBirth = (2021 - Integer.parseInt(birth)) + 1;

        System.out.println(birth);
        System.out.println(yourBirth);

    }

    public static void computeChange() {
        Scanner sc2 = new Scanner(System.in);
        int backMoney;
        int money;
        int goodsCost;

        System.out.println("가격을 입력하세요. ");
        goodsCost = sc2.nextInt();

        System.out.println("받은 금액 입력하세요. ");
        money = sc2.nextInt();

        backMoney = money - goodsCost;

            if ((backMoney % 50000 != 0) || (backMoney <= 50000)) {
                backMoney = backMoney / 50000;
                System.out.println("5만원권 " + backMoney + "장 필요합니다.");
            } else if ((backMoney % 10000 != 0) || (backMoney <= 10000)) {
                backMoney = backMoney / 10000;
                System.out.println("1만원권 " + backMoney + "장 필요합니다.");
            } else if (backMoney % 5000 != 0 || backMoney <= 5000) {
                backMoney = backMoney / 5000;
                System.out.println("5천원권 " + backMoney + "장 필요합니다.");
            } else if (backMoney % 1000 != 0 || backMoney <= 1000) {
                backMoney = backMoney / 1000;
                System.out.println("1천원권 " + backMoney + "장 필요합니다.");
            } else if (backMoney % 500 != 0 || backMoney <= 500) {
                backMoney = backMoney / 500;
                System.out.println("5백원 " + backMoney + "개 필요합니다.");
            } else if (backMoney % 100 != 0 || backMoney <= 100) {
                backMoney = backMoney / 100;
                System.out.println("1백원 " + backMoney + "개 필요합니다.");
            } else if (backMoney % 50 != 0 || backMoney <= 50) {
                backMoney = backMoney / 50;
                System.out.println("50원 " + backMoney + "개 필요합니다.");
            } else if (backMoney % 10 != 0 || backMoney <= 10) {
                backMoney = backMoney / 10;
                System.out.println("10원 " + backMoney + "개 필요합니다.");
            }

        System.out.println(backMoney);




    }


}//class

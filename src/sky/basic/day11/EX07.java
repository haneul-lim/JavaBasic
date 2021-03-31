package sky.basic.day11;

import java.util.Random;
import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        // Q14
        double ondDay = 86400;
        double oneHour = 3600;
        double oneMinute = 60;

        double numDay = 1234567890;
        double numHour = 98765;
        double numMinute = 12345;
        double result;

        result = numDay / ondDay;
        System.out.println((int)Math.ceil(result) + "일입니다.");

        result = numHour - oneHour;
        System.out.println((int)Math.ceil(result) + "시간입니다.");

        result = numMinute - oneMinute;
        System.out.println((int)Math.ceil(result) + "분입니다.");


        // Q25 자리에 상관없이 숫자 맞으면 당첨!
        int[] yourkey = new int[3];
        double[] lottokey = new double[3];
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        double magic = Math.random();

        System.out.print("복권 숫자 한개 입력하세요: ");
        yourkey[0] = sc.nextInt();
        System.out.print("복권 숫자 두개 입력하세요: ");
        yourkey[1] = sc.nextInt();
        System.out.print("복권 숫자 세개 입력하세요: ");
        yourkey[2] = sc.nextInt();

        System.out.println("");

        lottokey[0] = rnd.nextDouble();
        lottokey[1] = rnd.nextDouble();
        lottokey[2] = rnd.nextDouble();
        lottokey[2] = Math.random();
        //lottokey[2] = Math.random(Integer.parseInt(String.valueOf(lottokey[2])) * (45 - 1) + 1);

    }


}

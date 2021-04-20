package sky.basic.day16;

import sky.basic.sungjuk.SungJukServiceV2;
import sky.basic.sungjuk.SungJukServiceV2Impl;
import sky.basic.sungjuk.SungJukServiceV3;
import sky.basic.sungjuk.SungJukServiceV3Impl;

import java.util.Scanner;

public class SungJukV7Main {

    // 성적처리프로그램 V7 - ArrayList + 텍스트기반스트림 + 직렬화
    // 입력한 성적데이터를 직렬화를 통해 텍스트 기반 파일에 저장
    // 따라서, 프로그램 종료시 입력했던 데이터는 그대로 유지됨
    // SungJukServiceV3
    // initSungJuk, saveSungjuk (파일처리/직렬화) 추가

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SungJukServiceV3 sjsrv = SungJukServiceV3Impl.getInstance();

        String menu = "";

        while (true) {
            sjsrv.displayMenu();
            menu = sc.next();

            switch (menu) {
                case "1":
                    sjsrv.newSungJuk();
                    break;
                case "2":
                    sjsrv.showSungJuk();
                    break;
                case "3":
                    sjsrv.showOneSungJuk();
                    break;
                case "4":
                    sjsrv.modifySungJuk();
                    break;
                case "5":
                    sjsrv.removeSungJuk();
                    break;
                case "0":
                    sjsrv.saveSungJuk();
                    // saveSungJuk을 newsungjuk에 저장을 할 건지 혹은
                    // 프로그램 종료시에 데이터를 저장할 건지에 따라 해당 메서드의
                    // 위치가 달라짐
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다");
            }


        }
    }//main

}//class

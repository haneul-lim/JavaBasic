package sky.basic.day13;

import javafx.scene.transform.Scale;
import sky.basic.sungjuk.*;

import java.util.Scanner;

public class SungJukV6Main {

    // 성적처리프로그램 V6 - ArrayList + CRUD
    // 동적배열을 이용해서 대량의 성적데이터를 저장할 수 있게 함
    // 즉, 입력받은 성적데이터는 동적배열에 저장하고
    // 저장한 데이터들을 조회/수정/삭제할 수 있도록 함
    // SungJukServiceV2
    // (1)newSungJuk, (2)showSungJuk,성적조회 (3)showOneSungJuk,성적상세조회
    // (4)modifySungJuk,성적수정 (5)removeSungJuk성적삭제
    // computeSungJuk, displayMenu

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SungJukServiceV2 sjsrv = SungJukServiceV2Impl.getInstance();

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
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다");
            }


        }
    }//main

}//class

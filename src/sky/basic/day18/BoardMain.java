package sky.basic.day18;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BoardService bsrv = BoardServiceImpl.getInstance();

        String menu = "";

        while (true) {

            System.out.println(
                    "1 : 입력\n2 : 조회\n3 : 상세 조회\n" +
                    "4 : 수정 \n5 : 삭제 \n0 : 종료");
            System.out.println("번호를 입력하세요");
            menu = sc.next();

            switch (menu) {
                case "1": bsrv.newBoard(); break;
                case "2": bsrv.showBoard(); break;
                case "3": bsrv.showOneBoard(); break;
                case "4": bsrv.modifyBoard(); break;
                case "5": bsrv.removeBoard(); break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("잘못입력하셨습니다");
            }

        }


    }
}

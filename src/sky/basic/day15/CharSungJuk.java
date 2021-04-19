package sky.basic.day15;

import java.io.*;
import java.util.Scanner;

public class CharSungJuk {
    public static void main(String[] args) {
        // CharSungJuk
        // 문자기반으로 스트림을 읽거나 씀 : 유니코드 기반(1~3byte)
        // 주로 텍스트 기반 데이터를 처리할 때 사용
        // 사람이 읽고 쓸 수 있는 데이터를 대상으로 함

        // 이름, 국어, 영어, 수학을 키보드로 입력받아
        // sungjuk.dat에 저장하는 코드를 작성하세요
        // 단, 파일에 저장하는 문자열 형식은 다음과 같이 합니다.

        // 입력데이터 : 혜교 97 98 95
        // 파일 저장 형식 : 혜교,97,98,95


        // 성적 데이터 입력받기
        String name = "";
        int kor = 0;
        int eng = 0;
        int mat = 0;
        Scanner sc = new Scanner(System.in);

//        System.out.print("이름은? ");
//        name = sc.next();
//        System.out.print("국어는? ");
//        kor = sc.nextInt();
//        System.out.print("영어는? ");
//        eng = sc.nextInt();
//        System.out.print("수학은? ");
//        mat = sc.nextInt();

        System.out.println("성적은? ('이름 국어 영어 수학' 순서로) ");
        name = sc.next();
        kor = sc.nextInt();
        eng = sc.nextInt();
        mat = sc.nextInt();

        // 파일에 쓰기
        String fpath = "c:/java/sungjuk.dat";

        // 입력받은 성적데이터를 파일에 저장
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(fpath, true);
            // 파일에 데이터 누적 옵션 설정 (append : true)
            // 기본값은 false로 되어있음
            bw = new BufferedWriter(fw);

            //bw.write(name + "," + kor + "," +
            //        eng + "," + mat + "\n");

            String fmt = "%s, %d, %d, %d \n";
            String data = String.format(fmt, name, kor,eng, mat);
            bw.write(data);

            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        // 저장한 성적데이터를 화면에 출력
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(fpath);
            br = new BufferedReader(fr);

            while (br.ready()) {
                System.out.println(br.readLine());
            }

            br.close();
            fr.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }



    }
}

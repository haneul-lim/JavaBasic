package sky.basic.day15;

import sky.basic.sungjuk.SungJukVO;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SerializeSungJuk {
    // 이름, 국어, 영어, 수학을 키보드로 입력받아
    // sungjuk.bin에 저장하는 코드를 작성
    // 단, 입력받은 값들은 SungJukVO에 저장한후'
    // 직렬화해서 저장함

    // 입력 테이터 : 혜교 97 98 95
    // 역직렬화 후 결과 : 혜교 97 98 95

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String name = "";
        int kor = 0;
        int eng = 0;
        int mat = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("성적은? ('이름 국어 영어 수학' 순서로) ");
        name = sc.next();
        kor = sc.nextInt();
        eng = sc.nextInt();
        mat = sc.nextInt();

        // 입력받은 데이터를 SungJukVO에 저장 (객체만듬)
        SungJukVO sj = new SungJukVO(name, kor, eng, mat);

        // 직렬화
        String fpath = "c:/java/sungjuk.bin";

        FileOutputStream fos = new FileOutputStream(fpath);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(sj);
        // sungjukVO에 담아두는 이유는 한번에 불러오기 편하게 하기 위해
        // write를 사용해 저장 및 불러올 때 한 번에 하기 위해,,

        // 주석처리한건 내가 한 방식인뎅.. 흠... 틀린듯?ㅎ..
//        ArrayList data = new ArrayList<>();
//        data.add(name);
//        data.add(kor);
//        data.add(eng);
//        data.add(mat);
//
//        oos.writeObject(data);
        // oos.writeInt(mat);   // 쌤은 이런식으로 할 수 있다고..


        oos.close();
        bos.close();
        fos.close();



        // 역직렬화
        FileInputStream fis = new FileInputStream(fpath);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        SungJukVO sjvo = (SungJukVO)ois.readObject();

        ois.close();
        bis.close();
        fis.close();

        int tot = sjvo.getKor() + sjvo.getEng() + sjvo.getMat();
        double avg = (double)tot / 3;

        String fmt = "%s, %d, %d, %d, %d, %.1f \n";
        System.out.printf(fmt, sjvo.getName(), sjvo.getKor(),
                sjvo.getEng(), sjvo.getMat(), tot, avg);



        // 내가 한 코드
//        FileInputStream fis = new FileInputStream(fpath);
//        BufferedInputStream bis = new BufferedInputStream(fis);
//        ObjectInputStream ois = new ObjectInputStream(bis);
//
//        ArrayList data2 = (ArrayList) ois.readObject();
//        name = (String) data2.get(0);
//        kor = (int) data2.get(1);
//        eng = (int) data2.get(2);
//        mat = (int) data2.get(3);
//
//        String fmt = "%s, %d, %d, %d, %d, %.1f \n";
//        int tot = kor + eng + mat;
//        double avg = tot / 3;
//
//        System.out.printf(fmt, name, kor, eng, mat, tot, avg);
//
//        ois.close();
//        bis.close();
//        fis.close();






    } // main

} // class


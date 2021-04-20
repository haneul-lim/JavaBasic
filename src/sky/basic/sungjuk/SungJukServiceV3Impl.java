package sky.basic.sungjuk;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SungJukServiceV3Impl implements SungJukServiceV3 {
    // 멤버변수 선언
    // 입력받은 모든 성적데이터를 저장하는 동적배열 변수 선언
    List<SungJukVO> sjdata = new ArrayList<>();
    SungJukVO sj = null;

    // 성적데이터를 저장해 둘 파일경로 지정
    String fpath = "c:/java/SungJuk.data";
    String fpath2 = "c:/java/SungJuk.csv";
    String fpath3 = "c:/java/SungJuk.json";

    // CSV 직렬화를 위한 문자열 포맷   // 숫자도 문자로 데이터형식이 변경되어 저장
    String scvfmt = "%s,%d,%d,%d,%d,%.1f,%s\n"; // 띄어쓰기 하면 안됨(!!)

    // JSON 직렬화를 위한 문자열 포맷  // 데이터 형식을 유지함
    String jsonfmt = "{\"name\":\"%s\", \"kor\":%d, \"eng\":%d, \"mat\":%d, " +
            "\"tot\":%d, \"avg\":%.1f, \"grd\":\"%s\"},\n";


    // 싱글톤 패턴 시작
    private static SungJukServiceV3 sjsrv = null;

    private SungJukServiceV3Impl() {
        // 프로그램 시작시 initSungJuk 메서드 호출
        initSungJuk();
    }

    public static SungJukServiceV3 getInstance() {
        if (sjsrv == null) sjsrv = new SungJukServiceV3Impl();
        return sjsrv;
    }
    // 싱글톤 패턴 끝

    @Override
    public void displayMenu() {
        String displaymenu =
                        "--------------------------\n" +
                        "     성적 프로그램 v7	   \n" +
                        "--------------------------\n" +
                        " 1. 성적데이터 입력 \n" +
                        " 2. 성적데이터 조회 \n" +
                        " 3. 성적데이터 상세조회 \n" +
                        " 4. 성적데이터 수정 \n" +
                        " 5. 성적데이터 삭제 \n" +
                        " 0. 성적데이터 종료 \n" +
                        "--------------------------\n" +
                        " 작업을 선택하세요 : ";

        System.out.print(displaymenu);
    }

    @Override
    public void newSungJuk() {
        Scanner sc = new Scanner(System.in);

        try {
            // 입력값의 타입이 다를경우 발생한 오류를 대비해 예외처리.
            System.out.print("이름은? ");
            String name = sc.next();
            System.out.print("국어는? ");
            int kor = sc.nextInt();
            System.out.print("영어는? ");
            int eng = sc.nextInt();
            System.out.print("수학은? ");
            int mat = sc.nextInt();
            SungJukVO sj = new SungJukVO(name, kor, eng, mat);
            // 입력받은 성적데이터를 객체화함
            computeSungJunk(sj);
            // 성적데이터 처리
            sjdata.add(sj);
            // 처리된 성적데이터를 동적배열에 저장

            // 방금 입력된 성적데이터와 기존 입력된 성적데이터 모두를
            // SungJuk.data 파일에 직렬화해서 저장함
            // saveSungJuk();
            // 이곳에서 saveSungJuk 메서드를 실행하게 되면
            // 데이터가 입력될 때마다 데이터 저장이 빈번하게 이루어짐
            // 안정성이 더 높음! (강제 종료시 데이터가 보존되기 때문)

        } catch (Exception ex) {
            System.out.println("잘못입력하셨습니다!");
            return; // 오류발생시 실행 중단하고 main으로 복귀
            // 결과값을 호출자에게 넘겨주는 반환의 return
            // 함수 실행이나 특정코드를 실행하다가 중단할때 return 이 있음
        }

    }

    // 저장된 성적데이터들 중에서
    // 배열인덱스, 이름, 국어, 영어, 수학만 뽑아서
    // 목록list형태로 출력
    @Override
    public void showSungJuk() {
        String fmt = "번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d \n";
        int pos = 0; // 배열인덱스

        for( SungJukVO sj : sjdata ) {
            System.out.printf(fmt, pos, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat());
            ++pos;
        }
    }

    @Override
    public void modifySungJuk() {

    }

    @Override
    public void removeSungJuk() {

    }

    @Override
    public void computeSungJunk(SungJukVO sj) {
        sj.setTot(sj.getKor() + sj.getEng() + sj.getMat());
        sj.setAvg((double) sj.getTot() / 3);
        switch ((int)sj.getAvg() / 10) {
            case 10: case 9: sj.setGrd('수'); break;
            case 8: sj.setGrd('우'); break;
            case 7: sj.setGrd('미'); break;
            case 6: sj.setGrd('양'); break;
            default: sj.setGrd('가');
        }
    }

    @Override
    public void showOneSungJuk() {
        String fmt = "번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d \n"
                + "총점:%d, 평균:%.1f, 학점:%c \n";

            Scanner sc = new Scanner(System.in);
            System.out.print("조회할 학생 번호는? ");
            int pos = sc.nextInt();

        try {
            SungJukVO sj = sjdata.get(pos);

            System.out.printf(fmt, pos, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(),
                    sj.getTot(), sj.getAvg(), sj.getGrd());
        } catch (Exception ex) {
            System.out.println("데이터가 존재하지 않습니다!");
        }

    }
    // 기존에 입력된 성적데이터를 역직렬화로
    // 파일에서 읽어서 메모리에 적재하는 기능 담당
    @Override
    public void initSungJuk() {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(fpath);
            bis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bis);

            sjdata = (ArrayList) ois.readObject();

        } catch (Exception ex) {
            // ex.printStackTrace();
            System.out.println("파일이 없거나 시스템 오류입니다");
        } finally {
            // try{} 안의 구문이 오류가 난 경우 객체 close를 못하고
            // 예외처리 구문에서 바로 빠져나가는 경우를 방지하기 위해
            // finally를 통해 필수적으로 해당 구문을
            // 실행하고 빠져나가도록 처리하는 구문
            if(ois != null)
                try { ois.close(); } catch (IOException e) { }
            if(bis != null)
                try { bis.close(); } catch (IOException e) { }
            if(fis != null)
                try { fis.close(); } catch (IOException e) { }
        }
    }

    // 메모리내에 저장된 모든 성적데이터를
    // 직렬화를 통해 파일에 저장
    @Override
    public void saveSungJuk() {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(fpath);
            bos = new BufferedOutputStream(fos);
            oos = new ObjectOutputStream(bos);

            oos.writeObject(sjdata);

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("파일이 없거나 시스템 오류입니다");
        } finally {
            if(oos != null)
                try { oos.close(); } catch (IOException e) { }
            if(bos != null)
                try { bos.close(); } catch (IOException e) { }
            if(fos != null)
                try { fos.close(); } catch (IOException e) { }
        }

    }

    // 기존에 입력된 성적데이터를 CSV 역직렬화로
    // 파일에서 읽어서 메모리에 적재하는 기능 담당
    @Override
    public void initSungJuk2() {
        // try-with-resources 구문 사용
        try (
            FileReader fr = new FileReader(fpath2);
            BufferedReader br = new BufferedReader(fr);
        ) {
            sjdata = new ArrayList<>();
            while ( br.ready() ) {
                // csv파일에서 문자열 한줄을 읽어서
                // 쉼표 단위로 분리한 후 배열로 생성
                String line = br.readLine();
                String data[] = line.split(",");
                // 읽어들인 문자열을 , 로 구분

                // 생성된 배열을 이용해서 성적객체를 만들어
                // 총점, 평균, 학점을 구한 다음 (옵션, 생성자를 7개를 만든다면 생략)
                // (생성자 총점,평균,학점도 만든다면 따로 구하지도 않고,
                //  아래서 computeSungJuk 메서드를 호출하지 않아도 됨)
                // ArrayList에 저장함
                SungJukVO sj = new SungJukVO(
                        data[0], Integer.parseInt(data[1]),
                        Integer.parseInt(data[2]), Integer.parseInt(data[3]));
               // 성적VO객체를 만들어 데이터 초기화 시킴

                computeSungJunk(sj);

                sjdata.add(sj);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // 메모리내에 저장된 모든 성적데이터를
    // CSV직렬화를 통해 파일에 저장
    @Override
    public void saveSungJuk2() {

        // JDK7부터는 자원을 쉽게 해제할 수 있도록
        // try-with-resources라는 구문을 지원함
        try (
                FileWriter fw = new FileWriter(fpath2);
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            String result = "";
            for (SungJukVO sj : sjdata) {
                result = String.format(scvfmt, sj.getName(), sj.getKor(),
                        sj.getEng(), sj.getMat(), sj.getTot(), sj.getAvg(),
                        sj.getGrd());
                // 혜교, 77,66,55,345,76.5,수 (이런 식으로 만들어짐)
                bw.write(result);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    // 기존에 입력된 성적데이터를 JSON 역직렬화로
    // 파일에서 읽어서 메모리에 적재하는 기능 담당
    @Override
    public void initSungJuk3() {
        // try-with-resources 구문 사용
        try (
                FileReader fr = new FileReader(fpath3);
                BufferedReader br = new BufferedReader(fr);
        ) {
            // json 파일의 모든 내용을 한 번에 읽어 lines 변수에 저장
            String lines = br.lines().collect(Collectors.joining());
            // System.out.println(lines);

            // 텍스트 파일에 저장된 반정형데이터를
            // JSON 분석기(parser)를 이용해서 메모리에 객체형태로 저장함
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(lines);

            // 메모리에 저장된 객체에서 sj라는 이름의 배열객체를 가져옴
            JSONArray jsons = (JSONArray) obj.get("sj");

            // 반복문을 이용해서 배열객체의 각 요소를 하나씩 꺼내
            // 성적 객체에 담고 ArrayList에 저장함
            for(int i = 0; i < jsons.size(); ++i) {
                JSONObject json = (JSONObject) jsons.get(i);
                SungJukVO sj = new SungJukVO(
                        (String)json.get("name"),
                        ((Long)json.get("kor")).intValue(),
                        ((Long)json.get("eng")).intValue(),
                        ((Long)json.get("mat")).intValue() );
                computeSungJunk(sj);
                sjdata.add(sj);
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // 메모리내에 저장된 모든 성적데이터를
    // JSON직렬화를 통해 파일에 저장
    @Override
    public void saveSungJuk3() {
        try (
                FileWriter fw = new FileWriter(fpath3);
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            String result = "";
            bw.write("{\"sj\": [");   // json 배열 시작
            for (SungJukVO sj : sjdata) {
                result = String.format(jsonfmt, sj.getName(), sj.getKor(),
                        sj.getEng(), sj.getMat(), sj.getTot(), sj.getAvg(),
                        sj.getGrd());
                // {'name':'혜교', 'kor':77, 'eng':66, 'mat':55,
                // 'tot':345, 'avg':76.5, 'grd':'수'},
                bw.write(result);
            }
            bw.write("] }");    // json 배열 끝
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}

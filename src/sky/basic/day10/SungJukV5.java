package sky.basic.day10;

import sky.basic.day07.SungJukV4b;
import sky.basic.sungjuk.SungJukVO;

import java.util.Scanner;

public class SungJukV5 {
    public static void main(String[] args) {
        // 클래스에 대한 객체 생성하기
        // 클래스명 객체명 = new 클래스명();

        // 상속을 받은 클래스에 대한 객체 생성하기
        // 클래스명 객체명 = new 클래스명();
        // 부모클래스명 객체명 = new 자식클래스명(); <-더 추천!
        // Cat c = new Cat();
        // Animal cd = new Cat(); <- 더 추천!
        // cd = new Dog(); <- 변수 한개로 두개의 객체를 받을 수 있음
        
        // 인터페이스를 구현한 클래스 객체 생성하기
        // 인터페이스 객체명 = new 클래스명();
        //SungJukV5ServiceImpl sjsrv = new SungJukV5ServiceImpl();
        SungJukV5Service sjsrv = new SungJukV5ServiceImpl();    // 위 방식보다 해당 방식이 더 추천
        
        // 성적데이터 입력받기
        SungJukVO sj = sjsrv.readSungJuk();

        // 입력받은 성적데이터를 처리함
        sjsrv.computeSungJuk(sj);

        // 처리된 성적데이터 출력하기
        sjsrv.printSungJuk(sj);
    }//main
}//class

// 성적처리와 관련된 메서드를 따로 뽑아 인터페이스로 구현
// 보통 인터페이스의 명명법은 이름 끝에 Service를 추가함
interface SungJukV5Service {
    SungJukVO readSungJuk();
    void computeSungJuk(SungJukVO sj);
    void printSungJuk(SungJukVO sj);
}

// 인터페이스를 구현한 클래스는
// 클래스 이름 끝에 Impl 접미사를 추가해줌
class SungJukV5ServiceImpl implements SungJukV5Service{

    @Override
    public SungJukVO readSungJuk() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름은? ");
        String name = sc.next();
        System.out.print("국어는? ");
        int kor = sc.nextInt();
        System.out.print("영어는? ");
        int eng = sc.nextInt();
        System.out.print("수학은? ");
        int mat = sc.nextInt();

        return new SungJukVO(name, kor, eng, mat);
    }

    @Override
    public void computeSungJuk(SungJukVO sj) {
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
    public void printSungJuk(SungJukVO sj) {
        String fmt = "%s %d %d %d \n %d %.1f %c\n";
        System.out.printf(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(),
                sj.getTot(), sj.getAvg(), sj.getGrd());
    }
}
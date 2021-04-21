package sky.basic.day17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCMember_sky {
    public static void main(String[] args) {
        // 네이버 회원가입 기능을 JDBC로 구현
        // 테이블명 : NMember (palyground)
        // 테이블 컬럼 구성 : 아이디userid, 비밀번호passwd, 이름name, 생년월일birth,
        //                  본인확인 이메일email, 휴대전화hp
        // 자동입력 컬럼 : 회원번호mbno(PK), 가입일regdate

        // 테이블 만들기
        String sql = " create table NMember " +
                    " (userid varchar(30), passwd varchar(30), name varchar(30), " +
                    " birth varchar(30), email varchar(50), hp varchar(50), " +
                    " mbno int primary key AUTO_INCREMENT, " +
                    " regdate timestamp NOT NULL DEFAULT current_timestamp()) ";
        String newsql = " insert into NMember values (%s, %s, %s, %s, %s, %s, %d, %s) ";

        MariaJDBC jdbc = new MariaJDBC();

        // 스캐너 값 입력
        Scanner sc = new Scanner(System.in);

        System.out.println("아이디 : ");
        String userid = sc.next();
        System.out.println("비밀번호 : ");
        String passwd = sc.next();
        System.out.println("이름 : ");
        String name = sc.next();
        System.out.println("생년월일 : ");
        String birth = sc.next();
        System.out.println("본인 확인 이메일 : ");
        String email = sc.next();
        System.out.println("휴대전화 : ");
        String hp = sc.next();

        String sql2 = String.format( newsql, userid, passwd,
                                        name, birth, email, hp );

        // 값을 디비 저장
        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            int cnt = pstmt.executeUpdate();
            if ( cnt >= -1 ) System.out.println("데이터 저장 완료!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }






    } //main
} //class

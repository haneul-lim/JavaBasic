package sky.basic.day17;

import oracle.jdbc.proxy.annotation.Pre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCMember {
    public static void main(String[] args) {
        // 네이버 회원가입 기능을 JDBC로 구현
        // 테이블명 : NMember (palyground)
        // 테이블 컬럼 구성 : 아이디userid, 비밀번호passwd, 이름name, 생년월일birth,
        //                  성별gender, 본인확인 이메일email, 휴대전화hp
        // 자동입력 컬럼 : 회원번호mbno(PK), 가입일regdate

        // 회원가입 테이블
//        create table NMember (
//                mbno int primary key auto_increment,
//                userid varchar(18) not null,
//                passwd varchar(18) not null,
//                name varchar(10) not null,
//                birth varchar(10) not null,
//                gender int not null,
//                email varchar(50) not null,
//                hp varchar(15) not null,
//                regdate datetime default current_timestamp
//        );

        // 데이터 삽입 테스트
//        insert into NMember
//                (userid, passwd, name, birth, gender, email, hp)
//        values ('abc123','987xyz','홍길동','2021-04-21','1',
//                0,'email@email.com','010-1234-5678');

        // 데이터 조회 테스트
//        select mbno, userid, name, regdate from NMember
//        order by mbno desc;

        // 데이터 상세조회 테스트
//        select * from NMember where mbno = 1;

        // 데이터 수정 테스트
//        update NMember
//        set name = "전지현", birth = "2020-04-21", hp = "010-9876-5432"
//        where mbno = 1;

        // 데이터 삭제 테스트
//        delete from NMember where mbno = 1;


        // 회원정보 입력받음
        Scanner sc = new Scanner(System.in);
        System.out.println("회원정보를 입력하세요!");
        System.out.println
                ("입력순서는 아이디 비밀번호 이름 생년월일 성별 이메일 폰번호");
        String uid = sc.next();
        String pwd = sc.next();
        String name = sc.next();
        String bth = sc.next();
        String gdr = sc.next();
        String eml = sc.next();
        String hp = sc.next();


        // JDBC를 이용해서 NMember 테이블에 회원정보 저장하기
        String sql = " insert into NMember " +
               " (userid, passwd, name, birth, gender, email, hp) " +
                " values (?,?,?,?,?,?,?) ";

        MariaJDBC jdbc = new MariaJDBC();
        try(
            Connection conn = jdbc.openConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setString(1, uid);
            pstmt.setString(2, pwd);
            pstmt.setString(3, name);
            pstmt.setString(4, bth);
            pstmt.setString(5, gdr);
            pstmt.setString(6, eml);
            pstmt.setString(7, hp);

            int cnt = pstmt.executeUpdate();
            if (cnt > 0) System.out.println("회원가입 성공!");
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }


        // 회원가입 완료 후 지금까지 가입한 모든 회원 조회
        // 조회대상 컬럼 : 회원번호, 아이디, 이름, 가입일
        String sql2 = " select mbno, userid, name, regdate " +
                      " from NMember order by mbno desc ";

        try (
            Connection conn = jdbc.openConn();
            PreparedStatement pstmt = conn.prepareStatement(sql2);
            ResultSet rs = pstmt.executeQuery();
        ) {
            String fmt = "%s %s %s %s \n";
            StringBuffer sb = new StringBuffer();
            while (rs.next()) {
                String result = String.format(fmt,
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4).substring(0,10));
                sb.append(result);
            }
            System.out.println(sb.toString());
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }






// ------------------------------------------------------------

//
//
//
//        // 테이블 만들기
//        String sql = " create table NMember " +
//                    " (userid varchar(30), passwd varchar(30), name varchar(30), " +
//                    " birth varchar(30), email varchar(50), hp varchar(50), " +
//                    " mbno int primary key AUTO_INCREMENT, " +
//                    " regdate timestamp NOT NULL DEFAULT current_timestamp()) ";
//        String newsql = " insert into NMember values (%s, %s, %s, %s, %s, %s, %d, %s) ";
//
//        MariaJDBC jdbc = new MariaJDBC();
//
//        // 스캐너 값 입력
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("아이디 : ");
//        String userid = sc.next();
//        System.out.println("비밀번호 : ");
//        String passwd = sc.next();
//        System.out.println("이름 : ");
//        String name = sc.next();
//        System.out.println("생년월일 : ");
//        String birth = sc.next();
//        System.out.println("본인 확인 이메일 : ");
//        String email = sc.next();
//        System.out.println("휴대전화 : ");
//        String hp = sc.next();
//
//        String sql2 = String.format( newsql, userid, passwd,
//                                        name, birth, email, hp );
//
//        // 값을 디비 저장
//        try (
//                Connection conn = jdbc.openConn();
//                PreparedStatement pstmt = conn.prepareStatement(sql);
//        ) {
//            int cnt = pstmt.executeUpdate();
//            if ( cnt >= -1 ) System.out.println("데이터 저장 완료!");
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//




    } //main
} //class

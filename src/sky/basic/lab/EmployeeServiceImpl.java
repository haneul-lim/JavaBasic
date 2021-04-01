package sky.basic.lab;

import javafx.scene.SnapshotParameters;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    // 멤버변수 선언
    List<EmployeeVO> empdata = new ArrayList<>();
    EmployeeVO emp = null;

    // 단일 상수 선언         // makeExtInfo 메서드에서 사용할 상수선언
    static final String[] JOBID ={"FI_MGR", "AC_MGR", "SA_MAN", "IT_PROG", "ST_CLERK"};
    static int MINSAL = 2000;
    static int MAXSAL = 40000;
    static int MAXDEPT = 270;
    static int MAXMGRID = 206;

    // 싱글톤 블럭 시작
    private static EmployeeService empsrv = null;
    // 하나의 객체를 외부에서 안보이게 만들어야 함.(??)
    private EmployeeServiceImpl() { }

    public static EmployeeService getInstance() {
        if(empsrv == null) empsrv = new EmployeeServiceImpl();
        return empsrv;
    }
    // 싱글톤 블럭 끝
    // 싱글톤을 하게 되면 Main에서 getInstance부분이 검정글씨로 돌아옴



    // 화면에 프로그램 메뉴 출력
    @Override
    public void displayMenu() {
        String displaymenu =
                        "--------------------------\n" +
                        "     사원관리 프로그램 v1   \n" +
                        "--------------------------\n" +
                        " 1. 사원정보 입력 \n" +
                        " 2. 사원정보 조회 \n" +
                        " 3. 사원정보 상세조회 \n" +
                        " 4. 사원정보 수정 \n" +
                        " 5. 사원정보 삭제 \n" +
                        " 0. 프로그램 종료 \n" +
                        "--------------------------\n" +
                        " 작업을 선택하세요 : ";

        System.out.print(displaymenu);
    }


    @Override
    public void modifyEmployee() {

    }

    @Override
    public void removeEmployee() {

    }

    // 새로운 사원정보를 입력받음
    @Override
    public void newEmployee() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("사번을 입력하세요: ");
            String empno = sc.next();
            System.out.print("이름을 입력하세요: ");
            String fname = sc.next();
            System.out.print("성을 입력하세요: ");
            String lname = sc.next();
            System.out.print("이메일을 입력하세요: ");
            String email = sc.next();
            System.out.print("전화번호를 입력하세요: ");
            String phone = sc.next();
            System.out.print("입사일을 입력하세요: ");
            String hdate = sc.next();

            // 입력받은 값들을 이용해서 객체 생성
            EmployeeVO emp = new EmployeeVO(
                    empno, fname, lname, email, phone, hdate);
            // 사원 추가정보를 생성해서 사원정보로 저장
            empsrv.makeExtInfo(emp);
            // 동적배열에 새로운 사원 데이터 저장
            empdata.add(emp);
        } catch (Exception ex) {
            System.out.println("잘못입력하셨습니다!");
        }
    }

    // 사원 기본정보(사번, 이름, 성, 이메일, 전화번호, 입사일)를
    // 리스트 형태로 출력함
    @Override
    public void showEmployee() {
        String fmt = "%s %s %s %s %s %s \n";
        // "사번: %S,이름: %s,성: %s,이메일: %s,전화번호: %s,입사일: %s,\n";
        // 사번이라는 지정 번호가 존재하기 때문에 따로 인덱스 넘버를 출력하지 않아도 됨.

        for( EmployeeVO emp : empdata ) {
            System.out.printf(fmt, emp.getEmpno(), emp.getFname(), emp.getLname(),
                    emp.getEmail(), emp.getPhone(), emp.getHdate());
        }
    }


    @Override
    public void showOneEmployee() {
        String fmt =  "%s %s %s %s %s %s \n" +
                      "%s %s %s %s %s \n";
                //"{사번: %S,이름: %s,성: %s,이메일: %s,전화번호: %s,입사일: %s,\n"
                //+ "직책: %s,급여: %d,수당: %.1f, 상사번호: %S,부서번호: %s}\n";

        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 사번을 입력하세요: ");
        String empno = sc.next();

        // get으로 받아 올 수는 없고 순차 검색을 통해 알아내야함. (성능이 좋지 않음)
        // empdata 중에서 첫번째 데이터와 비교하고자 하는 데이터와 비교해서 동일하면 그 데이터를 가져오고
        // 다르면 다음 데이터로 넘어가는 것.
        EmployeeVO emp = null;
        for(EmployeeVO e : empdata) {
            // 찾는 데이터가 동적배열에 존재한다면, emp변수에 저장하고 반복문을 종료함
            if( e.getEmpno().equals(empno) ) {
                emp = e;    // 찾는 주소가 넘어옴
                break;
            }
        }

        System.out.printf(fmt, emp.getEmpno(), emp.getFname(), emp.getLname(),
                emp.getEmail(), emp.getPhone(), emp.getHdate(), emp.getJobid(),
                emp.getSal(), emp.getComm(), emp.getMgrid(), emp.getDeptid());
    }

    @Override
    public void makeExtInfo(EmployeeVO emp) {
        Random rnd = new Random();

        int key = rnd.nextInt(JOBID.length);
        String jobid = JOBID[key];

        // int sal = rnd.nextInt(38000) + 2001;
        int sal = rnd.nextInt(MAXSAL) + MINSAL;
        int mgrid = rnd.nextInt(MAXMGRID) + 100;
        int deptid = (rnd.nextInt(MAXDEPT) % 100) * 10;

        DecimalFormat df = new DecimalFormat("#.##");
        double comm = Double.parseDouble( df.format( rnd.nextDouble() / 2 ) );

//        System.out.println(jobid);
//        System.out.println(sal);
//        System.out.println(mgrid);
//        System.out.println(deptid);
//        System.out.println(comm);

        emp.setJobid(jobid);
        emp.setSal(sal);
        emp.setComm(comm);
        emp.setMgrid(mgrid + "");
        emp.setDeptid(deptid + "");

    }


}

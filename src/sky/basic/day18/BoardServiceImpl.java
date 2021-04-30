package sky.basic.day18;

import java.util.Scanner;

public class BoardServiceImpl implements BoardService{

    // 싱글톤 패턴 시작
    private static BoardService bsrv = null;

    public static BoardService getInstance() {
        if (bsrv == null) bsrv = new BoardServiceImpl();
        return bsrv;
    }
    // 싱글톤 패턴 끝


    @Override
    public void newBoard() {
        Scanner sc = new Scanner(System.in);

        System.out.println("");

    }

    @Override
    public void showBoard() {

    }

    @Override
    public void showOneBoard() {

    }

    @Override
    public void modifyBoard() {

    }

    @Override
    public void removeBoard() {

    }
}

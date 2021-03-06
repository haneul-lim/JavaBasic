package sky.basic.day19;

public class BoardMain {
    public static void main(String[] args) {
        // BoardServcie객체부터 생성

        BoardService bsrv = BoardServiceImpl.getInstance();

        //데이터 입력
        bsrv.newBoard();

        //데이터 조회
        bsrv.readBoard();

        //데이터 상세조회
        bsrv.readOneBoard();

        //데이터 수정
        bsrv.modifyBoard();

        //데이터 삭제
        bsrv.removeBoard();

    }

}

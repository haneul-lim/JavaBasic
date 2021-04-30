package sky.basic.day18;

import sky.basic.jdbc.JDBCUtil;

import java.util.List;

public class BoardDAOImpl implements BoardDAO {

    private JDBCUtil jdbc;

    private String insertSQL =
            " insert into board(title, thumbup, contents) " +
            " values (?,?,?) ";
    private String selectSQL =
            " select bdno, title, userid, regdate, views, thumbup " +
            " from board order by bdno desc ";
    private String selectOneSQL = " select * from board where bdno = ? ";
    private String updateSQL =
            " update board " +
            " set title = ?, userid = ?, views = (views + 1), " +
            " thumbup = (thumbup + 1), contents = ? regdate = current_timestamp " +
            " where bdno = ? ";
    private String deleteSQL = " delete from board where bdno = ? ";


    public BoardDAOImpl() { jdbc = new JDBCUtil(); }

    public static sky.basic.day19.BoardDAO getInstance() {
        return null;
    }


    @Override
    public int insertBoard(BoardVO bd) {
        return 0;
    }

    @Override
    public List<BoardVO> selectBoard() {
        return null;
    }

    @Override
    public BoardVO selectOneBoard(int bdno) {
        return null;
    }

    @Override
    public int updateBoard(BoardVO bd) {
        return 0;
    }

    @Override
    public int deleteBoard(int bdno) {
        return 0;
    }
}

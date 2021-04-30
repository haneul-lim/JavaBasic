package sky.basic.day18;

public class BoardVO {
    //멤버변수
    protected int bdno;
    protected String title;
    protected String userid;
    protected String regdate;
    protected int views;
    protected int thumbup;
    protected String contents;


    //생성자

    public BoardVO() { }

    public BoardVO(String title, String userid, String contents) {
        this.title = title;
        this.userid = userid;
        this.contents = contents;
    }

    //setter/getter


    public int getBdno() {
        return bdno;
    }

    public void setBdno(int bdno) {
        this.bdno = bdno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getThumbup() {
        return thumbup;
    }

    public void setThumbup(int thumbup) {
        this.thumbup = thumbup;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }






}

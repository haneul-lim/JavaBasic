package sky.basic.day10;

import sky.basic.sungjuk.SungJukService;
import sky.basic.sungjuk.SungJukServiceImpl;
import sky.basic.sungjuk.SungJukVO;

public class SungJukV5bMain {
    public static void main(String[] args) {
        // SungJukService sjsrv = new SungJukServiceImpl();
        SungJukService sjsrv = SungJukServiceImpl.getInstance();

        SungJukVO sj  = sjsrv.readSungJuk();
        sjsrv.computeSungJunk(sj);
        sjsrv.printSungJunk(sj);
    }//main
}//class

--테이블명 : board
--구성 도메인 : 글번호 제목 작성자 작성일 조회수 추천수 본문
--컬럼명 : bdno, title, userid, regdate, views, thumbup, contents
--
--입력 :
--조회 :
--상세조회 :
--수정 :
--삭제 :
--
--BoardMain, BoardService, BoardDAO
--           BoardServiceImpl, BoardDAOImpl
--(display X)
--
--테이블 -> sql코드 테스트 -> 자바코드


create table board (
    bdno int auto_increment,
    title varchar(100) not null,
    userid varchar(20) not null,
    regdate datetime default current_timestamp,
    views int default '0',
    thumbup int default '0',
    contents text(65535) not null,
    primary key (bdno)
);

insert into board(title, thumbup, contents)
values ('타이틀', 'sky', '게시판 프로그램을 작성중에 있습니다.');

select bdno, title, userid, regdate, views, thumbup from board order by bdno desc;

select * from board where bdno = 1;

update board
set title = '타이틀을 바꿔볼래', userid = '아이디바꿈',
    views = (views + 1), thumbup = (thumbup + 1), contents = '내용없음'
where bdno = 1;

delete from board where bdno = 1;
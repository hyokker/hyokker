--코멘트 테이블

--drop table comments cascade constraint;

CREATE TABLE comments (
    no                number        primary key,    --번호
    name             varchar2(20)    not null,            --이름    
    pwd              varchar2(20)    not null,            --비밀번호
    regdate         date        default  sysdate,    --작성일
    content         varchar2(2000)         null,            --내용
    bdNo            number references board(no) on delete cascade not null        --원본 게시판 글번호    
    --boardName	varchar2(50)		null	-- 게시판이름 : reboard, upboard
);

--drop sequence comments_seq;
create sequence comments_seq
increment by 1
start with 1
nocache;

select * from comments;

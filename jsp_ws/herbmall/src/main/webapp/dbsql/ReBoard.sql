--답변형 게시판 테이블
--drop table reboard  cascade constraint;

create table reboard
(
    no              number		primary key,      --번호
    name         varchar2(20)      not null,            --이름    
    pwd           varchar2(20)	not null,             --비밀번호
    title           varchar2(100)	not  null,            --제목
    email         varchar2(80)	null,				--이메일
    regdate      date			default  sysdate,      --작성일
    readcount  number		default 0     null,      --조회수
    content      clob			null,			--내용
	groupNo  	number      	default 0,       	--그룹번호
	step	   	number       	default 0,	  	--글의 단계 
	sortNo 	number       	default 0,   	--글의 정렬순서
	delFlag    	char			default 'N'	 --삭제 Flag  
);

create sequence reboard_seq
increment by 1
start with 1
nocache;

select * from reboard;

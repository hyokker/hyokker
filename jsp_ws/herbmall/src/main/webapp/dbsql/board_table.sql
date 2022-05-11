create table board
(
	no		        number		primary key,	--번호
	name		varchar2(20)	not null,			--이름	
	pwd			varchar2(20)    not null,            --비밀번호
	title			varchar2(100)	 not null,			--제목
	email		varchar2(80)    null,            --이메일
	regdate 		date			default  sysdate,	--작성일
	--regip		varchar2(15)	 null,			--작성IP
	readcount	number		default 0	 null,		--조회수
	content		clob			null			--내용
);

create sequence board_seq
increment by 1
start with 1
nocache;

select * from board;

create table board
(
	no		        number		primary key,	--��ȣ
	name		varchar2(20)	not null,			--�̸�	
	pwd			varchar2(20)    not null,            --��й�ȣ
	title			varchar2(100)	 not null,			--����
	email		varchar2(80)    null,            --�̸���
	regdate 		date			default  sysdate,	--�ۼ���
	--regip		varchar2(15)	 null,			--�ۼ�IP
	readcount	number		default 0	 null,		--��ȸ��
	content		clob			null			--����
);

create sequence board_seq
increment by 1
start with 1
nocache;

select * from board;

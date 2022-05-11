--reboardDelete.sql
--exec reboardDelete(13,0,13);
create or replace procedure reboardDelete --프로시저 이름 
(
--매개변수
    p_groupNo number,
    p_step    number,
    p_no  number
)
is
--변수선언부
cnt number;
flag char;
begin
    --[1] 원본글인 경우
    if p_step=0 then
        --답변이 존재하는지 체크
        select count(*) into cnt 
        from reboard
        where groupno=p_groupNo;
        
        --1) 답변이 존재하면
        if cnt>1 then
            update reboard
            set delflag='Y'
            where no=p_no;
        else --2) 답변이 없으면
            delete from reboard
            where no=p_no;
        end if;
    else --[2] 답변글인 경우
        delete from reboard
        where no=p_no;
        
        select count(*) into cnt
        from reboard
        where groupno=p_groupno;
        
        select delflag into flag
        from reboard
        where groupno=p_groupno and step=0;
        
        if flag='Y' and cnt=1 then
        delete reboard
        where no=p_groupno;
        
    end if;
    
    commit;

EXCEPTION
    WHEN OTHERS THEN
        raise_application_error(-20001, '답변형 게시판 글삭제 실패!');
        ROLLBACK;
end;

select * from reboard order by groupno desc, sortno;
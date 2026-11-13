select * from school;
select * from tab;
select * from 학생;
select * from teacher;
CREATE TABLE sports(
	sno number(2) primary key,
	sname varchar2(20),
	smajor varchar2(30)
);

insert into sports values (1,'손흥민','축구');
insert into sports values (2,'마이클 조던','농구');
insert into sports values (3,'강호동','씨름');
select * from sports;
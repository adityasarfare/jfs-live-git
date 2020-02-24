select * from COUNTRIES;

-- anonymous block
set serveroutput on;
begin
dbms_output.put_line('My first pl/sql anonymous block');
end;

declare
begin
exception
end;

procedure display
is
begin
end;

function display
return datatype
is
begin
return value;
end;

--Declaring and Initializing PL/SQL Variables
declare 
--name char(10) := 'Monday';
name char(10); 
message char(20) := q'!'Tuesday's are good!';
begin
name := 'Tuesday';
dbms_output.put_line('Mr.' || name);
dbms_output.put_line('Message ' || message);
end;

desc employees;

select * from employees;

create table demployees(
EMPLOYEE_ID number(6), 
LAST_NAME char (25)
);

select * from DEMPLOYEES;

insert into DEMPLOYEES values (101,'sam');
insert into DEMPLOYEES values (102,'ram');
go;

select EMPLOYEE_ID from DEMPLOYEES where LAST_NAME ='sam';

declare
vEMPLOYEE_ID number(6);
begin
select EMPLOYEE_ID into vEMPLOYEE_ID from DEMPLOYEES where LAST_NAME ='sam';
dbms_output.put_line(vEMPLOYEE_ID);
end;

select sysdate from dual;

declare
vEMPLOYEE_ID DEMPLOYEES.EMPLOYEE_ID%TYPE;
begin
select EMPLOYEE_ID into vEMPLOYEE_ID from DEMPLOYEES where LAST_NAME ='sam';
dbms_output.put_line(vEMPLOYEE_ID);
end;


--instant practice
--convert the pl/sql variable to bind variable...

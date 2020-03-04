SELECT select_list
INTO {variable_name[, variable_name]...
| record_name}
FROM table
[WHERE condition];

--BREAKING DOWN THE SYNTAX
SELECT FIRST_NAME, LAST_NAME
INTO VFIRST_NAME, VLAST_NAME
FROM TABLE
WHERE EMPLOYEE_ID = 'E01';

DECLARE
VFIRST_NAME VARCHAR2(20);
VLAST_NAME VARCHAR2(20);
BEGIN
    SELECT FIRST_NAME, LAST_NAME
    INTO VFIRST_NAME , VLAST_NAME
    FROM EMPLOYEES;
    dbms_output.put_line('FIRST NAME > ' || VFIRST_NAME || ' LAST NAME > ' || VLAST_NAME);
END;

--ORA-01422: exact fetch returns more than requested number of rows

--ERROR FIX
DECLARE
VFIRST_NAME VARCHAR2(20);
VLAST_NAME VARCHAR2(20);
BEGIN
    SELECT FIRST_NAME, LAST_NAME
    INTO VFIRST_NAME , VLAST_NAME
    FROM EMPLOYEES;
    dbms_output.put_line('FIRST NAME > ' || VFIRST_NAME || ' LAST NAME > ' || VLAST_NAME);
END;

--PRECISION AND SCALE
NUMBER(7,3)
1234.567


SET SERVEROUTPUT ON
DECLARE
sum_sal NUMBER(10,2);
deptno NUMBER NOT NULL := 60;
BEGIN
SELECT SUM(salary) -- group function
INTO sum_sal FROM employees
WHERE department_id = deptno;
DBMS_OUTPUT.PUT_LINE ('The sum of salary is '
|| sum_sal);
END;
/

--
--CREATE A function
CREATE FUNCTION FIRSTFUNCTION
RETURNS BOOLEAN
IS
BEGIN
RETURN TRUE;
END;

--CREATE TABLE, VIEW, PROCEDURE, FUNCTION, TRIGGER
DROP PROCEDURE PRCFIRST1;
CREATE OR REPLACE PROCEDURE PRCFIRST1
AS
BEGIN
DBMS_OUTPUT.PUT_LINE ('FIRST PROCEDURE');
END;

--EXECUTING A PROCEDURE
BEGIN
PRCFIRST1;
END;

CREATE OR REPLACE FUNCTION FIRSTFUNCTION
RETURN NUMBER
AS
BEGIN
RETURN 100;
END;

--EXECUTING A FUNCTION
SELECT FIRSTFUNCTION() FROM DUAL;
SELECT FIRSTFUNCTION() * 10 FROM DUAL;
SELECT SALARY, SALARY * FIRSTFUNCTION() FROM EMPLOYEES;

BEGIN
DBMS_OUTPUT.PUT_LINE (FIRSTFUNCTION());
END;

--FUNCTION WITH PARAMETERS
CREATE OR REPLACE FUNCTION ADDFUNCTION (NUMBER1 NUMBER, NUMBER2 NUMBER)
RETURN NUMBER
AS
BEGIN
RETURN NUMBER1 + NUMBER2;
END;

SELECT ADDFUNCTION(100,200) FROM DUAL;
SELECT SALARY,COMMISSION_PCT,  ADDFUNCTION(SALARY, COMMISSION_PCT) FROM EMPLOYEES;
SELECT ADDFUNCTION(&NUMBER1,&NUMBER2) FROM DUAL;

--USING BIND VARIABLES WITH FUNCTIONS
VARIABLE NUM1 NUMBER
EXEC :NUM1:=100


VARIABLE NUM2 NUMBER;
EXEC :NUM2 := 200

SELECT ADDFUNCTION(:NUM1,:NUM2) FROM DUAL;

--CURSORS--
--ACCESSING A SINGLE RECORD
DECLARE
VFIRST_NAME EMPLOYEES.FIRST_NAME%TYPE;
VLAST_NAME EMPLOYEES.LAST_NAME%TYPE;
CURSOR EMPCURSOR IS 
select FIRST_NAME, LAST_NAME from employees WHERE EMPLOYEE_ID = 105;
BEGIN
OPEN EMPCURSOR;
FETCH EMPCURSOR INTO VFIRST_NAME, VLAST_NAME;
DBMS_OUTPUT.PUT_LINE (VFIRST_NAME || ' ' || VLAST_NAME);
CLOSE EMPCURSOR;
END;


--ACCESSING MULTIPLE RECORDS
DECLARE
--VFIRST_NAME EMPLOYEES.FIRST_NAME%TYPE;
--VLAST_NAME EMPLOYEES.LAST_NAME%TYPE;
CURSOR EMPCURSOR IS 
select FIRST_NAME, LAST_NAME from employees;
BEGIN
--OPEN EMPCURSOR;
--FETCH EMPCURSOR INTO VFIRST_NAME, VLAST_NAME;
-- FOR EMPCURSORRECORD IN (select FIRST_NAME, LAST_NAME from employees)
FOR EMPCURSORRECORD IN EMPCURSOR
LOOP
DBMS_OUTPUT.PUT_LINE (EMPCURSORRECORD.FIRST_NAME || ' ' || EMPCURSORRECORD.LAST_NAME);
END LOOP;
--CLOSE EMPCURSOR;
END;


--VIEWS ARE VIRTUAL TABLES
CREATE VIEW VWEMP
AS
SELECT FIRST_NAME, LAST_NAME FROM EMPLOYEES;
SELECT * FROM VWEMP WHERE FIRST_NAME LIKE 'D%';

--EXCEPTION HANDLING
declare
vEMPLOYEE_ID number(6);
begin
select EMPLOYEE_ID into vEMPLOYEE_ID from EMPLOYEES where MANAGER_ID =100;
dbms_output.put_line(vEMPLOYEE_ID);
EXCEPTION
WHEN TOO_MANY_ROWS THEN
dbms_output.put_line('ENSURE THAT QUERY RETURNS ONLY ONE RECORD OR USE A CURSOR INSTEAD');
end;

--PACKAGES
CREATE OR REPLACE PACKAGE FIRSTPACK 
IS
TESTVAR NUMBER := 5;
PROCEDURE TESTPROC (TESTVAL NUMBER);
END FIRSTPACK;

CREATE OR REPLACE PACKAGE BODY FIRSTPACK 
IS
    PROCEDURE TESTPROC (TESTVAL NUMBER) IS
    BEGIN
    dbms_output.put_line(TESTVAL);
    END TESTPROC;
END FIRSTPACK;

EXECUTE FIRSTPACK.TESTPROC(100);
EXECUTE dbms_output.put_line('INVOKING PACKAGE PROCEDURE');
EXECUTE dbms_output.put_line(SYSDATE);
--DROP THE PACKAGE
DROP PACKAGE  FIRSTPACK
DROP PACKAGE  BODY FIRSTPACK

--GET THE SOURCE CODE
SELECT TEXT FROM USER_SOURCE WHERE NAME = 'FIRSTPACK';

--TRIGGERS
CREATE OR REPLACE TRIGGER TRGDEMPLOYEESINSERT 
BEFORE INSERT
ON DEMPLOYEES
BEGIN
RAISE_APPLICATION_ERROR(-20500, 'You may insert'
||' into EMPLOYEES table only during '
||' business hours.');
--dbms_output.put_line('RECORD INSERTED ' || SYSDATE);
END;

INSERT INTO DEMPLOYEES VALUES (555,'TEST');
SELECT * FROM DEMPLOYEES;

Analyze the PL/SQL code given below figure out which line of code produces an error?

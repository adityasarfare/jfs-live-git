# LABS
1. For the department 80, print the max, min, avg, count of commission_pct.
2. Grading employee salaries
   1. accpet employee id
   2. sort the salary as low <10000, average (between 10000 and 20000) and high (greater than 20000)
   3. Print : Employee <First_Name> Salary Grade <<Grade>>
3. Write a loop to print the number from 10 to 1 in reverse.
4. Make a copy of regions table
   1. insert 3 regions using a procedure.
   2. print the number of rows inserted using sql implicit cursor.
5. CREATE a procedure, invoke the below function and display the result.
   1. CREATE OR REPLACE FUNCTION FIRSTFUNCTION
       RETURN NUMBER
       IS
       BEGIN
       RETURN 5;
       END;
6. Create a view 

# EXTENDED LABS
1. Requirement : (Evaluation)
   1. Create a table (Scores : ParticipantID, ObjectiveScore, SubjectiveScore)
   2. Create the following procedures  
      1. insertScores
      2. updateScores
      3. deleteScores
   3. The procedures should take input parameters (ParticipantID, ObjectiveScore, SubjectiveScore) 
   4. create a function to participant id and return his total score.
2. Implement a procedure to demonstarte the following exceptions
   1. NO_DATA_FOUND
   2. INVALID_CURSOR
   3. HANDLE ALL OTHER EXCEPTIONS
3. CREATE A TRIGGER 
   1. that allows insertion, updation and deletion only during business hours.
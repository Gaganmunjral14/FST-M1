-- Add the grade column
alter table salesman add grade int;

--Update the value in the grade column
Update salesman set grade = 100;

-- Display data 
Select * from salesman;
CREATE TABLE Worker(
Worker_Id INT PRIMARY KEY,
First_Name VARCHAR(50),
Last_Name VARCHAR(50),
Salary INT,
Joining_Date DATE,
Department VARCHAR(50)
);

SELECT * FROM Worker;

INSERT INTO Worker VALUES
(1, 'Monika', 'Arora', 100000, '2020-02-14', 'HR'),
(2, 'Niharika', 'Verma', 80000, '2011-02-14', 'Admin'),
(3, 'Vishal', 'Singhal', 300000, '2020-02-14', 'HR'),
(4, 'Amitabh', 'Singh', 500000, '2020-02-14', 'Admin'),
(5, 'Vivek', 'Bhati', 500000, '2011-06-14', 'Admin'),
(6, 'Vipul', 'Diwan', 200000, '2011-06-14', 'Account'),
(7, 'Satish', 'Kumar', 75000, '2020-01-14', 'Account'),
(8, 'Geetika', 'Chauhan',90000 , '2011-04-14', 'Admin');

CREATE TABLE Bonus (
    WORKER_REF_ID INT,
    BONUS_AMOUNT INT,
    BONUS_DATE DATE,
    FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);

SELECT * FROM Bonus;

INSERT INTO Bonus VALUES
(1, 5000, '2020-02-16'),
(2, 3000, '2011-06-16'),
(3, 4000, '2020-02-16'),
(1, 4500, '2020-02-16'),
(2, 3500, '2011-02-16'),
(4, 4500, '2020-02-16'),
(5, 3500, '2011-02-16');


CREATE TABLE Title (
    WORKER_REF_ID INT,
    WORKER_TITLE VARCHAR(50),
    AFFECTED_FROM DATE,
    FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);

SELECT * FROM Title;

INSERT INTO Title VALUES
(1, 'Manager', '2016-02-20'),
(2, 'Executive', '2016-06-11'),
(8, 'Executive', '2016-06-11'),
(5, 'Manager', '2016-06-11'),
(4, 'Asst. Manager', '2016-06-11'),
(7, 'Executive', '2016-06-11'),
(6, 'Lead', '2016-06-11'),
(3, 'Lead', '2016-06-11');


SELECT W.FIRST_NAME, W.SALARY, T.WORKER_TITLE
FROM Worker W
JOIN Title T ON W.WORKER_ID = T.WORKER_REF_ID;




CREATE OR REPLACE FUNCTION get_worker_count_by_nth_highest_salary(n INT)
RETURNS INTEGER AS $$
DECLARE
    nth_salary INT;
    worker_count INT;
BEGIN
    -- Get the nth highest salary
    SELECT DISTINCT SALARY INTO nth_salary
    FROM Worker
    ORDER BY SALARY DESC
    LIMIT 1 OFFSET n - 1;
 
    -- Get the count of workers having the nth highest salary
    SELECT COUNT(*) INTO worker_count
    FROM Worker
    WHERE SALARY = nth_salary;
 
    RETURN worker_count;
END;
$$ LANGUAGE plpgsql;
 
-- Example call to the function for the 4th highest salary
SELECT get_worker_count_by_nth_highest_salary(1);
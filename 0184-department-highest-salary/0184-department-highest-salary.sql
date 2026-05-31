/* Write your PL/SQL query statement below */
SELECT d.name AS Department,e.name AS Employee,e.salary as Salary FROM Employee e join Department d on e.departmentId=d.id where e.salary=(select max(salary)  FROM Employee where
departmentId=e.departmentId)
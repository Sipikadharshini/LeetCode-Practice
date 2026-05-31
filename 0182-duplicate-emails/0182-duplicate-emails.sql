/* Write your PL/SQL query statement below */
SELECT email AS Email from Person GROUP BY Email HAVING count(email)>1;
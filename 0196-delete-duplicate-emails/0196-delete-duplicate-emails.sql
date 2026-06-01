/* Write your PL/SQL query statement below */
DELETE from Person where ID not in (select min(id) from PERSON GROUP BY email);
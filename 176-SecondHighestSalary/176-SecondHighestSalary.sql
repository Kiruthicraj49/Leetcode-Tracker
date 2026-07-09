-- Last updated: 09/07/2026, 15:08:07
select max(salary) as SecondHighestSalary from Employee
 where salary < (select max(salary) from Employee);
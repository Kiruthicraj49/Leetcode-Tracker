-- Last updated: 09/07/2026, 15:07:55
select d.name AS Department, e1.name AS Employee, e1.salary AS Salary
from Employee e1 join Department d on e1.departmentId = d.id
where (select COUNT(distinct e2.salary) from Employee e2 
where e2.departmentId = e1.departmentId and  e2.salary > e1.salary) < 3;
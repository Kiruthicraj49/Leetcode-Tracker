-- Last updated: 09/07/2026, 15:07:57
select d.name as Department, e.name as Employee,e.salary as Salary 
from Department d join Employee e on d.id = e.departmentId 
where (e.departmentId,e.salary) in (select departmentId,max(salary) 
from Employee group by departmentId);

-- Last updated: 09/07/2026, 15:08:06
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  SET N = N - 1;
  RETURN (
      select distinct salary from Employee order by salary desc limit 1 offset N
  );
END
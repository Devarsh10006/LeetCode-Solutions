-- SELECT TOP 1
--     salary AS SecondHighestSalary
-- FROM (
--     SELECT DISTINCT TOP 2 salary
--     FROM Employee
--     ORDER BY salary DESC
-- ) AS temp
-- ORDER BY salary

SELECT MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee);

-- SELECT (
--     SELECT DISTINCT salary
--     FROM Employee
--     ORDER BY salary DESC
--     OFFSET 1 ROW FETCH NEXT 1 ROW ONLY
-- ) AS SecondHighestSalary;
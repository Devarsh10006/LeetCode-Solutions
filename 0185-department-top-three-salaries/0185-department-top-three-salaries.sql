SELECT
    D.name AS Department,
    E.name AS Employee,
    E.salary AS Salary
FROM (
    SELECT
        *,
        DENSE_RANK() OVER (
            PARTITION BY departmentId
            ORDER BY salary DESC
        ) AS salary_rank
    FROM Employee
) E
INNER JOIN Department AS D
    ON D.id = E.departmentId
WHERE E.salary_rank <= 3;


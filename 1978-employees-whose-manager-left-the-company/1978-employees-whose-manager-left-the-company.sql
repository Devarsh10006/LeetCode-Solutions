SELECT 
    employee_id
FROM Employees

WHERE 
    salary < 30000
        AND
    manager_id IS NOT NULL
        AND 
    MANAGER_ID NOT IN (
        SELECT 
            EMPLOYEE_ID 
        FROM EMPLOYEES
    )

ORDER BY 
    employee_id
CREATE FUNCTION getNthHighestSalary(@N INT) RETURNS INT AS
BEGIN
    DECLARE @result INT;
    IF (SELECT COUNT(DISTINCT salary) FROM Employee) < @N
        BEGIN
            SET @result = NULL;
        END
    ELSE IF (@N) < 0
        BEGIN
            SET @result = NULL;
        END
    ELSE
        BEGIN
            SELECT @result = MIN(salary)
            FROM (
                SELECT DISTINCT TOP (@N) salary
                FROM Employee
                ORDER BY salary DESC
            ) t;
        END
    RETURN (
        @result
    );
END

-- SELECT DISTINCT salary
-- FROM Employee
-- ORDER BY salary DESC
-- OFFSET @N - 1 ROW
-- FETCH NEXT 1 ROW ONLY
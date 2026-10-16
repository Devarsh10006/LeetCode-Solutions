SELECT MAX(num) AS num
FROM MyNumbers
WHERE Num IN (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(*) = 1
);
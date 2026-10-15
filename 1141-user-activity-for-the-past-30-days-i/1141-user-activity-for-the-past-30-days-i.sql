SELECT
    activity_date AS day,
    COUNT(DISTINCT user_id) AS active_users
FROM Activity
WHERE activity_date BETWEEN DATEADD(DAY, -29, '2019-07-27')
                        AND '2019-07-27'
GROUP BY activity_date;


-------------------Another Ways----------------
-- SELECT
--     activity_date AS day,
--     COUNT(DISTINCT user_id) AS active_users
-- FROM Activity
-- WHERE activity_date BETWEEN
--     DATEADD(DAY, -29, (SELECT 
--                             MAX(activity_date) 
--                         FROM Activity)
--                        )
--       AND (SELECT 
--             MAX(activity_date) 
--             FROM Activity
--           )
-- GROUP BY activity_date;



-- WITH cte AS (
--     SELECT MAX(activity_date) AS max_date
--     FROM Activity
-- )

-- SELECT
--     A.activity_date AS [day],
--     COUNT(DISTINCT A.user_id) AS active_users
-- FROM Activity A
-- CROSS JOIN cte
-- WHERE A.activity_date BETWEEN
--       DATEADD(DAY, -29, cte.max_date)
--       AND cte.max_date
-- GROUP BY A.activity_date;
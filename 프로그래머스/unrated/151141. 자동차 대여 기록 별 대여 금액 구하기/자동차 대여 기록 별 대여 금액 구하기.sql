SELECT D.HISTORY_ID, (NVL(1 - C.DISCOUNT_RATE / 100, 1) * D.DAILY_FEE) * D.DAYS AS FEE
FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN C
RIGHT JOIN (
    SELECT A.CAR_ID, A.END_DATE - A.START_DATE + 1 AS DAYS, B.CAR_TYPE, B.DAILY_FEE, A.HISTORY_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY A
    RIGHT OUTER JOIN (
        SELECT CAR_ID, DAILY_FEE, CAR_TYPE
        FROM CAR_RENTAL_COMPANY_CAR
        WHERE CAR_TYPE = '트럭'
    ) B ON A.CAR_ID = B.CAR_ID
) D ON D.CAR_TYPE = C.CAR_TYPE
AND C.DURATION_TYPE = CASE
    WHEN D.DAYS >= 90 THEN '90일 이상'
    WHEN D.DAYS >= 30 THEN '30일 이상'
    WHEN D.DAYS >= 7 THEN '7일 이상'
    ELSE NULL
    END
ORDER BY FEE DESC, HISTORY_ID DESC;
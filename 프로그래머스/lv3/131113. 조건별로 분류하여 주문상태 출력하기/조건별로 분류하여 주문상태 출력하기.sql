SELECT ORDER_ID, PRODUCT_ID, TO_CHAR(OUT_DATE,'YYYY-MM-DD') AS OUT_DATE,
    CASE WHEN TO_CHAR(OUT_DATE, 'YYYY-MM-DD') <= TO_CHAR(DATE '2022-05-01', 'YYYY-MM-DD') THEN '출고완료'
    WHEN TO_CHAR(OUT_DATE, 'YYYY-MM-DD') > TO_CHAR(DATE '2022-05-01', 'YYYY-MM-DD') THEN '출고대기'
         ELSE '출고미정' END AS "출고여부"
FROM FOOD_ORDER
ORDER BY ORDER_ID;

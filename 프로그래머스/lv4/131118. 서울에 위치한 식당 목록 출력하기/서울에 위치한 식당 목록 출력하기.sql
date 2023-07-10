SELECT A.REST_ID, A.REST_NAME, A.FOOD_TYPE, A.FAVORITES, A.ADDRESS, B.SCORE
FROM REST_INFO A
INNER JOIN (SELECT REST_ID, ROUND(AVG(REVIEW_SCORE),2) AS SCORE
           FROM REST_REVIEW
           GROUP BY REST_ID)B
ON A.REST_ID=B.REST_ID
WHERE A.ADDRESS LIKE '서울%'
ORDER BY B.SCORE DESC, A.FAVORITES DESC
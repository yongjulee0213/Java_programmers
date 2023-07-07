SELECT A.MEMBER_NAME, B.REVIEW_TEXT, TO_CHAR(B.REVIEW_DATE,'YYYY-MM-DD') AS REVIEW_DATE
FROM MEMBER_PROFILE A, REST_REVIEW B
WHERE A.MEMBER_ID = B.MEMBER_ID  /*이너조인*/
AND A.MEMBER_ID IN (
                    SELECT MEMBER_ID FROM 
                    (
                        -- 유저 ID 및 유저별 리뷰 수를 구하는 쿼리
                        SELECT MEMBER_ID, COUNT(*) AS CNT FROM REST_REVIEW
                        GROUP BY MEMBER_ID)
                        WHERE CNT = 
                                    (
                                        -- 최대 리뷰 수 구하는 쿼리
                                        SELECT MAX(COUNT(*)) AS MAXCNT FROM REST_REVIEW
                                        GROUP BY MEMBER_ID)
                                    )
ORDER BY B.REVIEW_DATE, B.REVIEW_TEXT;
SELECT C.APNT_NO, C.PT_NAME , C.PT_NO, C.MCDP_CD, D.DR_NAME, C.APNT_YMD
FROM DOCTOR D
INNER JOIN (
            SELECT B.APNT_NO, A.PT_NAME , B.PT_NO, B.MCDP_CD, B.APNT_YMD, B.MDDR_ID
            FROM PATIENT A
            INNER JOIN
                        (
                        SELECT APNT_YMD, PT_NO, APNT_NO, MCDP_CD, MDDR_ID
                        FROM APPOINTMENT
                        WHERE TO_CHAR(APNT_YMD,'YYYY-MM-DD')=TO_CHAR(DATE'2022-04-13','YYYY-MM-DD') AND MCDP_CD='CS'
                                AND APNT_CNCL_YN='N'
                        ) B
            ON A.PT_NO=B.PT_NO
        ) C
ON D.DR_ID=C.MDDR_ID
ORDER BY APNT_YMD
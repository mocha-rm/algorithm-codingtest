SELECT a.title, a.BOARD_ID, b.REPLY_ID, b.WRITER_ID, b.CONTENTS, 
SUBSTR(b.CREATED_DATE, 1, 10) AS CREATED_DATE
FROM USED_GOODS_BOARD a
JOIN USED_GOODS_REPLY b on a.BOARD_ID = b.BOARD_ID
WHERE YEAR(a.CREATED_DATE) = 2022 AND MONTH(a.CREATED_DATE) = 10
ORDER BY CREATED_DATE, a.title
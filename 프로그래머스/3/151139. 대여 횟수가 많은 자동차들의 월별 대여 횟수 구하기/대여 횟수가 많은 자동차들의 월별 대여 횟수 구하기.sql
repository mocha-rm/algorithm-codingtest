SELECT MONTH(START_DATE) MONTH, CAR_ID, COUNT(CAR_ID) RECORD
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE MONTH(START_DATE) BETWEEN 8 AND 10
AND CAR_ID IN (SELECT CAR_ID
              FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
              WHERE YEAR(START_DATE) = 2022 AND MONTH(START_DATE) BETWEEN 8 AND 10
              GROUP BY CAR_ID
              HAVING COUNT(CAR_ID) >= 5)
GROUP BY MONTH, CAR_ID
ORDER BY MONTH, CAR_ID DESC;
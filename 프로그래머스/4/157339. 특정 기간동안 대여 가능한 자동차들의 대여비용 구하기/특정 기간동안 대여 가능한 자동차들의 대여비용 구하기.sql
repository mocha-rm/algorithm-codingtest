SELECT CAR_ID, sub.CAR_TYPE, FLOOR((daily_fee - (daily_fee * (p.discount_rate / 100))) * 30) FEE
FROM car_rental_company_discount_plan p
JOIN (
    SELECT a.CAR_ID, a.CAR_TYPE, a.DAILY_FEE, b.HISTORY_ID
    FROM car_rental_company_car a
    JOIN car_rental_company_rental_history b ON a.car_id = b.car_id
    WHERE a.CAR_ID NOT IN (
        SELECT CAR_ID
        FROM car_rental_company_rental_history
        WHERE END_DATE > '2022-11-01' AND START_DATE < '2022-12-01'
    ) AND a.CAR_TYPE in ('세단', 'SUV')
) AS sub ON p.car_type = sub.car_type
WHERE p.DURATION_TYPE = '30일 이상'
GROUP BY car_id
HAVING FEE BETWEEN 500000 AND 2000000
ORDER BY FEE DESC, p.CAR_TYPE, CAR_ID DESC

                                        
                                        
                                        
                                        
# case when p.car_type = '세단' then )
#      when p.car_type = 'SUV' then da
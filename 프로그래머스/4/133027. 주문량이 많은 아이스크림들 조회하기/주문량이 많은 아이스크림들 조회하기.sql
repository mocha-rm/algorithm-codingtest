SELECT F.FLAVOR
FROM FIRST_HALF F JOIN (SELECT FLAVOR, SUM(TOTAL_ORDER) as "TOTAL_ORDER" from JULY
                       GROUP BY FLAVOR) J
                       ON F.FLAVOR = J.FLAVOR
GROUP BY F.FLAVOR
ORDER BY (F.TOTAL_ORDER + J.TOTAL_ORDER) DESC
limit 3

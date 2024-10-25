select
info.REST_ID, 
info.REST_NAME,
info.FOOD_TYPE,
info.FAVORITES,
info.ADDRESS,
round(avg(review.REVIEW_SCORE), 2) as SCORE
from REST_INFO info join REST_REVIEW review on info.REST_ID = review.REST_ID
where ADDRESS LIKE '서울%'
group by REST_NAME
order by SCORE DESC, info.FAVORITES DESC
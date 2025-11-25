select EXTRACT(HOUR FROM CAST(datetime AS TIMESTAMP)) as hour, count(*) as count
from animal_outs
where EXTRACT(HOUR FROM CAST(datetime AS TIMESTAMP)) between '9' and '19'
group by EXTRACT(HOUR FROM CAST(datetime AS TIMESTAMP))
order by hour;

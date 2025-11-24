select animal_id, name, TO_CHAR(datetime, 'YYYY-MM-DD') as 날짜
from animal_ins
order by animal_id;
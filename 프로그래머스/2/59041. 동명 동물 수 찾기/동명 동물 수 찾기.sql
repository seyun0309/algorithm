select name, count(name) as count
from animal_ins
group by name
HAVING count(name) > 1
order by name
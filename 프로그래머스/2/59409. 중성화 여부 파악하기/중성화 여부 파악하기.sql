select animal_id, 
       name,
       CASE
            WHEN sex_upon_intake like '%Neutered%' or sex_upon_intake like '%Spayed%' THEN 'O'
            ELSE 'X'
       END AS 중성화
from animal_ins
order by animal_id;
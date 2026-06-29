# Write your MySQL query satement below
select teacher_id, count(distinct subject_id) as cnt
from Teacher 
group by teacher_id;
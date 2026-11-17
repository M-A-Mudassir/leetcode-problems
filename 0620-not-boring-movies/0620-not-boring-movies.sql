# Write your MySQL query statement below
select * from Cinema where id mod 2 <> 0 and description <> "boring"
group by id order by rating desc;
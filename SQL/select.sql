-- 1757. Recyclable and Low Fat Products
-- # Write your postgreSQL query statement below

select product_id from Products
where low_fats like 'Y'and recyclable like 'Y'
order by product_id asc;

-- 584. Find Customer Referee
-- # Write your MySQL query statement below

SELECT name
FROM Customer
WHERE referee_id != 2 OR referee_id IS NULL;

-- 595. Big Countries
-- # Write your MySQL query statement below

select name, population, area from World
where (area >= 3000000) or (population >= 25000000);

-- 1148. Article Views I
-- # Write your MySQL query statement below

select author_id as id from Views where author_id = viewer_id 
union
select author_id as id from Views where author_id = viewer_id
order by id asc;

-- 1683. Invalid Tweets
-- Write your PostgreSQL query statement below

Select tweet_id from Tweets where length(content) > 15; 
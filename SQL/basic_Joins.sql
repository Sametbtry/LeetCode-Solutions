-- 1378. Replace Employee ID With The Unique Identifier
-- Write your PostgreSQL query statement below
select e_uni.unique_id, e.name from Employees e
left join EmployeeUNI e_uni on e.id = e_uni.id;

-- 1068. Product Sales Analysis I
-- Write your PostgreSQL query statement below
select p.product_name, s.year, s.price  from Sales s
left join Product p USING (product_id);  
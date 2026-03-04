-- 1378. Replace Employee ID With The Unique Identifier
-- Write your PostgreSQL query statement below
select e_uni.unique_id, e.name from Employees e
left join EmployeeUNI e_uni on e.id = e_uni.id;

-- 1068. Product Sales Analysis I
-- Write your PostgreSQL query statement below
select p.product_name, s.year, s.price  from Sales s
left join Product p USING (product_id);  

'''
1581. Customer Who Visited but Did Not Make Any Transactions
LEFT JOIN + IS NULL:
NOT EXISTS:
NOT IN:
https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/solutions/6699097/what-to-choose-explanation-for-not-in-no-c4tc
The best option is usually the NOT EXISTS approach.
A close second (slightly worse) is LEFT JOIN + IS NULL.
The worst option is NOT IN.
 '''
-- Write your PostgreSQL query statement below
select v.customer_id , count(customer_id) as count_no_trans  from Visits v
left join Transactions t on v.visit_id = t.visit_id
where transaction_id is null  
group by v.customer_id;

-- Write your PostgreSQL query statement below
 SELECT v.customer_id
     , count(v.customer_id) count_no_trans
  FROM visits v
 WHERE NOT EXISTS (SELECT 1 FROM transactions t WHERE v.visit_id = t.visit_id)
 GROUP BY v.customer_id;
 
-- Write your PostgreSQL query statement below
 SELECT v.customer_id
     , count(v.customer_id) count_no_trans
  FROM visits v
 WHERE v.visit_id NOT IN (SELECT visit_id FROM transactions)
 GROUP BY v.customer_id;
 
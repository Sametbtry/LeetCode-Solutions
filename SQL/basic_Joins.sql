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


-- 197. Rising Temperature
-- Write your PostgreSQL query statement below
SELECT today.id FROM Weather AS today
WHERE EXISTS (
    SELECT 1 FROM Weather AS yesterday
    WHERE  today.temperature > yesterday.temperature 
    AND today.recordDate  = yesterday.recordDate + 1
);
 
-- 570. Managers with at Least 5 Direct Reports
-- Write your PostgreSQL query statement below
SELECT e.name 
FROM Employee e
JOIN (
    SELECT managerId 
    FROM Employee 
    GROUP BY managerId 
    HAVING COUNT(managerId) >= 5
) m ON e.id = m.managerId;
/* Low performance
SELECT name FROM Employee
    WHERE id IN (
        SELECT managerId FROM Employee
        GROUP BY managerId 
        HAVING COUNT(managerId) >= 5
    )

    Şu basit senaryoyu düşün: Tabloda 100.000 çalışan var. Sadece `id=1` olan yöneticinin 5 çalışanı var.

**IN Yöntemi Adım Adım:**
1. **Alt sorgu çalışır:** 5'ten fazla çalışanı olanları bulur ve bellekte bir liste oluşturur: `[1]`.
2. **Tarama başlar:** Veritabanı ana tablodaki 100.000 satırı en baştan tek tek okumaya başlar.
3. **Sorgulama:** Okuduğu her satır için şu soruyu sorar: "Senin id değerin `[1]` listesinin içinde geçiyor mu?". 
**Neden verimsiz?** Veritabanı hedefi bulsa bile diğer satırları da kontrol etmek için bu soruyu tam 100.000 kere sorar. Liste kalabalıksa sistem felç olur.

**JOIN Yöntemi Adım Adım:**
1. **Alt sorgu çalışır:** 5'ten fazla çalışanı olanları bulur ve bunu geçici bir tablo yapar: `[1]`.
2. **Eşleştirme (Hash/Index Match):** Veritabanı 100.000 satırı tek tek taramaz. Bunun yerine elindeki `1` değerini alır, ana tablonun **indeksine** (kitabın arkasındaki fihrist gibi düşün) bakar.
3. **Nokta atışı:** İndeks sayesinde ana tablodaki `id=1` olan kaydın tam olarak nerede olduğunu anında bulur ve gidip o veriyi çeker.  (NOT : Primary key oldugu icin otomatik olarak index var.)
**Neden verimli?** Geriye kalan 99.999 satırın hiçbirine bakmaz, onlarla vakit kaybetmez. Doğrudan adrese teslim işlem yapar.
*/



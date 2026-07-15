/* Write your PL/SQL query statement below */
select p.product_id, 
CASE 
    WHEN COUNT(u.product_id) = 0 THEN 0
    ELSE ROUND(SUM(u.units * p.price) / SUM(u.units), 2)
END average_price
FROM Prices p LEFT JOIN UnitsSold u
ON (p.start_date <= u.purchase_date AND u.purchase_date <= p.end_date AND p.product_id = u.product_id)
GROUP BY p.product_id
SELECT 
    p.product_code,
    SUM(p.price * s.sales_amount) AS sales
FROM product p
JOIN offline_sale s 
      ON p.product_id = s.product_id
GROUP BY p.product_code, p.price
ORDER BY sales DESC, p.product_code ASC;
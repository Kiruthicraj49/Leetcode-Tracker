-- Last updated: 09/07/2026, 15:07:58
select c.name as Customers from Customers c left join Orders o on c.id = o.customerId
where o.id is null;
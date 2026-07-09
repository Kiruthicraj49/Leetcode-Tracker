-- Last updated: 09/07/2026, 15:08:00
select email as Email from Person group by email having count(email)>1;
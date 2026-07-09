-- Last updated: 09/07/2026, 15:08:09

select p.firstName,p.lastName,a.city,a.state from Person p left join 
Address a on p.personId = a.personID;
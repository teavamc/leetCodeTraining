select
  a.Name as Customers
from
  Customers as a
    left join
  Orders as b
  on
      a.Id = b.CustomerId
group by
  a.Id
having
    count(b.Id) = 0


select
  e.Name as Employee
from
  Employee as e
where
    e.Salary > (
    select b.Salary
    from Employee as b
    where e.ManagerId = b.Id

  )
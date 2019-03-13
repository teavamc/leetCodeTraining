delete
  a.*
from
  Person as a,
  Person as b
where
    a.Email = b.Email
  AND
    a.Id > b.Id
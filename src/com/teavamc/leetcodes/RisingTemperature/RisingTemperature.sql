
# 使用 where
select
  a.Id
from
  Weather as a
where
    a.Temperature > (
    select b.Temperature
    from Weather as b
    where
        DATEDIFF (a.RecordDate,b.RecordDate) = 1
  )

# 使用Join

select
  a.Id
from
  Weather as a
    join
  Weather as b
  on
        a.Temperature > b.Temperature
      and
        datediff(a.RecordDate,b.RecordDate) = 1
--Übungsblatt 4

-- Anzahl Projekte je Niederlassung und Sitz. Es sollen Niederlassungen ausgegeben werden, die mehr als 2 Projekte haben
Select prj.nlnr, sitz, count(prjnr)
From prj
Inner Join nl on prj.nlnr = nl.nlnr
Group by prj.nlnr, sitz
HAVING count(prjnr) > 2;

-- Aufgabe 1
Select avg(dauer)
from Task
Where task.manr = 8956;

--Aufgabe2
Select count(distinct vorgNr)
from ma;

-- Aufgabe 3
Select prjnr, count(prjnr), round(avg(dauer),2)
from task
group by prjnr;

-- Aufgabe 4
Select task.manr, nl.sitz, count(task.prjnr), avg(task.dauer)
from task
Inner join ma on task.manr = ma.manr
Inner Join nl on nl.nlnr = ma.nlnr
group by task.manr, nl.sitz;

--Aufgabe 5
Select prjnr, count(*)
From task
Group by prjnr
Having count(*) <= 6;

-- Aufgabe 6
Select prj.prjnr, prj.titel, avg(task.dauer)
from task
Inner Join prj on task.prjnr = prj.prjnr
Group by prj.prjnr, prj.titel
Having avg(task.dauer) > 300;

-- Aufgabe 7
Select x.vorgnr, y.name, count(x.manr) "Anz_Unterg"
from ma x
inner join ma y On x.vorgnr = y.manr
group by x.vorgnr, y.name
having count(x.manr) > 2;

--Aufgabe 8
Select to_char(task.am, 'MM-YY'), avg(task.dauer), count(prjnr), sum(dauer)
from task
group by to_char(task.am, 'MM-YY');

--Aufgabe 9
-- Antw: prov ist null --> zweite Fall wird ausgegeben, also 0

-- Aufgabe 10
Select name, job, nvl(length(name) / 10 * prov, 50 * length(name)) "S_Prämie"
From ma
where ma.nlnr = 10;

-- Aufgabe 11
Select nl.nlnr, sum(nvl(prov,0) + ma.gehalt) "Gesamtgehalt"
From ma
Inner join nl on nl.nlnr = ma.nlnr
Group by nl.nlnr

-- Äußere Verbundoperatoren

-- Aufgabe 2
Select distinct p.prjnr, task.manr
from prj p
Left Outer Join task on p.prjnr = task.prjnr
order by p.prjnr asc;

--Aufgabe 3
Select p.prjnr, count(t.manr)
from prj p
Left Outer Join task t on  p.prjnr = t.prjnr
group by p.prjnr;

--Aufgabe 4
Select ma.manr, count(task.prjnr), nvl(avg(dauer),0)
From ma
Left Outer Join task on ma.manr = task.manr
group by ma.manr;































----------------Prüfungsvorbereitung

--Aufgabe 2
Select Distinct task.prjnr, ma.manr
from ma 
Left Outer Join task on task.manr = ma.manr;

--Aufgabe 3

Select prj.prjnr, count(task.manr)
from prj
Left Outer Join task on prj.prjnr = task.prjnr
Group by prj.prjnr;

--Aufgabe 4
--Bestimmen Sie je Mitarbeiter, die Anzahl Tasks und die durchschnittliche Dauer der von dem Mitarbeiter ausgeübten Tasks. 
--Es sollen alle Mitarbeiter ausgegeben werden. Für einen Mitarbeiter ohne Tasks sollen für Anzahl und Durchschnitt der Wert 0 erschei-

Select ma.manr, nvl(count(prjnr),0), nvl(avg(dauer),0)
from ma
Left Outer Join task on task.manr = ma.manr
Group by ma.manr;







































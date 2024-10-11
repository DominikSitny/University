-- Übungsblatt 3

-- Aufgabe 6
Select distinct m.manr, m.name, m.job, t.prjnr
From ma m
inner join task t on t.manr = m.manr
where m.job = 'Manager';

--Aufgabe 7
Select Distinct m.nlnr, m.manr, m.name, t.prjnr
From ma m
Inner Join NL n On n.nlnr = m.nlnr
Inner Join Task t on t.manr = m.manr
Where n.sitz in ('Berlin', 'Bielefeld', 'Dortmund')
Order By m.nlnr DESC, t.prjnr ASC
;

-- Aufgabe 8
Select Distinct m.nlnr, m.manr, m.name, t.prjnr
From ma m
Inner join task t on t.manr = m.manr 
Inner join prj p on p.prjnr = t.prjnr
Where p.kdnr = 'M341';

-- Aufgabe 9 (Geht auch mit einem Inner Join)
Select name, job, gehalt, nlnr
from ma
where nlnr = 20 and gehalt > (Select gehalt from ma where manr = 7767);

--Aufgabe 10
Select x.name, x.job, x.gehalt, (y.gehalt - x.gehalt) As Delta
from ma x
Inner Join ma y On x.vorgnr = y.manr
Where y.name = 'Kron';







-- ------------------------------ Prüfungsvorbereitung ---------------------------

-- Aufgabe 8

Select Distinct ma.nlnr, ma.manr, ma.name, prj.prjnr
from ma
Inner Join prj on prj.nlnr = ma.nlnr
Where prj.kdnr = 'M341';

--Aufgabe 9
Select *
From ma 
where nlnr = 20 And gehalt > (Select gehalt from ma where manr = '7767');


--Aufgabe 10
Select u.name, (v.gehalt - u.gehalt) As Differenz
from ma u
Inner Join ma v on u.vorgnr = v.manr
Where v.name = 'Kron';







































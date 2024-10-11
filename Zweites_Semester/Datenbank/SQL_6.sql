-- Inner Select-Abfrage Übungsblatt 6

-- Wer verdient mehr als Mitarbeiter 7900
Select *
from ma 
where gehalt > (select gehalt from ma where manr = 7900);

-- Wer verdient mehr als das Durchschnittsgehalt der Niederlassung 20 
Select *
from ma
where gehalt > (Select avg(gehalt) from ma where nlnr = 20);

-- Welche Mitarbeiter haben noch keinen Task ausgeführt?
Select *
from ma
where manr not in (select distinct manr from task);

-- Aufgabe 1
Select Distinct ma.*
from ma 
inner join task on ma.manr = task.manr  
inner join prj on prj.prjnr = task.prjnr
where prj.nlnr = 10;

-- Aufgabe 2
Select ma.*
from ma 
where gehalt> (select max(gehalt) from ma where nlnr = 30) and 
      nlnr in (select nlnr from nl where nl.sitz = 'Hamburg');

-- Aufgabe 4
Select nl.nlnr, nl.bezeichnung, nl.sitz, sum(ma.gehalt)
From nl
Inner join ma on nl.nlnr = ma.nlnr
Group by nl.nlnr, nl.bezeichnung, nl.sitz
Having sum(ma.gehalt) = (Select max(sum(gehalt)) from ma group by nlnr);

--Aufgabe 5 (schon öfter gemacht eig)

--Aufgabe 6
Select Distinct ma.*
From ma 
Where ma.nlnr in ('10', '20') And manr Not IN (Select Distinct manr from task);

--Aufgabe 7 (kb)

-- Aufgabe 8
Select prjnr, count(*)
from task
group by prjnr
having count(*) > (Select count(prjnr) from task where prjnr = 244);

-- Aufgabe 9
Select task.prjnr, sum(task.dauer)
from task
group by task.prjnr
having sum(task.dauer) =    (
                                Select max(sum(dauer))
                                from task
                                group by prjnr
                            );






------------------------- Prüfungsvorbereitung

-- Aufgabe 6

Select ma.*
from ma
where nlnr in (10,20) and manr not in (select distinct manr from task);

--Aufgabe 8

Select prjnr, count(prjnr)
from task
group by prjnr
having count(prjnr) > (Select count(prjnr) from task where prjnr = 244);


--Aufgabe 9

Select prjnr, sum(dauer)
from task
group by prjnr
having sum(dauer) = (
                        select max(sum(dauer))
                        from task
                        group by prjnr
                      )  
                    
            






























































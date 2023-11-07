/*
Aufgabe 1: Distinct kann nur doppelte Datensätze entfernen, in Spalte nlnr werden verschiedene Werte angezeigt 
*/

/*
Aufgabe 2:
*/
Select name, job, gehalt, nlnr
From ma;


/*
Aufgabe 3: 
*/
Select Upper(name),Upper(job), gehalt * 1.55 as "W-Geld"
from ma;

/* Aufgabe 4 


Select ma.nlnr, ma.manr, ma.name, prj.prjnr
From ma,prj
Where ma.nlnr = prj.nlnr And prj.kdnr = 'M341';
*/


Select DISTINCT ma.name, nl.sitz, prj.titel, task.am
From ma, nl, prj, task
Where ma.nlnr = nl.nlnr AND
nl.sitz IN ('Bielefeld', 'Berlin', 'Dortmund') AND 
nl.nlnr = prj.nlnr AND 
prj.kdnr = 'M341' AND 
prj.prjnr = task.prjnr AND 
to_char(task.am,'MM') = 10 AND 
to_char(task.am,'YY') = 10;
/*
Select DISTINCT ma.manr, ma.name
From ma, nl, task
Where ma.nlnr = nl.nlnr AND 
      ma.manr = task.manr AND 
      nl.sitz = 'Berlin' AND 
      task.dauer >= 300 AND task.dauer <= 400; 

*/


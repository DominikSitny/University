/*Drop Table Kunde;

Create Table Kunde (kdnr number(6) not null, 
name varchar2(30)not null, ort varchar2(30), 
Constraint pk_1 PRIMARY KEY (kdnr));


Create Table APA(apaNr number(2) not null, 
kdNr number(6) not null, 
name varchar2(20) not null,
CONSTRAINT Fk_1 FOREIGN KEY (kdNr) REFERENCES Kunde(kdnr),
Constraint pk_2 PRIMARY KEY (apaNr));

/*Fallstudie*/

DROP TABLE BG ;
DROP TABLE KFZ ;
DROP TABLE KATEG ;
DROP TABLE FL ;
DROP TABLE KU ;

Create Table Kateg(ktg varchar2(1) not null, preis number(3),
Constraint pk_Kateg PRIMARY KEY (ktg));

Create Table FL(flnr number(2) not null, flughafen varchar2(11) not null, plz varchar2(7) not null, telnr varchar2(11) not null,
Constraint pk_FL PRIMARY KEY (flNr), 
CONSTRAINT u_flTel Unique (telnr));

Create Table KU(KUNr number(3) not null, name varchar2(10) not null, ort varchar2(14) not null, 
Constraint pk_KU PRIMARY KEY (kunr));


Create Table KFZ(knz number(2) not null, marke varchar2(9) not null, typ varchar2(9) not null, ps number(3) not null, stand number(6) not null, extras varchar2(20) not null, ktg varchar(1) not null, flnr number(2) not null,
Constraint pk_kfz PRIMARY KEY (knz),
CONSTRAINT fk_kfzKtg FOREIGN KEY (ktg) REFERENCES KATEG(ktg),
CONSTRAINT fk_kfzflNr FOREIGN KEY (flNr) REFERENCES FL(flNr));


Create Table BG(KNZ number(2) not null, KUNr number(3) not null, am DATE not null, dauer number(2) not null,
Constraint pk_bg PRIMARY KEY (knz),
CONSTRAINT fk_BGknz FOREIGN KEY (knz) REFERENCES kfz(knz),
CONSTRAINT fk_BGkunr FOREIGN KEY (kunr) REFERENCES ku(kunr));
alter table table_fstats rename column Fid TO FID;

drop table stats;
insert into fstats values(7, 7, '51%', '47%', 22, 1, 0);


select * from fstats;
create table fstats(SID int(2), Fid int(2) references fighters, Striking_Accuracy char(3), Grappling_Accuracy char(3),  Wins int(2), 
Losses int(2), Draws int(2));


insert into fighters values(7, 'Daniel Costatsrmier');
select * from fighters;
create table fighters(fid int(2) primary key, name char(20));




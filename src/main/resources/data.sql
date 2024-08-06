drop table if exists tbl_employee;

create table tbl_employee(id int,name varchar(255),salary varchar(255),primary key (id));

insert into tbl_employee(id, name, salary) values ( 1,'Pati','50000' );
insert into tbl_employee(id, name, salary) values ( 2,'Pavithra','60000' );
insert into tbl_employee(id, name, salary) values ( 3,'Sathvika','70000' );
insert into tbl_employee(id, name, salary) values ( 4,'Pati Pavithra Sathvika','80000' );
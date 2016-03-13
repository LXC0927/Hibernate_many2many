create table project
(
	pid int primary key,
	pname varchar(10) not null
);

create table employee
(
	eid int primary key,
	ename varchar(10) not null
);

create table pe
(
	rpid int,
	reid int
);

alter table pe add constraint fk_pid foreign key (rpid) references project(pid);
alter table pe add constraint fk_eid foreign key (reid) references employee(eid);
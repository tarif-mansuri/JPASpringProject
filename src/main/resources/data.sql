insert into course(id, name)
values(10001,'JPA in 50 steps');
insert into course(id, name)
values(10002,'Spring in 50 steps');
insert into course(id, name)
values(10003,'Sprint Boot in 1000 steps');

insert into passport(id, number)
values(40001,'EP3423');
insert into passport(id, number)
values(40002,'PQ6745');
insert into passport(id, number)
values(40003,'KS8953');

insert into student(id, name, passport_id)
values(20001,'Ranga',40001);
insert into student(id, name, passport_id)
values(20002,'Adam',40002);
insert into student(id, name, passport_id)
values(20003,'Jane',40003);

insert into review(id, rating,description,course_id)
values(50001,'5','Great Course',10001);
insert into review(id, rating,description,course_id)
values(50002,'4','Wonderful Course',10001);
insert into review(id, rating,description,course_id)
values(50003,'5','Awesome Course',10003);
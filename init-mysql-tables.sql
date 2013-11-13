create table blogs (
id int primary key AUTO_INCREMENT,
author_id int,
title varchar(200),
txt text,
create_date datetime,
published int
) engine=innodb;

create table authors (
id int primary key auto_increment,
first_name varchar(50),
last_name varchar(50)
) engine=innodb;

create table keywords (
id int primary key auto_increment,
keyword varchar(50) unique
) engine=innodb;

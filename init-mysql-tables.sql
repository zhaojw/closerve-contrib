create table blogs (
id int primary key AUTO_INCREMENT,
users_id int,
title varchar(200),
txt text,
createDate datetime,
published int
) engine=innodb;

create table users (
id int primary key auto_increment,
hashpass varchar(100),
email varchar(100),
firstName varchar(50),
lastName varchar(50),
isAdmin tinyint,
canBlog tinyint
) engine=innodb;

create table keywords (
id int primary key auto_increment,
keyword varchar(50) unique
) engine=innodb;

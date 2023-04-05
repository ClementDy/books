--liquibase formatted sql
--changeset author:cdilly:1
CREATE TABLE book (id int, title varchar(50), numberOfPage int, language varchar(20));
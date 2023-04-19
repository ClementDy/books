--liquibase formatted sql
--changeset cdilly:create-tables
CREATE TABLE IF NOT EXISTS book(id int, title varchar(50), authorId int, numberOfPage int, language varchar(30));
CREATE TABLE IF NOT EXISTS author(id int, firstName varchar(50), lastName varchar(50));
CREATE TABLE IF NOT EXISTS reading(id int, bookId int, startDate date, endDate date);
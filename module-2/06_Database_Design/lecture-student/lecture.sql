BEGIN TRANSACTION;

--CREATE DATABASE database_name

CREATE database artgallery;

--Create tables 
/*
CREATE TABLE table_name
(
  column_name1 data_type(size), 
  column_name2 data_type(size) NOT NULL,
  CONSTRAINT pk_column_name1 PRIMARY KEY (column_name1),
  CONSTRAINT fk_column_name2 FOREIGN KEY (column_name2) REFERENCES table_name_2(columnD) 
);
*/
--customers table that has a customer id, name, address, and phone. customer_id is the primary key (pk)
CREATE TABLE customers 
(
  customer_id SERIAL,
  name varchar(64) NOT NULL,
  address varchar(100) NOT NULL,
  phone varchar(11) NULL,
  
  CONSTRAINT pk_customers_customer_id PRIMARY KEY(customer_id) 


);



--TO DROP A TABLE
--DROP TABLE table_name

--safer option
--DROP TABLE IF EXISTS table_name

--create a table to hold the artists - this has artistID, first name, last name and id is the pk;
CREATE TABLE artists
(
  artist_id SERIAL,
  artist_first_name varchar(64) NOT NULL,
  artist_last_name varchar(64) NULL,
  
  CONSTRAINT pk_artists_id PRIMARY KEY(artist_id)

);

--create a table for the art that has the artcodeid, a title, and the artist
CREATE TABLE art 
(
  art_code_id SERIAL,
  title varchar(64) NOT NULL,
  who_did_it int NOT NULL, --if the artist_id is serial, my foreign key needs to be an int. If the artist_id was a varchar, then fk should be a varchar as well.
  
  CONSTRAINT pk_art PRIMARY KEY (art_code_id),
  CONSTRAINT fk_art_who_did_it_refs_artists_artist_id FOREIGN KEY (who_did_it) REFERENCES artists(artist_id)


);


BEGIN TRANSACTION;

DROP DATABASE IF EXISTS projectorganizer;
CREATE DATABASE projectorganizer;

CREATE TABLE department
(
  department_number SERIAL,
  name varchar(64) NOT NULL,

  CONSTRAINT pk_department PRIMARY KEY(department_number)
);

CREATE TABLE employee
(
  employee_number SERIAL,
  job_title varchar(64) NOT NULL,
  first_name varchar(64) NOT NULL,
  last_name varchar(64) NOT NULL,
  gender varchar(32) NOT NULL,
  date_of_birth date NOT NULL,
  date_of_hire date NOT NULL,
  department_number int NOT NULL,

  CONSTRAINT pk_employee PRIMARY KEY(employee_number),
  CONSTRAINT fk_employee_references_department FOREIGN KEY(department_number) REFERENCES department(department_number)
);

CREATE TABLE project
(
  project_number SERIAL,
  name varchar(64) NOT NULL,
  start_date date NOT NULL,

  CONSTRAINT pk_project PRIMARY KEY(project_number)
);

CREATE TABLE employee_projects
(
  employee_number int NOT NULL,
  project_number int NOT NULL,
 
  CONSTRAINT pk_employee_projects PRIMARY KEY(employee_number, project_number),
  CONSTRAINT fk_employee_projects_references_employee FOREIGN KEY(employee_number) REFERENCES employee(employee_number),
  CONSTRAINT fk_employee_projects_references_project FOREIGN KEY(project_number) REFERENCES project(project_number)
);

INSERT INTO department (name)
VALUES ('Marketing'), ('Defense Against the Dark Arts'), ('Accounting'), ('Geology');

INSERT INTO employee (job_title, first_name, last_name, gender, date_of_birth, date_of_hire, department_number)
VALUES ('Chief Executive', 'Jeff', 'Bozos', 'Male', '02-21-1965', '11-18-1995', 1),
       ('Janitor', 'Charlie', 'Kelly', 'Male', '01-08-1970', '03-28-1998', 2),
       ('Staff Accountant', 'Pat', 'Damon', 'Female', '10-31-1982', '12-22-2004', 3),
       ('Rock Collector', 'Aloysius', 'Gonzaga', 'Male', '05-19-1992', '05-02-2014', 4),
       ('TCB - Taking Care of Business', 'Cosmo', 'Kramer', 'Male', '01-18-1971', '12-24-2016', 2),
       ('Chief Marketer', 'Donna', 'Draper', 'Female', '08-17-1985', '10-13-2017', 1),
       ('Cooker of the Books', 'Guy', 'Fieri', 'Male', '04-22-1980', '09-11-2000', 3),
       ('Subject Matter Expert', 'Dwayne', 'Johnson', 'Male', '06-22-1987', '05-09-2018', 4);

INSERT INTO project (name, start_date)
VALUES ('Damage Control', '02-16-2021'),
       ('Obtain all 7 Horcruxes', '11-17-2009'),
       ('Iron Out Our Finances', '05-22-2017'),
       ('Rock and Roll Event', '12-29-2020');

INSERT INTO employee_projects (employee_number, project_number)
VALUES (1, 1),
       (2, 2),
       (3, 3),
       (4, 4),
       (5, 1),
       (6, 2),
       (7, 3), 
       (8, 4);

COMMIT;
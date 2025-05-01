CREATE TABLE teachers(
	id BIGINT,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	hire_date DATE,
    email VARCHAR(100)
);

SELECT * FROM teachers;

INSERT INTO teachers VALUES
	(1, 'Temuri', 'Tabatadze', '2006-03-09', 'TemurTabatadze@gmail.com'),
    (2, 'Lana', 'Arabuli', '2016-05-05', 'Lana@gmail.com'),
	(3, 'Tamuna', 'Tabatadze', '2017-09-09', 'Tamuna23@gmail.com'),
	(4, 'Tamari', 'Maisuradze', '2008-08-06', 'TamarMaisuradze@gmail.com'),
	(5, 'Gela', 'Meleqsishvili', '2020-02-01', 'Gela25@gmail.com');
	
SELECT * FROM teachers
WHERE hire_date > '2009-01-01';

ALTER TABLE teachers ADD COLUMN department VARCHAR(50);

UPDATE teachers
SET department = 'Physics'
WHERE id = 1;

UPDATE teachers
SET department = 'Chemistry' 
WHERE id = 2;

UPDATE teachers
SET department = 'Art' 
WHERE id = 3;

UPDATE teachers
SET department = 'English Language'
WHERE id = 4;

UPDATE teachers
SET department = 'Religion'
WHERE id = 5;

ALTER TABLE teachers
RENAME email TO contact_email;

SELECT *
FROM teachers
WHERE 
hire_date < '2015-01-01' or hire_date > '2018-12-31';
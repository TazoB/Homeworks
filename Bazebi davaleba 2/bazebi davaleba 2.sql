CREATE TABLE students (
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	dob DATE,
	enroll_date TIMESTAMP 
	DEFAULT CURRENT_TIMESTAMP,
	grade INTEGER,
	CONSTRAINT chkGrade CHECK (grade >= 1 and grade <=12),
	email TEXT UNIQUE
);

SELECT * FROM students;

INSERT INTO students 
(first_name, last_name, dob, enroll_date, grade, email) VALUES 
('Tazo', 'Bendianishvili', '2009-03-26', '2015-09-15 19:10:25', 10, 'Tazo.Bendianishvili@gmail.com'),
('Tekla', 'Bendianishvili', '2008-02-14', '2014-09-15 19:10:25', 11, 'Tekla.Bendianishvili@gmail.com'),
('Lasha', 'Tskhelishvili', '2009-04-04', '2015-09-15 19:10:25', 10, 'Lasha.Tskhelishvili@gmail.com'),
('Data', 'Marjanidze', '2009-08-05', '2015-09-15 19:10:25', 10, 'Data.Marjanidze@gmail.com'),
('Irakli', 'Kemularia', '2009-06-19', '2015-09-15 19:10:25', 10, 'Irakli.Kemularia@gmail.com');



INSERT INTO students
(first_name, last_name, dob, grade, email) VALUES
('Giorgi', 'Antadze', '2009-02-15', 13, 'Anta21@gmail.com')






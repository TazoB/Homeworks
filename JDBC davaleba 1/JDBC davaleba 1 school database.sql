/* 1 */
CREATE DATABASE School;

/* 2 */
CREATE TABLE students(
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	grade INTEGER
)

/* 3 */
CREATE TABLE teachers(
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	subject INTEGER,
	CONSTRAINT sub_fk FOREIGN KEY (subject)
	REFERENCES subjects(id),
	salary BIGINT
)

/* 4 */
CREATE TABLE subjects(
	id SERIAL PRIMARY KEY,
	subject_name TEXT
)
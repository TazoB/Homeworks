/* 1 */
CREATE TABLE authors (
	id SERIAL PRIMARY KEY,
	first_name TEXT,
	last_name TEXT
)

/* 2 */
CREATE TABLE books (
	id SERIAL PRIMARY KEY,
	title TEXT NOT NULL,
	author_id INTEGER,
	CONSTRAINT aut_fk FOREIGN KEY (author_id)
	REFERENCES authors(id),
	price DECIMAL(6, 2) NOT NULL
);

/* 3 */
CREATE TABLE sales (
	id SERIAL PRIMARY KEY,
	book_id INTEGER,
	CONSTRAINT book_fk FOREIGN KEY (book_id)
	REFERENCES books(id),
	quantity INTEGER,
	sale_date DATE
);

/* 4 */
INSERT INTO authors (first_name, last_name) VALUES
('Jane', 'Austen'),
('Charles', 'Dickens'),
('Mark', 'Twain'),
('Alexandre', 'Dumas'),
('William', 'Shakespeare'),
('Joanne', 'Rowling');

INSERT INTO books (title, author_id, price) VALUES
('Pride and Prejudice', 1, 19.99),
('David Copperfield', 2, 15.50),
('Adventures of Huckleberry Finn', 3, 8.99),
('Emma', 1, 12.50),
('Great Expectations', 2, 10.00),
('The Count of Monte Cristo', 4, 21.99),
('Hamlet', 5, 17.99),
('The Three Musketeers', 4, 18.99),
('Romeo and Juliet', 5, 17.99),
('The Prince and the Pauper', 3, 15.99),
('Christmas Carol', 2, 14.99),
('Oliver Twist', 2, 12.99),
('Harry Potter', 6, 22.99);

INSERT INTO sales (book_id, quantity, sale_date) VALUES
(1, 2, '2024-01-10'),
(2, 1, '2024-01-11'),
(5, 3, '2024-01-12'),
(3, 2, '2023-03-28'),
(6, 1, '2024-09-07'),
(4, 4, '2024-01-12'),
(13, 7, '2025-01-02'),
(11, 3, '2025-03-26'),
(9, 2, '2024-01-12'),
(10, 1, '2023-10-20'),
(7, 4, '2025-02-14'),
(8, 5, '2023-10-29'),
(12, 1, '2025-03-19'),
(7, 2, '2025-09-02'),
(13, 7, '2022-12-05');

/* 5 */
SELECT *
FROM authors a
INNER JOIN books b
ON a.id = b.author_id;

/* 6 */
SELECT SUM(quantity) AS sum_of_sales
FROM sales;

/* 7 */
SELECT b.title, a.first_name, a.last_name
FROM sales s
JOIN books b
ON s.book_id = b.id
JOIN authors a
ON b.author_id = a.id
WHERE s.sale_date = '2024-01-12';
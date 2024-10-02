DROP TABLE IF EXISTS bookPdf;
CREATE TABLE bookPdf (
	id SERIAL,
	book_id  VARCHAR (30),	
	book_name VARCHAR(255),
	file_path VARCHAR(255),
	PRIMARY KEY (id)
);
INSERT INTO bookPdf (book_name, file_path)
VALUES
(
	'サンプル1',
	'./pdf/sample_1.pdf'
);
INSERT INTO bookPdf (book_name, file_path)
VALUES('サンプル2', './pdf/sample_2.pdf');

SELECT * FROM bookPdf;
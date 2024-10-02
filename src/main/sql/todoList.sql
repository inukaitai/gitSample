DROP TABLE IF EXISTS todoList;
CREATE TABLE todoList (
	id SERIAL,
	list_id VARCHAR (30) NOT NULL,
	content VARCHAR(50) NOT NULL,
	createdAt DATE NOT NULL DEFAULT CURRENT_DATE,
	memo VARCHAR (255),
PRIMARY KEY (id)
);
INSERT INTO todoList
(
	list_id,
	content,
	memo
)
VALUES
(
	'list01',
	'16時半から全体会議',
	'週案の提出'
);

SELECT * FROM todoList;
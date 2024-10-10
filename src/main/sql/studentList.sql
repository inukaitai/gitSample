DROP TABLE IF EXISTS studentList;
CREATE TABLE studentList (
	id SERIAL,
	user_id VARCHAR (30) ,
	student_id VARCHAR (30) NOT NULL,
	student_name VARCHAR(30) NOT NULL,
	created_at DATE NOT NULL DEFAULT CURRENT_DATE,
	attendance VARCHAR (30) ,
	condition VARCHAR (30) ,
	memo VARCHAR (255),
	FOREIGN KEY (user_id) REFERENCES account (user_id),
PRIMARY KEY (id)
);
INSERT INTO studentList
(
	user_id,
	student_id,
	student_name,
	attendance,
	condition,
	memo	
)
VALUES
(
	'user01',
	'番号１番',
	'あああ',
	'',
	'',
	'元気いっぱい'
);
SELECT * FROM studentList;


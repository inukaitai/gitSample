DROP TABLE IF EXISTS account;
CREATE TABLE account (
	id SERIAL,
	user_id VARCHAR (30) NOT NULL,
	name VARCHAR(30) NOT NULL,
	mail VARCHAR(30) NOT NULL,
	school VARCHAR (255) NOT NULL,
	pass VARCHAR (20) NOT NULL,
	PRIMARY KEY (id)
);

INSERT INTO account
(
	user_id,
	name,
	mail,
	school,
	pass
)
VALUES
(	
	'user01',
	'Alex',
	'alex@example.com',
	'イヌ小学校',
	'11111111'
);

SELECT * FROM account;

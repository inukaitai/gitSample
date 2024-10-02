DROP TABLE IF EXISTS ann;
CREATE TABLE ann (
	id SERIAL,
	content VARCHAR(255) NOT NULL,
    open_date DATE NOT NULL DEFAULT CURRENT_DATE,
    PRIMARY KEY (id)
);
INSERT INTO ann
(
	content
)
VALUES
(
	'10/31 児童集会(halloween) ５時間目に開催'
);
SELECT * FROM ann;
CREATE TABLE regions (
region_id int NOT NULL AUTO_INCREMENT,
area varchar(255),
PRIMARY KEY (region_id)
);

INSERT INTO regions
VALUES(null, 'Boston, Massachusetts');
INSERT INTO regions
VALUES(null, 'New York City, New York');

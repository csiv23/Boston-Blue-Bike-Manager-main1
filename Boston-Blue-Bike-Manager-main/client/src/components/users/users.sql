CREATE TABLE Users (
userID int NOT NULL AUTO_INCREMENT,
firstName varchar(255),
lastName varchar(255),
username varchar(255),
password varchar(255),
email varchar(255),
dateOfBirth date,
membership ENUM('CHILD', 'STUDENT', 'SENIOR', 'ADULT'),
PRIMARY KEY (userID)
);

INSERT INTO users
VALUES(null, 'Ian', 'Kim', 'iankim', 'password0', 'ianemail@gmail.com', '2015-01-01', 'CHILD');
INSERT INTO users
VALUES(null, 'Cameron', 'Sivo', 'camsiv', 'password1', 'camemail@gmail.com', '2002-01-01', 'STUDENT');
INSERT INTO users
VALUES(null, 'Oliver', 'Buckley', 'olibuc', 'password2', 'oliemail@gmail.com', '1990-01-01', 'ADULT');
INSERT INTO users
VALUES(null, 'Old', 'Man', 'oldman', 'password3', 'oldemail@gmail.com', '1960-01-01', 'SENIOR');
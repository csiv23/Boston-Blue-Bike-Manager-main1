CREATE TABLE eightd_station_services (
service_id int AUTO_INCREMENT,
station_id int,
service varchar(255),
PRIMARY KEY(service_id),
FOREIGN KEY(station_id) REFERENCES stations(station_id)
);


INSERT INTO eightd_station_services
VALUES(null, 3, '');
INSERT INTO eightd_station_services
VALUES(null, 4, '');
INSERT INTO rental_methods
VALUES(null, 3, 'KEY');
INSERT INTO rental_methods
VALUES(null, 3, 'CREDITCARD');
INSERT INTO rental_methods
VALUES(null, 4, 'KEY');
INSERT INTO rental_methods
VALUES(null, 4, 'CREDITCARD');
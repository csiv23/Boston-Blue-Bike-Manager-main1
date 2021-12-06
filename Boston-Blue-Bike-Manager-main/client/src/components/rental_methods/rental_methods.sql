CREATE TABLE rental_methods (
method_id int AUTO_INCREMENT,
station_id int,
method varchar(255),
PRIMARY KEY(method_id),
FOREIGN KEY(station_id) REFERENCES stations(station_id)
);

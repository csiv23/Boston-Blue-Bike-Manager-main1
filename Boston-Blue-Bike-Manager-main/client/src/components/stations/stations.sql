CREATE TABLE stations (
station_id int NOT NULL,
external_id varchar(255),
name_ varchar(255),
short_name varchar(255),
capacity int,
lat double, #latitude
lon double, #longitude,
rental_url varchar(255),
station_type varchar(255),
electric_bike_surcharge_waiver boolean,
eightd_has_key_dispenser boolean,
region_id int,
has_kiosk boolean,
legacy_id int,

PRIMARY KEY (station_id),
FOREIGN KEY (region_id) REFERENCES regions(region_id)
);

INSERT INTO stations
VALUES(3, 'f83464e4-0de8-11e7-991c-3863bb43a7d0', 'Colleges of the Fenway - Fenway at Avenue Louis Pasteur', 'B32006', 15, 42.34011512249236, -71.10061883926392,
"https://www.bluebikes.com/app?station_id=3", 'classic', false, false, 1, true, 3);
INSERT INTO stations
VALUES(4, 'f834658f-0de8-11e7-991c-3863bb43a7d0', 'Northeastern University - North Parking Lot', 'C32000', 19, 42.345392, -71.069616,
"https://www.bluebikes.com/app?station_id=4", 'classic', false, false, 2, true, 4);
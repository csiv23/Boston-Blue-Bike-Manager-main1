CREATE TABLE bikes (
bikeID int NOT NULL AUTO_INCREMENT,
inUse boolean,
user int,
station_id int,
PRIMARY KEY (bikeID),
FOREIGN KEY (user) REFERENCES Users(userID),
FOREIGN KEY (station_id) REFERENCES stations(station_id)
);

INSERT INTO bikes
VALUES(null, true, 1, 3);
INSERT INTO bikes
VALUES(null, true, 3, 4);
INSERT INTO bikes
VALUES(null, true, 4, 3);
INSERT INTO bikes
VALUES(null, false, null, 3);
INSERT INTO bikes
VALUES(null, false, null, 4);


-- to look for empty bikes at x station
SELECT * From bikes where station_id = 3 and inUse = false;
## look for empty bikes at x region
SELECT *
From bikes
INNER JOIN stations on stations.station_id = bikes.station_id and stations.region_id = 1 and inUse= false;

-- look for empty bikes at x station name
SELECT *
From bikes
INNER JOIN stations on stations.station_id = bikes.station_id and stations.name_= 'Colleges of the Fenway - Fenway at Avenue Louis Pasteur' and inUse= false;

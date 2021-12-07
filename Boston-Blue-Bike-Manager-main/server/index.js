const express = require("express");

const PORT = process.env.PORT || 3001;

const app = express();

var mysql = require('mysql')
var bodyParser = require('body-parser');

var connection = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: 'P@ssword',
  database: 'database-final'
})

connection.connect()
app.use( bodyParser.json() );       // to support JSON-encoded bodies
app.use(bodyParser.urlencoded({     // to support URL-encoded bodies
	extended: true
}));
/*
connection.query('select * from users', function (err, rows, fields) {
  if (err) throw err

  console.log(rows)

  app.get("/users", (req, res) => {
    res.json({ message: rows });
  });
})

connection.query('select * from bikes', function (err, rows, fields) {
  if (err) throw err

  console.log(rows)

  app.get("/bikes", (req, res) => {
    res.json({ message: rows });
  });
})
*/

//rest api to find all results for bikes
app.get('/bikes', function (req, res) {
   console.log(req);
   connection.query('select * from bikes', function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to find all results for users
app.get('/users', function (req, res) {
   console.log(req);
   connection.query('select * from users', function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to find all results for regions
app.get('/regions', function (req, res) {
   console.log(req);
   connection.query('select * from regions', function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to find all results for eightd_station_services
app.get('/eightd_station_services', function (req, res) {
   console.log(req);
   connection.query('select * from eightd_station_services', function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to find all results for rental_methods
app.get('/rental_methods', function (req, res) {
   console.log(req);
   connection.query('select * from rental_methods', function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to find all results for stations
app.get('/stations', function (req, res) {
   console.log(req);
   connection.query('select * from stations', function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to create a new bike into mysql database
app.post('/bikes', function (req, res) {
   var postData  = req.body;
   connection.query('INSERT INTO bikes SET ?', postData, function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to create a new user into mysql database
app.post('/users', function (req, res) {
   var postData  = req.body;
   connection.query('INSERT INTO users SET ?', postData, function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to create a new region into mysql database
app.post('/regions', function (req, res) {
   var postData  = req.body;
   connection.query('INSERT INTO regions SET ?', postData, function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to create a new eightd_station_service into mysql database
app.post('/eightd_station_services', function (req, res) {
   var postData  = req.body;
   connection.query('INSERT INTO eightd_station_services SET ?', postData, function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to create a new rental_method into mysql database
app.post('/rental_methods', function (req, res) {
   var postData  = req.body;
   connection.query('INSERT INTO rental_methods SET ?', postData, function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to create a new station into mysql database
app.post('/stations', function (req, res) {
   var postData  = req.body;
   connection.query('INSERT INTO stations SET ?', postData, function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to get data from a single bike
app.get('/bikes/:bikeID', function (req, res) {
   connection.query('select * from bikes where bikeID=?', [req.params.bikeID], function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to get data from a single user
app.get('/users/:userID', function (req, res) {
   connection.query('select * from users where userID=?', [req.params.userID], function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to get data from a single region
app.get('/regions/:region_ID', function (req, res) {
   connection.query('select * from regions where region_ID=?', [req.params.region_id], function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to get data from a single eightd_station_service
app.get('/eightd_station_services/:service_id', function (req, res) {
   connection.query('select * from eightd_station_services where service_id=?', [req.params.service_id], function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to get data from a single station
app.get('/stations/:station_id', function (req, res) {
   connection.query('select * from stations where station_id=?', [req.params.station_id], function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to get data from a single rental_method
app.get('/rental_methods/:method_id', function (req, res) {
   connection.query('select * from rental_methods where method_id=?', [req.params.method_id], function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to update record into mysql database
app.put('/bikes', function (req, res) {
   connection.query('UPDATE `bikes` SET `inUse`=?,`lastRider`=?, `stationID` =?, WHERE `bikeID`=?', [req.body.inUse,req.body.lastRider, req.body.stationID, req.body.bikeID], function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

app.put('/users', function (req, res) {
   connection.query('UPDATE `users` SET `firstName`=?,`lastName`=?, `username` =?, `password` =?,`email` =?,`dateOfBirth` =?,`Membership` =? WHERE `userID`=?', [req.body.firstName, req.body.lastName, req.body.username, req.body.password, req.body.email, req.body.dateOfBirth, req.body.Membership, req.body.userID,], function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

app.put('/regions', function (req, res) {
   connection.query('UPDATE `regions` SET `area`=? WHERE `region_id`=?', [req.body.area, req.body.region_id], function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

app.put('/eightd_station_services', function (req, res) {
   connection.query('UPDATE `eightd_station_services` SET `station_id`=?,`service`=? WHERE `service_id`=?', [req.body.station_id, req.body.service, req.body.service_id], function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

app.put('/rental_methods', function (req, res) {
   connection.query('UPDATE `rental_methods` SET `station_id`=?,`method`=? WHERE `method_id`=?', [req.body.station_id, req.body.method, req.body.method_id, ], function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

app.put('/stations', function (req, res) {
   connection.query('UPDATE `stations` SET `lat`=?,`external_id`=?, `capacity` =?, `lon` =?,`eightd_station_services` =?,`station_type` =?,`rental_methods` =?, `electric_bike_surcharge_waiver` =?,`rental_url` =?,`region_id` =?,`has_kiosk` =?,`name` =?,`short_name` =?,`legacy_id` =?,`eightd_has_key_dispenser` =? WHERE `station_id`=?', [req.body.lat, req.body.external_id, req.body.capacity, req.body.lon, req.body.eightd_station_services, req.body.station_type, req.body.rental_methods, req.body.electric_bike_surcharge_waiver, req.body.rental_url, req.body.region_id, req.body.has_kiosk, req.body.name, req.body.short_name,  req.body.legacy_id, req.body.eightd_has_key_dispenser, req.body.station_id], function (error, results, fields) {
	  if (error) throw error;
	  res.end(JSON.stringify(results));
	});
});

//rest api to delete user from mysql database
app.delete('/users', function (req, res) {
   console.log(req.body);
   connection.query('DELETE FROM `users` WHERE `userID`=?', [req.body.userID], function (error, results, fields) {
	  if (error) throw error;
	  res.end('Record has been deleted!');
	});
});

//rest api to delete bike from mysql database
app.delete('/bikes', function (req, res) {
   console.log(req.body);
   connection.query('DELETE FROM `bikes` WHERE `bikeID`=?', [req.body.bikeID], function (error, results, fields) {
	  if (error) throw error;
	  res.end('Record has been deleted!');
	});
});

//rest api to delete region from mysql database
app.delete('/regions', function (req, res) {
   console.log(req.body);
   connection.query('DELETE FROM `regions` WHERE `region_id`=?', [req.body.region_ID], function (error, results, fields) {
	  if (error) throw error;
	  res.end('Record has been deleted!');
	});
});

//rest api to delete eightd_station_service from mysql database
app.delete('/eightd_station_services', function (req, res) {
   console.log(req.body);
   connection.query('DELETE FROM `eightd_station_services` WHERE `service_id`=?', [req.body.service_id], function (error, results, fields) {
	  if (error) throw error;
	  res.end('Record has been deleted!');
	});
});

//rest api to delete rental_method from mysql database
app.delete('/rental_methods', function (req, res) {
   console.log(req.body);
   connection.query('DELETE FROM `rental_methods` WHERE `method_id`=?', [req.body.method_id], function (error, results, fields) {
	  if (error) throw error;
	  res.end('Record has been deleted!');
	});
});

//rest api to delete station from mysql database
app.delete('/stations', function (req, res) {
   console.log(req.body);
   connection.query('DELETE FROM `stations` WHERE `station_id`=?', [req.body.station_id], function (error, results, fields) {
	  if (error) throw error;
	  res.end('Record has been deleted!');
	});
});

/*
connection.query('select * from stations', function (err, rows, fields) {
  if (err) throw err

  console.log(rows)

  app.get("/stations", (req, res) => {
    res.json({ message: rows });
  });
})
*/


app.listen(PORT, () => {
  console.log(`Server listening on ${PORT}`);
});
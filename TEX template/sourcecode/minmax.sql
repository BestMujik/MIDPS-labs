SELECT MIN(lastmoddt) AS MinDateTime, MAX(lastmoddt) AS MaxDateTime  
FROM transmission 
WHERE lastmoddt > ? AND lastmoddt <= ?
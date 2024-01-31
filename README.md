# Getting Started

### Run dockerfile
docker build -t usersdb .
docker run --name usersdb -p 5432:5432 -d usersdb

### To check
docker exec -it usersdb bash
psql -l
psql -d users
SELECT * FROM users;
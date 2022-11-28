## Dockerfile

1. create and run container for DB
```
    docker run -p 3309:3306 --name appdb -e MYSQL_ROOT_PASSWORD=user2003 -d mysql/mysql-server:5.7
```
2. New proccess in DB
```
    docker exec -it appdb1 bash
```
And in bash and in mysql
```
    mysql -uroot -p -A;
```
In mysql
```
    update mysql.user set host="%" where user="root";
    flush privileges;
```
3. Create network
```
    docker network create app-network
```
4. Connect DB to network
```
    docker network connect app-network appdb1
```
5. Create image
```
    docker image build -t web .
```
6. Repackage our application with command "mvn clean install"
7. Create and run container for application
```
    docker run --network=app-network --name apl -d -p 8083:8080 web
```
## Docker-compose

1. Run docker-compose
```
   docker-compose up --build
```

## Tested it in browser and in the Postman.
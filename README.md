# spring-boot-java-modules

## Run Locally

1. Run PostgreSQL:

```sh
docker run -d --name java-modules-postgres -p 5432:5432 -e POSTGRES_USER=user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=nba postgres:latest
```

2. Run the Spring Boot application:

```sh
mvn spring-boot:run
```

## Usage/Examples

Player API:

* Get player:

```
curl -X GET http://localhost:8080/api/player/{player_id}
```

where `player_id` is a UUID (e.g. `123e4567-e89b-12d3-a456-426614174001`)


* Get team:

```
curl -X GET http://localhost:8080/api/team/{team_name}

where `team_name` is an encoded string (e.g. `Awesome%20Team`)
```

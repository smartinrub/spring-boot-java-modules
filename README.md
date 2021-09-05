# spring-boot-java-modules

## Run Locally

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

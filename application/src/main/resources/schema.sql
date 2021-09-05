DROP TABLE IF EXISTS player;
DROP TABLE IF EXISTS team;

CREATE TABLE IF NOT EXISTS team (
  name varchar(256) NOT NULL,
  city varchar(256) NOT NULL,
  PRIMARY KEY (name)
);

CREATE TABLE IF NOT EXISTS player (
  id uuid NOT NULL,
  name varchar(256) NOT NULL,
  team_name varchar(256) NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (team_name) REFERENCES team(name)
);

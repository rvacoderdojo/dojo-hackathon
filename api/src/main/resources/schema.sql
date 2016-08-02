DROP TABLE challenges if EXISTS;

CREATE sequence challenges_seq;

CREATE TABLE challenges (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    code varchar(6),
    title VARCHAR(50),
    description varchar(500)
);

DROP TABLE hackers if EXISTS;

CREATE sequence hackers_seq;

CREATE TABLE hackers (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(50),
);

DROP TABLE results if EXISTS;

CREATE sequence results_seq;

CREATE TABLE results (
  id        INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  challengeid INT NOT NULL REFERENCES challenges(id),
  hackerid INT NOT NULL REFERENCES hackers (id)
);

commit;





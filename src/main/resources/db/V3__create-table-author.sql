CREATE TABLE authors(

    id VARCHAR(100) NOT NULL UNIQUE,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR NOT NULL,
    profiles VARCHAR(100) NOT NULL,

    primary key(id)

);
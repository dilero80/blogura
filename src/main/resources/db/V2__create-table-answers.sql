CREATE TABLE answers(

    id VARCHAR(100) NOT NULL UNIQUE,
    message TEXT NOT NULL,
    topic VARCHAR(100) NOT NULL,
    creationDate DATETIME NOT NULL,
    author VARCHAR(100) NOT NULL,

    primary key(id)

);

CREATE TABLE authors(

    id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE ,
    password VARCHAR(300) NOT NULL,
    profiles VARCHAR(100) NOT NULL,

    primary key(id)

);
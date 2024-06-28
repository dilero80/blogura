CREATE TABLE answers(

    id INT NOT NULL AUTO_INCREMENT,
    message TEXT NOT NULL,
    topic VARCHAR(100) NOT NULL,
    creationDate DATETIME NOT NULL,
    author VARCHAR(100) NOT NULL,

    primary key(id)

);

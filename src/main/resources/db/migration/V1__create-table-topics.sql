CREATE TABLE topics(

    id VARCHAR(100) NOT NULL UNIQUE,
    title VARCHAR(100) NOT NULL,
    message TEXT NOT NULL,
    creationDate DATETIME NOT NULL,
    status BOOLEAN,
    author VARCHAR(100) NOT NULL,
    course VARCHAR(100) NOT NULL,
    answers VARCHAR(100) ,

    primary key(id)

);



CREATE TABLE topics(

    id BIGINT NOT NULL AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    message TEXT NOT NULL,
    creation_date DATETIME NOT NULL,
    status BOOLEAN,
    author VARCHAR(100) NOT NULL,
    course VARCHAR(100) NOT NULL,
    answers VARCHAR(100) ,

    primary key(id)

);



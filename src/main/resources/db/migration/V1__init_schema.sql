CREATE TABLE event (
    id SERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    description VARCHAR(255) NOT NULL,
    img_url VARCHAR(100) NOT NULL,
    event_url VARCHAR(100) NOT NULL,
    is_remote BOOLEAN NOT NULL,
    date TIMESTAMP NOT NULL
);

CREATE TABLE coupon (
    id SERIAL PRIMARY KEY,
    discount INTEGER,
    valid DATE,
    event_id BIGINT,
    FOREIGN KEY (event_id) REFERENCES event(id) ON DELETE CASCADE
);

CREATE TABLE address (
    id SERIAL PRIMARY KEY,
    city VARCHAR(100) NOT NULL,
    uf VARCHAR(2) NOT NULL,
    event_id BIGINT,
    FOREIGN KEY (event_id) REFERENCES event(id) ON DELETE CASCADE
);

CREATE SEQUENCE IF NOT EXISTS flowers_seq;
CREATE TABLE IF NOT EXISTS flowers (
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(20),
    price       INTEGER,
    quantity    INTEGER
);

--------------------------------------------------------
--  Insert data
--------------------------------------------------------
INSERT INTO flowers (name, price, quantity)
       VALUES   ('rose', 100, 300),
                ('lavender', 75, 250),
                ('chamomile', 30, 400),
                ('lily', 80, 200),
                ('tulip', 60, 100),
                ('narcissus', 65, 350);
COMMIT;
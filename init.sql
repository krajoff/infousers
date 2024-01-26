USE users;

-- Create a table
CREATE TABLE users (
    id INT SERIAL PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    email VARCHAR(255)
);

-- Insert some sample data
INSERT INTO users (name, age, email) VALUES
    ('Nikolay', 33, 'nikola@ya.ru'),
    ('Mike', 37, 'mike@ya.ru');
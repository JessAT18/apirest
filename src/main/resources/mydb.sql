USE demojessica;

DROP TABLE Employee;

CREATE TABLE Employee(
	id INT auto_increment,
	first_name VARCHAR(100),
	last_name VARCHAR(100),
	erole VARCHAR(100),
    primary key(id)
);

SELECT * FROM Employee;

INSERT INTO Employee(first_name, last_name, erole) VALUES
	("Jessica", "Aquino", "Scrum Master"),
    ("Andrea", "Torrez", "Product Owner");
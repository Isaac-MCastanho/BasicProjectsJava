CREATE DATABASE db_empresa;

USE db_empresa;

CREATE TABLE funcionarios(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(50),
  CPF VARCHAR(50),
  setor VARCHAR(30),
  salario_bruto DECIMAL(10,2),
);

INSERT INTO funcionarios VALUES(NULL,"Isaac","888.888.888.88","Front-end",5000.00);
INSERT INTO funcionarios VALUES(NULL,"Olaf","999.888.888.88","Back-end",6000.00);
INSERT INTO funcionarios VALUES(NULL,"Luisa","888.777.888.88","Front-end",9000.00);
INSERT INTO funcionarios VALUES(NULL,"Brian","888.888.555.88","DBA",7000.00);
INSERT INTO funcionarios VALUES(NULL,"Fabio Assuncao","888.222.888.88","Front-end",5000.00);
INSERT INTO funcionarios VALUES(NULL,"Mario","999.222.888.88","Design",1100.00);
INSERT INTO funcionarios VALUES(NULL,"Lucas","555.222.888.88","Front-end",1500.00);

SELECT * FROM funcionarios 
WHERE salario_bruto > 2000;

SELECT * FROM funcionarios 
WHERE salario_bruto < 2000;

UPDATE funcionarios
SET nome = 'Outro Fabio'
WHERE id = 5;
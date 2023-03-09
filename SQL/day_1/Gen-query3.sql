CREATE DATABASE db_escola;

CREATE TABLE tb_estudantes(
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(255),
  nota DECIMAL(4,2),
  matricula VARCHAR(255),
  turma VARCHAR(255),
  periodo VARCHAR(255),
  transporte BOOLEAN
);

INSERT INTO tb_estudantes VALUES(NULL, "Eu",5.50,"555-A6","Alguma","Integral",true),
(NULL, "Jonas",6.50,"489-A6","Brothers","Matutino",false),
(NULL, "Wallace",5.50,"857-A6","Bonde do tigrão","Integral",true),
(NULL, "Messi",9.99,"999-A6","The Best","Integral",true),
(NULL, "Neymar",9.50,"333-A6","Night","Integral",true),
(NULL, "Batman",10.00,"777-F7","Ninguem sabe","Integral",true),
(NULL, "Cleubio",5.50,"897-A6","Bonde do tigrão","Integral",true),
(NULL, "Marcelo Bechler",9.00,"857-A6","Barça","Integral",true);

SELECT * FROM tb_estudantes WHERE nota > 7;

SELECT * FROM tb_estudantes WHERE nota < 7;
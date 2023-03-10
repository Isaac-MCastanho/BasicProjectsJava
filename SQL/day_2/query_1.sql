

CREATE DATABASE db_generation_game_online;


CREATE TABLE tb_classes(
 idClasse BIGINT PRIMARY KEY AUTO_INCREMENT,
 nome VARCHAR(20),
 ataque_distancia BOOLEAN,
 magia BOOLEAN
);

INSERT INTO tb_classes VALUES
(NULL, "Arqueiro",true,false),
(NULL, "Guerreiro",false,false),
(NULL, "Mago",true,true),
(NULL, "Curandeiro",false,false);


CREATE TABLE tb_personagens(
 idPersonagem BIGINT PRIMARY KEY AUTO_INCREMENT,
 id_classe BIGINT,
 nome VARCHAR(20) NOT NULL,
 defesa DECIMAL(6,2) NOT NULL,
 ataque DECIMAL(6,2) NOT NULL,
 magia DECIMAL(6,2),
 cura DECIMAL(6,2),

 FOREIGN KEY(id_classe) REFERENCES tb_classes(idClasse)
);

INSERT INTO tb_personagens VALUES
(NULL,3, "Brahma",300.00,600.00,2000.00,400.00),
(NULL,3, "Messi",100.00,2500.00,9000.00,200.00),
(NULL,1, "Robin Hood",1000.00,5000.00,null,null),
(NULL,5, "Rollo",3000.00,9900.00,null,null),
(NULL,4, "Medico do Neymar",800.00,100.00,null,9999.99),
(NULL,2, "Shazam",5000.00,7000.00,null,null),
(NULL,2, "Balduíno IV",1000.00,8800.00,null,null),
(NULL,2, "Aquiles",8000.00,9900.00,null,null);

/*--------  Consultas  --------*/

SELECT * FROM tb_personagens
WHERE ataque > 2000;

SELECT * FROM tb_personagens
WHERE ataque < 2000 && ataque > 1000;

SELECT * FROM tb_personagens
WHERE nome LIKE '%c%';

SELECT P.idPersonagem, P.id_classe, P.nome, P.defesa, P.ataque, P.magia, P.cura, C.nome as Nome_Classe, C.ataque_distancia, C.magia
FROM tb_personagens as P
INNER JOIN tb_classes as C
ON P.id_classe = C.idClasse;


SELECT P.idPersonagem, P.id_classe, P.nome, P.defesa, P.ataque, P.magia, P.cura, C.nome as Nome_Classe, C.ataque_distancia, C.magia
FROM tb_personagens as P
INNER JOIN tb_classes as C
ON P.id_classe = C.idClasse
WHERE P.id_classe = 2;
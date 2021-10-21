CREATE TABLE comerciante (
	id bigint PRIMARY KEY auto_increment,
	title varchar(200),
	description TEXT,
	points int
);

CREATE TABLE user (
	id bigint PRIMARY KEY auto_increment,
	name varchar(200),
	email varchar(200),
	password varchar(200),
	githubuser varchar(200)
	
);

INSERT INTO user (name, email, password, githubuser) VALUES
('Vinicius Rodrigues', 'vinnirx@gmail.com', '$2a$12$GCncvnswTrQXv94uYJw8Dem0RZQGR7iwyWIDPB3Is3TURYzGZiCHu', 'vinnirx'),
('Ronie Menezes', 'ronie@gmail.com', '12345678', 'ronieSantosDeMenezes'),
('Gabriel Montovanni', 'gabriel@fiap.com.br', '12345678', 'GabrielMontovani');


INSERT INTO comerciante (title, description) VALUES 
	('Produtos Cadastrados da Loja do Vinicius',
	'Batata, Arroz, Feijão');
	
	
INSERT INTO comerciante (title, description) VALUES 
	('Produtos Cadastrados da Loja do Ronie',
	'Feijão, Macarrão, Linguiça');
	
INSERT INTO comerciante (title, description) VALUES 
	('Produtos Cadastrados da Loja do Gabriel',
	'Bala Fini, Nescau, Alface');
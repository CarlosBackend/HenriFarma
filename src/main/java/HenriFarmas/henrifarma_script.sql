
CREATE DATABASE IF NOT EXISTS henrifarma;
USE henrifarma;

CREATE TABLE `cliente` (
   `id` int NOT NULL AUTO_INCREMENT,
   `nome` varchar(100) NOT NULL,
   `cpf` varchar(11) NOT NULL,
   `endereco` varchar(150) NOT NULL,
   `telefone` varchar(20) NOT NULL,
   PRIMARY KEY (`id`)
 );

 CREATE TABLE `funcionario` (
    `id` int NOT NULL AUTO_INCREMENT,
    `nome` varchar(100) NOT NULL,
    `cpf` varchar(11) NOT NULL,
    `cargo` varchar(50) NOT NULL,
    PRIMARY KEY (`id`)
  );

  CREATE TABLE `produto` (
     `id` int NOT NULL AUTO_INCREMENT,
     `nome` varchar(50) NOT NULL,
     `preco` decimal(5,2) NOT NULL,
     `quantidade` int NOT NULL,
     `validade` date NOT NULL,
     PRIMARY KEY (`id`)
   );
   CREATE TABLE `itens_venda` (
      `id` int NOT NULL AUTO_INCREMENT,
      `venda_id` int DEFAULT NULL,
      `produto_id` int DEFAULT NULL,
      `quantidade` int NOT NULL,
      `preco_unitario` decimal(10,2) NOT NULL,
      PRIMARY KEY (`id`),
      KEY `venda_id` (`venda_id`),
      KEY `produto_id` (`produto_id`),
      CONSTRAINT `itens_venda_ibfk_1` FOREIGN KEY (`venda_id`) REFERENCES `venda` (`id`),
      CONSTRAINT `itens_venda_ibfk_2` FOREIGN KEY (`produto_id`) REFERENCES `produto` (`id`)
    );

    CREATE TABLE `venda` (
       `id` int NOT NULL AUTO_INCREMENT,
       `data` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
       `total` decimal(10,2) NOT NULL,
       `cliente_id` int DEFAULT NULL,
       PRIMARY KEY (`id`),
       KEY `cliente_id` (`cliente_id`),
       CONSTRAINT `venda_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`)
     );




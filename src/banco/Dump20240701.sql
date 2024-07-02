CREATE DATABASE  IF NOT EXISTS `app` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `app`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: app
-- ------------------------------------------------------
-- Server version	5.7.40

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cadastro`
--

DROP TABLE IF EXISTS `cadastro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cadastro` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `senha` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cadastro`
--

LOCK TABLES `cadastro` WRITE;
/*!40000 ALTER TABLE `cadastro` DISABLE KEYS */;
INSERT INTO `cadastro` VALUES (1,'brunohenrique','bruno@email.com','11223344'),(2,'admin','adm@email.com','1234');
/*!40000 ALTER TABLE `cadastro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produtos`
--

DROP TABLE IF EXISTS `produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produtos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codBarras` varchar(50) DEFAULT NULL,
  `preco` double DEFAULT NULL,
  `descricao` varchar(50) DEFAULT NULL,
  `imagem` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produtos`
--

LOCK TABLES `produtos` WRITE;
/*!40000 ALTER TABLE `produtos` DISABLE KEYS */;
INSERT INTO `produtos` VALUES (1,'001',5,'batata ruflles 350g','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/batata.png'),(2,'002',7,'cerveja budwiser logneck 360ml','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/cerveja.png'),(3,'003',9.99,'pote pequeno nutella 180g','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/nutella.png'),(4,'004',10.99,'coca-cola 2 litros','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/coca-cola.jpeg'),(5,'005',13.6,'yogourt danone sabor morango','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/danonão grosso.jpeg'),(6,'006',4.6,'biscoito recheado balduco','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/biscoito.jpeg'),(7,'007',13,'farofa de churrasco yoke tradicional 180g','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/farofayoki.jpeg'),(8,'008',14,'requeijão cremoso danone 200g','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/requeijãodanone.jpeg'),(9,'009',8.99,'batata inglesa','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/Batatainglesa.jpg'),(10,'010',7.99,'arroz branco 1kg','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/arroz.jpeg'),(11,'011',8.99,'feijão preto 1kg','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/feijaopreto.jpeg'),(12,'012',17,'shampoo dove reconstrução completa 400ml','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/shampoo.jpeg'),(13,'013',24.9,'vinho tinto suave bordô pérgola 750ml','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/vinho.jpeg'),(14,'014',11.59,'oleo de soja soya 350ml','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/oleo.jpeg'),(15,'015',10.99,'feijao carioca 1kg','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/feijao carioca.jpeg'),(16,'016',27.9,'amaciante downy 1.5l concentrado','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/amaciante.jpeg'),(17,'017',2.79,'detergente neutro ypê 200ml','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/detergente.jpeg'),(18,'018',23.99,'sorvete nestlê napolitano 1.5l','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/sorvete.jpeg'),(19,'019',1.7,'suco tang sabor laranja 25g','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/suco.jpeg'),(20,'020',15,'café 3 corações tradicional 600g','C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/café.jpeg');
/*!40000 ALTER TABLE `produtos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-01 21:17:34

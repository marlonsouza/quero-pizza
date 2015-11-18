CREATE DATABASE  IF NOT EXISTS `queroPizza` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `queroPizza`;
-- MySQL dump 10.13  Distrib 5.5.46, for debian-linux-gnu (x86_64)
--
-- Host: 127.0.0.1    Database: queroPizza
-- ------------------------------------------------------
-- Server version	5.6.27-0ubuntu0.14.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cardapios_itens`
--

DROP TABLE IF EXISTS `cardapios_itens`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cardapios_itens` (
  `Cardapio_i_cardapio` bigint(20) NOT NULL,
  `itens_i_item` bigint(20) NOT NULL,
  UNIQUE KEY `UK_gj18cvpi5u8bjj6vvswwm1okn` (`itens_i_item`),
  KEY `FK_ka9yqvw5j6vfx1u2jp9g6c1pk` (`Cardapio_i_cardapio`),
  CONSTRAINT `FK_gj18cvpi5u8bjj6vvswwm1okn` FOREIGN KEY (`itens_i_item`) REFERENCES `itens` (`i_item`),
  CONSTRAINT `FK_ka9yqvw5j6vfx1u2jp9g6c1pk` FOREIGN KEY (`Cardapio_i_cardapio`) REFERENCES `cardapios` (`i_cardapio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cardapios_itens`
--

LOCK TABLES `cardapios_itens` WRITE;
/*!40000 ALTER TABLE `cardapios_itens` DISABLE KEYS */;
/*!40000 ALTER TABLE `cardapios_itens` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-11-18 21:03:18

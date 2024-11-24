CREATE DATABASE  IF NOT EXISTS `eventflow` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `eventflow`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: eventflow
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

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
-- Table structure for table `checklist`
--

DROP TABLE IF EXISTS `checklist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `checklist` (
  `ID_Checklsit` int(11) NOT NULL,
  `ID_Evento` int(11) DEFAULT NULL,
  `Titulo_Checklist` varchar(45) DEFAULT NULL,
  `Descricao` varchar(60) DEFAULT NULL,
  `Itens_Checklist` varchar(250) DEFAULT NULL,
  `Status_Itens` enum('Entregues','Pendentes','Encaminhados') DEFAULT NULL,
  PRIMARY KEY (`ID_Checklsit`),
  KEY `ID_Evento` (`ID_Evento`),
  CONSTRAINT `checklist_ibfk_1` FOREIGN KEY (`ID_Evento`) REFERENCES `evento` (`ID_Evento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `checklist`
--

LOCK TABLES `checklist` WRITE;
/*!40000 ALTER TABLE `checklist` DISABLE KEYS */;
/*!40000 ALTER TABLE `checklist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipe`
--

DROP TABLE IF EXISTS `equipe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipe` (
  `ID_Equipe` int(11) NOT NULL,
  `ID_Evento` int(11) DEFAULT NULL,
  `Nome_Equipe` varchar(20) DEFAULT NULL,
  `Funcionarios_Desponiveis` varchar(100) DEFAULT NULL,
  `Demandas_Andamento` varchar(100) DEFAULT NULL,
  `Prazo_Fornecedor` int(11) DEFAULT NULL,
  `Prazo_Evento` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_Equipe`),
  KEY `ID_Evento` (`ID_Evento`),
  CONSTRAINT `equipe_ibfk_1` FOREIGN KEY (`ID_Evento`) REFERENCES `evento` (`ID_Evento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipe`
--

LOCK TABLES `equipe` WRITE;
/*!40000 ALTER TABLE `equipe` DISABLE KEYS */;
/*!40000 ALTER TABLE `equipe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evento`
--

DROP TABLE IF EXISTS `evento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `evento` (
  `ID_Evento` int(11) NOT NULL AUTO_INCREMENT,
  `TituloEvento` varchar(25) DEFAULT NULL,
  `TipoEvento` enum('Casual','Aniversário','Casamento','Palestra') DEFAULT NULL,
  `DescricaoEvento` varchar(60) DEFAULT NULL,
  `Contato_Evento` int(11) DEFAULT NULL,
  `Responsavel_Evento` varchar(25) DEFAULT NULL,
  `DataEvento_inicial` date NOT NULL,
  `DataEvento_Final` date NOT NULL,
  `HorarioEvento_inicial` varchar(15) DEFAULT NULL,
  `HorarioEvento_Final` varchar(15) DEFAULT NULL,
  `LocalEvento` varchar(50) DEFAULT NULL,
  `StatusEvento` enum('Concluído','Em andamento','Preparando') DEFAULT NULL,
  PRIMARY KEY (`ID_Evento`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evento`
--

LOCK TABLES `evento` WRITE;
/*!40000 ALTER TABLE `evento` DISABLE KEYS */;
INSERT INTO `evento` VALUES (7,'ww','Casamento','22',123,'ww','2024-05-08','2024-08-09','1','5','ww',NULL),(8,'ww','Aniversário','i',123,'ww','2024-05-08','2025-08-09','1','4','i',NULL),(9,'deu certo','Casamento','gggggggggg',123321,'gg','2024-08-09','2025-04-08','1','5','1',NULL);
/*!40000 ALTER TABLE `evento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `expositor`
--

DROP TABLE IF EXISTS `expositor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `expositor` (
  `ID_Expositor` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Evento` int(11) DEFAULT NULL,
  `Responsavel` varchar(15) DEFAULT NULL,
  `CEP` int(11) DEFAULT NULL,
  `Nome_Expositor` varchar(20) DEFAULT NULL,
  `Tipo_Parceria` varchar(40) DEFAULT NULL,
  `Email_Expositor` varchar(22) DEFAULT NULL,
  `Data_Cadastro` date DEFAULT NULL,
  `Status_Expositor` enum('Confirmado.','Em negociação.','Recusado.') DEFAULT NULL,
  PRIMARY KEY (`ID_Expositor`),
  KEY `ID_Evento` (`ID_Evento`),
  CONSTRAINT `expositor_ibfk_1` FOREIGN KEY (`ID_Evento`) REFERENCES `evento` (`ID_Evento`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `expositor`
--

LOCK TABLES `expositor` WRITE;
/*!40000 ALTER TABLE `expositor` DISABLE KEYS */;
INSERT INTO `expositor` VALUES (1,NULL,'ww',132,'ww',NULL,'ww','2024-05-08',NULL),(2,NULL,'ww',125468,'ww',NULL,'123','2024-05-08',NULL),(3,NULL,'ww',123,'ww',NULL,'234','2021-05-03',NULL);
/*!40000 ALTER TABLE `expositor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fornecedor`
--

DROP TABLE IF EXISTS `fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornecedor` (
  `ID_Fornecedor` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(45) DEFAULT NULL,
  `NumCelular_Fornecedor` int(12) DEFAULT NULL,
  `Email_Fornecedor` varchar(25) DEFAULT NULL,
  `Data_Cadastro` date DEFAULT NULL,
  `StatusFornecedorEvento` enum('Em atraso.','Entregue.','A caminho.') DEFAULT NULL,
  `CEPfornecedor` int(11) DEFAULT NULL,
  `StatusFornecedorGeral` enum('ATIVO','INATIVO','PENDENTE') DEFAULT NULL,
  `Servicos` enum('PRODUTOS DESCARTAVEIS','BEBIDAS','COMIDAS','SALGADOS','SONORIZAÇÃO','MULTIMIDEA','ARRANJO','DECORAÇÃO','FLORICULTURA','MESAS & CADEIRAS') DEFAULT NULL,
  PRIMARY KEY (`ID_Fornecedor`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornecedor`
--

LOCK TABLES `fornecedor` WRITE;
/*!40000 ALTER TABLE `fornecedor` DISABLE KEYS */;
INSERT INTO `fornecedor` VALUES (2,'WW',NULL,'123','2025-05-08',NULL,22,'ATIVO','PRODUTOS DESCARTAVEIS');
/*!40000 ALTER TABLE `fornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modelo_de_evento`
--

DROP TABLE IF EXISTS `modelo_de_evento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `modelo_de_evento` (
  `ID_Modelo` int(11) NOT NULL,
  `ID_Evento` int(11) DEFAULT NULL,
  `ID_Usuario` int(11) DEFAULT NULL,
  `Nome_Modelo` varchar(30) NOT NULL,
  `Descricao` varchar(100) NOT NULL,
  `Capacidade_Maxima` int(11) NOT NULL,
  `Duracao_Padrao` int(11) DEFAULT NULL,
  `Itens_Incluidos_Pacote` varchar(50) DEFAULT NULL,
  `Preco_Base` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_Modelo`),
  KEY `ID_Evento` (`ID_Evento`),
  KEY `ID_Usuario` (`ID_Usuario`),
  CONSTRAINT `modelo_de_evento_ibfk_1` FOREIGN KEY (`ID_Evento`) REFERENCES `evento` (`ID_Evento`),
  CONSTRAINT `modelo_de_evento_ibfk_2` FOREIGN KEY (`ID_Usuario`) REFERENCES `usuario` (`ID_Usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modelo_de_evento`
--

LOCK TABLES `modelo_de_evento` WRITE;
/*!40000 ALTER TABLE `modelo_de_evento` DISABLE KEYS */;
/*!40000 ALTER TABLE `modelo_de_evento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `participante`
--

DROP TABLE IF EXISTS `participante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `participante` (
  `ID_Participante` int(11) NOT NULL,
  `ID_Evento` int(11) DEFAULT NULL,
  `Nome_Participante` varchar(20) DEFAULT NULL,
  `Email_Participante` varchar(35) DEFAULT NULL,
  `Data_Cadastro` date DEFAULT NULL,
  PRIMARY KEY (`ID_Participante`),
  KEY `ID_Evento` (`ID_Evento`),
  CONSTRAINT `participante_ibfk_1` FOREIGN KEY (`ID_Evento`) REFERENCES `evento` (`ID_Evento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `participante`
--

LOCK TABLES `participante` WRITE;
/*!40000 ALTER TABLE `participante` DISABLE KEYS */;
/*!40000 ALTER TABLE `participante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `ID_Usuario` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Evento` int(11) DEFAULT NULL,
  `Nome_Usuario` varchar(40) DEFAULT NULL,
  `Senha` varchar(10) DEFAULT NULL,
  `Email_Usuario` varchar(35) DEFAULT NULL,
  `Telefone` int(12) DEFAULT NULL,
  PRIMARY KEY (`ID_Usuario`),
  KEY `ID_Evento` (`ID_Evento`),
  CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`ID_Evento`) REFERENCES `evento` (`ID_Evento`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (6,NULL,'ww','321','ww',NULL),(7,NULL,'wesley','123','wpassos',NULL),(8,NULL,'ww','ww','ww',NULL);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-10 21:47:54

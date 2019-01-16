-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: proxibanquefinal
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (1,'jean@hotmail.fr','Jean','Paul','06-21-05-46-65','00123465'),(2,'jano@hotmail','Jano','No','06-45-32-45-78','00124578'),(3,'lilas@hotmail.fr','Maeva','Boireau','06-12-45-32-02','00123415'),(4,'huff@hotmail.fr','Harry','Potter','06-35-45-98-78','00124312'),(5,'street@hotmail.fr','Albus','Dumbledore','06-00-45-98-65','00124376'),(6,'fomr@hotmail.fr','Sevrus','Rogue','06-45-98-28-90','00121010'),(7,'gggg@hotmail.fr','Draco','Malfoy','06-51-51-98-64','00127373'),(8,'okok@hotmail.fr','Sidney','Sid','06-85-85-12-12','00126464'),(9,'ffff@hotmail.fr','Bernard','Pmu','06-75-12-53-45','00125050'),(10,'tyty@hotmail.fr','Toto','titi','06-24-85-64-13','00127342');
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `opinion`
--

LOCK TABLES `opinion` WRITE;
/*!40000 ALTER TABLE `opinion` DISABLE KEYS */;
INSERT INTO `opinion` VALUES (3,NULL,'1',2,1),(4,NULL,'1',3,2),(5,NULL,'1',6,3),(6,'Test','0',NULL,NULL),(7,NULL,'1',10,5),(8,'Je n\'en ai pas besoin','0',4,2),(9,'Je ne suis pas intéresse','0',8,3),(10,'Je possède deja une assurance auto','0',1,1),(11,'Possède déja une assurance auto','0',9,5),(12,'Quels sont les avantages','0',5,2),(13,'sqfuodhsdfouihsfgoihreqgouheqgouiqhergrheqgiluZRH<','0',NULL,NULL),(14,'Pouraaalalala','0',NULL,NULL),(15,'nique ta mere','0',NULL,NULL),(16,'sqfuodhsdfouihsfgoihreqgouheqgouiqhergrheqgiluZRH<','0',NULL,NULL),(17,NULL,'0',NULL,NULL),(18,NULL,'0',NULL,NULL),(19,NULL,'0',NULL,NULL),(20,NULL,'0',NULL,NULL),(21,NULL,'0',NULL,NULL),(22,NULL,'0',NULL,NULL),(23,NULL,'0',NULL,NULL),(24,NULL,'0',NULL,NULL),(25,NULL,'0',NULL,NULL),(26,NULL,'0',NULL,NULL),(27,'k:ok','0',NULL,NULL),(28,'ttt','0',NULL,NULL),(29,NULL,'0',NULL,NULL),(30,'nique ta mere','0',NULL,NULL),(31,'nique ta mere','0',NULL,NULL),(32,'k:ok','0',NULL,NULL);
/*!40000 ALTER TABLE `opinion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `survey`
--

LOCK TABLES `survey` WRITE;
/*!40000 ALTER TABLE `survey` DISABLE KEYS */;
INSERT INTO `survey` VALUES (1,'2018-08-20','2018-09-22','2018-09-20'),(2,'2018-09-23','2018-10-25','2018-10-23'),(3,'2018-10-26','2018-11-28','2018-11-26'),(4,'2018-11-29','2018-12-30','2018-12-29'),(5,'2019-01-02','2019-01-15','2019-02-02'),(6,'2017-01-01','2019-01-15','2020-01-01'),(7,'2017-01-01','2019-01-16','2020-01-01'),(8,'2017-01-01',NULL,'2020-12-30');
/*!40000 ALTER TABLE `survey` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-16  9:17:43

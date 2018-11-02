-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: xy_wx_data
-- ------------------------------------------------------
-- Server version	5.7.17-log

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
-- Table structure for table `goal`
--

DROP TABLE IF EXISTS `goal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `goal` (
  `goal_id` int(11) NOT NULL AUTO_INCREMENT,
  `goal_type` varchar(45) DEFAULT NULL,
  `goal_name` varchar(45) DEFAULT NULL,
  `goal_num` varchar(45) DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_by` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `is_del` int(11) DEFAULT NULL,
  PRIMARY KEY (`goal_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `goal`
--

LOCK TABLES `goal` WRITE;
/*!40000 ALTER TABLE `goal` DISABLE KEYS */;
INSERT INTO `goal` VALUES (1,'跑步步数','跑步','10000','admin','2017-11-29 00:00:00',NULL,NULL,NULL),(2,'跑步步数','跑步','10000','admin','2017-11-29 00:00:00',NULL,NULL,NULL),(3,'跑步步数','跑步','10000','admin','2017-12-01 00:00:00',NULL,NULL,NULL);
/*!40000 ALTER TABLE `goal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `motion_record`
--

DROP TABLE IF EXISTS `motion_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `motion_record` (
  `motion_record_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(255) DEFAULT NULL,
  `goal_id` int(11) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `complete_num` int(11) DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_by` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `is_del` int(11) DEFAULT NULL,
  PRIMARY KEY (`motion_record_id`),
  KEY `fk_goal_id` (`goal_id`),
  KEY `fk_user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `motion_record`
--

LOCK TABLES `motion_record` WRITE;
/*!40000 ALTER TABLE `motion_record` DISABLE KEYS */;
INSERT INTO `motion_record` VALUES (1,'7c2960fa-dcbd-47ee-9bf3-1c75a6695c6f',1,NULL,0,NULL,'7c2960fa-dcbd-47ee-9bf3-1c75a6695c6f','2017-11-29 00:00:00',NULL,NULL,NULL);
/*!40000 ALTER TABLE `motion_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` varchar(255) NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  `wx_name` varchar(45) DEFAULT NULL,
  `union_id` varchar(255) DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_by` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `province` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `is_del` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('123456','测试',NULL,NULL,'微信名','654321',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('7c2960fa-dcbd-47ee-9bf3-1c75a6695c6f','cs001',NULL,'1',NULL,'654321',NULL,'2017-11-23 00:00:00',NULL,NULL,NULL,NULL,NULL),('acf324fd-7e3f-4e39-9abf-bc5d07cd0d84','cs002',NULL,'1',NULL,'',NULL,'2017-11-23 00:00:00',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_info`
--

DROP TABLE IF EXISTS `user_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_info` (
  `USER_INFO_ID` varchar(255) NOT NULL,
  `NAME` varchar(45) DEFAULT NULL,
  `CARD_NO` varchar(255) DEFAULT NULL,
  `BIRTHDAY` date DEFAULT NULL,
  `GENDER` varchar(45) DEFAULT NULL,
  `TELEPHONE` varchar(45) DEFAULT NULL,
  `USER_LEVEL` varchar(45) DEFAULT NULL,
  `REMARK` varchar(255) DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_by` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `is_del` int(11) DEFAULT NULL,
  PRIMARY KEY (`USER_INFO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_info`
--

LOCK TABLES `user_info` WRITE;
/*!40000 ALTER TABLE `user_info` DISABLE KEYS */;
INSERT INTO `user_info` VALUES ('1','chens',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('7c2960fa-dcbd-47ee-9bf3-1c75a6695c6f',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2017-11-23 00:00:00',NULL,NULL,NULL),('acf324fd-7e3f-4e39-9abf-bc5d07cd0d84',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2017-11-23 00:00:00',NULL,NULL,NULL);
/*!40000 ALTER TABLE `user_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_motion`
--

DROP TABLE IF EXISTS `user_motion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_motion` (
  `USER_MOTION_ID` varchar(255) NOT NULL,
  `AVERAGE_STEP` varchar(255) DEFAULT NULL,
  `MOTION_NUM` int(11) DEFAULT NULL,
  `AVERAGE_JUMP` varchar(255) DEFAULT NULL,
  `PRACTICE` varchar(255) DEFAULT NULL,
  `STEP_STATUS` varchar(45) DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_by` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `is_del` int(11) DEFAULT NULL,
  PRIMARY KEY (`USER_MOTION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_motion`
--

LOCK TABLES `user_motion` WRITE;
/*!40000 ALTER TABLE `user_motion` DISABLE KEYS */;
INSERT INTO `user_motion` VALUES ('1','0',0,'0','0','','',NULL,NULL,NULL,NULL),('7c2960fa-dcbd-47ee-9bf3-1c75a6695c6f',NULL,0,NULL,NULL,NULL,NULL,'2017-11-23 00:00:00',NULL,NULL,NULL),('acf324fd-7e3f-4e39-9abf-bc5d07cd0d84',NULL,0,NULL,NULL,NULL,NULL,'2017-11-23 00:00:00',NULL,NULL,NULL);
/*!40000 ALTER TABLE `user_motion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-02 10:44:40

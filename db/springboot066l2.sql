-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springboot066l2
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Current Database: `springboot066l2`
--

/*!40000 DROP DATABASE IF EXISTS `springboot066l2`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `springboot066l2` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `springboot066l2`;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hetongxinxi`
--

DROP TABLE IF EXISTS `hetongxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hetongxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `hetongbianhao` varchar(200) DEFAULT NULL COMMENT '合同编号',
  `wenjian` varchar(200) DEFAULT NULL COMMENT '文件',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `qiandingqixian` varchar(200) DEFAULT NULL COMMENT '签订期限',
  `qiandingriqi` datetime DEFAULT NULL COMMENT '签订日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `hetongbianhao` (`hetongbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='合同信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hetongxinxi`
--

LOCK TABLES `hetongxinxi` WRITE;
/*!40000 ALTER TABLE `hetongxinxi` DISABLE KEYS */;
INSERT INTO `hetongxinxi` VALUES (61,'2021-12-20 04:42:24','1111111111','upload/hetongxinxi_wenjian1.jpg','用户账号1','用户姓名1','签订期限1','2021-12-20 12:42:24'),(62,'2021-12-20 04:42:24','2222222222','upload/hetongxinxi_wenjian2.jpg','用户账号2','用户姓名2','签订期限2','2021-12-20 12:42:24'),(63,'2021-12-20 04:42:24','3333333333','upload/hetongxinxi_wenjian3.jpg','用户账号3','用户姓名3','签订期限3','2021-12-20 12:42:24'),(64,'2021-12-20 04:42:24','4444444444','upload/hetongxinxi_wenjian4.jpg','用户账号4','用户姓名4','签订期限4','2021-12-20 12:42:24'),(65,'2021-12-20 04:42:25','5555555555','upload/hetongxinxi_wenjian5.jpg','用户账号5','用户姓名5','签订期限5','2021-12-20 12:42:25'),(66,'2021-12-20 04:42:25','6666666666','upload/hetongxinxi_wenjian6.jpg','用户账号6','用户姓名6','签订期限6','2021-12-20 12:42:25');
/*!40000 ALTER TABLE `hetongxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huli`
--

DROP TABLE IF EXISTS `huli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huli` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `hulizhanghao` varchar(200) NOT NULL COMMENT '护理账号',
  `hulixingming` varchar(200) NOT NULL COMMENT '护理姓名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `dianhuahaoma` varchar(200) DEFAULT NULL COMMENT '电话号码',
  PRIMARY KEY (`id`),
  UNIQUE KEY `hulizhanghao` (`hulizhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='护理';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huli`
--

LOCK TABLES `huli` WRITE;
/*!40000 ALTER TABLE `huli` DISABLE KEYS */;
INSERT INTO `huli` VALUES (31,'2021-12-20 04:42:24','护理账号1','护理姓名1','123456','男','upload/huli_touxiang1.jpg','部门1','13823888881'),(32,'2021-12-20 04:42:24','护理账号2','护理姓名2','123456','男','upload/huli_touxiang2.jpg','部门2','13823888882'),(33,'2021-12-20 04:42:24','护理账号3','护理姓名3','123456','男','upload/huli_touxiang3.jpg','部门3','13823888883'),(34,'2021-12-20 04:42:24','护理账号4','护理姓名4','123456','男','upload/huli_touxiang4.jpg','部门4','13823888884'),(35,'2021-12-20 04:42:24','护理账号5','护理姓名5','123456','男','upload/huli_touxiang5.jpg','部门5','13823888885'),(36,'2021-12-20 04:42:24','护理账号6','护理姓名6','123456','男','upload/huli_touxiang6.jpg','部门6','13823888886');
/*!40000 ALTER TABLE `huli` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hulifangan`
--

DROP TABLE IF EXISTS `hulifangan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hulifangan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `hulibianhao` varchar(200) DEFAULT NULL COMMENT '护理编号',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `hulifangan` varchar(200) DEFAULT NULL COMMENT '护理方案',
  `yinshi` varchar(200) DEFAULT NULL COMMENT '饮食',
  `yaofang` varchar(200) DEFAULT NULL COMMENT '药方',
  `xiangqing` longtext COMMENT '详情',
  `hulizhanghao` varchar(200) DEFAULT NULL COMMENT '护理账号',
  `hulixingming` varchar(200) DEFAULT NULL COMMENT '护理姓名',
  `zhiwei` varchar(200) DEFAULT NULL COMMENT '职位',
  PRIMARY KEY (`id`),
  UNIQUE KEY `hulibianhao` (`hulibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='护理方案';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hulifangan`
--

LOCK TABLES `hulifangan` WRITE;
/*!40000 ALTER TABLE `hulifangan` DISABLE KEYS */;
INSERT INTO `hulifangan` VALUES (111,'2021-12-20 04:42:25','1111111111','用户账号1','用户姓名1','护理方案1','饮食1','药方1','详情1','护理账号1','护理姓名1','职位1'),(112,'2021-12-20 04:42:25','2222222222','用户账号2','用户姓名2','护理方案2','饮食2','药方2','详情2','护理账号2','护理姓名2','职位2'),(113,'2021-12-20 04:42:25','3333333333','用户账号3','用户姓名3','护理方案3','饮食3','药方3','详情3','护理账号3','护理姓名3','职位3'),(114,'2021-12-20 04:42:25','4444444444','用户账号4','用户姓名4','护理方案4','饮食4','药方4','详情4','护理账号4','护理姓名4','职位4'),(115,'2021-12-20 04:42:25','5555555555','用户账号5','用户姓名5','护理方案5','饮食5','药方5','详情5','护理账号5','护理姓名5','职位5'),(116,'2021-12-20 04:42:25','6666666666','用户账号6','用户姓名6','护理方案6','饮食6','药方6','详情6','护理账号6','护理姓名6','职位6');
/*!40000 ALTER TABLE `hulifangan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hulijilu`
--

DROP TABLE IF EXISTS `hulijilu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hulijilu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jilubianhao` varchar(200) DEFAULT NULL COMMENT '记录编号',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `yinshi` varchar(200) DEFAULT NULL COMMENT '饮食',
  `yaofang` varchar(200) DEFAULT NULL COMMENT '药方',
  `shentizhuangkuang` longtext COMMENT '身体状况',
  `hulixiangqing` longtext COMMENT '护理详情',
  `hulizhanghao` varchar(200) DEFAULT NULL COMMENT '护理账号',
  `hulixingming` varchar(200) DEFAULT NULL COMMENT '护理姓名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `jilubianhao` (`jilubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='护理记录';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hulijilu`
--

LOCK TABLES `hulijilu` WRITE;
/*!40000 ALTER TABLE `hulijilu` DISABLE KEYS */;
INSERT INTO `hulijilu` VALUES (121,'2021-12-20 04:42:25','1111111111','用户账号1','用户姓名1','饮食1','药方1','身体状况1','护理详情1','护理账号1','护理姓名1'),(122,'2021-12-20 04:42:25','2222222222','用户账号2','用户姓名2','饮食2','药方2','身体状况2','护理详情2','护理账号2','护理姓名2'),(123,'2021-12-20 04:42:25','3333333333','用户账号3','用户姓名3','饮食3','药方3','身体状况3','护理详情3','护理账号3','护理姓名3'),(124,'2021-12-20 04:42:25','4444444444','用户账号4','用户姓名4','饮食4','药方4','身体状况4','护理详情4','护理账号4','护理姓名4'),(125,'2021-12-20 04:42:25','5555555555','用户账号5','用户姓名5','饮食5','药方5','身体状况5','护理详情5','护理账号5','护理姓名5'),(126,'2021-12-20 04:42:25','6666666666','用户账号6','用户姓名6','饮食6','药方6','身体状况6','护理详情6','护理账号6','护理姓名6');
/*!40000 ALTER TABLE `hulijilu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiankangdangan`
--

DROP TABLE IF EXISTS `jiankangdangan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiankangdangan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) NOT NULL COMMENT '用户姓名',
  `yiwangbingshi` longtext COMMENT '以往病史',
  `jiazubingshi` longtext COMMENT '家族病史',
  `xianbingshi` longtext COMMENT '现病史',
  `tijianjieguo` varchar(200) DEFAULT NULL COMMENT '体检结果',
  `dengjishijian` datetime DEFAULT NULL COMMENT '登记时间',
  `yishengzhanghao` varchar(200) DEFAULT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) DEFAULT NULL COMMENT '医生姓名',
  `zhiwei` varchar(200) DEFAULT NULL COMMENT '职位',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8 COMMENT='健康档案';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiankangdangan`
--

LOCK TABLES `jiankangdangan` WRITE;
/*!40000 ALTER TABLE `jiankangdangan` DISABLE KEYS */;
INSERT INTO `jiankangdangan` VALUES (161,'2021-12-20 04:42:25','用户账号1','用户姓名1','以往病史1','家族病史1','现病史1','体检结果1','2021-12-20 12:42:25','医生账号1','医生姓名1','职位1'),(162,'2021-12-20 04:42:25','用户账号2','用户姓名2','以往病史2','家族病史2','现病史2','体检结果2','2021-12-20 12:42:25','医生账号2','医生姓名2','职位2'),(163,'2021-12-20 04:42:25','用户账号3','用户姓名3','以往病史3','家族病史3','现病史3','体检结果3','2021-12-20 12:42:25','医生账号3','医生姓名3','职位3'),(164,'2021-12-20 04:42:25','用户账号4','用户姓名4','以往病史4','家族病史4','现病史4','体检结果4','2021-12-20 12:42:25','医生账号4','医生姓名4','职位4'),(165,'2021-12-20 04:42:25','用户账号5','用户姓名5','以往病史5','家族病史5','现病史5','体检结果5','2021-12-20 12:42:25','医生账号5','医生姓名5','职位5'),(166,'2021-12-20 04:42:25','用户账号6','用户姓名6','以往病史6','家族病史6','现病史6','体检结果6','2021-12-20 12:42:25','医生账号6','医生姓名6','职位6');
/*!40000 ALTER TABLE `jiankangdangan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiankangpinggu`
--

DROP TABLE IF EXISTS `jiankangpinggu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiankangpinggu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `jiankangpinggu` longtext COMMENT '健康评估',
  `jiankangdengji` varchar(200) DEFAULT NULL COMMENT '健康等级',
  `pinggushijian` datetime DEFAULT NULL COMMENT '评估时间',
  `yishengzhanghao` varchar(200) DEFAULT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) DEFAULT NULL COMMENT '医生姓名',
  `zhiwei` varchar(200) DEFAULT NULL COMMENT '职位',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=177 DEFAULT CHARSET=utf8 COMMENT='健康评估';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiankangpinggu`
--

LOCK TABLES `jiankangpinggu` WRITE;
/*!40000 ALTER TABLE `jiankangpinggu` DISABLE KEYS */;
INSERT INTO `jiankangpinggu` VALUES (171,'2021-12-20 04:42:25','用户账号1','用户姓名1','健康评估1','★','2021-12-20 12:42:25','医生账号1','医生姓名1','职位1'),(172,'2021-12-20 04:42:25','用户账号2','用户姓名2','健康评估2','★','2021-12-20 12:42:25','医生账号2','医生姓名2','职位2'),(173,'2021-12-20 04:42:25','用户账号3','用户姓名3','健康评估3','★','2021-12-20 12:42:25','医生账号3','医生姓名3','职位3'),(174,'2021-12-20 04:42:25','用户账号4','用户姓名4','健康评估4','★','2021-12-20 12:42:25','医生账号4','医生姓名4','职位4'),(175,'2021-12-20 04:42:25','用户账号5','用户姓名5','健康评估5','★','2021-12-20 12:42:25','医生账号5','医生姓名5','职位5'),(176,'2021-12-20 04:42:25','用户账号6','用户姓名6','健康评估6','★','2021-12-20 12:42:25','医生账号6','医生姓名6','职位6');
/*!40000 ALTER TABLE `jiankangpinggu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `liliaoxinxi`
--

DROP TABLE IF EXISTS `liliaoxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `liliaoxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `liliaobianhao` varchar(200) DEFAULT NULL COMMENT '理疗编号',
  `tijianjieguo` varchar(200) DEFAULT NULL COMMENT '体检结果',
  `liliaofangan` varchar(200) DEFAULT NULL COMMENT '理疗方案',
  `liliaoshijian` varchar(200) DEFAULT NULL COMMENT '理疗时间',
  `liliaoxiangmu` varchar(200) DEFAULT NULL COMMENT '理疗项目',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `yishengzhanghao` varchar(200) DEFAULT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) DEFAULT NULL COMMENT '医生姓名',
  `zhiwei` varchar(200) DEFAULT NULL COMMENT '职位',
  PRIMARY KEY (`id`),
  UNIQUE KEY `liliaobianhao` (`liliaobianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='理疗信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `liliaoxinxi`
--

LOCK TABLES `liliaoxinxi` WRITE;
/*!40000 ALTER TABLE `liliaoxinxi` DISABLE KEYS */;
INSERT INTO `liliaoxinxi` VALUES (101,'2021-12-20 04:42:25','1111111111','体检结果1','理疗方案1','理疗时间1','理疗项目1','用户账号1','用户姓名1','医生账号1','医生姓名1','职位1'),(102,'2021-12-20 04:42:25','2222222222','体检结果2','理疗方案2','理疗时间2','理疗项目2','用户账号2','用户姓名2','医生账号2','医生姓名2','职位2'),(103,'2021-12-20 04:42:25','3333333333','体检结果3','理疗方案3','理疗时间3','理疗项目3','用户账号3','用户姓名3','医生账号3','医生姓名3','职位3'),(104,'2021-12-20 04:42:25','4444444444','体检结果4','理疗方案4','理疗时间4','理疗项目4','用户账号4','用户姓名4','医生账号4','医生姓名4','职位4'),(105,'2021-12-20 04:42:25','5555555555','体检结果5','理疗方案5','理疗时间5','理疗项目5','用户账号5','用户姓名5','医生账号5','医生姓名5','职位5'),(106,'2021-12-20 04:42:25','6666666666','体检结果6','理疗方案6','理疗时间6','理疗项目6','用户账号6','用户姓名6','医生账号6','医生姓名6','职位6');
/*!40000 ALTER TABLE `liliaoxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ruyuantongji`
--

DROP TABLE IF EXISTS `ruyuantongji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ruyuantongji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tongjibianhao` varchar(200) DEFAULT NULL COMMENT '统计编号',
  `tongjishijian` date DEFAULT NULL COMMENT '统计时间',
  `ruyuanrenshu` int(11) DEFAULT NULL COMMENT '入院人数',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `tongjibianhao` (`tongjibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1639975604760 DEFAULT CHARSET=utf8 COMMENT='入院统计';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ruyuantongji`
--

LOCK TABLES `ruyuantongji` WRITE;
/*!40000 ALTER TABLE `ruyuantongji` DISABLE KEYS */;
INSERT INTO `ruyuantongji` VALUES (131,'2021-12-20 04:42:25','1111111111','2021-12-20',1,'备注1'),(132,'2021-12-20 04:42:25','2222222222','2021-12-20',2,'备注2'),(133,'2021-12-20 04:42:25','3333333333','2021-12-20',3,'备注3'),(134,'2021-12-20 04:42:25','4444444444','2021-12-20',4,'备注4'),(135,'2021-12-20 04:42:25','5555555555','2021-12-20',5,'备注5'),(136,'2021-12-20 04:42:25','6666666666','2021-12-20',6,'备注6'),(1639975604759,'2021-12-20 04:46:44','1639975580929','2021-12-13',265,'<p>432454</p>');
/*!40000 ALTER TABLE `ruyuantongji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ruzhuxinxi`
--

DROP TABLE IF EXISTS `ruzhuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ruzhuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `ruzhubianhao` varchar(200) DEFAULT NULL COMMENT '入住编号',
  `fanghao` varchar(200) DEFAULT NULL COMMENT '房号',
  `chuanghao` varchar(200) DEFAULT NULL COMMENT '床号',
  `jinjilianxiren` varchar(200) DEFAULT NULL COMMENT '紧急联系人',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `lianxirenguanxi` varchar(200) DEFAULT NULL COMMENT '联系人关系',
  `zuoxiguilv` varchar(200) DEFAULT NULL COMMENT '作息规律',
  `yinshixiguan` longtext COMMENT '饮食习惯',
  `shenghuoxihao` varchar(200) DEFAULT NULL COMMENT '生活喜好',
  `ruzhushijian` datetime DEFAULT NULL COMMENT '入住时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `hulizhanghao` varchar(200) DEFAULT NULL COMMENT '护理账号',
  `hulixingming` varchar(200) DEFAULT NULL COMMENT '护理姓名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `ruzhubianhao` (`ruzhubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='入住信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ruzhuxinxi`
--

LOCK TABLES `ruzhuxinxi` WRITE;
/*!40000 ALTER TABLE `ruzhuxinxi` DISABLE KEYS */;
INSERT INTO `ruzhuxinxi` VALUES (51,'2021-12-20 04:42:24','1111111111','房号1','床号1','紧急联系人1','13823888881','联系人关系1','作息规律1','饮食习惯1','生活喜好1','2021-12-20 12:42:24','用户账号1','用户姓名1','护理账号1','护理姓名1'),(52,'2021-12-20 04:42:24','2222222222','房号2','床号2','紧急联系人2','13823888882','联系人关系2','作息规律2','饮食习惯2','生活喜好2','2021-12-20 12:42:24','用户账号2','用户姓名2','护理账号2','护理姓名2'),(53,'2021-12-20 04:42:24','3333333333','房号3','床号3','紧急联系人3','13823888883','联系人关系3','作息规律3','饮食习惯3','生活喜好3','2021-12-20 12:42:24','用户账号3','用户姓名3','护理账号3','护理姓名3'),(54,'2021-12-20 04:42:24','4444444444','房号4','床号4','紧急联系人4','13823888884','联系人关系4','作息规律4','饮食习惯4','生活喜好4','2021-12-20 12:42:24','用户账号4','用户姓名4','护理账号4','护理姓名4'),(55,'2021-12-20 04:42:24','5555555555','房号5','床号5','紧急联系人5','13823888885','联系人关系5','作息规律5','饮食习惯5','生活喜好5','2021-12-20 12:42:24','用户账号5','用户姓名5','护理账号5','护理姓名5'),(56,'2021-12-20 04:42:24','6666666666','房号6','床号6','紧急联系人6','13823888886','联系人关系6','作息规律6','饮食习惯6','生活喜好6','2021-12-20 12:42:24','用户账号6','用户姓名6','护理账号6','护理姓名6');
/*!40000 ALTER TABLE `ruzhuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tijiantongji`
--

DROP TABLE IF EXISTS `tijiantongji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tijiantongji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tongjibianhao` varchar(200) DEFAULT NULL COMMENT '统计编号',
  `tongjishijian` date DEFAULT NULL COMMENT '统计时间',
  `tijianrenshu` int(11) DEFAULT NULL COMMENT '体检人数',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `tongjibianhao` (`tongjibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1639975657337 DEFAULT CHARSET=utf8 COMMENT='体检统计';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tijiantongji`
--

LOCK TABLES `tijiantongji` WRITE;
/*!40000 ALTER TABLE `tijiantongji` DISABLE KEYS */;
INSERT INTO `tijiantongji` VALUES (141,'2021-12-20 04:42:25','1111111111','2021-12-20',1,'备注1'),(142,'2021-12-20 04:42:25','2222222222','2021-12-20',2,'备注2'),(143,'2021-12-20 04:42:25','3333333333','2021-12-20',3,'备注3'),(144,'2021-12-20 04:42:25','4444444444','2021-12-20',4,'备注4'),(145,'2021-12-20 04:42:25','5555555555','2021-12-20',5,'备注5'),(146,'2021-12-20 04:42:25','6666666666','2021-12-20',6,'备注6'),(1639975657336,'2021-12-20 04:47:36','1639975635593','2021-12-17',848,'<p>454665</p>');
/*!40000 ALTER TABLE `tijiantongji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tijianxinxi`
--

DROP TABLE IF EXISTS `tijianxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tijianxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiangmubianhao` varchar(200) DEFAULT NULL COMMENT '项目编号',
  `xiangmumingcheng` varchar(200) NOT NULL COMMENT '项目名称',
  `xiangmuleixing` varchar(200) NOT NULL COMMENT '项目类型',
  `jiage` float DEFAULT NULL COMMENT '价格',
  `tijianshijian` datetime DEFAULT NULL COMMENT '体检时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `yishengzhanghao` varchar(200) DEFAULT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) DEFAULT NULL COMMENT '医生姓名',
  `zhiwei` varchar(200) DEFAULT NULL COMMENT '职位',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xiangmubianhao` (`xiangmubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='体检信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tijianxinxi`
--

LOCK TABLES `tijianxinxi` WRITE;
/*!40000 ALTER TABLE `tijianxinxi` DISABLE KEYS */;
INSERT INTO `tijianxinxi` VALUES (91,'2021-12-20 04:42:25','1111111111','项目名称1','项目类型1',1,'2021-12-20 12:42:25','用户账号1','用户姓名1','医生账号1','医生姓名1','职位1'),(92,'2021-12-20 04:42:25','2222222222','项目名称2','项目类型2',2,'2021-12-20 12:42:25','用户账号2','用户姓名2','医生账号2','医生姓名2','职位2'),(93,'2021-12-20 04:42:25','3333333333','项目名称3','项目类型3',3,'2021-12-20 12:42:25','用户账号3','用户姓名3','医生账号3','医生姓名3','职位3'),(94,'2021-12-20 04:42:25','4444444444','项目名称4','项目类型4',4,'2021-12-20 12:42:25','用户账号4','用户姓名4','医生账号4','医生姓名4','职位4'),(95,'2021-12-20 04:42:25','5555555555','项目名称5','项目类型5',5,'2021-12-20 12:42:25','用户账号5','用户姓名5','医生账号5','医生姓名5','职位5'),(96,'2021-12-20 04:42:25','6666666666','项目名称6','项目类型6',6,'2021-12-20 12:42:25','用户账号6','用户姓名6','医生账号6','医生姓名6','职位6');
/*!40000 ALTER TABLE `tijianxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','yiqbycxtd9wx370rzgc0hgcptpr3oldl','2021-12-20 04:43:45','2021-12-20 05:45:56');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-12-20 04:42:25');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiangmuleixing`
--

DROP TABLE IF EXISTS `xiangmuleixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiangmuleixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiangmuleixing` varchar(200) NOT NULL COMMENT '项目类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='项目类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiangmuleixing`
--

LOCK TABLES `xiangmuleixing` WRITE;
/*!40000 ALTER TABLE `xiangmuleixing` DISABLE KEYS */;
INSERT INTO `xiangmuleixing` VALUES (71,'2021-12-20 04:42:25','项目类型1'),(72,'2021-12-20 04:42:25','项目类型2'),(73,'2021-12-20 04:42:25','项目类型3'),(74,'2021-12-20 04:42:25','项目类型4'),(75,'2021-12-20 04:42:25','项目类型5'),(76,'2021-12-20 04:42:25','项目类型6');
/*!40000 ALTER TABLE `xiangmuleixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiangmuxinxi`
--

DROP TABLE IF EXISTS `xiangmuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiangmuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiangmumingcheng` varchar(200) DEFAULT NULL COMMENT '项目名称',
  `xiangmuleixing` varchar(200) DEFAULT NULL COMMENT '项目类型',
  `jiage` float DEFAULT NULL COMMENT '价格',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `zhuyishixiang` longtext COMMENT '注意事项',
  `tijianneirong` longtext COMMENT '体检内容',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `yishengzhanghao` varchar(200) DEFAULT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) DEFAULT NULL COMMENT '医生姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='项目信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiangmuxinxi`
--

LOCK TABLES `xiangmuxinxi` WRITE;
/*!40000 ALTER TABLE `xiangmuxinxi` DISABLE KEYS */;
INSERT INTO `xiangmuxinxi` VALUES (81,'2021-12-20 04:42:25','项目名称1','项目类型1',1,'upload/xiangmuxinxi_tupian1.jpg','注意事项1','体检内容1','2021-12-20','医生账号1','医生姓名1'),(82,'2021-12-20 04:42:25','项目名称2','项目类型2',2,'upload/xiangmuxinxi_tupian2.jpg','注意事项2','体检内容2','2021-12-20','医生账号2','医生姓名2'),(83,'2021-12-20 04:42:25','项目名称3','项目类型3',3,'upload/xiangmuxinxi_tupian3.jpg','注意事项3','体检内容3','2021-12-20','医生账号3','医生姓名3'),(84,'2021-12-20 04:42:25','项目名称4','项目类型4',4,'upload/xiangmuxinxi_tupian4.jpg','注意事项4','体检内容4','2021-12-20','医生账号4','医生姓名4'),(85,'2021-12-20 04:42:25','项目名称5','项目类型5',5,'upload/xiangmuxinxi_tupian5.jpg','注意事项5','体检内容5','2021-12-20','医生账号5','医生姓名5'),(86,'2021-12-20 04:42:25','项目名称6','项目类型6',6,'upload/xiangmuxinxi_tupian6.jpg','注意事项6','体检内容6','2021-12-20','医生账号6','医生姓名6');
/*!40000 ALTER TABLE `xiangmuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xinlizixun`
--

DROP TABLE IF EXISTS `xinlizixun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xinlizixun` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zixunbianhao` varchar(200) DEFAULT NULL COMMENT '咨询编号',
  `hulizhanghao` varchar(200) DEFAULT NULL COMMENT '护理账号',
  `hulixingming` varchar(200) DEFAULT NULL COMMENT '护理姓名',
  `zixunneirong` longtext NOT NULL COMMENT '咨询内容',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `zixunshijian` date DEFAULT NULL COMMENT '咨询时间',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zixunbianhao` (`zixunbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8 COMMENT='心理咨询';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xinlizixun`
--

LOCK TABLES `xinlizixun` WRITE;
/*!40000 ALTER TABLE `xinlizixun` DISABLE KEYS */;
INSERT INTO `xinlizixun` VALUES (151,'2021-12-20 04:42:25','1111111111','护理账号1','护理姓名1','咨询内容1','用户账号1','用户姓名1','2021-12-20','是',''),(152,'2021-12-20 04:42:25','2222222222','护理账号2','护理姓名2','咨询内容2','用户账号2','用户姓名2','2021-12-20','是',''),(153,'2021-12-20 04:42:25','3333333333','护理账号3','护理姓名3','咨询内容3','用户账号3','用户姓名3','2021-12-20','是',''),(154,'2021-12-20 04:42:25','4444444444','护理账号4','护理姓名4','咨询内容4','用户账号4','用户姓名4','2021-12-20','是',''),(155,'2021-12-20 04:42:25','5555555555','护理账号5','护理姓名5','咨询内容5','用户账号5','用户姓名5','2021-12-20','是',''),(156,'2021-12-20 04:42:25','6666666666','护理账号6','护理姓名6','咨询内容6','用户账号6','用户姓名6','2021-12-20','是','');
/*!40000 ALTER TABLE `xinlizixun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yisheng`
--

DROP TABLE IF EXISTS `yisheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yisheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yishengzhanghao` varchar(200) NOT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) NOT NULL COMMENT '医生姓名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `zhiwei` varchar(200) DEFAULT NULL COMMENT '职位',
  `gongling` int(11) DEFAULT NULL COMMENT '工龄',
  `dianhuahaoma` varchar(200) DEFAULT NULL COMMENT '电话号码',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yishengzhanghao` (`yishengzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='医生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yisheng`
--

LOCK TABLES `yisheng` WRITE;
/*!40000 ALTER TABLE `yisheng` DISABLE KEYS */;
INSERT INTO `yisheng` VALUES (21,'2021-12-20 04:42:24','医生账号1','医生姓名1','123456','男','upload/yisheng_touxiang1.jpg','职位1',1,'13823888881'),(22,'2021-12-20 04:42:24','医生账号2','医生姓名2','123456','男','upload/yisheng_touxiang2.jpg','职位2',2,'13823888882'),(23,'2021-12-20 04:42:24','医生账号3','医生姓名3','123456','男','upload/yisheng_touxiang3.jpg','职位3',3,'13823888883'),(24,'2021-12-20 04:42:24','医生账号4','医生姓名4','123456','男','upload/yisheng_touxiang4.jpg','职位4',4,'13823888884'),(25,'2021-12-20 04:42:24','医生账号5','医生姓名5','123456','男','upload/yisheng_touxiang5.jpg','职位5',5,'13823888885'),(26,'2021-12-20 04:42:24','医生账号6','医生姓名6','123456','男','upload/yisheng_touxiang6.jpg','职位6',6,'13823888886');
/*!40000 ALTER TABLE `yisheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) NOT NULL COMMENT '用户姓名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `dianhuahaoma` varchar(200) DEFAULT NULL COMMENT '电话号码',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuzhanghao` (`yonghuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2021-12-20 04:42:24','用户账号1','用户姓名1','123456','男','upload/yonghu_touxiang1.jpg',1,'13823888881'),(12,'2021-12-20 04:42:24','用户账号2','用户姓名2','123456','男','upload/yonghu_touxiang2.jpg',2,'13823888882'),(13,'2021-12-20 04:42:24','用户账号3','用户姓名3','123456','男','upload/yonghu_touxiang3.jpg',3,'13823888883'),(14,'2021-12-20 04:42:24','用户账号4','用户姓名4','123456','男','upload/yonghu_touxiang4.jpg',4,'13823888884'),(15,'2021-12-20 04:42:24','用户账号5','用户姓名5','123456','男','upload/yonghu_touxiang5.jpg',5,'13823888885'),(16,'2021-12-20 04:42:24','用户账号6','用户姓名6','123456','男','upload/yonghu_touxiang6.jpg',6,'13823888886');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhusuxinxi`
--

DROP TABLE IF EXISTS `zhusuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhusuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhusubianhao` varchar(200) DEFAULT NULL COMMENT '住宿编号',
  `fanghao` varchar(200) DEFAULT NULL COMMENT '房号',
  `chuanghao` varchar(200) DEFAULT NULL COMMENT '床号',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `hulizhanghao` varchar(200) DEFAULT NULL COMMENT '护理账号',
  `hulixingming` varchar(200) DEFAULT NULL COMMENT '护理姓名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhusubianhao` (`zhusubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='住宿信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhusuxinxi`
--

LOCK TABLES `zhusuxinxi` WRITE;
/*!40000 ALTER TABLE `zhusuxinxi` DISABLE KEYS */;
INSERT INTO `zhusuxinxi` VALUES (41,'2021-12-20 04:42:24','1111111111','房号1','床号1','用户账号1','用户姓名1',1,'护理账号1','护理姓名1'),(42,'2021-12-20 04:42:24','2222222222','房号2','床号2','用户账号2','用户姓名2',2,'护理账号2','护理姓名2'),(43,'2021-12-20 04:42:24','3333333333','房号3','床号3','用户账号3','用户姓名3',3,'护理账号3','护理姓名3'),(44,'2021-12-20 04:42:24','4444444444','房号4','床号4','用户账号4','用户姓名4',4,'护理账号4','护理姓名4'),(45,'2021-12-20 04:42:24','5555555555','房号5','床号5','用户账号5','用户姓名5',5,'护理账号5','护理姓名5'),(46,'2021-12-20 04:42:24','6666666666','房号6','床号6','用户账号6','用户姓名6',6,'护理账号6','护理姓名6');
/*!40000 ALTER TABLE `zhusuxinxi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-20 16:13:51

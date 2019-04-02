/*
Navicat MySQL Data Transfer

Source Server         : Lee
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : workorder

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2019-04-02 15:35:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `orderId` int(11) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `role` int(11) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('1', '5', '对方感受到', null, '2019-04-01 12:02:33');
INSERT INTO `comment` VALUES ('2', '5', 'dfg的反射', null, '2019-04-02 12:02:49');
INSERT INTO `comment` VALUES ('3', '5', '第三方或是否合格', null, '2019-04-03 12:03:01');
INSERT INTO `comment` VALUES ('4', '4', '我就是嘴边好的数据库', '1', '2019-04-10 12:28:06');
INSERT INTO `comment` VALUES ('5', '4', 'postman test', '2', '2018-04-25 16:00:00');

-- ----------------------------
-- Table structure for orderinfo
-- ----------------------------
DROP TABLE IF EXISTS `orderinfo`;
CREATE TABLE `orderinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` text,
  `status` int(11) DEFAULT NULL,
  `priority` int(11) DEFAULT NULL,
  `category` int(11) DEFAULT NULL,
  `userID` int(11) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `attachment` varchar(255) DEFAULT NULL,
  `engineerID` int(11) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `finishTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of orderinfo
-- ----------------------------
INSERT INTO `orderinfo` VALUES ('1', 'A20190401111808A', 'test1', '里面的内容不重要啦', '1', '1', '1', '1', '18362723726', '741320298@qq.com', 'c://...', '1', '2019-04-01 11:20:11', '2019-04-01 12:20:15');
INSERT INTO `orderinfo` VALUES ('2', 'A20190401123589S', 'test2', '什么也不想敲', '2', '2', '1', '2', '15252600107', '18362723726@163.com', 'e://..', '6', '2019-04-01 12:35:51', '2019-04-03 12:35:54');
INSERT INTO `orderinfo` VALUES ('3', 'A20190401124589S', 'test3', '闪电发货空数据', '3', '1', '2', '1', '18362723726', '741320298@qq.com', null, null, '2019-04-01 11:20:11', '2019-04-01 12:20:15');
INSERT INTO `orderinfo` VALUES ('4', 'A20190756123589S', 'test4', '的粉红色的', '4', '2', '4', '2', '15252600107', '18362723726@163.com', null, null, '2019-04-01 12:35:51', '2019-04-03 12:35:54');
INSERT INTO `orderinfo` VALUES ('6', 'A201904011235fdsa', 'test1', '反倒是收到货', '1', '2', '4', '1', '15252600107', '18362723726@163.com', null, null, '2019-04-01 12:35:51', '2019-04-03 12:35:54');
INSERT INTO `orderinfo` VALUES ('7', 'A201903451235fdsa', 'test2', '双方都很舒服广寒深宫', '2', '1', '3', '6', '18362723726', '741320298@qq.com', null, null, '2019-04-01 11:20:11', '2019-04-01 12:20:15');
INSERT INTO `orderinfo` VALUES ('8', 'A20190401123sdfsa', 'test3', '地方是非得失', '3', '2', '3', '8', '15252600107', '18362723726@163.com', null, null, '2019-04-01 12:35:51', '2019-04-03 12:35:54');
INSERT INTO `orderinfo` VALUES ('9', 'V2er904011235fdsa', 'test4', '噶的非官方大哥', '4', '1', '1', '4', '18362723726', '741320298@qq.com', null, null, '2019-04-03 20:54:19', '2019-04-10 20:54:22');
INSERT INTO `orderinfo` VALUES ('10', 'A201999911235fdsa', 'test5', '体育体育与天涯倦客', '5', '1', '1', '2', '15252600107', '18362723726@163.com', null, null, '2019-04-16 20:54:26', '2019-05-01 20:54:29');
INSERT INTO `orderinfo` VALUES ('11', 'A3012sd451235fdsa', 'test1', '人员投入而因为人体羊肉汤', '1', '2', '2', '3', '18362723726', '741320298@qq.com', null, null, '2019-04-28 22:54:33', '2019-05-10 20:54:40');
INSERT INTO `orderinfo` VALUES ('12', 'Bsdf456d11235fdsa', 'test2', '我让他因为热爱让人挺好', '2', '1', '4', '1', '15252600107', '18362723726@163.com', null, null, '2019-04-01 11:20:11', '2019-04-01 12:20:15');
INSERT INTO `orderinfo` VALUES ('13', 'A201dgsfg11235fds', 'test3', '随便翘一点内容吧', '3', '2', '5', '2', '18362723726', '741320298@qq.com', null, null, '2019-04-01 12:35:51', '2019-04-03 12:35:54');
INSERT INTO `orderinfo` VALUES ('14', 'A201456fgd1235fds', 'test4', '如有污染土黄色', '4', '1', '4', '1', '15252600107', '18362723726@163.com', null, null, '2019-04-03 20:54:19', '2019-04-10 20:54:22');
INSERT INTO `orderinfo` VALUES ('15', 'A201904011hg898ff', 'test5', '微软同样问题荣誉企业', '5', '2', '3', '2', '18362723726', '741320298@qq.com', null, null, '2019-04-16 20:54:26', '2019-05-01 20:54:29');
INSERT INTO `orderinfo` VALUES ('16', 'Qsdf7657hgy35fdsa', 'test1', '太容易体育台yiu哟卡了', '1', '1', '3', '3', '15252600107', '18362723726@163.com', null, null, '2019-04-28 22:54:33', '2019-05-10 20:54:40');
INSERT INTO `orderinfo` VALUES ('17', 'A201904011465gdfh', 'test2', '安徽一体uyiopqzcvdfshg', '2', '2', '1', '1', '18362723726', '741320298@qq.com', null, null, '2019-04-01 11:20:11', '2019-04-01 12:20:15');
INSERT INTO `orderinfo` VALUES ('18', 'A201904satrtuyipmn', 'test3', '电饭锅和染色体就', '3', '1', '1', '6', '15252600107', '18362723726@163.com', null, null, '2019-04-01 12:35:51', '2019-04-03 12:35:54');
INSERT INTO `orderinfo` VALUES ('19', 'A465fghlisdfhgrt465', 'test4', '好人突然问题', '4', '2', '2', '8', '18362723726', '741320298@qq.com', null, null, '2019-04-03 20:54:19', '2019-04-10 20:54:22');
INSERT INTO `orderinfo` VALUES ('20', 'TYGdsfhstj4654d168', 'test5', '如图无可就不错云', '5', '1', '4', '4', '15252600107', '18362723726@163.com', null, null, '2019-04-16 20:54:26', '2019-05-01 20:54:29');
INSERT INTO `orderinfo` VALUES ('21', null, null, '随便翘一点内容吧', null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for paraentcategory
-- ----------------------------
DROP TABLE IF EXISTS `paraentcategory`;
CREATE TABLE `paraentcategory` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of paraentcategory
-- ----------------------------

-- ----------------------------
-- Table structure for soncategory
-- ----------------------------
DROP TABLE IF EXISTS `soncategory`;
CREATE TABLE `soncategory` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `paraentID` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `paraentID` (`paraentID`),
  CONSTRAINT `soncategory_ibfk_1` FOREIGN KEY (`paraentID`) REFERENCES `paraentcategory` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of soncategory
-- ----------------------------

-- ----------------------------
-- Table structure for topquestion
-- ----------------------------
DROP TABLE IF EXISTS `topquestion`;
CREATE TABLE `topquestion` (
  `id` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` text,
  `categoryID` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of topquestion
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'asd', null, null, null);

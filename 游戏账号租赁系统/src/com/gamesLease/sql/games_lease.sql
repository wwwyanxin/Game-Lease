/*
Navicat MySQL Data Transfer

Source Server         : wyx
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : games_lease

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-05-29 12:20:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account_info
-- ----------------------------
DROP TABLE IF EXISTS `account_info`;
CREATE TABLE `account_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `game_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account_info
-- ----------------------------
INSERT INTO `account_info` VALUES ('1', 'abcd123', 'qwert', '1');
INSERT INTO `account_info` VALUES ('2', 'hgkjdfhgf', '5jkh45', '3');
INSERT INTO `account_info` VALUES ('3', 'rttret', '432gf', '4');
INSERT INTO `account_info` VALUES ('4', '43fhghgdh', '32wsdfgdfgsd', '5');
INSERT INTO `account_info` VALUES ('5', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('6', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('7', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('8', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('9', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('10', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('11', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('12', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('13', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('14', '455435', 'tert', '6');
INSERT INTO `account_info` VALUES ('15', 'tomfdgdfgsd', '123', '10');
INSERT INTO `account_info` VALUES ('16', 'tom454', '435435435', '8');
INSERT INTO `account_info` VALUES ('17', '453454543534', '454355', '1');
INSERT INTO `account_info` VALUES ('18', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('19', '', '', '1');
INSERT INTO `account_info` VALUES ('20', 'to', '', '1');
INSERT INTO `account_info` VALUES ('21', '', '', '1');
INSERT INTO `account_info` VALUES ('22', '', '', '1');
INSERT INTO `account_info` VALUES ('23', '', '', '1');
INSERT INTO `account_info` VALUES ('24', '45435345', '3434', '1');
INSERT INTO `account_info` VALUES ('25', 'wazi19972010', '19970725q', '6');
INSERT INTO `account_info` VALUES ('26', '12212', '333', '1');
INSERT INTO `account_info` VALUES ('27', '3423423423', '32534543534545', '1');
INSERT INTO `account_info` VALUES ('28', '324342543', '43535535', '10');
INSERT INTO `account_info` VALUES ('29', 'tom', '123', '10');
INSERT INTO `account_info` VALUES ('30', 'tom', '123', '10');
INSERT INTO `account_info` VALUES ('31', '43543534534', '435435534534', '1');
INSERT INTO `account_info` VALUES ('32', '2131233123123213', 'werewrewr', '7');
INSERT INTO `account_info` VALUES ('33', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('34', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('35', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('36', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('37', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('38', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('39', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('40', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('41', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('42', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('43', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('44', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('45', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('46', 'tom', '123', '11');
INSERT INTO `account_info` VALUES ('47', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('48', 'tom', '123', '7');
INSERT INTO `account_info` VALUES ('49', 'tom', '123', '8');
INSERT INTO `account_info` VALUES ('50', 'tom', '123', '10');
INSERT INTO `account_info` VALUES ('51', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('52', '3434', '435435435', '6');
INSERT INTO `account_info` VALUES ('53', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('54', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('55', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('56', 'tom', '123', '1');

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin1', '123');
INSERT INTO `admin` VALUES ('2', 'admin2', '123');

-- ----------------------------
-- Table structure for game
-- ----------------------------
DROP TABLE IF EXISTS `game`;
CREATE TABLE `game` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of game
-- ----------------------------
INSERT INTO `game` VALUES ('1', '地下城与勇士');
INSERT INTO `game` VALUES ('2', '传奇世界');
INSERT INTO `game` VALUES ('3', '天龙八部');
INSERT INTO `game` VALUES ('4', '梦幻西游');
INSERT INTO `game` VALUES ('5', '魔兽世界');
INSERT INTO `game` VALUES ('6', '范伟打天下');
INSERT INTO `game` VALUES ('7', '剑侠情缘网络版三');
INSERT INTO `game` VALUES ('8', '弹弹堂');
INSERT INTO `game` VALUES ('9', '英雄联盟');
INSERT INTO `game` VALUES ('10', 'Dota2');
INSERT INTO `game` VALUES ('11', '王者荣耀');

-- ----------------------------
-- Table structure for lease_order
-- ----------------------------
DROP TABLE IF EXISTS `lease_order`;
CREATE TABLE `lease_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `account_id` int(11) NOT NULL,
  `start` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `end` datetime NOT NULL,
  `price` double(10,2) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '-2审核未通过,-1已下架,0审核中,1可租,2已被租',
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lease_order
-- ----------------------------
INSERT INTO `lease_order` VALUES ('1', '1', '1', '2017-05-12 00:42:41', '2017-05-27 00:42:46', '10.00', '-1', '一刀88级');
INSERT INTO `lease_order` VALUES ('2', '2', '2', '2017-04-25 00:49:50', '2017-05-27 00:49:53', '30.00', '-1', '无fuck说');
INSERT INTO `lease_order` VALUES ('3', '1', '3', '2017-05-27 21:25:18', '2017-06-04 00:54:58', '15.00', '2', '发个梵蒂冈地方给对方');
INSERT INTO `lease_order` VALUES ('4', '1', '4', '2017-05-27 22:26:23', '2017-05-27 23:26:38', '30.00', '-1', null);
INSERT INTO `lease_order` VALUES ('5', '1', '11', '2017-05-24 22:52:09', '2017-05-21 00:00:00', '3.00', '-1', '32æ¹æå¤æ¹ä¸¹åvsvså°å');
INSERT INTO `lease_order` VALUES ('6', '1', '12', '2017-05-24 22:55:16', '2017-05-21 00:00:00', '3.00', '-1', '32惹我复方丹参vsvs地址');
INSERT INTO `lease_order` VALUES ('7', '1', '13', '2017-05-24 22:55:16', '2017-05-20 00:00:00', '1.00', '-1', '3434气娃娃当然第三方');
INSERT INTO `lease_order` VALUES ('8', '3', '14', '2017-05-24 22:55:16', '2017-05-11 00:00:00', '22.00', '-1', '啊啊大法师打发嗷嗷待食');
INSERT INTO `lease_order` VALUES ('9', '2', '15', '2017-05-24 22:55:16', '2017-05-05 00:00:00', '33.00', '-1', '娃儿娃儿');
INSERT INTO `lease_order` VALUES ('10', '1', '16', '2017-05-26 14:13:35', '2017-05-19 00:00:00', '234.00', '-1', '人头狗地方广东佛山');
INSERT INTO `lease_order` VALUES ('11', '1', '17', '2017-05-26 14:13:35', '2017-05-25 00:00:00', '0.00', '-1', '4545');
INSERT INTO `lease_order` VALUES ('12', '1', '18', '2017-05-26 14:13:35', '2017-05-21 00:00:00', '-2.00', '-1', '23');
INSERT INTO `lease_order` VALUES ('13', '1', '19', '2017-05-26 14:13:35', '2017-05-21 00:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('14', '1', '20', '2017-05-26 14:13:35', '2017-05-21 00:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('15', '1', '21', '2017-05-26 14:13:35', '2017-05-21 00:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('16', '1', '22', '2017-05-26 14:13:35', '2017-05-21 00:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('17', '1', '23', '2017-05-26 14:13:35', '2017-05-21 00:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('18', '1', '24', '2017-05-26 14:13:35', '2018-05-16 00:00:00', '1.00', '-2', '');
INSERT INTO `lease_order` VALUES ('19', '6', '25', '2017-05-26 14:13:35', '2017-05-18 00:00:00', '99999999.00', '-1', '装备全靠打.快快加入范伟打天下吧!\r\n只要99999999');
INSERT INTO `lease_order` VALUES ('20', '1', '26', '2017-05-26 14:13:35', '2017-07-23 00:00:00', '111.00', '-2', '');
INSERT INTO `lease_order` VALUES ('21', '2', '27', '2017-05-26 14:13:35', '2017-05-23 00:00:00', '0.00', '-1', 'dsfasdfasfa');
INSERT INTO `lease_order` VALUES ('22', '1', '28', '2017-05-26 14:13:35', '2017-05-11 00:00:00', '1.00', '-1', 'fsfsdafadsfasfadssadfasfasdfadf');
INSERT INTO `lease_order` VALUES ('23', '1', '29', '2017-05-26 14:13:35', '2017-05-11 00:00:00', '1.00', '-1', 'fsfsdafadsfasfadssadfasfasdfadf');
INSERT INTO `lease_order` VALUES ('24', '1', '30', '2017-05-24 23:16:21', '2017-05-11 00:00:00', '1.00', '-1', 'fsfsdafadsfasfadssadfasfasdfadf');
INSERT INTO `lease_order` VALUES ('25', '6', '31', '2017-05-24 22:54:55', '2018-05-24 00:00:00', '0.00', '-2', '大佛的覅感觉对方立刻感觉浪费大驾光临快递费结果集大富科技过节费时刻感觉对方价格地方看见过独领风骚开关机东方健康规范的经济管理水电费加工精度发几个看到了就是感觉放多少分开了的客观记录非得贱更好但是风力发电了解过来看看见的罚款观澜街道浪费时间管理会计东方国际');
INSERT INTO `lease_order` VALUES ('26', '1', '32', '2017-05-26 14:15:52', '2017-05-04 00:00:00', '1.00', '-1', '');
INSERT INTO `lease_order` VALUES ('27', '1', '33', '2017-05-26 14:40:16', '2016-05-11 00:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('28', '1', '34', '2017-05-27 14:01:25', '2017-05-02 00:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('29', '1', '35', '2017-05-27 14:01:25', '2017-05-10 00:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('30', '1', '36', '2017-05-27 14:01:25', '2017-05-27 00:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('31', '1', '37', '2017-05-27 22:16:05', '2017-05-09 00:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('32', '1', '38', '2017-05-27 22:16:05', '2017-05-09 00:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('33', '1', '39', '2017-05-27 22:16:05', '2017-05-27 00:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('34', '1', '40', '2017-05-27 22:16:05', '2017-05-27 00:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('35', '1', '41', '2017-05-27 22:16:05', '2017-05-09 00:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('36', '1', '42', '2017-05-27 14:01:25', '2017-05-29 01:59:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('37', '1', '43', '2017-05-27 22:16:05', '2017-05-10 00:22:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('38', '1', '44', '2017-05-27 14:01:25', '2017-05-31 00:59:00', '0.00', '1', '');
INSERT INTO `lease_order` VALUES ('39', '1', '45', '2017-05-27 22:45:55', '2017-05-31 00:59:00', '0.00', '2', '');
INSERT INTO `lease_order` VALUES ('40', '1', '46', '2017-05-27 22:43:07', '2017-05-28 12:58:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('41', '1', '47', '2017-05-27 22:16:51', '2017-05-31 23:08:00', '0.00', '2', '');
INSERT INTO `lease_order` VALUES ('42', '1', '48', '2017-05-27 21:28:20', '2017-06-03 12:59:00', '343.00', '1', '3434324');
INSERT INTO `lease_order` VALUES ('43', '1', '49', '2017-05-27 21:21:37', '2017-08-24 01:59:00', '15.00', '2', '');
INSERT INTO `lease_order` VALUES ('44', '1', '50', '2017-05-27 22:17:59', '2017-07-28 03:04:00', '20.00', '1', '啊啊');
INSERT INTO `lease_order` VALUES ('45', '1', '51', '2017-05-27 22:25:14', '2017-06-11 15:04:00', '5.00', '2', '二恶烷若');
INSERT INTO `lease_order` VALUES ('46', '2', '52', '2017-05-27 22:19:39', '2017-07-25 02:13:00', '2.00', '2', '');
INSERT INTO `lease_order` VALUES ('47', '1', '53', '2017-05-27 22:29:57', '2017-07-21 03:04:00', '10.00', '1', '');
INSERT INTO `lease_order` VALUES ('48', '1', '54', '2017-05-27 22:48:06', '2017-05-31 14:02:00', '10.00', '1', '');
INSERT INTO `lease_order` VALUES ('49', '2', '55', '2017-05-27 22:50:08', '2017-05-31 14:03:00', '10.00', '1', '');
INSERT INTO `lease_order` VALUES ('50', '2', '56', '2017-05-27 22:49:40', '2017-06-22 14:03:00', '12.00', '1', '');

-- ----------------------------
-- Table structure for orderitem
-- ----------------------------
DROP TABLE IF EXISTS `orderitem`;
CREATE TABLE `orderitem` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `lease_id` int(11) NOT NULL,
  `start` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `end` datetime NOT NULL,
  `cost` double(10,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderitem
-- ----------------------------
INSERT INTO `orderitem` VALUES ('1', '1', '2', '2017-05-19 00:51:50', '2017-05-25 00:51:55', '333.00');
INSERT INTO `orderitem` VALUES ('2', '1', '42', '2017-05-27 21:28:20', '2017-05-27 22:00:00', '181.38');
INSERT INTO `orderitem` VALUES ('3', '2', '41', '2017-05-27 22:16:51', '2017-05-31 00:59:00', '0.00');
INSERT INTO `orderitem` VALUES ('4', '1', '44', '2017-05-27 22:17:59', '2017-05-27 22:58:00', '13.37');
INSERT INTO `orderitem` VALUES ('5', '1', '46', '2017-05-27 22:19:39', '2017-05-31 13:59:00', '175.31');
INSERT INTO `orderitem` VALUES ('6', '2', '45', '2017-05-27 22:25:14', '2017-05-30 01:00:00', '252.91');
INSERT INTO `orderitem` VALUES ('7', '1', '4', '2017-05-27 22:26:23', '2017-05-27 22:59:00', '16.41');
INSERT INTO `orderitem` VALUES ('8', '1', '47', '2017-05-27 22:30:00', '2017-05-28 00:00:00', '15.05');
INSERT INTO `orderitem` VALUES ('9', '1', '40', '2017-05-27 22:43:10', '2017-05-27 23:01:00', '0.00');
INSERT INTO `orderitem` VALUES ('10', '1', '39', '2017-05-27 22:45:55', '2017-05-30 12:59:00', '0.00');
INSERT INTO `orderitem` VALUES ('11', '1', '48', '2017-05-27 22:48:06', '2017-05-28 13:01:00', '142.17');
INSERT INTO `orderitem` VALUES ('12', '2', '50', '2017-05-27 22:49:40', '2017-05-28 01:01:00', '26.28');
INSERT INTO `orderitem` VALUES ('13', '1', '49', '2017-05-27 22:50:08', '2017-05-28 13:01:00', '141.83');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `balance` double(18,2) DEFAULT '0.00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'tom', '123', '487.68');
INSERT INTO `user` VALUES ('2', 'wyx', '123', '414.23');
INSERT INTO `user` VALUES ('3', 'aaa', '34324', '0.00');
INSERT INTO `user` VALUES ('6', 'wazi1997', '19970725q', '999999999.00');

-- ----------------------------
-- Procedure structure for update_lease_status
-- ----------------------------
DROP PROCEDURE IF EXISTS `update_lease_status`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `update_lease_status`()
BEGIN
	#Routine body goes here...
IF EXISTS (select id from orderitem where SYSDATE()>=`end`) THEN
		update lease_order set `status`='1'
		WHERE id in (select lease_id from orderitem where SYSDATE()>=`end`);
	END IF;

IF EXISTS (select id from lease_order where SYSDATE()>=`end`) THEN
		update lease_order set `status`='-1'
		WHERE id in (
									SELECT temp_table.id from(
												select id from lease_order where SYSDATE()>=`end`
																						)temp_table
								 );
	END IF;
END
;;
DELIMITER ;

-- ----------------------------
-- Event structure for 每秒检测出租表是否end
-- ----------------------------
DROP EVENT IF EXISTS `每秒检测出租表是否end`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` EVENT `每秒检测出租表是否end` ON SCHEDULE EVERY 1 SECOND STARTS '2017-05-28 22:32:20' ON COMPLETION PRESERVE ENABLE DO call update_lease_status()
;;
DELIMITER ;
SET FOREIGN_KEY_CHECKS=1;

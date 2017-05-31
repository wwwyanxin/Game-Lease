/*
Navicat MySQL Data Transfer

Source Server         : wyx
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : games_lease

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-05-31 20:34:16
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
) ENGINE=InnoDB AUTO_INCREMENT=94 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account_info
-- ----------------------------
INSERT INTO `account_info` VALUES ('1', 'abcd123', 'qwert', '1');
INSERT INTO `account_info` VALUES ('2', 'hgkjdfhgf', '5jkh45', '3');
INSERT INTO `account_info` VALUES ('3', 'rttret', '432gf', '4');
INSERT INTO `account_info` VALUES ('4', '43fhghgdh', '32wsdfgdfgsd', '5');
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
INSERT INTO `account_info` VALUES ('57', '546546456', '23123123', '1');
INSERT INTO `account_info` VALUES ('58', 'tom5645656', 'tgrstsdfg', '1');
INSERT INTO `account_info` VALUES ('59', '53453456346', '547645746574', '12');
INSERT INTO `account_info` VALUES ('60', '4536456456456', '54645645erter', '12');
INSERT INTO `account_info` VALUES ('61', '343243434', '325325325', '12');
INSERT INTO `account_info` VALUES ('62', '5345345363456', '54654665', '12');
INSERT INTO `account_info` VALUES ('63', '546565656', '342432', '12');
INSERT INTO `account_info` VALUES ('64', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('65', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('66', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('67', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('68', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('69', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('70', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('71', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('72', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('73', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('74', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('75', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('76', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('77', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('78', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('79', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('80', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('81', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('82', 'tom', '123', '1');
INSERT INTO `account_info` VALUES ('83', 'tom5345345363456', '123', '1');
INSERT INTO `account_info` VALUES ('85', '546546456346', '4364566', '9');
INSERT INTO `account_info` VALUES ('86', '78568567867', '123', '9');
INSERT INTO `account_info` VALUES ('87', '67864786758', '6785686', '9');
INSERT INTO `account_info` VALUES ('88', '45747473', '5656', '1');
INSERT INTO `account_info` VALUES ('89', '6754675647', '12367858', '11');
INSERT INTO `account_info` VALUES ('90', '123456789', '123456789', '1');
INSERT INTO `account_info` VALUES ('91', 'hdjfkrk', 'djjdjjjdjr', '6');
INSERT INTO `account_info` VALUES ('92', 'waxiness', '19970725q', '12');
INSERT INTO `account_info` VALUES ('93', 'wazi1997', '19970725', '4');

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
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

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
INSERT INTO `game` VALUES ('12', '炉石传说');

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
  `description` varchar(10000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=84 DEFAULT CHARSET=utf8;

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
INSERT INTO `lease_order` VALUES ('38', '1', '44', '2017-05-27 14:01:25', '2017-05-10 00:59:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('39', '1', '45', '2017-05-27 22:45:55', '2017-05-29 00:59:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('40', '1', '46', '2017-05-27 22:43:07', '2017-05-28 12:58:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('41', '1', '47', '2017-05-27 22:16:51', '2017-05-31 23:08:00', '0.00', '1', '');
INSERT INTO `lease_order` VALUES ('42', '1', '48', '2017-05-27 21:28:20', '2017-06-25 12:59:00', '343.00', '1', '3434324');
INSERT INTO `lease_order` VALUES ('43', '1', '49', '2017-05-27 21:21:37', '2017-08-24 01:59:00', '15.00', '2', '');
INSERT INTO `lease_order` VALUES ('44', '1', '50', '2017-05-27 22:17:59', '2017-07-28 03:04:00', '20.00', '1', '啊啊');
INSERT INTO `lease_order` VALUES ('45', '1', '51', '2017-05-27 22:25:14', '2017-06-11 15:04:00', '5.00', '1', '二恶烷若');
INSERT INTO `lease_order` VALUES ('46', '2', '52', '2017-05-27 22:19:39', '2017-07-25 02:13:00', '2.00', '1', '');
INSERT INTO `lease_order` VALUES ('47', '1', '53', '2017-05-27 22:29:57', '2017-05-17 03:04:00', '10.00', '-1', '');
INSERT INTO `lease_order` VALUES ('48', '1', '54', '2017-05-27 22:48:06', '2017-05-29 14:02:00', '10.00', '-1', '');
INSERT INTO `lease_order` VALUES ('49', '2', '55', '2017-05-27 22:50:08', '2017-05-02 14:03:00', '10.00', '-1', '');
INSERT INTO `lease_order` VALUES ('50', '2', '56', '2017-05-27 22:49:40', '2017-05-10 14:03:00', '12.00', '-1', '');
INSERT INTO `lease_order` VALUES ('51', '1', '57', '2017-05-29 22:46:26', '2017-09-30 03:04:00', '3.00', '1', ' 5173签约大卖家万元押金√5173唯一爱心公益大卖家√本店出售账号永久售后√5年信誉感谢新老客户一直以来的支持√有任何问题随时咨询24小时QQ在线客服\r\n');
INSERT INTO `lease_order` VALUES ('52', '1', '58', '2017-05-29 22:47:51', '2017-10-20 02:03:00', '1.00', '1', ' ★一诺签约卖家★是DNF帐号最安全的交易品牌，V1032\r\n本店为5173签约大卖家，已交纳万元押金做为安全保证金并且上传了店主的身份证，\r\n帐号交易成功后请第一时间找客服要店主的QQ、身份证、电话,终身售后，免去您的后顾之忧！如果您不想玩了可以联系我们高价回收帐号。\r\n号没截图完整，买号之后会有很多惊喜，但凡是截图了的就一定有，截图之后我们是不会再上帐号的。\r\n注：买帐号最讲究的就是安全问题，本店出售过几万个帐号从来就没出现过找回的情况,店铺里上千个帐号不至于说为了找回你一个帐号丢了信誉。');
INSERT INTO `lease_order` VALUES ('53', '2', '62', '2017-05-30 00:05:29', '2018-06-21 04:07:00', '2.00', '1', '全新账号，截图真实！账号里至少有6000金币+20免费卡包+免费竞技场，战网名称可以修改1次（金币数量以实际为准，但不少于6000金币)， 所有职业基础卡齐，战网账号新建，邮箱账号新建，游戏账号和邮箱未做任何的绑定，绝对安全可靠！本店所有帐号都可以长期使用，可以 做为大号使用，所有账号全部为安全号.（小小建议）想长期使用的 请修改战网密码邮箱密保，绑定手机。 注：自产自销，卖完就删除，安 全有保障，本人承若一经售出，立即删档，永不找回，请放心使用，该游戏电脑登录时，如果发生IP地址更换，需要到战网去激活下，账号 保证全部没问题，亲们请放心购买!PS:由于注册账号采用随机身份证注册，故连卖家本身都不清楚身份信息，所以此种账号最安全，因为一 旦售出，永无法找回！');
INSERT INTO `lease_order` VALUES ('54', '2', '63', '2017-05-30 00:06:49', '2017-12-24 18:59:00', '1.00', '1', '纯手工竞技 卡包120金币1885浮尘1050 不少12胜 大量7以上胜利 可以开不少金卡 分解的卡也能制作不少传说 自己竞技场循环的 纯手工竞技 没玩过对战 没买过迎新合集 可以改名');
INSERT INTO `lease_order` VALUES ('55', '1', '64', '2017-05-30 13:27:13', '2017-05-10 13:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('56', '1', '65', '2017-05-30 13:27:38', '2017-07-21 13:00:00', '0.00', '-2', '');
INSERT INTO `lease_order` VALUES ('57', '1', '66', '2017-05-30 13:28:09', '2017-05-28 01:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('58', '1', '67', '2017-05-30 13:28:38', '2017-05-28 01:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('59', '1', '68', '2017-05-30 13:29:20', '2017-05-28 01:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('60', '1', '69', '2017-05-30 13:30:15', '2017-05-28 01:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('61', '1', '70', '2017-05-30 13:30:46', '2017-05-28 01:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('62', '1', '71', '2017-05-30 13:34:53', '2017-05-28 01:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('63', '1', '72', '2017-05-30 13:36:12', '2017-05-26 12:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('64', '1', '73', '2017-05-30 13:36:30', '2017-05-26 12:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('65', '1', '74', '2017-05-30 13:38:30', '2017-05-26 12:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('66', '1', '75', '2017-05-30 13:44:24', '2017-05-26 12:00:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('67', '1', '76', '2017-05-30 15:31:03', '2017-05-31 18:05:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('68', '1', '77', '2017-05-30 15:31:42', '2017-05-31 18:05:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('69', '1', '78', '2017-05-30 15:32:05', '2017-05-31 18:05:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('70', '1', '79', '2017-05-30 15:34:14', '2017-05-31 18:05:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('71', '1', '80', '2017-05-30 15:36:32', '2017-05-31 18:05:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('72', '1', '81', '2017-05-30 15:36:32', '2017-05-31 18:05:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('73', '1', '82', '2017-05-30 15:39:00', '2017-05-31 18:05:00', '0.00', '-1', '');
INSERT INTO `lease_order` VALUES ('74', '1', '83', '2017-05-30 16:03:49', '2017-06-04 06:05:00', '0.00', '-2', '');
INSERT INTO `lease_order` VALUES ('75', '7', '85', '2017-05-30 16:14:29', '2018-02-15 16:45:00', '0.00', '1', '-----------------------------------------------------------------------灵活组排是黄金，单双排是青铜-------------------------------------------------------- ---------------------------------------------------------------------------------------------------------------------------------------------------- -----------------------------------------------------------------------------------▲▲希望老板收藏下次方便老板找号▲▲------------------------------- --------------------------------------------------------------------------------------------▲▲希望老板能评价留言谢谢▲▲-------------------------- ---------------------------------------------------------------------------------------------------------------------------------------------------- --------------------------------------------------------------------------------------------▲▲▲绝对不允许.挂机.逃跑.使用金币，否则投诉扣押金封号谢谢▲▲▲ ------------------------------------------------------------------------------------------▲▲▲绝对不允许.挂机.逃跑.使用金币，否则投诉扣押金封号谢谢▲▲▲ ----------------------------------------------------------------------------------------------------------------------------------------------------- -------------------------------------------------------------------------------为什么设置押金？因为老有人不当是自己号挂机逃跑，导致封号1-3天裁决之镰，非常坏 【这种肯定是拉黑扣押金的】----------------------------------------------------------------------------------------------------------------------------------- ---------------------------------------------- 〓七级瞎子 德莱文 VN 诺手 亚索 妖姬 〓 海克斯限定全安妮vn诺手〓 战队皮肤全〓 黑白龙虾 龙年猴子琴女大嘴〓 蛇年蛇女安妮〓 马年全 〓鸡年全〓哥特萝莉安妮〓屠龙丧尸全〓猩红源计划三国各6〓❤死兆星一套❤ 霞洛皮肤');
INSERT INTO `lease_order` VALUES ('76', '7', '86', '2017-05-30 16:15:36', '2017-12-19 13:59:00', '1.00', '1', '122英雄 364皮肤 各种限定皮肤 龙瞎 哥特安妮 海克斯安妮 摄魂使者薇恩 恐惧新星诺手 蛮王奥斯曼大帝 暗杀星全套 STK全套 SSW全套等等 金币可自行购买符文或英雄 各位租号的朋友喜欢的可以收藏 请珍惜他人账号 逃跑挂机恶意投诉者直接投诉拉黑\r\n');
INSERT INTO `lease_order` VALUES ('77', '7', '87', '2017-05-30 16:16:45', '2018-08-31 04:05:00', '2.00', '1', '如果有裁决 及时申述 撤单 有全额退！\r\n');
INSERT INTO `lease_order` VALUES ('78', '7', '88', '2017-05-30 16:17:45', '2018-05-30 18:43:00', '1.00', '2', '铂金框目前铂金段位135英雄362皮肤！海克斯安妮龙刀花木兰电玩冰原阻击龙琴TGC泳池海量限定皮肤！排位随便打！请勿挂机逃跑！恶意制造裁决之镰直接拉黑如遇账号冻结密码错误等问题请投诉！本商铺会尽力在第一时间为您解决！请5分钟后从新获取解锁码登陆游戏取消投诉即可！感谢您的支持和配合！谢谢！祝您游戏愉快！\r\n');
INSERT INTO `lease_order` VALUES ('79', '7', '89', '2017-05-30 16:19:24', '2018-05-31 16:59:00', '1.00', '1', '（安卓手Q26区兼爱非攻） ▷ 更多账号 【搜索白白手游】 大批极品V8新号 价格优惠 ✿安卓V8 65英雄 116皮肤 六套150铭文，每个英雄至少一款皮肤，主流传说限定史诗超多，有新英雄皮肤都会更新✿ 请素质游戏 不挂机 不逃跑 不得使用第三方 否则投诉拉黑并扣除押金谢谢 〓 时间到了还想继续玩的话请续租，不续请自觉下线以免影响后面的租客，造成顶号扣信誉积分 〓 喜欢本店的老板们 欢迎收藏 评论 方便下次租号 〓 如遇密码错误登录不上或者有事咨询请加企鹅喔 ◁\r\n');
INSERT INTO `lease_order` VALUES ('80', '8', '90', '2017-05-31 15:50:02', '2017-12-31 23:59:00', '10.00', '2', '账号价值10万元 ');
INSERT INTO `lease_order` VALUES ('81', '2', '91', '2017-05-31 16:01:23', '2018-05-31 16:00:00', '1.00', '0', 'hfjdjdjdkejej');
INSERT INTO `lease_order` VALUES ('82', '6', '92', '2017-05-31 16:03:09', '2017-09-09 16:02:00', '10.00', '1', '常年传说的大神号，全卡全金卡，各类上分卡组，可以体验大神的感觉，各种卡背应有尽有');
INSERT INTO `lease_order` VALUES ('83', '6', '93', '2017-05-31 16:05:24', '2017-09-18 16:04:00', '0.80', '0', '上古账号，上古国服前十账号，就是厉害。');

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
  `status` tinyint(255) DEFAULT '1' COMMENT '1是租赁中,0是已过期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderitem
-- ----------------------------
INSERT INTO `orderitem` VALUES ('1', '1', '2', '2017-05-19 00:51:50', '2017-05-25 00:51:55', '333.00', '0');
INSERT INTO `orderitem` VALUES ('2', '1', '42', '2017-05-27 21:28:20', '2017-05-27 22:00:00', '181.38', '0');
INSERT INTO `orderitem` VALUES ('3', '2', '41', '2017-05-27 22:16:51', '2017-05-31 00:59:00', '0.00', '0');
INSERT INTO `orderitem` VALUES ('4', '1', '44', '2017-05-27 22:17:59', '2017-05-27 22:58:00', '13.37', '0');
INSERT INTO `orderitem` VALUES ('5', '1', '46', '2017-05-27 22:19:39', '2017-05-31 13:59:00', '175.31', '0');
INSERT INTO `orderitem` VALUES ('6', '2', '45', '2017-05-27 22:25:14', '2017-05-30 01:00:00', '252.91', '0');
INSERT INTO `orderitem` VALUES ('7', '1', '4', '2017-05-27 22:26:23', '2017-05-27 22:59:00', '16.41', '0');
INSERT INTO `orderitem` VALUES ('8', '1', '47', '2017-05-27 22:30:00', '2017-05-28 00:00:00', '15.05', '0');
INSERT INTO `orderitem` VALUES ('9', '1', '40', '2017-05-27 22:43:10', '2017-05-27 23:01:00', '0.00', '0');
INSERT INTO `orderitem` VALUES ('10', '1', '39', '2017-05-27 22:45:55', '2017-05-30 12:59:00', '0.00', '0');
INSERT INTO `orderitem` VALUES ('11', '1', '48', '2017-05-27 22:48:06', '2017-05-28 13:01:00', '142.17', '0');
INSERT INTO `orderitem` VALUES ('12', '2', '50', '2017-05-27 22:49:40', '2017-05-28 01:01:00', '26.28', '0');
INSERT INTO `orderitem` VALUES ('13', '1', '49', '2017-05-27 22:50:08', '2017-05-28 13:01:00', '141.83', '0');
INSERT INTO `orderitem` VALUES ('15', '6', '41', '2017-05-31 16:15:36', '2017-05-31 22:30:00', '0.00', '1');
INSERT INTO `orderitem` VALUES ('16', '6', '80', '2017-05-31 16:17:17', '2017-06-30 01:01:00', '7047.31', '1');
INSERT INTO `orderitem` VALUES ('17', '6', '42', '2017-05-31 16:20:05', '2017-06-01 22:22:00', '10301.73', '1');
INSERT INTO `orderitem` VALUES ('18', '1', '46', '2017-05-31 18:21:01', '2017-05-31 18:21:00', '0.00', '0');
INSERT INTO `orderitem` VALUES ('19', '1', '46', '2017-05-31 18:29:57', '2017-05-31 18:30:00', '0.00', '0');
INSERT INTO `orderitem` VALUES ('20', '1', '46', '2017-05-31 18:30:11', '2017-05-31 18:31:00', '0.03', '0');
INSERT INTO `orderitem` VALUES ('21', '2', '41', '2017-05-31 20:18:56', '2017-05-31 20:19:00', '0.00', '0');
INSERT INTO `orderitem` VALUES ('22', '2', '41', '2017-05-31 20:19:23', '2017-05-31 20:20:00', '0.00', '0');
INSERT INTO `orderitem` VALUES ('23', '2', '41', '2017-05-31 20:20:19', '2017-05-31 20:22:00', '0.00', '0');
INSERT INTO `orderitem` VALUES ('24', '2', '41', '2017-05-31 20:23:17', '2017-05-31 20:25:00', '0.00', '0');
INSERT INTO `orderitem` VALUES ('25', '2', '41', '2017-05-31 20:33:25', '2017-05-31 20:34:00', '0.00', '0');

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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'tom', '123', '10789.38');
INSERT INTO `user` VALUES ('2', 'wyx', '123', '414.26');
INSERT INTO `user` VALUES ('3', 'aaa', '34324', '0.00');
INSERT INTO `user` VALUES ('6', 'wazi1997', '19970725q', '0.00');
INSERT INTO `user` VALUES ('7', 'haha', '123', '0.00');
INSERT INTO `user` VALUES ('8', '123456', '123456', '2989.00');

-- ----------------------------
-- Procedure structure for update1.2
-- ----------------------------
DROP PROCEDURE IF EXISTS `update1.2`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `update1.2`()
    COMMENT 'WHERE id in (select lease_id from orderitem where SYSDATE()>=`en'
BEGIN
	#Routine body goes here...
IF EXISTS (SELECT lease_id from orderitem WHERE `status`='1' AND SYSDATE()>=`end`) THEN
		update lease_order set `status`='1'
			WHERE id in (SELECT lease_id from orderitem WHERE `status`='1' AND SYSDATE()>=`end`);
		update orderitem set `status`='0'
			WHERE id in (SELECT temp_table.id FROM
				(SELECT id from orderitem WHERE `status`='1' AND SYSDATE()>=`end`)temp_table);
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
-- Procedure structure for update_lease_status
-- ----------------------------
DROP PROCEDURE IF EXISTS `update_lease_status`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `update_lease_status`()
    COMMENT 'WHERE id in (select lease_id from orderitem where SYSDATE()>=`en'
BEGIN
	#Routine body goes here...
IF EXISTS (select id from orderitem where SYSDATE()>=`end`) THEN
		update lease_order set `status`='1'
			where id in (
			SELECT temp.lease_id from 
				(select lease_id from orderitem 
				WHERE SYSDATE()>=`end` and lease_id in
					(select id from lease_order where `status`='2')
				)temp
			);
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
CREATE DEFINER=`root`@`localhost` EVENT `每秒检测出租表是否end` ON SCHEDULE EVERY 1 SECOND STARTS '2017-05-28 22:32:20' ON COMPLETION PRESERVE ENABLE DO call `update1.2`
;;
DELIMITER ;
SET FOREIGN_KEY_CHECKS=1;

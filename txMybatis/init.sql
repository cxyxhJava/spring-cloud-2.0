/*
 Navicat Premium Data Transfer

 Source Server         : dev
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : rm-bp1z81te81pnav7224o.mysql.rds.aliyuncs.com:3306
 Source Schema         : chat_log_dev

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 05/09/2020 15:40:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for test_user
-- ----------------------------
DROP TABLE IF EXISTS `test_user`;
CREATE TABLE `test_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of test_user
-- ----------------------------
BEGIN;
INSERT INTO `test_user` VALUES (1, '石头1好', '1', '11', '2020-09-05 14:52:03');
INSERT INTO `test_user` VALUES (2, '石头2好', '1', '23', '2020-09-05 14:52:14');
INSERT INTO `test_user` VALUES (3, '石头3好', '3', '333', '2020-09-05 14:52:03');
INSERT INTO `test_user` VALUES (4, '石头4好', '3', '333', '2020-09-05 14:52:03');
INSERT INTO `test_user` VALUES (5, '石头5好', '3', '333', '2020-09-05 14:52:03');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

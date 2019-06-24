/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.2.144-huguMall
 Source Server Type    : MySQL
 Source Server Version : 50173
 Source Host           : 192.168.2.144:3306
 Source Schema         : emall-inventory

 Target Server Type    : MySQL
 Target Server Version : 50173
 File Encoding         : 65001

 Date: 24/06/2019 15:33:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `is_delete` varchar(255) NOT NULL DEFAULT 'n',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
BEGIN;
INSERT INTO `sys_user` VALUES (1, '哈哈', 18, 'n');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

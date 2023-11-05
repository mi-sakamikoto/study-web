/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : bank

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 03/10/2023 13:37:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `password` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `personId` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证号',
  `idType` int NULL DEFAULT NULL COMMENT '账户类型',
  `ins_user` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '登录者信息',
  `ins_dt` timestamp NULL DEFAULT NULL COMMENT '登录时间',
  `upd_user` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '更新者信息',
  `upd_dt` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1653971060739 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES (1, '123', 'cat', '210', 1, NULL, NULL, NULL, NULL);
INSERT INTO `account` VALUES (2, '456', 'Bob', '211', 3, NULL, NULL, NULL, NULL);
INSERT INTO `account` VALUES (3, '000', 'ming', '321', 2, NULL, NULL, NULL, NULL);
INSERT INTO `account` VALUES (4, '789', 'li', '2111', 0, NULL, NULL, NULL, NULL);
INSERT INTO `account` VALUES (11, '123', 'tom', '111111', 0, NULL, NULL, NULL, NULL);
INSERT INTO `account` VALUES (12, '456', 'pitter', '222', NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for asset
-- ----------------------------
DROP TABLE IF EXISTS `asset`;
CREATE TABLE `asset`  (
  `id` bigint NOT NULL,
  `balance` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '账户余额',
  `ceiling` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '透支额度',
  `ceiled` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '已透支额度',
  `loanamount` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '贷款金额',
  `ins_user` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '登录者信息',
  `ins_dt` timestamp NULL DEFAULT NULL COMMENT '登录时间',
  `upd_user` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '更新者信息',
  `upd_dt` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of asset
-- ----------------------------

-- ----------------------------
-- Table structure for asset_history
-- ----------------------------
DROP TABLE IF EXISTS `asset_history`;
CREATE TABLE `asset_history`  (
  `history_seq` bigint NOT NULL,
  `history_insdt` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `id` bigint NOT NULL,
  `balance` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '账户余额',
  `ceiling` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '透支额度',
  `ceiled` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '已透支额度',
  `loanamount` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '贷款金额',
  `ins_user` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '登录者信息',
  `ins_dt` timestamp NULL DEFAULT NULL COMMENT '登录时间',
  `upd_user` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '更新者信息',
  `upd_dt` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`history_seq`, `id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of asset_history
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;

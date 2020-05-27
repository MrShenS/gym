/*
 Navicat Premium Data Transfer

 Source Server         : shenzhen
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : gym_ms

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 27/05/2020 12:08:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for activity
-- ----------------------------
DROP TABLE IF EXISTS `activity`;
CREATE TABLE `activity`  (
  `activity_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '活动编号',
  `activity_name` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '活动名称',
  `activity_description` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '活动描述',
  `activity_user` varchar(72) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '活动负责人',
  `activity_residueTime` int(11) NULL DEFAULT NULL COMMENT '活动剩余时间',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `activity_status` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '活动状态',
  PRIMARY KEY (`activity_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '活动策划表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of activity
-- ----------------------------
INSERT INTO `activity` VALUES (1, '推出学生卡活动', '这是神魔活动', '15024829030', 36, '2020-03-11 05:42:45', '2020-03-14 16:48:35', 'false');
INSERT INTO `activity` VALUES (2, '办健身卡送豆油', '31234213123', 'shenzhen', 0, '2020-03-11 05:44:17', '2020-03-14 16:49:07', 'true');
INSERT INTO `activity` VALUES (3, '蛋白粉半价', '123123', 'shenzhen', 12, '2020-03-11 05:45:45', '2020-03-14 16:49:26', 'true');
INSERT INTO `activity` VALUES (4, '招聘健身教练', '1323qwdasds', 'shenzhen', 123, '2020-03-11 05:46:46', '2020-03-14 16:50:00', 'false');
INSERT INTO `activity` VALUES (5, '年卡800元', '哈哈', '15024829030', 233, '2020-03-11 05:49:23', '2020-03-14 16:50:17', 'false');
INSERT INTO `activity` VALUES (6, '月卡200元', '123123', '15024829030', 123123, '2020-03-11 05:55:47', '2020-03-14 16:50:29', 'true');
INSERT INTO `activity` VALUES (7, '健身打卡正式启动', '救济断粮 坚持吧 兄弟', 'shenzhen', 10000, '2020-03-11 06:10:35', '2020-03-14 19:17:08', 'true');
INSERT INTO `activity` VALUES (8, '健身标兵', '来吧  一起健身 锻炼强健的肌肉', 'shenxiaoxiao1', 100, '2020-03-14 10:40:24', '2020-03-14 10:40:24', 'false');

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '类目名字',
  `category_type` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '类目编号',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`category_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (2, '有氧健身器械', 'facilities', '2020-03-13 09:37:48', '2020-03-13 09:37:48');
INSERT INTO `category` VALUES (3, '无氧健身器械', 'facilities', '2020-03-13 09:38:00', '2020-03-13 09:38:00');
INSERT INTO `category` VALUES (4, '健身消耗品', 'product', '2020-03-13 09:39:01', '2020-03-13 09:39:01');
INSERT INTO `category` VALUES (5, '私教课程', 'product', '2020-03-13 09:39:18', '2020-03-13 09:39:18');
INSERT INTO `category` VALUES (6, '特殊器械', 'facilities', '2020-03-14 05:27:15', '2020-03-14 05:27:15');

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '客户名称',
  `customer_phone` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '客户电话',
  `customer_type` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '客户类型',
  `customer_residueTime` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '会员时间',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `birthday` date NULL DEFAULT NULL COMMENT '耶稣诞辰\r\n',
  `customer_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上帝的宫殿\r\n',
  `customer_description` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`customer_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '会员信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES (1, '申震', '15024829030', '顶梁柱', '978', '2020-03-16 02:05:21', '2020-03-16 02:05:21', '1998-08-13', '广东省广州市海珠区', '这是咱们公司的第一位 顶梁柱 大家鼓掌');
INSERT INTO `customer` VALUES (2, '张三', '15099988822', '顶梁柱', '-22', '2020-03-16 02:10:05', '2020-03-16 02:10:05', '2007-03-20', '湖南省长沙市岳麓区', '第二位顶梁柱');
INSERT INTO `customer` VALUES (4, '李四', '15099988822', '顶梁柱', '-22', '2020-03-16 02:11:41', '2020-03-16 02:11:41', '2007-03-22', '湖南省长沙市岳麓区', '康定任务');
INSERT INTO `customer` VALUES (5, '王五', '1999088023', '顶梁柱', '208', '2020-03-16 02:16:19', '2020-03-16 02:16:19', '2020-03-17', '广东省东莞市长安镇', 'gogogo  冲冲冲');

-- ----------------------------
-- Table structure for earning
-- ----------------------------
DROP TABLE IF EXISTS `earning`;
CREATE TABLE `earning`  (
  `earning_id` int(11) NOT NULL COMMENT '主键',
  `earning_source` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收入来源',
  `earning_description` int(11) NOT NULL COMMENT '收入描述',
  `earning_money` double NULL DEFAULT NULL COMMENT '收入金额',
  `earning_user` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负责人',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`earning_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '财务报表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `employee_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工号',
  `employee_name` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工名称',
  `employee_password` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工密码',
  `employee_post` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '员工职位',
  `CREATE_TIME` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `salary` double NOT NULL COMMENT '薪水',
  `employee_relname` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '薪水',
  `employee_phone` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话号',
  `employee_email` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `employee_address` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`employee_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '员工信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (1, 'admin', '123123', '', '2020-03-09 04:59:16', '2020-05-23 05:56:03', 0, '申震', '15024829030', '18947249331@189.cn', '内蒙古乌兰浩特');
INSERT INTO `employee` VALUES (18, 'shenzhen', 'shenzhen', '', '2020-03-10 03:03:15', '2020-03-10 03:03:15', 1000, 'zhen shen', '152223909012', '无', '内蒙古乌兰浩特');
INSERT INTO `employee` VALUES (22, 'shenxiaoxiao1', 'shenzhen', '', '2020-03-12 02:20:18', '2020-05-22 23:26:15', 0, 'zhen shen', '15024829030', 'shenzhen@qq.com', '上海');
INSERT INTO `employee` VALUES (24, '新人', 'sinren', '', '2020-03-18 10:17:39', '2020-03-18 10:17:39', 0, '213123123', '19023123', '123123', '内蒙古');

-- ----------------------------
-- Table structure for facilities
-- ----------------------------
DROP TABLE IF EXISTS `facilities`;
CREATE TABLE `facilities`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `facilities_name` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '设备名称',
  `number` int(11) NOT NULL COMMENT '设备数量',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `discription` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '器械描述',
  `facilities_Status` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '器械状态',
  `price` double NULL DEFAULT NULL COMMENT '器械价格',
  `facilities_type` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '器械类型\r\n\r\n',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '健身设备表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of facilities
-- ----------------------------
INSERT INTO `facilities` VALUES (5, '动感单车', 9, '2020-03-14 05:20:07', '2020-03-14 05:20:07', '动次打次动次打次', 'stop', 3000, '有氧健身器械');
INSERT INTO `facilities` VALUES (6, '跑步机二代', 8, '2020-03-14 08:23:47', '2020-03-14 08:23:47', '健康运动 加量也加价 物有所值', 'start', 5000, '有氧健身器械');
INSERT INTO `facilities` VALUES (7, '肱二头肌练习机', 8, '2020-03-15 02:39:21', '2020-03-15 02:39:21', '专门锻炼肱二头肌', 'start', 1500, '无氧健身器械');
INSERT INTO `facilities` VALUES (8, '腹肌辅助器', 13, '2020-03-15 02:40:28', '2020-03-15 02:40:28', '辅助练习腹肌', 'start', 1300, '无氧健身器械');
INSERT INTO `facilities` VALUES (9, '战绳', 20, '2020-03-15 02:41:24', '2020-03-15 02:41:24', '网红健身', 'start', 200, '特殊器械');
INSERT INTO `facilities` VALUES (10, '椭圆机', 9, '2020-03-15 02:43:31', '2020-03-15 02:43:31', '椭圆机可以成功地把手臂与腿部的运动有机结合起来，达到四肢协调、健美体线的目的', 'start', 800, '无氧健身器械');
INSERT INTO `facilities` VALUES (11, '蝴蝶机', 9, '2020-03-15 02:44:07', '2020-03-15 02:44:07', '蝴蝶机夹胸的好处是不会因手臂位置（position )的变化而变化。由于可采取桥式动作（挺胸收腹），使手把相触，故动作幅度可更大。', 'start', 1600, '无氧健身器械');
INSERT INTO `facilities` VALUES (12, '提踵器', 9, '2020-03-15 02:44:34', '2020-03-15 02:44:34', '提踵器目标锻炼部位：股三头肌，发展小腿的整体块头。', 'start', 1600, '无氧健身器械');
INSERT INTO `facilities` VALUES (13, '引体向上训练器', 9, '2020-03-15 02:45:04', '2020-03-15 02:45:04', '引体向上器一款实用的室内(indoor)健身器材，集合单杠、俯卧撑、仰卧起坐三大功能', 'start', 1660, '无氧健身器械');

-- ----------------------------
-- Table structure for fileinfo
-- ----------------------------
DROP TABLE IF EXISTS `fileinfo`;
CREATE TABLE `fileinfo`  (
  `file_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '文件编号',
  `file_name` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '文件标识 不允许重复',
  `file_address` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '文件地址 唯一',
  `file_description` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件描述 可有可无',
  PRIMARY KEY (`file_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '附件信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of fileinfo
-- ----------------------------
INSERT INTO `fileinfo` VALUES (1, '摩纳哥的黎明.jpg', 'D://Git/MrshenS/graduationProject/image/摩纳哥的黎明.jpg', NULL);
INSERT INTO `fileinfo` VALUES (2, '这是1.png', 'D://Git/MrshenS/graduationProject/image/这是1.png', NULL);
INSERT INTO `fileinfo` VALUES (3, '这是ss1.png', 'D://Git/MrshenS/graduationProject/image/这是ss1.png', NULL);
INSERT INTO `fileinfo` VALUES (4, '毕业论文-申震.doc', 'D://Git/MrshenS/graduationProject/image/毕业论文-申震.doc', NULL);
INSERT INTO `fileinfo` VALUES (5, '202004240906530766910.jpg', 'D://Git/MrshenS/graduationProject/image/202004240906530766910.jpg', NULL);
INSERT INTO `fileinfo` VALUES (6, '202004230217236867530.jpg', 'D://Git/MrshenS/graduationProject/image/202004230217236867530.jpg', NULL);

-- ----------------------------
-- Table structure for finance
-- ----------------------------
DROP TABLE IF EXISTS `finance`;
CREATE TABLE `finance`  (
  `finance_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '财务流水号',
  `finance_name` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '流水项',
  `finance_description` varchar(508) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '流水项描述',
  `finance_type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '流水类别',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `money` double NOT NULL COMMENT '流水金额',
  `finance_reclassify` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`finance_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '财务流水表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of finance
-- ----------------------------
INSERT INTO `finance` VALUES (1, '买跑步机', '买卖', 'disburse', '2020-05-22 05:15:29', 20000, '器材支出');
INSERT INTO `finance` VALUES (2, '买买买', '动次打次动次打次是真的嗨啊', 'disburse', '2020-05-21 05:20:13', 24000, '器材支出');
INSERT INTO `finance` VALUES (3, '动词打次特别爽', '加', 'income', '2020-05-22 05:58:28', 27000, '器材收入');
INSERT INTO `finance` VALUES (4, '跑步机申请', '加油', 'disburse', '2020-05-23 06:13:35', 4000, '器材支出');
INSERT INTO `finance` VALUES (5, '清空跑步机库存', '全部删除', 'income', '2020-05-23 05:18:31', 24000, '器材收入');
INSERT INTO `finance` VALUES (6, '升级产品', '产品升级必须 通过', 'disburse', '2020-05-22 08:23:47', 40000, '器材支出');
INSERT INTO `finance` VALUES (7, '肱二头肌练习必须', '肱二头肌需要', 'disburse', '2020-05-23 02:39:21', 12000, '器材支出');
INSERT INTO `finance` VALUES (8, '练习腹机器', '买买买', 'disburse', '2020-05-21 02:40:28', 16900, '器材支出');
INSERT INTO `finance` VALUES (9, '时代潮流', '买买买', 'disburse', '2020-05-22 02:41:24', 4000, '器材支出');
INSERT INTO `finance` VALUES (10, '刚需', '买买买', 'disburse', '2020-05-23 02:43:31', 7200, '器材支出');
INSERT INTO `finance` VALUES (11, '刚需', '买买买', 'disburse', '2020-03-19 02:44:07', 14400, '器材支出');
INSERT INTO `finance` VALUES (12, '刚需', '买买买', 'disburse', '2020-05-22 02:44:34', 14400, '器材支出');
INSERT INTO `finance` VALUES (13, '刚需', '买买买', 'disburse', '2020-03-15 02:45:04', 14940, '器材支出');
INSERT INTO `finance` VALUES (14, '买蛋白粉', '再买', 'disburse', '2020-03-15 08:49:05', 360000, '产品支出');
INSERT INTO `finance` VALUES (15, '购买健身粉', '是个老板 购买健身粉', 'income', '2020-05-22 08:53:30', 20000, '产品收入');
INSERT INTO `finance` VALUES (16, '购买健身粉', '老板又来的', 'income', '2020-05-23 06:59:49', 20000, '产品收入');
INSERT INTO `finance` VALUES (17, '购买健身粉', '真实个大主顾啊', 'income', '2020-05-22 09:01:47', 40000, '产品收入');
INSERT INTO `finance` VALUES (18, '购买健身粉', '是个新人 来买的', 'income', '2020-05-21 09:04:41', 72000, '产品收入');
INSERT INTO `finance` VALUES (19, '购买健身粉', '来买的', 'income', '2020-05-22 09:04:41', 72000, '产品收入');
INSERT INTO `finance` VALUES (20, '购买健身粉', '买', 'income', '2020-05-22 06:04:41', 72000, '产品收入');
INSERT INTO `finance` VALUES (21, '购买握力器', '锻炼握力', 'disburse', '2020-05-22 05:57:53', 9000, '产品支出');
INSERT INTO `finance` VALUES (22, '购买臂力器', '必须产品', 'disburse', '2020-05-22 23:37:17', 720, '产品支出');
INSERT INTO `finance` VALUES (23, '清空臂力器库存', '全部删除', 'income', '2020-05-22 23:40:15', 720, '产品收入');
INSERT INTO `finance` VALUES (24, '购买', '热销产品', 'disburse', '2020-05-22 23:43:20', 160000, '产品支出');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '上产名称',
  `product_type` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `number` int(11) NOT NULL COMMENT '商品数量',
  `price` double NOT NULL COMMENT '商品价格',
  `discription` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品描述',
  `product_status` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品状态',
  PRIMARY KEY (`product_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (1, '蛋白粉', '健身消耗品', '2020-03-15 06:03:35', '2020-03-15 06:03:35', 1400, 200, '增肌必备', 'start');
INSERT INTO `product` VALUES (2, '动感单车', '私教课程', '2020-03-15 06:08:02', '2020-03-15 06:08:02', 20000, 200, '无敌瘦身 坚持就是胜利', 'start');
INSERT INTO `product` VALUES (3, '握力器', '健身消耗品', '2020-03-21 05:57:53', '2020-03-21 05:57:53', 100, 90, '锻炼握力', 'start');
INSERT INTO `product` VALUES (5, '臂力器', '健身消耗品', '2020-05-22 23:43:15', '2020-05-22 23:43:15', 4000, 40, '健身必备', 'stop');

-- ----------------------------
-- Table structure for product_category
-- ----------------------------
DROP TABLE IF EXISTS `product_category`;
CREATE TABLE `product_category`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品信息和种类关系主键',
  `produce_id` int(11) NOT NULL COMMENT '商品ID',
  `category_id` int(11) NOT NULL COMMENT '种类ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品种类关系表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product_customer
-- ----------------------------
DROP TABLE IF EXISTS `product_customer`;
CREATE TABLE `product_customer`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品和会员关系主键',
  `produce_id` int(11) NOT NULL COMMENT '商品ID',
  `customer_id` int(11) NOT NULL COMMENT '会员ID',
  `number` int(33) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品会员关系表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_customer
-- ----------------------------
INSERT INTO `product_customer` VALUES (1, 1, 1, 20);
INSERT INTO `product_customer` VALUES (2, 2, 1, 1);
INSERT INTO `product_customer` VALUES (3, 1, 3, 10);

SET FOREIGN_KEY_CHECKS = 1;

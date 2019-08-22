/*
Navicat MySQL Data Transfer

Source Server         : zk
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : kc

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-08-22 16:28:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for business_info
-- ----------------------------
DROP TABLE IF EXISTS `business_info`;
CREATE TABLE `business_info` (
  `businessId` bigint(20) NOT NULL,
  `businessName` varchar(128) NOT NULL COMMENT '企业名字',
  `charge` varchar(128) NOT NULL COMMENT '主管',
  `description` varchar(500) DEFAULT NULL COMMENT '企业描述',
  `adderss` varchar(200) NOT NULL COMMENT '园区地址',
  `loginUrl` varchar(300) DEFAULT NULL COMMENT '登陆网址',
  PRIMARY KEY (`businessId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of business_info
-- ----------------------------

-- ----------------------------
-- Table structure for dept_info
-- ----------------------------
DROP TABLE IF EXISTS `dept_info`;
CREATE TABLE `dept_info` (
  `deptId` bigint(20) NOT NULL,
  `deptName` varchar(300) NOT NULL,
  `parentId` bigint(20) NOT NULL COMMENT '父节点',
  `orderNumber` bigint(20) DEFAULT NULL COMMENT '排序',
  `businessId` bigint(20) NOT NULL COMMENT '企业主键',
  PRIMARY KEY (`deptId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept_info
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleId` bigint(20) NOT NULL,
  `roleName` varchar(100) NOT NULL,
  `remark` varchar(100) DEFAULT NULL,
  `createTime` datetime NOT NULL,
  `modifyTime` datetime DEFAULT NULL,
  `businessId` bigint(20) NOT NULL,
  PRIMARY KEY (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for t_visitor_res_info
-- ----------------------------
DROP TABLE IF EXISTS `t_visitor_res_info`;
CREATE TABLE `t_visitor_res_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `v_name` varchar(255) NOT NULL COMMENT '访客姓名',
  `v_phone` varchar(255) NOT NULL COMMENT '联系电话',
  `v_dw` varchar(255) DEFAULT NULL COMMENT '访客单位',
  `v_certificateNumber` varchar(255) NOT NULL,
  `v_reason` varchar(255) NOT NULL,
  `v_time` datetime NOT NULL,
  `v_lvTime` datetime NOT NULL,
  `faceFile` varchar(255) NOT NULL,
  `channelCodes` varchar(255) NOT NULL,
  `cardNumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_visitor_res_info
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` bigint(20) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) NOT NULL,
  `password` varchar(128) NOT NULL,
  `email` varchar(128) DEFAULT NULL,
  `mibile` varchar(50) DEFAULT NULL,
  `status` char(1) NOT NULL,
  `crateTime` datetime NOT NULL,
  `modifyTime` datetime DEFAULT NULL,
  `lastLoginTime` datetime DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `deptId` bigint(20) DEFAULT NULL,
  `businessId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `userId` bigint(20) NOT NULL,
  `roleId` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------

-- ----------------------------
-- Table structure for visitor_info
-- ----------------------------
DROP TABLE IF EXISTS `visitor_info`;
CREATE TABLE `visitor_info` (
  `visitorId` bigint(20) NOT NULL,
  `visitorName` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `idcard` varchar(200) DEFAULT NULL,
  `image` varchar(200) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`visitorId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of visitor_info
-- ----------------------------

-- ----------------------------
-- Table structure for v_record
-- ----------------------------
DROP TABLE IF EXISTS `v_record`;
CREATE TABLE `v_record` (
  `recordid` bigint(20) NOT NULL AUTO_INCREMENT,
  `id` bigint(20) DEFAULT NULL,
  `cardNumber` varchar(255) NOT NULL,
  `cardStatus` int(11) DEFAULT NULL,
  `channelCode` varchar(255) DEFAULT NULL,
  `channelName` varchar(255) DEFAULT NULL,
  `deptName` varchar(255) DEFAULT NULL,
  `deviceCode` varchar(255) DEFAULT NULL,
  `deviceName` varchar(255) DEFAULT NULL,
  `enterOrExit` int(11) DEFAULT NULL,
  `openResult` int(11) DEFAULT NULL,
  `openType` int(11) DEFAULT NULL,
  `paperNumber` varchar(255) DEFAULT NULL,
  `personCode` varchar(255) DEFAULT NULL,
  `personId` bigint(20) DEFAULT NULL,
  `personName` varchar(255) DEFAULT NULL,
  `swingTime` datetime DEFAULT NULL,
  `recordImageName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`recordid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of v_record
-- ----------------------------
INSERT INTO `v_record` VALUES ('1', '1', '12321321', '0', '123123123', '测试通道名称', '测试部门1', '12312321321', '测试设备1', '1', '1', '1', '12345678909', '0000000012', null, '测试人员', '2018-01-04 07:42:26', '12321321_20190808511214');
INSERT INTO `v_record` VALUES ('2', '1', '12321321', '0', '123123123', '测试通道名称', '测试部门1', '12312321321', '测试设备1', '1', '1', '1', '12345678909', '0000000012', null, '测试人员', '2018-01-04 07:42:26', '12321321_20190808181353');
INSERT INTO `v_record` VALUES ('3', '1', '12321321', '0', '123123123', '测试通道名称', '测试部门1', '12312321321', '测试设备1', '1', '1', '1', '12345678909', '0000000012', null, '测试人员', '2018-01-04 07:42:26', '12321321_20190808281308');
INSERT INTO `v_record` VALUES ('4', '1', '12321321', '0', '123123123', '测试通道名称', '测试部门1', '12312321321', '测试设备1', '1', '1', '1', '12345678909', '0000000012', null, '测试人员', '2018-01-04 07:42:26', '12321321_20190808521517');
INSERT INTO `v_record` VALUES ('5', '1', '12321321', '0', '123123123', '测试通道名称', '测试部门1', '12312321321', '测试设备1', '1', '1', '1', '12345678909', '0000000012', null, '测试人员', '2018-01-04 07:42:26', '12321321_20190808551542');
INSERT INTO `v_record` VALUES ('6', '1', '12321321', '0', '123123123', '测试通道名称', '测试部门1', '12312321321', '测试设备1', '1', '1', '1', '12345678909', '0000000012', null, '测试人员', '2018-01-04 07:42:26', '12321321_20190808361622');
INSERT INTO `v_record` VALUES ('7', '1', '12321321', '0', '123123123', '测试通道名称', '测试部门1', '12312321321', '测试设备1', '1', '1', '1', '12345678909', '0000000012', null, '测试人员', '2018-01-04 07:42:26', '12321321_20190808481637');
INSERT INTO `v_record` VALUES ('8', '1', '12321321', '0', '123123123', '测试通道名称', '测试部门1', '12312321321', '测试设备1', '1', '1', '1', '12345678909', '0000000012', null, '测试人员', '2018-01-04 07:42:26', '12321321_20190808541647');
INSERT INTO `v_record` VALUES ('9', '1', '12321321', '0', '123123123', '测试通道名称', '测试部门1', '12312321321', '测试设备1', '1', '1', '1', '12345678909', '0000000012', null, '测试人员', '2018-01-04 07:42:26', '12321321_20190808551632');
INSERT INTO `v_record` VALUES ('10', '1', '12321321', '0', '123123123', '测试通道名称', '测试部门1', '12312321321', '测试设备1', '1', '1', '1', '12345678909', '0000000012', null, '测试人员', '2018-01-04 07:42:26', '12321321_20190808561619');
INSERT INTO `v_record` VALUES ('11', '1', '12321321', '0', '123123123', '测试通道名称', '测试部门1', '12312321321', '测试设备1', '1', '1', '1', '12345678909', '0000000012', null, '测试人员', '2018-01-04 07:42:26', '12321321_20190808571658');
INSERT INTO `v_record` VALUES ('12', '1', '12321321', '0', '123123123', '测试通道名称', '测试部门1', '12312321321', '测试设备1', '1', '1', '1', '12345678909', '0000000012', null, '测试人员', '2018-01-04 07:42:26', '12321321_20190808381748');
INSERT INTO `v_record` VALUES ('13', '1', '12321321', '0', '123123123', '测试通道名称', '测试部门1', '12312321321', '测试设备1', '1', '1', '1', '12345678909', '0000000012', null, '测试人员', '2018-01-04 07:42:26', '12321321_20190808531754');
INSERT INTO `v_record` VALUES ('14', '1', '12321321', '0', '123123123', '测试通道名称', '测试部门1', '12312321321', '测试设备1', '1', '1', '1', '12345678909', '0000000012', null, '测试人员', '2018-01-04 07:42:26', '12321321_20190808551748');
INSERT INTO `v_record` VALUES ('15', '1', '12321321', '0', '123123123', '测试通道名称', '测试部门1', '12312321321', '测试设备1', '1', '1', '1', '12345678909', '0000000012', null, '测试人员', '2018-01-04 07:42:26', '12321321_20190811541449');
INSERT INTO `v_record` VALUES ('16', '1', '12321321', '0', '123123123', '测试通道名称', '测试部门1', '12312321321', '测试设备1', '1', '1', '1', '12345678909', '0000000012', null, '测试人员', '2018-01-04 07:42:26', '12321321_20190811581403');
INSERT INTO `v_record` VALUES ('17', null, '47B2A749', '0', '1000002$7$0$0', '?????????_??1', null, '1000002', '?????????', '1', '1', '61', null, '12028905', null, 'zhangsan', '2019-08-15 09:30:20', '47B2A749_20190815301726');

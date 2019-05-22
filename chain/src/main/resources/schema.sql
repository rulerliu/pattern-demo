CREATE TABLE `gateway_handler` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `handler_name` varchar(32) DEFAULT NULL COMMENT 'handler名称',
  `handler_id` varchar(32) DEFAULT NULL COMMENT 'handler主键id',
  `prev_handler_id` varchar(32) DEFAULT NULL,
  `next_handler_id` varchar(32) DEFAULT NULL COMMENT '下一个handler',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of gateway_handler
-- ----------------------------
INSERT INTO `gateway_handler`(handler_name, handler_id, prev_handler_id, next_handler_id) VALUES ('Api接口限流', 'currentLimitHandler', null, 'blacklistHandler');
INSERT INTO `gateway_handler`(handler_name, handler_id, prev_handler_id, next_handler_id) VALUES ('黑名单拦截', 'blacklistHandler', 'currentLimitHandler', 'conversationHandler');
INSERT INTO `gateway_handler`(handler_name, handler_id, prev_handler_id, next_handler_id) VALUES ('会话验证', 'conversationHandler', 'blacklistHandler', null);
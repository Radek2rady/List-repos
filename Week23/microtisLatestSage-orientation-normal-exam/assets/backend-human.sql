SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for human
-- ----------------------------
DROP TABLE IF EXISTS `human`;
CREATE TABLE `human` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `location` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of human
-- ----------------------------
BEGIN;
INSERT INTO `human` VALUES (1, 'John', 'Doe', 30, 'male', 'Hungary');
INSERT INTO `human` VALUES (2, 'Jane', 'Doe', 25, 'female', 'Hungary');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

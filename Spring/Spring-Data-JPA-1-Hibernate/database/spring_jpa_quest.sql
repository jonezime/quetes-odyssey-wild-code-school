CREATE DATABASE  IF NOT EXISTS `spring_jpa_quest` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `spring_jpa_quest`;
DROP TABLE IF EXISTS `school`;
DROP TABLE IF EXISTS `wizard`;

CREATE USER 'h4rryp0tt3r'@'localhost' IDENTIFIED BY 'Horcrux4life!';
GRANT ALL PRIVILEGES ON spring_jpa_quest.* TO 'h4rryp0tt3r'@'localhost';
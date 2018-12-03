-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.1.30-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.5.0.5278
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para campeonato
CREATE DATABASE IF NOT EXISTS `campeonato` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `campeonato`;

-- Volcando estructura para tabla campeonato.arbitro
CREATE TABLE IF NOT EXISTS `arbitro` (
  `id_arbitro` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) NOT NULL DEFAULT '0',
  `apellido_paterno` varchar(50) NOT NULL DEFAULT '0',
  `apellido_materno` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_arbitro`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla campeonato.arbitro: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `arbitro` DISABLE KEYS */;
/*!40000 ALTER TABLE `arbitro` ENABLE KEYS */;

-- Volcando estructura para tabla campeonato.equipo
CREATE TABLE IF NOT EXISTS `equipo` (
  `id_equipo` varchar(50) NOT NULL,
  `Nombre_equipo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_equipo`),
  KEY `Nombre_equipo` (`Nombre_equipo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla campeonato.equipo: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `equipo` DISABLE KEYS */;
INSERT INTO `equipo` (`id_equipo`, `Nombre_equipo`) VALUES
	('1', 'Chicharito FC'),
	('4', 'Inter'),
	('2', 'Manchester City'),
	('3', 'Real Madrid'),
	('5', 'Valencia FC');
/*!40000 ALTER TABLE `equipo` ENABLE KEYS */;

-- Volcando estructura para tabla campeonato.jugadores
CREATE TABLE IF NOT EXISTS `jugadores` (
  `id_jugador` varchar(50) NOT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido_Paterno` varchar(50) DEFAULT NULL,
  `Apellido_Materno` varchar(50) DEFAULT NULL,
  `Numero_camiseta` varchar(50) DEFAULT NULL,
  `cod_equipo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_jugador`),
  KEY `cod_equipo` (`cod_equipo`),
  CONSTRAINT `FK_jugadores_equipo` FOREIGN KEY (`cod_equipo`) REFERENCES `equipo` (`id_equipo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla campeonato.jugadores: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `jugadores` DISABLE KEYS */;
INSERT INTO `jugadores` (`id_jugador`, `Nombre`, `Apellido_Paterno`, `Apellido_Materno`, `Numero_camiseta`, `cod_equipo`) VALUES
	('101', 'Pedro', 'Carpio', 'Montenegro', '4', NULL);
/*!40000 ALTER TABLE `jugadores` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

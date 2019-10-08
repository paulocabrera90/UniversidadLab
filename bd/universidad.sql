-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 08-10-2019 a las 13:21:28
-- Versión del servidor: 5.7.23
-- Versión de PHP: 5.6.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `universidad`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

DROP TABLE IF EXISTS `alumno`;
CREATE TABLE IF NOT EXISTS `alumno` (
  `alm_id` int(20) NOT NULL AUTO_INCREMENT,
  `alm_nombre` varchar(50) COLLATE utf8_bin NOT NULL,
  `alm_apellido` varchar(50) COLLATE utf8_bin NOT NULL,
  `alm_dni` int(8) NOT NULL,
  `alm_domicilio` varchar(100) COLLATE utf8_bin NOT NULL,
  `alm_egb` int(11) DEFAULT NULL,
  PRIMARY KEY (`alm_id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`alm_id`, `alm_nombre`, `alm_apellido`, `alm_dni`, `alm_domicilio`, `alm_egb`) VALUES
(1, 'kevin', 'Navarro', 3822144, 'Barrio N C° 22', 2),
(2, 'Gonzalo', 'Caberera', 38111144, 'Barrio N C° 22', 3),
(3, 'Pauo', 'Nav', 3822123, 'Barri22', 1),
(4, 'Gonzalo', 'Caberera', 38111144, 'Barrio N C° 22', 3),
(5, 'Pauo', 'Nav', 3822123, 'Barri22', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cursada`
--

DROP TABLE IF EXISTS `cursada`;
CREATE TABLE IF NOT EXISTS `cursada` (
  `cur_id` int(11) NOT NULL AUTO_INCREMENT,
  `alm_id` int(11) NOT NULL,
  `mat_id` int(11) NOT NULL,
  `nota` double NOT NULL,
  KEY `cur_id` (`cur_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

DROP TABLE IF EXISTS `materia`;
CREATE TABLE IF NOT EXISTS `materia` (
  `mat_id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) COLLATE utf8_bin NOT NULL,
  `pro_id` int(11) NOT NULL,
  PRIMARY KEY (`mat_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`mat_id`, `nombre`, `pro_id`) VALUES
(1, 'Matematica', 1),
(2, 'Lengua', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

DROP TABLE IF EXISTS `profesor`;
CREATE TABLE IF NOT EXISTS `profesor` (
  `pro_id` int(11) NOT NULL AUTO_INCREMENT,
  `pro_matricula` varchar(150) COLLATE utf8_bin NOT NULL,
  `pro_titulo` varchar(150) COLLATE utf8_bin NOT NULL,
  `pro_nombre` varchar(150) COLLATE utf8_bin NOT NULL,
  `pro_apellido` varchar(150) COLLATE utf8_bin NOT NULL,
  `pro_domicilio` varchar(150) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`pro_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`pro_id`, `pro_matricula`, `pro_titulo`, `pro_nombre`, `pro_apellido`, `pro_domicilio`) VALUES
(1, '1234', 'lic Matematica', 'Aristide', 'Dasso', 'Barrio N C° 22'),
(2, '1234', 'lic Fisica', 'Rene', 'Castro', 'Barrio N C° 22');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

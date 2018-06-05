-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mar. 05 juin 2018 à 10:43
-- Version du serveur :  5.7.21
-- Version de PHP :  5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `lorann`
--

DELIMITER $$
--
-- Procédures
--
DROP PROCEDURE IF EXISTS `pickMap`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `pickMap` (IN `n` INT)  BEGIN
 	SELECT contenu 
	FROM niveau
	WHERE ID_Niveau = n;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `niveau`
--

DROP TABLE IF EXISTS `niveau`;
CREATE TABLE IF NOT EXISTS `niveau` (
  `ID_Niveau` int(20) NOT NULL AUTO_INCREMENT,
  `contenu` text NOT NULL,
  PRIMARY KEY (`ID_Niveau`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `niveau`
--

INSERT INTO `niveau` (`ID_Niveau`, `contenu`) VALUES
(1, 'O------O---O-------O;Ie1eeeQIe1eIe1eeeeeI;IeeDe1eIeeeeeeeDeeeI;IeeeeeeIeeeIeeeeee1I;Ie1e---OeeeOe------I;Ieee1eeee@eeeeeeeeeI;Ie--O--O-e-O--O-ee-I;IeeeeeeeeeeIeeeeeeeI;Ieee1eeOeeeOeeeYeeeI;IeeeeeeIeeeeeeeeee1I;IeeDeeeIeeeIeeeDeeeI;Ieeee1eIe1eIe1eeeeeI;O------O---O-------O;\r'),
(2, 'O------------------O;Ie1eeeeee@eeeeeee1eI;I-ee--e----ee-D-ee-I;I-ee--1--1eeeeeeee-O;I-ee-----------ee1-I;I-eeeeeeeee-eeeeeeeI;I--e1e---ee-eDee--1I;I--------ee-eeeee1-O;I1eeeeeeeee-----ee-I;Iee-e1---1eeeeD-eQ-I;Iee----------------I;I1eeeeeeeeeee1eeeeYI;O------------------O;\r'),
(3, 'O-----O--------O--Oe;IeeeeeOe1e1e1eOOeeIO;Ie@eeeOOeeeeeOOeeeIO;IeeeeeeOOeeDeOeeeeIO;IeeeOOeeOOeeOOeeeeIO;IeOOOeeee+eOOeeeeeIO;OOOeeeDe+Q+eDeeOO1IO;Iee1eeeOe+eeeeeeOOIO;Ie1eeOOOeeDeeOOeeOOO;I1eeOOeeeeeeeeOOeeeO;O---O----------OOeYO;eOOOOOOOOOOOOOOOOOOO;--------------------;\r'),
(4, 'eeO--O-----------Oee;eOOeeOeeeeeeeeeeeOOe;OO@eeeeO1O1O1O1Oe1OO;IeeOOOeO-O-O-O-OOeeI;IeeOIIeeeeeee0eIeeeI;IeeeIO-OeO---OeIOeeI;IeeOIIeeeO-OeeeIeeeI;IeeeOOeeeO-OeeYIOeeI;IeeO----O------OOeeI;OOeeO1O1O1O1O1OODQOO;eOOeeeeeeDeeDeeDeOOe;eeO--------------Oee;OOOOOOOOOOOOOOOOOOOO;\r'),
(5, 'eeeeeeeeeeeeeeeeeeee;eO-----OOeeeeeeeeeee;O+eeeeeQO--Oeeeeeeee;IeO---Oeee1O--Oeeeee;IDeeeeeeeOeee1O--Oee;IeO--OeOeeeOeeee1O-O;IDeeeeeeeOeIeee@ee1I;IeO--OeOeeeOeeee1O-O;IDeeeeeeeOeee1O--Oee;IeO---Oeee1O--Oeeeee;OYeeeee1O--Oeeeeeeee;eO-----OOeeeeeeeeeee;eeeeeeeeeeeeeeeeeeee;\r'),
(6, 'eeeeeeeeeeeeeeeeeeee;eO-OeO-OeOeOeO-Oeeee;eIeeeIeIeIOIeIeeeeee;eIeIeI-IeIeIeI-eeeee;eIeIeIeIeIeIeIeeeeee;eO-OeOeOeOeOeO-Oeeee;eeeeeeeeeeeeeeeeeeee;eeeeO-OeOeOeO-OeO-Oe;eeeeIeIeIeIeIeeeIeIe;eeeeIeIeIeIeI-eeO-Oe;eeeeIeIeIeIeIeeeIIee;eeeeD-OeeDee@-DeIeIe;eeeeeeeeeeeeeeeeeeee;\r'),
(7, 'eeeeeeeeeeeeeeeeeeee;eOeeeOee--eeIeeIeeee;eeOeOeeIeeIeIeeIeeee;eeeIeeeIDeIeIeeIeeee;eeeIeeeIeeIeIeeIeeee;eeeIeeee--eee--eeeee;eeeeeeeeeeeeeeeee@ee;eeeIeeeIee--eeIeeeIe;eeeIeeeIeIeeIeIIeeIe;eeeIeeeIeIDeIeIeIeIe;eeeIeIeIeIeeIeIeeIIe;eeee-e-eee--eeIeeeIe;eeeeeeeeeeeeeeeeeeee;');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 31, 2016 at 10:41 PM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `slovnik`
--
CREATE DATABASE IF NOT EXISTS `slovnik` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `slovnik`;

-- --------------------------------------------------------

--
-- Table structure for table `slovnicek`
--

CREATE TABLE IF NOT EXISTS `slovnicek` (
  `id` int(11) NOT NULL,
  `cs` varchar(50) CHARACTER SET utf8 COLLATE utf8_czech_ci NOT NULL,
  `en` varchar(50) CHARACTER SET utf8 COLLATE utf8_czech_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `slovnicek`
--

INSERT INTO `slovnicek` (`id`, `cs`, `en`) VALUES
(1, 'počítač', 'computer'),
(4, 'plamen', 'flame'),
(6, 'oheň', 'fire'),
(7, 'slovo', 'word'),
(9, 'stůl', 'table'),
(10, 'kniha', 'book'),
(11, 'ulice', 'street'),
(12, 'přidat', 'add'),
(13, 'vymazat', 'delete'),
(14, 'hledat', 'find'),
(16, 'cesta', 'road'),
(17, 'řidič', 'driver');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `slovnicek`
--
ALTER TABLE `slovnicek`
  ADD PRIMARY KEY (`id`), ADD KEY `slovnicek_cs_idx` (`cs`), ADD KEY `slovnicek_en_idx` (`en`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `slovnicek`
--
ALTER TABLE `slovnicek`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=20;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

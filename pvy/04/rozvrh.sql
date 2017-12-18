-- phpMyAdmin SQL Dump
-- version 3.2.2.1deb1
-- http://www.phpmyadmin.net
--
-- Počítač: localhost
-- Vygenerováno: Neděle 04. dubna 2010, 10:35
-- Verze MySQL: 5.1.37
-- Verze PHP: 5.2.10-2ubuntu6.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Databáze: `rozvrh`
--

-- --------------------------------------------------------

--
-- Struktura tabulky `obory`
--

CREATE TABLE IF NOT EXISTS `obory` (
  `zkratka_oboru` varchar(2) COLLATE utf8_unicode_ci NOT NULL,
  `nazev_oboru` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`zkratka_oboru`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Vypisuji data pro tabulku `obory`
--

INSERT INTO `obory` (`zkratka_oboru`, `nazev_oboru`) VALUES
('AD', 'Administrativa'),
('IC', 'Informační technologie'),
('SV', 'Strojí­renství'),
('UO', 'Umělecké obory');

-- --------------------------------------------------------

--
-- Struktura tabulky `osoby`
--

CREATE TABLE IF NOT EXISTS `osoby` (
  `rodne_cislo` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `titul` enum('Ing.','Mgr.','Bc.','RNDr.','PhDr.','MgA.') COLLATE utf8_unicode_ci DEFAULT NULL,
  `prijmeni` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `jmeno` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `obec` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ulice` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `psc` int(5) unsigned DEFAULT NULL,
  `fotka` mediumblob,
  `poznamka` text COLLATE utf8_unicode_ci,
  `nick` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `heslo` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`rodne_cislo`),
  KEY `prijmeni` (`prijmeni`),
  KEY `obec` (`obec`),
  KEY `nick` (`nick`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Vypisuji data pro tabulku `osoby`
--

INSERT INTO `osoby` (`rodne_cislo`, `titul`, `prijmeni`, `jmeno`, `obec`, `ulice`, `psc`, `fotka`, `poznamka`, `nick`, `heslo`, `email`) VALUES
('576019/3789', 'Mgr.', 'Frejová', 'Milada', 'Bolatice', 'Schillerova 13', 74723, NULL, 'Aprobace: český jazyk a dějepis', 'frejova', 'milada', 'milada.frejova@skola.cz'),
('650512/4325', 'Ing.', 'Pleva', 'Jindřich', 'Opava', 'Mezi trhy 22', 74601, NULL, 'Aprobace: elektrotechnika, fyzika', 'pleva', 'jindrich', 'jindrich.pleva@skola.cz'),
('720324/7878', 'Mgr.', 'Novák', 'Martin', 'Melč', 'Horní 187', 74784, NULL, 'Aprobace: tělesná výchova, občanská výchova', 'novak', 'martin', 'martin.novak@skola.cz'),
('750814/4445', 'Mgr.', 'Kalousek', 'Jan', 'Ostrava', 'Hornická 78', 70050, NULL, 'Aprobace: matematika, fyzika', 'kalousek', 'ucitel', 'kalousek@skola.cz'),
('795102/1672', 'Bc.', 'Bassová', 'Petra', 'Opava', 'Nádražní okruh 48', 74601, NULL, 'Aprobace: anglický jazyk', 'bassova', 'petra', 'petra.bassova@skola.cz'),
('810517/5224', 'RNDr.', 'Husník', 'Kamil', 'Otice', 'U potoka 201', 74781, NULL, 'Aprobace: hardware, počítačová grafika', 'husnik', 'kamil', 'kamil.husnik@skola.cz'),
('900802/4632', NULL, 'Klement', 'Jiří', 'Oldřišov', 'Kovářská 158', 74733, NULL, 'Hraje závodně šachy', 'klement', 'jiri', 'jiri.klement.it@skola.cz'),
('901222/3346', NULL, 'Packal', 'Michal', 'Litultovice', 'Hlavní 88', 74755, NULL, 'Reprezentuje školu ve fotbalu', 'packal', 'michal', 'michal.packal.it@skola.cz'),
('910723/3543', NULL, 'Horňák', 'Martin', 'Velká Polom', 'Ostravská 31', 74764, NULL, '', 'hornak', 'martin', 'martin.hornak.sv@skola.cz'),
('911030/6323', NULL, 'Sobota', 'Milan', 'Opava', 'Těšínská 199', 74601, NULL, '', 'sobota', 'milan', 'milan.sobota.it@skola.cz'),
('911105/3452', NULL, 'Sekyra', 'Dominik', 'Štěpánkovice', 'Mírová 210', 74728, NULL, '', 'sekyra', 'dominik', 'dominik.sekyra.uo@skola.cz'),
('911206/2074', NULL, 'Tluchoř', 'Jiří', 'Opava', 'Solná 19', 74601, NULL, 'Kvalitní počítačový grafik', 'tluchor', 'jiri', 'jiri.tluchor.sv@skola.cz'),
('916211/3435', NULL, 'Seidlová', 'Mariana', 'Hradec nad Moravicí', 'Opavská 53', 74741, NULL, '', 'seidlova', 'mariana', 'mariana.seidlova.uo@skola.cz'),
('920127/7812', NULL, 'Rybníček', 'Tomáš', 'Opava', 'Na Rybníčku 40', 74601, NULL, '', 'rybnicek', 'tomas', 'tomas.rybnicek.sv@skola.cz'),
('920403/2189', NULL, 'Kouzelník', 'Richard', 'Opava', 'Kolofíkovo nábřeží 13', 74601, NULL, 'Pozor - taháky vytahuje z rukávu!', 'kouzelnik', 'student', 'kouzelnik.richard@student.cz'),
('920930/7798', NULL, 'Hrubý', 'Radim', 'Děhylov', 'Polní 184', 74794, NULL, '', 'hruby', 'radim', 'radim.hruby.sv@skola.cz'),
('921226/7846', NULL, 'Lebeda', 'Romeo', 'Háj ve Slezsku', 'V Rybníkách 2', 74792, NULL, '', 'lebeda', 'romeo', 'romeo.lebeda.sv@skola.cz'),
('925412/0678', NULL, 'Pilná', 'Marta', 'Dolní Benešov', 'Hřbitovní 74', 74722, NULL, 'Vynikající studentka', 'pilna', 'marta', 'marta.pilna.uo@skola.cz'),
('925716/7347', NULL, 'Soudková', 'Jana', 'Opava', 'Dolní náměstí 3', 74601, NULL, 'Zdravotní problémy způsobené nadváhou', 'soudkova', 'jana', 'jana.soudkova@student.cz'),
('926108/7745', NULL, 'Rybářová', 'Barbora', 'Hradec nad Moravicí', 'Lesní 17', 74741, NULL, NULL, NULL, NULL, NULL),
('930218/3120', NULL, 'Troufal', 'Matěj', 'Štěpánkovice', 'Tulipánová 31', 74728, NULL, 'Smělý, někdy až drzý žák', 'troufal', 'matej', 'matej.troufal.it@skola.cz'),
('930430/1687', NULL, 'Sekyra', 'Miroslav', 'Štěpánkovice', 'Mírová 210', 74728, NULL, NULL, NULL, NULL, NULL),
('930712/7645', NULL, 'Vojíř', 'Roman', 'Háj ve Slezsku', 'Hlavní 93', 74792, NULL, 'Zajímá se o vojenskou techniku, prázdniny tráví v bunkrech', 'vojir', 'roman', 'roman.vojir.it@skola.cz'),
('930714/3456', NULL, 'Šperk', 'Jiří', 'Opava', 'Olomoucká 75', 74601, NULL, 'Žák velmi dbá o svůj vzhled, velký znalec parfémů', 'sperk', 'jiri', 'jiri.sperk.it@skola.cz'),
('930819/9785', NULL, 'Hilský', 'Zbyněk', 'Velké Heraltice', 'Jubilejní 28', 74775, NULL, '', 'hilsky', 'zbynek', 'zbynek.hilsky.it@skola.cz'),
('930821/0442', NULL, 'Světlý', 'Tomáš', 'Štítina', 'Stodolní 149', 74791, NULL, 'Divadelní ochotník, získal ocenění za roli němého Bobše', 'svetly', 'tomas', 'tomas.svetly.it@skola.cz'),
('930925/3863', NULL, 'Halámek', 'Michal', 'Opava', 'Olomoucká 34', 74601, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Struktura tabulky `predmety`
--

CREATE TABLE IF NOT EXISTS `predmety` (
  `zkratka` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `nazev` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`zkratka`),
  KEY `nazev` (`nazev`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Vypisuji data pro tabulku `predmety`
--

INSERT INTO `predmety` (`zkratka`, `nazev`) VALUES
('ANJ', 'Anglický jazyk'),
('CJL', 'Český jazyk a literatura'),
('DEJ', 'Dějepis'),
('ELE', 'Elektrotechnika'),
('FYZ', 'Fyzika'),
('MAT', 'Matematika'),
('OBV', 'Občanská výchova'),
('PGR', 'Počítačová grafika'),
('PRP', 'Programování'),
('PVY', 'Programové vybavení'),
('TVY', 'Technické vybavení'),
('TEV', 'Tělesná výchova');

-- --------------------------------------------------------

--
-- Struktura tabulky `studenti`
--

CREATE TABLE IF NOT EXISTS `studenti` (
  `osoby_rodne_cislo` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `absence` int(3) unsigned DEFAULT '0',
  `tridy_trida` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`osoby_rodne_cislo`),
  KEY `absence` (`absence`),
  KEY `fk_studenti_osoby` (`osoby_rodne_cislo`),
  KEY `fk_studenti_tridy1` (`tridy_trida`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Vypisuji data pro tabulku `studenti`
--

INSERT INTO `studenti` (`osoby_rodne_cislo`, `absence`, `tridy_trida`) VALUES
('900802/4632', 38, 'IT3'),
('901222/3346', 103, 'U3'),
('910723/3543', 57, 'IT3'),
('911030/6323', 89, 'IT3'),
('911105/3452', 101, 'IT3'),
('911206/2074', 0, 'IT3'),
('916211/3435', 78, 'U3'),
('920127/7812', 88, 'IT3'),
('920403/2189', 145, 'IT3'),
('920930/7798', 12, 'U3'),
('921226/7846', 40, 'IT2'),
('925412/0678', 120, 'U3'),
('925716/7347', 94, 'U3'),
('926108/7745', 0, 'U3'),
('930218/3120', 18, 'IT2'),
('930430/1687', 0, 'IT2'),
('930712/7645', 0, 'SV2A'),
('930714/3456', 7, 'IT2'),
('930819/9785', 51, 'IT2'),
('930821/0442', 43, 'SV2A'),
('930925/3863', 0, 'IT2');

-- --------------------------------------------------------

--
-- Struktura tabulky `tridy`
--

CREATE TABLE IF NOT EXISTS `tridy` (
  `trida` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `tridni_ucitel` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `obor` varchar(2) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`trida`),
  KEY `fk_tridy_ucitele1` (`tridni_ucitel`),
  KEY `fk_obor` (`obor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Vypisuji data pro tabulku `tridy`
--

INSERT INTO `tridy` (`trida`, `tridni_ucitel`, `obor`) VALUES
('IT2', '650512/4325', 'IC'),
('IT3', '750814/4445', 'IC'),
('SV2A', '810517/5224', 'SV'),
('U3', '576019/3789', 'UO');

-- --------------------------------------------------------

--
-- Struktura tabulky `ucebny`
--

CREATE TABLE IF NOT EXISTS `ucebny` (
  `cislo_ucebny` int(3) unsigned zerofill NOT NULL,
  `pocet_mist` int(2) unsigned DEFAULT NULL,
  PRIMARY KEY (`cislo_ucebny`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Vypisuji data pro tabulku `ucebny`
--

INSERT INTO `ucebny` (`cislo_ucebny`, `pocet_mist`) VALUES
(109, 25),
(207, 30),
(220, 30),
(301, 30),
(302, 16),
(303, 16);

-- --------------------------------------------------------

--
-- Struktura tabulky `ucitele`
--

CREATE TABLE IF NOT EXISTS `ucitele` (
  `osoby_rodne_cislo` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `plat` decimal(10,2) unsigned DEFAULT NULL,
  `funkce` set('ředitel','zástupce','výchovný poradce','předseda PK') COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`osoby_rodne_cislo`),
  KEY `plat` (`plat`),
  KEY `funkce` (`funkce`),
  KEY `fk_ucitele_osoby1` (`osoby_rodne_cislo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Vypisuji data pro tabulku `ucitele`
--

INSERT INTO `ucitele` (`osoby_rodne_cislo`, `plat`, `funkce`) VALUES
('576019/3789', '23500.00', 'předseda PK'),
('650512/4325', '20700.00', NULL),
('720324/7878', '27300.00', 'zástupce'),
('750814/4445', '21350.00', NULL),
('795102/1672', '21700.00', 'výchovný poradce'),
('810517/5224', '18900.00', NULL);

-- --------------------------------------------------------

--
-- Struktura tabulky `vyucovaci_hodiny`
--

CREATE TABLE IF NOT EXISTS `vyucovaci_hodiny` (
  `ucebna` int(3) unsigned zerofill NOT NULL,
  `predmet` int(11) NOT NULL,
  `den` enum('pondělí','úterý','středa','čtvrtek','pátek') COLLATE utf8_unicode_ci NOT NULL,
  `od` time NOT NULL,
  `do` time NOT NULL,
  UNIQUE KEY `ucebna` (`ucebna`,`den`,`od`),
  UNIQUE KEY `ucebna_2` (`ucebna`,`den`,`do`),
  KEY `fk_vyucovaci_hodiny_ucebny1` (`ucebna`),
  KEY `fk_vyucovaci_hodiny_vyucovane_predmety1` (`predmet`),
  KEY `den` (`den`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Vypisuji data pro tabulku `vyucovaci_hodiny`
--

INSERT INTO `vyucovaci_hodiny` (`ucebna`, `predmet`, `den`, `od`, `do`) VALUES
(109, 21, 'pondělí', '08:00:00', '08:45:00'),
(109, 22, 'pondělí', '08:50:00', '09:35:00'),
(109, 22, 'úterý', '09:45:00', '10:30:00'),
(109, 22, 'středa', '09:45:00', '10:30:00'),
(109, 22, 'čtvrtek', '10:50:00', '11:35:00'),
(109, 21, 'pátek', '10:50:00', '11:35:00'),
(207, 17, 'pondělí', '08:50:00', '09:35:00'),
(207, 18, 'úterý', '08:00:00', '08:45:00'),
(207, 17, 'úterý', '08:50:00', '09:35:00'),
(207, 17, 'středa', '09:45:00', '10:30:00'),
(207, 18, 'čtvrtek', '09:45:00', '10:30:00'),
(220, 18, 'pondělí', '09:45:00', '10:30:00'),
(220, 17, 'čtvrtek', '10:50:00', '11:35:00'),
(220, 18, 'pátek', '11:40:00', '12:25:00'),
(302, 28, 'pondělí', '10:50:00', '12:25:00'),
(302, 27, 'úterý', '10:50:00', '12:25:00'),
(303, 26, 'středa', '08:00:00', '09:30:00'),
(303, 25, 'čtvrtek', '08:00:00', '09:30:00');

-- --------------------------------------------------------

--
-- Struktura tabulky `vyucovane_predmety`
--

CREATE TABLE IF NOT EXISTS `vyucovane_predmety` (
  `idvyucovane_predmety` int(11) NOT NULL AUTO_INCREMENT,
  `trida` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `ucitel` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `predmet` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`idvyucovane_predmety`),
  UNIQUE KEY `trida` (`trida`,`ucitel`,`predmet`),
  KEY `fk_vyucovane_predmety_tridy1` (`trida`),
  KEY `fk_vyucovane_predmety_ucitele1` (`ucitel`),
  KEY `fk_vyucovane_predmety_predmety1` (`predmet`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=29 ;

--
-- Vypisuji data pro tabulku `vyucovane_predmety`
--

INSERT INTO `vyucovane_predmety` (`idvyucovane_predmety`, `trida`, `ucitel`, `predmet`) VALUES
(5, 'IT2', '576019/3789', 'CJL'),
(6, 'IT2', '650512/4325', 'ELE'),
(10, 'IT2', '650512/4325', 'FYZ'),
(12, 'IT2', '720324/7878', 'OBV'),
(11, 'IT2', '720324/7878', 'TEV'),
(17, 'IT2', '750814/4445', 'MAT'),
(21, 'IT2', '795102/1672', 'ANJ'),
(27, 'IT2', '810517/5224', 'PGR'),
(25, 'IT2', '810517/5224', 'TVY'),
(3, 'IT3', '576019/3789', 'CJL'),
(8, 'IT3', '650512/4325', 'ELE'),
(9, 'IT3', '650512/4325', 'FYZ'),
(15, 'IT3', '720324/7878', 'OBV'),
(16, 'IT3', '720324/7878', 'TEV'),
(18, 'IT3', '750814/4445', 'MAT'),
(22, 'IT3', '795102/1672', 'ANJ'),
(28, 'IT3', '810517/5224', 'PGR'),
(26, 'IT3', '810517/5224', 'TVY'),
(4, 'SV2A', '576019/3789', 'CJL'),
(7, 'SV2A', '650512/4325', 'FYZ'),
(14, 'SV2A', '720324/7878', 'TEV'),
(19, 'SV2A', '750814/4445', 'MAT'),
(23, 'SV2A', '795102/1672', 'ANJ'),
(1, 'U3', '576019/3789', 'CJL'),
(2, 'U3', '576019/3789', 'DEJ'),
(13, 'U3', '720324/7878', 'TEV'),
(20, 'U3', '750814/4445', 'MAT');

--
-- Omezení pro exportované tabulky
--

--
-- Omezení pro tabulku `studenti`
--
ALTER TABLE `studenti`
  ADD CONSTRAINT `fk_studenti_osoby` FOREIGN KEY (`osoby_rodne_cislo`) REFERENCES `osoby` (`rodne_cislo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_studenti_tridy1` FOREIGN KEY (`tridy_trida`) REFERENCES `tridy` (`trida`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Omezení pro tabulku `tridy`
--
ALTER TABLE `tridy`
  ADD CONSTRAINT `fk_tridy_ucitele1` FOREIGN KEY (`tridni_ucitel`) REFERENCES `ucitele` (`osoby_rodne_cislo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `tridy_ibfk_1` FOREIGN KEY (`obor`) REFERENCES `obory` (`zkratka_oboru`) ON UPDATE CASCADE;

--
-- Omezení pro tabulku `ucitele`
--
ALTER TABLE `ucitele`
  ADD CONSTRAINT `fk_ucitele_osoby1` FOREIGN KEY (`osoby_rodne_cislo`) REFERENCES `osoby` (`rodne_cislo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Omezení pro tabulku `vyucovaci_hodiny`
--
ALTER TABLE `vyucovaci_hodiny`
  ADD CONSTRAINT `fk_vyucovaci_hodiny_ucebny1` FOREIGN KEY (`ucebna`) REFERENCES `ucebny` (`cislo_ucebny`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_vyucovaci_hodiny_vyucovane_predmety1` FOREIGN KEY (`predmet`) REFERENCES `vyucovane_predmety` (`idvyucovane_predmety`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Omezení pro tabulku `vyucovane_predmety`
--
ALTER TABLE `vyucovane_predmety`
  ADD CONSTRAINT `fk_vyucovane_predmety_predmety1` FOREIGN KEY (`predmet`) REFERENCES `predmety` (`zkratka`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_vyucovane_predmety_tridy1` FOREIGN KEY (`trida`) REFERENCES `tridy` (`trida`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_vyucovane_predmety_ucitele1` FOREIGN KEY (`ucitel`) REFERENCES `ucitele` (`osoby_rodne_cislo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

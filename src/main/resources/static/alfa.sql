-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Creato il: Lug 18, 2024 alle 10:20
-- Versione del server: 10.4.21-MariaDB
-- Versione PHP: 7.4.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `alfa`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `fermate`
--

CREATE TABLE `fermate` (
  `idFermata` int(11) NOT NULL,
  `nomeFermata` varchar(30) NOT NULL,
  `tipoFermata` varchar(1) NOT NULL,
  `zonaFermata` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `fermate`
--

INSERT INTO `fermate` (`idFermata`, `nomeFermata`, `tipoFermata`, `zonaFermata`) VALUES
(1, 'bengasi', 'e', 'd'),
(2, 'carducci', 'u', 'c');

-- --------------------------------------------------------

--
-- Struttura della tabella `linee`
--

CREATE TABLE `linee` (
  `idLinea` int(11) NOT NULL,
  `nomeLinea` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `linee`
--

INSERT INTO `linee` (`idLinea`, `nomeLinea`) VALUES
(1, 'a18'),
(2, 'b68');

-- --------------------------------------------------------

--
-- Struttura della tabella `preventivi`
--

CREATE TABLE `preventivi` (
  `idPreventivo` int(11) NOT NULL,
  `nomeAzienda` varchar(50) NOT NULL,
  `nomePiano` varchar(50) NOT NULL,
  `maxFermateUrbane` int(11) NOT NULL,
  `maxFermateExtraUrbane` int(11) NOT NULL,
  `maxZone` int(11) NOT NULL,
  `prezzo` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `preventivi`
--

INSERT INTO `preventivi` (`idPreventivo`, `nomeAzienda`, `nomePiano`, `maxFermateUrbane`, `maxFermateExtraUrbane`, `maxZone`, `prezzo`) VALUES
(1, 'pippo srl', 'pippo plan easy', 5, 2, 3, 500),
(2, 'asdrubale srl', 'asdrubale full plan', 12, 5, 4, 1200);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `fermate`
--
ALTER TABLE `fermate`
  ADD PRIMARY KEY (`idFermata`);

--
-- Indici per le tabelle `linee`
--
ALTER TABLE `linee`
  ADD PRIMARY KEY (`idLinea`);

--
-- Indici per le tabelle `preventivi`
--
ALTER TABLE `preventivi`
  ADD PRIMARY KEY (`idPreventivo`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `fermate`
--
ALTER TABLE `fermate`
  MODIFY `idFermata` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT per la tabella `linee`
--
ALTER TABLE `linee`
  MODIFY `idLinea` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT per la tabella `preventivi`
--
ALTER TABLE `preventivi`
  MODIFY `idPreventivo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

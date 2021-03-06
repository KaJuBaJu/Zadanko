-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 24 Mar 2021, 22:32
-- Wersja serwera: 10.4.11-MariaDB
-- Wersja PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `staty`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `lebron`
--

CREATE TABLE `lebron` (
  `opponent` varchar(50) DEFAULT NULL,
  `minutes` int(11) DEFAULT NULL,
  `fg_madeattempted` varchar(10) DEFAULT NULL,
  `fg_percentage` varchar(100) DEFAULT NULL,
  `ft` varchar(10) DEFAULT NULL,
  `ftpercentage` varchar(100) DEFAULT NULL,
  `rebounds` int(11) DEFAULT NULL,
  `assists` int(11) DEFAULT NULL,
  `blocks` int(11) DEFAULT NULL,
  `steals` int(11) DEFAULT NULL,
  `fouls` int(11) DEFAULT NULL,
  `turnovers` int(11) DEFAULT NULL,
  `pointsscored` int(11) DEFAULT NULL,
  `added_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `lebron`
--

INSERT INTO `lebron` (`opponent`, `minutes`, `fg_madeattempted`, `fg_percentage`, `ft`, `ftpercentage`, `rebounds`, `assists`, `blocks`, `steals`, `fouls`, `turnovers`, `pointsscored`, `added_at`) VALUES
('Atlanta Hawks', 11, '3-6', '50.0', '3-3', '100.0', 1, 4, 0, 0, 0, 1, 10, '2021-03-24 22:30:34'),
('Charlotte Hornets', 37, '14-23', '60.9', '5-6', '83.3', 8, 6, 1, 1, 2, 3, 37, '2021-03-24 22:30:34'),
('Minnesota Timberwolves', 31, '8-14', '57.1', '5-5', '100.0', 12, 12, 1, 0, 0, 4, 25, '2021-03-24 22:30:34'),
('Golden State Warriors', 30, '8-13', '61.5', '4-6', '66.7', 10, 11, 0, 0, 3, 6, 22, '2021-03-24 22:30:34'),
('Indiana Pacers', 34, '5-13', '38.5', '7-11', '63.6', 3, 10, 0, 1, 4, 3, 18, '2021-03-24 22:30:34'),
('Phoenix Suns', 38, '16-24', '66.7', '3-5', '60.0', 5, 6, 1, 2, 1, 3, 38, '2021-03-24 22:30:34'),
('Golden State Warriors', 24, '7-12', '58.3', '2-4', '50.0', 6, 4, 2, 2, 2, 2, 19, '2021-03-24 22:30:34'),
('Portland Trail Blazers', 36, '11-21', '52.4', '4-8', '50.0', 11, 7, 3, 4, 1, 2, 28, '2021-03-24 22:30:34'),
('Utah Jazz', 28, '7-13', '53.8', '4-5', '80.0', 4, 4, 0, 1, 0, 4, 19, '2021-03-24 22:30:34'),
('Washington Wizards', 43, '14-29', '48.3', '1-3', '33.3', 9, 13, 0, 1, 2, 8, 31, '2021-03-24 22:30:34'),
('Miami Heat', 37, '7-21', '33.3', '4-4', '100.0', 9, 9, 1, 1, 3, 5, 19, '2021-03-24 22:30:34'),
('Brooklyn Nets', 33, '14-23', '60.9', '3-6', '50.0', 8, 7, 0, 0, 1, 3, 32, '2021-03-24 22:30:34'),
('Minnesota Timberwolves', 38, '13-20', '65.0', '3-4', '75.0', 13, 7, 1, 0, 1, 5, 30, '2021-03-24 22:30:34'),
('Denver Nuggets', 31, '9-18', '50.0', '4-7', '57.1', 10, 9, 1, 0, 2, 1, 22, '2021-03-24 22:30:34'),
('Memphis Grizzlies', 34, '9-15', '60.0', '9-14', '64.3', 9, 8, 0, 2, 2, 5, 28, '2021-03-24 22:30:34'),
('Oklahoma City Thunder', 41, '9-20', '45.0', '4-4', '100.0', 6, 7, 0, 2, 2, 5, 25, '2021-03-24 22:30:34'),
('Oklahoma City Thunder', 43, '11-22', '50.0', '4-5', '80.0', 14, 12, 2, 2, 3, 5, 28, '2021-03-24 22:30:34'),
('Detroit Pistons', 46, '13-26', '50.0', '4-6', '66.7', 5, 11, 0, 4, 3, 7, 33, '2021-03-24 22:30:34'),
('Denver Nuggets', 35, '12-19', '63.2', '1-2', '50.0', 10, 10, 1, 0, 1, 2, 27, '2021-03-24 22:30:34'),
('Atlanta Hawks', 38, '5-12', '41.7', '9-11', '81.8', 7, 9, 1, 2, 0, 2, 21, '2021-03-24 22:30:34'),
('Boston Celtics', 37, '7-17', '41.2', '3-5', '60.0', 7, 7, 1, 0, 3, 5, 21, '2021-03-24 22:30:34'),
('Detroit Pistons', 36, '8-19', '42.1', '2-3', '66.7', 7, 10, 0, 1, 2, 2, 22, '2021-03-24 22:30:34'),
('Philadelphia 76ers', 39, '12-22', '54.5', '8-11', '72.7', 6, 7, 0, 0, 3, 3, 34, '2021-03-24 22:30:34'),
('Cleveland Cavaliers', 38, '19-26', '73.1', '1-2', '50.0', 8, 6, 2, 2, 1, 3, 46, '2021-03-24 22:30:34'),
('Chicago Bulls', 29, '6-16', '37.5', '5-8', '62.5', 11, 6, 0, 2, 1, 6, 17, '2021-03-24 22:30:34'),
('Milwaukee Bucks', 38, '13-25', '52.0', '2-2', '100.0', 6, 8, 1, 1, 2, 3, 34, '2021-03-24 22:30:34'),
('Golden State Warriors', 38, '6-16', '37.5', '5-8', '62.5', 5, 5, 0, 1, 1, 5, 19, '2021-03-24 22:30:34'),
('New Orleans Pelicans', 31, '6-11', '54.5', '7-7', '100.0', 8, 11, 0, 1, 3, 3, 21, '2021-03-24 22:30:34'),
('Oklahoma City Thunder', 27, '9-20', '45.0', '3-4', '75.0', 6, 7, 0, 0, 2, 2, 26, '2021-03-24 22:30:34'),
('Houston Rockets', 29, '10-20', '50.0', '2-4', '50.0', 8, 5, 1, 0, 0, 5, 26, '2021-03-24 22:30:34'),
('Houston Rockets', 30, '7-15', '46.7', '3-6', '50.0', 7, 7, 1, 1, 2, 2, 18, '2021-03-24 22:30:34'),
('Chicago Bulls', 34, '11-21', '52.4', '6-8', '75.0', 7, 7, 0, 0, 1, 4, 28, '2021-03-24 22:30:34'),
('San Antonio Spurs', 35, '8-15', '53.3', '7-11', '63.6', 6, 12, 0, 0, 3, 4, 27, '2021-03-24 22:30:34'),
('Memphis Grizzlies', 34, '11-20', '55.0', '3-3', '100.0', 12, 7, 1, 1, 0, 6, 26, '2021-03-24 22:30:34'),
('Memphis Grizzlies', 32, '9-16', '56.3', '1-3', '33.3', 13, 8, 0, 1, 2, 2, 22, '2021-03-24 22:30:34'),
('San Antonio Spurs', 36, '8-22', '36.4', '7-7', '100.0', 11, 10, 0, 2, 0, 4, 26, '2021-03-24 22:30:34'),
('San Antonio Spurs', 35, '11-23', '47.8', '3-5', '60.0', 5, 8, 1, 1, 1, 2, 26, '2021-03-24 22:30:34'),
('Portland Trail Blazers', 36, '11-20', '55.0', '4-5', '80.0', 9, 6, 1, 2, 2, 3, 29, '2021-03-24 22:30:34'),
('Minnesota Timberwolves', 26, '6-13', '46.2', '5-7', '71.4', 9, 5, 0, 1, 1, 4, 18, '2021-03-24 22:30:34'),
('Dallas Mavericks', 31, '8-18', '44.4', '3-4', '75.0', 7, 10, 0, 1, 0, 4, 22, '2021-03-24 22:30:34'),
('LA Clippers', 28, '7-17', '41.2', '5-7', '71.4', 5, 5, 0, 0, 2, 4, 22, '2021-03-24 22:30:34'),
('Phoenix Suns', 25, '6-11', '54.5', '5-10', '50.0', 8, 4, 0, 1, 2, 8, 20, '2021-03-24 22:30:34'),
('Phoenix Suns', 15, '4-10', '40.0', '3-5', '60.0', 2, 2, 0, 1, 1, 3, 11, '2021-03-24 22:30:34');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

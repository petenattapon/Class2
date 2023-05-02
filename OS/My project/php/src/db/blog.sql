-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: db
-- Generation Time: Apr 28, 2023 at 04:46 PM
-- Server version: 8.0.33
-- PHP Version: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `blog`
--

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `id` int NOT NULL,
  `name` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`id`, `name`) VALUES
(2, 'Programming'),
(3, 'Music'),
(4, 'Dance'),
(6, 'Painting'),
(7, 'People'),
(8, 'Social Media'),
(9, 'Technology');

-- --------------------------------------------------------

--
-- Table structure for table `posts`
--

CREATE TABLE `posts` (
  `id` int NOT NULL,
  `cat_id` int NOT NULL,
  `title` varchar(255) NOT NULL,
  `contents` text NOT NULL,
  `date_posted` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `posts`
--

INSERT INTO `posts` (`id`, `cat_id`, `title`, `contents`, `date_posted`) VALUES
(6, 2, 'What is programming today?', 'Programming today is a race between software engineers striving to build bigger and better idiot-proof programs, and the Universe trying to produce bigger and better idiots. So far, the Universe is winning.\r\n• Rick Cook, The Wizardry Compiled', '2017-10-06 15:50:31'),
(8, 3, 'Music <3', 'Music has always been a matter of Energy to me, a question of Fuel. Sentimental people call it Inspiration, but what they really mean is Fuel. I have always needed Fuel. I am a serious consumer. On some nights I still believe that a car with the gas needle on empty can run about fifty more miles if you have the right music very loud on the radio.\r\n• Hunter S. Thompson', '2017-10-06 15:53:36'),
(9, 4, 'Just Dance!', 'Work like you don\'t need the money. Love like you\'ve never been hurt. Dance like nobody\'s watching. Satchel Paige', '2017-10-06 15:55:17'),
(10, 6, 'Art of Patience', 'I have seen many storms in my life. Most storms have caught me by surprise, so I had to learn very quickly to look further and understand that I am not capable of controlling the weather, to exercise the art of patience and to respect the fury of nature. -Paulo Coelho', '2017-10-06 15:56:16'),
(12, 8, 'Social Media vs. Technology', 'Social media is about sociology and psychology more than technology. Brian Solis', '2017-10-06 15:58:33');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `userlevel` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `user_name`, `password`, `name`, `userlevel`) VALUES
(3, 'ela', '202cb962ac59075b964b07152d234b70', 'Ela', '1'),
(4, 'elias', '202cb962ac59075b964b07152d234b70', 'elias', '1'),
(5, 'Magarza', '9fdd01d5cdf69c89c4493b5db89ee177', 'MagarThai', 'a');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `posts`
--
ALTER TABLE `posts`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `posts`
--
ALTER TABLE `posts`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

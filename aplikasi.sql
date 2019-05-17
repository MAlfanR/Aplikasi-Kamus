-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 17, 2019 at 02:59 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aplikasi`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `nama_admin` varchar(30) NOT NULL,
  `password` varchar(12) NOT NULL,
  `nip` int(20) NOT NULL,
  `jenis_kelamin` char(9) NOT NULL,
  `username` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`nama_admin`, `password`, `nip`, `jenis_kelamin`, `username`) VALUES
('Budi', '1234', 11223344, 'Laki-laki', 'budi123'),
('Rani', 'asdfg', 22334455, 'Perempuan', 'rani234');

-- --------------------------------------------------------

--
-- Table structure for table `kata`
--

CREATE TABLE `kata` (
  `keyword` varchar(25) NOT NULL,
  `deskripsi_kata` text,
  `kd_prodi` char(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kata`
--

INSERT INTO `kata` (`keyword`, `deskripsi_kata`, `kd_prodi`) VALUES
('', '', 'IF'),
('c++', 'bahasa pemrograman', 'IF'),
('java', 'bahasa pemrograman', 'IF'),
('Linux', 'Merupakan salah satu sistem operasi', 'IF'),
('Phyton', 'interpreted, high-level, general-purpose programming language. Created by Guido van Rossum and first released in 1991, Python\'s design philosophy emphasizes code readability with its notable use of significant whitespace. ', 'IF'),
('tumbuhan', 'sebuah tanaman yang', 'BI');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nim` int(10) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `tgl_lahir` char(10) DEFAULT NULL,
  `username` varchar(12) DEFAULT NULL,
  `password` varchar(12) DEFAULT NULL,
  `prodi` varchar(30) DEFAULT NULL,
  `angkatan` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`nim`, `name`, `tgl_lahir`, `username`, `password`, `prodi`, `angkatan`) VALUES
(14117, 'Andi', '30-11-1999', 'andiriyad', '123456', 'T.Informatika', 2018),
(14117150, 'M.Alfan', '25-11-1999', 'ranger25', '123456', 'T.Informatika', 2017);

-- --------------------------------------------------------

--
-- Table structure for table `prodi`
--

CREATE TABLE `prodi` (
  `kd_prodi` char(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `prodi`
--

INSERT INTO `prodi` (`kd_prodi`) VALUES
('AR'),
('BI'),
('EL'),
('IF');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `kata`
--
ALTER TABLE `kata`
  ADD PRIMARY KEY (`keyword`),
  ADD KEY `kd_prodi` (`kd_prodi`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `prodi`
--
ALTER TABLE `prodi`
  ADD PRIMARY KEY (`kd_prodi`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `kata`
--
ALTER TABLE `kata`
  ADD CONSTRAINT `kata_ibfk_1` FOREIGN KEY (`kd_prodi`) REFERENCES `prodi` (`kd_prodi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 09, 2023 at 04:52 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `final_project`
--

-- --------------------------------------------------------

--
-- Table structure for table `student_attendance`
--

CREATE TABLE `student_attendance` (
  `Date` varchar(30) NOT NULL,
  `S_ID` varchar(30) NOT NULL,
  `S_Name` varchar(30) NOT NULL,
  `C_code` varchar(30) NOT NULL,
  `Status` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_attendance`
--

INSERT INTO `student_attendance` (`Date`, `S_ID`, `S_Name`, `C_code`, `Status`) VALUES
('2023-06-02', 'CS33', 'adeelk', 'PHY-459', 'Present'),
('132', 'w2ewe', 'Ewew', 'wrw', 'wew');

-- --------------------------------------------------------

--
-- Table structure for table `student_grades`
--

CREATE TABLE `student_grades` (
  `S_ID` varchar(30) NOT NULL,
  `S_Name` text NOT NULL,
  `C_code` varchar(30) NOT NULL,
  `Quiz` varchar(30) NOT NULL,
  `Assignment` varchar(30) NOT NULL,
  `Mid_Term` varchar(30) NOT NULL,
  `Project` varchar(30) NOT NULL,
  `Final_Term` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_grades`
--

INSERT INTO `student_grades` (`S_ID`, `S_Name`, `C_code`, `Quiz`, `Assignment`, `Mid_Term`, `Project`, `Final_Term`) VALUES
('CSC-22F-116', 'Adeel', 'PHY-459', '3', '34', '34', '455', '454'),
('CSC-22F-116', 'Adeel', 'PHY-459', '12', '12', '12', '12', '12'),
('CSC-22F-116', 'Adeel', 'PHY-459', '4', '4', '6', '7', '7'),
('CS33', 'adeelk', 'PHY-459', '4', '4', '4', '4', '4'),
('CS33', 'adeelk', 'PHY-459', '10', '15', '20', '20', '20'),
('CS33', 'adeelk', 'CEN-101', '3', '3', '3', '3', '3');

-- --------------------------------------------------------

--
-- Table structure for table `student_register`
--

CREATE TABLE `student_register` (
  `S_Name` text NOT NULL,
  `S_ID` varchar(30) NOT NULL,
  `Subect` text NOT NULL,
  `Career` text NOT NULL,
  `Select_Course` varchar(30) NOT NULL,
  `Instructor` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_register`
--

INSERT INTO `student_register` (`S_Name`, `S_ID`, `Subect`, `Career`, `Select_Course`, `Instructor`) VALUES
('adeelk', 'CS33', 'Computer Science', 'Undergraduate', 'CEN-101', 'Ameen Khawaja'),
('adeelk', 'CS33', 'Computer Science', 'Undergraduate', 'MAT-103', 'Ameen Khawaja'),
('adeelk', 'CS33', 'Computer Science', 'Undergraduate', 'CHE-456', 'Irfan Ali'),
('adeelk', 'CS33', 'Computer Science', 'Undergraduate', 'PHY-459', 'Irfan Ali');

-- --------------------------------------------------------

--
-- Table structure for table `student_sign_up`
--

CREATE TABLE `student_sign_up` (
  `S_Name` text NOT NULL,
  `S_FName` text NOT NULL,
  `S_Email` text NOT NULL,
  `S_ID` varchar(30) NOT NULL,
  `S_PNumber` varchar(15) NOT NULL,
  `S_DOB` text NOT NULL,
  `S_Password` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_sign_up`
--

INSERT INTO `student_sign_up` (`S_Name`, `S_FName`, `S_Email`, `S_ID`, `S_PNumber`, `S_DOB`, `S_Password`) VALUES
('adeelk', 'ss', 'sds', 'CS33', '343543', '2023-06-12', 123),
('MuhammadAnas', 'khan', 'anas@gmail.com', 'CSC-22F-11', '343434535', '2023-06-08', 1234),
('snameytyujhjhfdf', 'sfname', 'semail', 'CSC2', 'spn', 'sdob', 89),
('sds', 'dsd', 'sds', 'CSC22', '123', '2023-06-14', 12),
('Asaam', 'Fareeed', 'mrassam@cvb', 'CSC321pillay', '34223344434', '2023-06-07', 1212);

-- --------------------------------------------------------

--
-- Table structure for table `teacher_sign_up`
--

CREATE TABLE `teacher_sign_up` (
  `T_Name` text NOT NULL,
  `T_FName` text NOT NULL,
  `T_Email` text NOT NULL,
  `T_ID` varchar(30) NOT NULL,
  `T_PNumber` varchar(15) NOT NULL,
  `T_DOB` text NOT NULL,
  `T_Department` text NOT NULL,
  `T_CourseCode` varchar(30) NOT NULL,
  `T_Password` int(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacher_sign_up`
--

INSERT INTO `teacher_sign_up` (`T_Name`, `T_FName`, `T_Email`, `T_ID`, `T_PNumber`, `T_DOB`, `T_Department`, `T_CourseCode`, `T_Password`) VALUES
('www', 'wwwe', 'wwwew', '12', '1213132', '2023-06-20', 'CS', 'CEN-101', 123),
('sfsf', 'dfddfd', 'dfd', '4354', '34354', 'dfd', 'erfe', '43435', 4343),
('dsd', 'sfd', 'sfs', 'dwsfdw', '4343', '2023-06-04', 'CS', 'CEN-101', 23232),
('ada', 'tr', 'trtr', 'gtry', '43454', '2023-06-06', 'CS', 'CEN-101', 123242),
('adeelyhu', 'fdf', 'fdf', 'SS', '42343', '2023-06-13', 'CS', 'PHY-459', 12);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `student_attendance`
--
ALTER TABLE `student_attendance`
  ADD PRIMARY KEY (`S_ID`);

--
-- Indexes for table `student_sign_up`
--
ALTER TABLE `student_sign_up`
  ADD PRIMARY KEY (`S_ID`);

--
-- Indexes for table `teacher_sign_up`
--
ALTER TABLE `teacher_sign_up`
  ADD PRIMARY KEY (`T_ID`,`T_CourseCode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 13, 2022 at 04:23 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employee_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `addemployee`
--

CREATE TABLE `addemployee` (
  `EmployeeID` int(255) NOT NULL,
  `employeedepartment` varchar(100) NOT NULL,
  `NameOfEmployee` varchar(100) NOT NULL,
  `DateOfBirth` date NOT NULL,
  `PhoneNumber` int(10) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `EmployeeSalary` int(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Gender` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `addemployee`
--

INSERT INTO `addemployee` (`EmployeeID`, `employeedepartment`, `NameOfEmployee`, `DateOfBirth`, `PhoneNumber`, `Email`, `EmployeeSalary`, `Address`, `Gender`) VALUES
(2, 'SOE', 'ascs', '1998-12-23', 23456, 'fFe', 3000, 'ewffe', 'male'),
(3, 'SOB', 'fesdfsedf', '1998-02-21', 456456546, 'aff', 3000, 'affasffs', 'male'),
(4, 'SOB', 'feqfwwqf', '1997-06-07', 346333, 'vfbdzfbdf', 3000, 'bSBDS', 'male'),
(5, 'SOB', 'dwfdwfqfwqf', '1992-02-02', 344355, 'vsdsv', 3000, 'sad', 'female'),
(6, 'SOB', 'dwfdwfqfwqf', '1992-02-02', 344355, 'vsdsv', 3000, 'sad', 'female'),
(7, 'SOE', 'New Emplyee name', '1997-07-06', 878846293, 'patiljaikishan@gmail.com', 3000, 'My adress', 'male'),
(8, 'SOB', 'new employeee', '1997-07-08', 87888452, 'patil@gmail.com', 3000, 'my adress', 'male');

-- --------------------------------------------------------

--
-- Table structure for table `admin_login`
--

CREATE TABLE `admin_login` (
  `id` int(255) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_login`
--

INSERT INTO `admin_login` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `attendence`
--

CREATE TABLE `attendence` (
  `EmployeeID` int(255) NOT NULL,
  `employeedepartment` varchar(255) NOT NULL,
  `NameOfEmployee` varchar(255) NOT NULL,
  `DateOfBirth` date NOT NULL,
  `date` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendence`
--

INSERT INTO `attendence` (`EmployeeID`, `employeedepartment`, `NameOfEmployee`, `DateOfBirth`, `date`) VALUES
(4, 'SOB', 'feqfwwqf', '1997-06-07', '0000-00-00'),
(2, 'SOE', 'ascs', '1998-12-23', '0000-00-00'),
(4, 'SOB', 'feqfwwqf', '1997-06-07', '0000-00-00'),
(5, 'SOB', 'dwfdwfqfwqf', '1992-02-02', '0000-00-00'),
(4, 'SOB', 'feqfwwqf', '1997-06-07', 'Jan 13, 2021'),
(4, 'SOB', 'feqfwwqf', '1997-06-07', 'Jan 13, 2021'),
(6, 'SOC', 'chathura', '1998-12-21', 'Jan 12, 2021'),
(2, 'SOE', 'ascs', '1998-12-23', 'Jan 12, 2021'),
(3, 'SOB', 'fesdfsedf', '1998-02-21', 'Jan 7, 2021'),
(5, 'SOB', 'dwfdwfqfwqf', '1992-02-02', 'Jan 12, 2021'),
(2, 'SOE', 'ascs', '1998-12-23', 'Jan 13, 2021'),
(2, 'SOE', 'ascs', '1998-12-23', 'Jan 26, 2021'),
(4, 'SOB', 'feqfwwqf', '1997-06-07', 'Jan 5, 2021'),
(6, 'SOC', 'chathura', '1998-12-21', 'Jan 27, 2021'),
(6, 'SOB', 'dwfdwfqfwqf', '1992-02-02', 'Feb 22, 2021'),
(2, 'SOE', 'ascs', '1998-12-23', '16 Mar, 2022'),
(7, 'SOE', 'New Emplyee', '1997-07-06', '13 Apr, 2022'),
(8, 'SOB', 'new employeee', '1997-07-08', '13 Apr, 2022');

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

CREATE TABLE `salary` (
  `EmployeeID` int(255) NOT NULL,
  `NameOfEmployee` varchar(255) NOT NULL,
  `employeedepartment` varchar(255) NOT NULL,
  `Bonus` int(255) NOT NULL,
  `Basic_salary` int(255) NOT NULL,
  `Total_salary` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `salary`
--

INSERT INTO `salary` (`EmployeeID`, `NameOfEmployee`, `employeedepartment`, `Bonus`, `Basic_salary`, `Total_salary`) VALUES
(2, 'ascs', 'SOE', 1200, 3000, 4200),
(4, 'feqfwwqf', 'SOB', 2300, 3000, 5300),
(4, 'feqfwwqf', 'SOB', 2300, 3000, 5300),
(2, 'ascs', 'SOE', 456, 3000, 3456),
(6, 'dwfdwfqfwqf', 'SOB', 2500, 3000, 5500),
(2, 'ascs', 'SOE', 12221, 3000, 15221),
(7, 'New Emplyee', 'SOE', 100, 3000, 3100),
(8, 'new employeee', 'SOB', 200, 3000, 3200);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addemployee`
--
ALTER TABLE `addemployee`
  ADD PRIMARY KEY (`EmployeeID`);

--
-- Indexes for table `admin_login`
--
ALTER TABLE `admin_login`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `addemployee`
--
ALTER TABLE `addemployee`
  MODIFY `EmployeeID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `admin_login`
--
ALTER TABLE `admin_login`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

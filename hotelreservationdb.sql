-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 22, 2017 at 11:26 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotelreservationdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminlg`
--

CREATE TABLE `adminlg` (
  `ser` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminlg`
--

INSERT INTO `adminlg` (`ser`, `username`, `pass`, `name`, `type`) VALUES
(1, 'admin', 'admin', '', 'admin'),
(2, 'she', '12', 'sara', 'supervisor');

-- --------------------------------------------------------

--
-- Table structure for table `bill_info`
--

CREATE TABLE `bill_info` (
  `guestID` int(11) NOT NULL,
  `Bill_no` int(11) NOT NULL,
  `room_chargers` varchar(10) NOT NULL,
  `other_chargers` varchar(10) NOT NULL,
  `subtotal` varchar(10) NOT NULL,
  `total` varchar(20) NOT NULL,
  `amount_paid` varchar(20) NOT NULL,
  `balance` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill_info`
--

INSERT INTO `bill_info` (`guestID`, `Bill_no`, `room_chargers`, `other_chargers`, `subtotal`, `total`, `amount_paid`, `balance`) VALUES
(2, 520, '8500', '0', '8500', '8500', '10000', '1500'),
(3, 521, '8500', '0', '8500', '8500', '10000', '1500'),
(2, 522, '2000', '0', '10000', '10000', '10000', '0'),
(3, 523, '8000', '0', '24000', '24000', '30000', '6000'),
(4, 524, '8500', '0', '42500', '42500', '30000', '6000'),
(5, 525, '4000', '0', '8000', '8000', '30000', '6000'),
(6, 526, '3000', '0', '3000', '3000', '30000', '6000'),
(7, 527, '9000', '0', '9000', '9000', '30000', '6000'),
(8, 528, '9000', '0', '9000', '9000', '10000', '1000');

-- --------------------------------------------------------

--
-- Table structure for table `double_rooms`
--

CREATE TABLE `double_rooms` (
  `room_no` int(11) NOT NULL,
  `status` varchar(50) NOT NULL,
  `extra` varchar(50) NOT NULL,
  `Price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `double_rooms`
--

INSERT INTO `double_rooms` (`room_no`, `status`, `extra`, `Price`) VALUES
(201, 'booked', 'ac', 8000),
(202, 'booked', 'no', 4000),
(203, 'Available', 'sofa', 5000),
(204, 'Available', 'sofa', 5000),
(205, 'Available', 'Table', 5000),
(206, 'Available', 'Table', 5000),
(207, 'Available', 'ac', 8000),
(208, 'Available', 'ac', 8000),
(209, 'Available', 'ac', 8000),
(210, 'Available', 'ac', 8000);

-- --------------------------------------------------------

--
-- Table structure for table `guest_info`
--

CREATE TABLE `guest_info` (
  `guestID` int(11) NOT NULL,
  `fName` varchar(50) DEFAULT NULL,
  `lName` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `tp` varchar(10) NOT NULL,
  `nic` varchar(10) NOT NULL,
  `bill_balance` int(10) NOT NULL,
  `room_no` int(10) NOT NULL,
  `room_type` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `guest_info`
--

INSERT INTO `guest_info` (`guestID`, `fName`, `lName`, `address`, `tp`, `nic`, `bill_balance`, `room_no`, `room_type`) VALUES
(2, 'kasuni', 'malagama', '15/chilaw', '0774659874', '942365871V', 0, 101, 'Single bed'),
(3, 'hansi', 'vindya', '78/colombo', '0994569874', '945698741V', 6000, 201, 'Double bed'),
(4, 'hansini', 'vindya', '78/colombo', '0994569875', '945698841V', 6000, 301, 'Threble bed'),
(5, 'ayodya', 'kalpa', '21/colombo', '0996569875', '945638841V', 6000, 202, 'Double bed'),
(6, 'radya', 'kalpani', '21/walisara', '0126569875', '955638841V', 6000, 102, 'Single bed'),
(7, 'danuka', 'rasarangana', '85/2 mathale', '0396569875', '915638841V', 6000, 302, 'Threble bed'),
(8, 'tharanga', 'lakmal', '79/3klaniya', '0773698754', '986352418V', 1000, 302, 'Threble bed');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `userId` varchar(50) NOT NULL,
  `Password` varchar(8) NOT NULL,
  `fName` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `addrs` varchar(50) NOT NULL,
  `telno` int(11) NOT NULL,
  `nic` varchar(10) NOT NULL,
  `sex` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`userId`, `Password`, `fName`, `lname`, `addrs`, `telno`, `nic`, `sex`) VALUES
('isu', '45', 'isuri', 'chathurika', '18/thotagoda,akmeemana', 774598731, '947865412v', 'null'),
('kasun', '123', 'kasun', 'dhananjaya', '15/ malwaththa,Chilaw', 771456987, '947856487V', 'Male');

-- --------------------------------------------------------

--
-- Table structure for table `room_info`
--

CREATE TABLE `room_info` (
  `guestID` int(11) NOT NULL,
  `fName` varchar(50) NOT NULL,
  `nic` varchar(10) NOT NULL,
  `room_type` varchar(15) NOT NULL,
  `room_no` int(11) NOT NULL,
  `room_charge` varchar(10) NOT NULL,
  `date_in` varchar(50) NOT NULL,
  `date_out` varchar(50) NOT NULL,
  `no_of_days` varchar(50) NOT NULL,
  `no_of_adult` varchar(50) NOT NULL,
  `no_of_children` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room_info`
--

INSERT INTO `room_info` (`guestID`, `fName`, `nic`, `room_type`, `room_no`, `room_charge`, `date_in`, `date_out`, `no_of_days`, `no_of_adult`, `no_of_children`) VALUES
(2, 'kasuni', '942365871V', 'Single bed', 101, '2000', '2017-01-21', '2017-01-26', '5', '1', '1'),
(6, 'radya', '955638841V', 'Single bed', 102, '3000', '2017-01-22', '2017-01-23', '1', '2', '0'),
(3, 'hansi', '945698741V', 'Double bed', 201, '8000', '2017-01-21', '2017-01-24', '3', '2', '0'),
(5, 'ayodya', '945638841V', 'Double bed', 202, '4000', '2017-01-22', '2017-01-24', '2', '2', '0');

-- --------------------------------------------------------

--
-- Table structure for table `search`
--

CREATE TABLE `search` (
  `guestID` int(250) NOT NULL,
  `lName` varchar(50) NOT NULL,
  `nic` varchar(10) NOT NULL,
  `room_no` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `search`
--

INSERT INTO `search` (`guestID`, `lName`, `nic`, `room_no`) VALUES
(2, 'malagama', '942365871V', 101),
(3, 'vindya', '945698741V', 201),
(5, 'kalpa', '945638841V', 202),
(6, 'kalpani', '955638841V', 102);

-- --------------------------------------------------------

--
-- Table structure for table `single_rooms`
--

CREATE TABLE `single_rooms` (
  `room_no` int(11) NOT NULL,
  `status` varchar(50) NOT NULL,
  `extra` varchar(50) NOT NULL,
  `Price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `single_rooms`
--

INSERT INTO `single_rooms` (`room_no`, `status`, `extra`, `Price`) VALUES
(101, 'booked', 'sofa', 2000),
(102, 'booked', 'Table', 3000),
(103, 'Available', 'ac', 5000),
(104, 'Available', 'sofa', 2000),
(105, 'Available', 'Table', 2000),
(106, 'Available', 'no', 1500),
(107, 'Available', 'sofa', 2000),
(108, 'Available', 'no', 1500),
(109, 'Available', 'ac', 50000),
(110, 'Available', 'Table', 2000);

-- --------------------------------------------------------

--
-- Table structure for table `thrible_rooms`
--

CREATE TABLE `thrible_rooms` (
  `room_no` int(11) NOT NULL,
  `status` varchar(50) NOT NULL,
  `extra` varchar(50) NOT NULL,
  `Price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `thrible_rooms`
--

INSERT INTO `thrible_rooms` (`room_no`, `status`, `extra`, `Price`) VALUES
(301, 'booked', 'no', 8500),
(302, 'Available', 'sofa', 9000),
(303, 'Available', 'sofa', 9000),
(304, 'Available', 'sofa', 9000),
(305, 'Available', 'Table', 9000),
(306, 'Available', 'sofa', 9000),
(307, 'Available', 'ac', 10000),
(308, 'Available', 'ac', 10000),
(309, 'Available', 'ac', 10000),
(310, 'Available', 'ac', 10000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adminlg`
--
ALTER TABLE `adminlg`
  ADD PRIMARY KEY (`ser`);

--
-- Indexes for table `bill_info`
--
ALTER TABLE `bill_info`
  ADD PRIMARY KEY (`Bill_no`),
  ADD KEY `guestID` (`guestID`);

--
-- Indexes for table `double_rooms`
--
ALTER TABLE `double_rooms`
  ADD PRIMARY KEY (`room_no`);

--
-- Indexes for table `guest_info`
--
ALTER TABLE `guest_info`
  ADD PRIMARY KEY (`guestID`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`userId`);

--
-- Indexes for table `room_info`
--
ALTER TABLE `room_info`
  ADD PRIMARY KEY (`room_no`);

--
-- Indexes for table `search`
--
ALTER TABLE `search`
  ADD PRIMARY KEY (`guestID`),
  ADD KEY `guestID` (`guestID`);

--
-- Indexes for table `single_rooms`
--
ALTER TABLE `single_rooms`
  ADD PRIMARY KEY (`room_no`);

--
-- Indexes for table `thrible_rooms`
--
ALTER TABLE `thrible_rooms`
  ADD PRIMARY KEY (`room_no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `adminlg`
--
ALTER TABLE `adminlg`
  MODIFY `ser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `bill_info`
--
ALTER TABLE `bill_info`
  MODIFY `Bill_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=529;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `search`
--
ALTER TABLE `search`
  ADD CONSTRAINT `search_ibfk_1` FOREIGN KEY (`guestID`) REFERENCES `guest_info` (`guestID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Dec 06, 2019 at 01:16 AM
-- Server version: 8.0.18
-- PHP Version: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `plorshop`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `firsname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `email` varchar(150) NOT NULL,
  `active` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `username`, `password`, `firsname`, `lastname`, `email`, `active`) VALUES
(1, 'plor', 'ddee6cbf5e4cd5190a82c616cd7c669a', 'tanachit', 'plor', 'plor009900@gmail.com', 1),
(4, 'took', '2cfd4560539f887a5e420412b370b361', 'ploo', 'ploo', 'tukta_ttpp@hotmail.com', 0),
(5, 'took', '2cfd4560539f887a5e420412b370b361', 'ploo', 'ploo', 'tukta_ttpp@hotmail.com', 0),
(6, 'tookta', '2cfd4560539f887a5e420412b370b361', 'ploo', 'ploo', 'tukta_ttpp@hotmail.com', 0),
(7, 'plor1234', '2cfd4560539f887a5e420412b370b361', 'plor', 'plor', 'tukta_ttpp@hotmail.com', 0);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` varchar(500) NOT NULL,
  `price` int(11) NOT NULL,
  `unitin_stock` int(11) NOT NULL,
  `picture` varchar(100) NOT NULL,
  `categoryID` int(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `name`, `description`, `price`, `unitin_stock`, `picture`, `categoryID`) VALUES
(1, 'โน๊ตบุค', 'core i7', 15000, 20, 'computer.jpg', 1),
(2, 'คอมพิวเตอร์', 'core i7', 14000, 21, 'nootbook.jpg', 1),
(3, 'computer', 'core i3', 14050, 20, 'computer1.jpg', 1),
(4, 'โน๊ตบุค', 'core i3\r\n', 14050, 20, 'nootbook1.jpg', 1),
(6, '    OPPO R17', 'หน้าจอขนาด 6.4 นิ้ว อัตราส่วน 19:9, Snapdragon 670, ความจุ 128 GB และมี RAM 6GB/8GB, กล้องหลัง 16 MP + 5 MP กล้องหน้า 25 MP', 4150, 20, '201.jpg', 2),
(7, 'Samsung Galaxy Note9', 'Galaxy Note9 มาพร้อมหน้าจอใหญ่ 6.4 นิ้ว ความละเอียด QHD+ กล้องหลัง 12 + 12 ล้านพิกเซล รองรับ AI ประมวลผลด้วยชิป Snapdragon 845 ชูจุดเด่นที่ปากกา S Pen ที่สามารถรองรับการใช้งานได้มากขึ้น', 14000, 30, '202.jpg', 2),
(8, 'Vivo V11', 'สมาร์ทโฟนหน้าจอใหญ่ 6.41 นิ้ว เซ็นเซอร์สแกนนิ้วใตหน้าจอ พร้อมรอยบากแบบ Water drop ประมวลผลด้วย Snapdragon 660 กล้องหลังคู่ 12 + 5 ล้านพิกเซล รองรับระบบ AI', 5499, 20, '203.jpg', 2),
(9, 'Samsung Galaxy A30', 'สมาร์ทโฟนหน้าจอ Infinity-U ขนาด 6.4 นิ้ว ความละเอียด FHD+ มาพร้อมเซ็นเซอร์แสกนนิ้วมือใต้หน้าจอ กล้องหลังคู่ 16 + 5 ล้านพิกเซล5539', 5539, 20, '204.jpg', 2),
(10, 'TEFAL เตารีด แรงดันไอน้ำ GV7556', 'แผ่นหน้าเตารีด Ultragliss 2400W รุ่น GV7556', 17990, 10, '301.jpg', 3),
(11, 'เตารีดไอน้ำ PHILIPS รุ่น GC2998', 'กำลังไฟ 2400 วัตต์', 1700, 10, '302.png', 3),
(12, 'PHILIPS เตารีดแรงดันไอน้ำ PerfectCare Elite Plus รุ่น GC9682', '', 22500, 20, '303.jpg', 3),
(13, 'เตารีดไอน้ำรุ่น VIVA 569', 'เตารีดไอน้ำรุ่นพิเศษ! สุดยอดระดับมืออาชีพ รุ่น VIVA 569 รูปลักษณ์สวยงามทันสมัย รีดเร็ว เรียบง่าย ดั่งมืออาชีพ แรงดันไอน้ำแรงแบบต่อเนื่อง', 15000, 10, '304.jpg', 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

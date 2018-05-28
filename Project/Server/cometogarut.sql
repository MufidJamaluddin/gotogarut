-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2018 at 01:51 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cometogarut`
--

-- --------------------------------------------------------

--
-- Table structure for table `facility`
--

CREATE TABLE `facility` (
  `id` int(11) NOT NULL,
  `title` varchar(19) DEFAULT NULL,
  `note` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `gallery`
--

CREATE TABLE `gallery` (
  `place_id` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  `link_photo` varchar(100) DEFAULT NULL,
  `description` text
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gallery`
--

INSERT INTO `gallery` (`place_id`, `id`, `link_photo`, `description`) VALUES
(1, 1, 'http://2.bp.blogspot.com/-dvNgcNJ__Mg/VVAMOq-GMNI/AAAAAAAABXs/fg6Zg6q0vUY/s1600/Pantai%2BSantolo%2BP', 'Aktivitas Pantai'),
(1, 2, 'http://2.bp.blogspot.com/-1ReYdxSKnX8/VBkwBZByxfI/AAAAAAAAClI/xoqXZMhrLnI/s1600/santolo.jpg', 'Pemandangan Sore'),
(1, 3, 'https://abdidani.files.wordpress.com/2015/06/96808-original.jpg?w=625', 'Pemandangan Terbit'),
(2, 1, 'http://2.bp.blogspot.com/-IxDDbx21YYI/UPZZfunYNTI/AAAAAAAAADo/xltv2UmmS7Q/s1600/IMG_2318.JPG', 'Gambar 1'),
(2, 2, 'https://4.bp.blogspot.com/-OyIV1LNqg14/VxtMuPzZxzI/AAAAAAAACmg/02dmeqXBqtsRWWdiK2gd9uc-Mfi5F6jYgCLcB', 'Gambar 2'),
(2, 3, 'http://2.bp.blogspot.com/-MVttjWqW0wU/Vl7G6bt4EdI/AAAAAAAAAOg/pgPSiR35FvE/s1600/viruspintar.blogspot', 'Gambar 3'),
(2, 4, 'https://2.bp.blogspot.com/-VNP7IrIs_HA/WkEvxZK58iI/AAAAAAAAAR4/czOJLA47dRclpVDJM1IKuaFYc91b7LlcQCLcB', 'Gambar 4'),
(3, 1, 'https://2.bp.blogspot.com/-5IAyMk7onLI/VQ7Y4K-6cbI/AAAAAAAAC2s/2wpJ3ilduck/s1600/DSC02562.JPG', 'Gambar 1'),
(3, 2, 'http://2.bp.blogspot.com/-6g9seaublYA/VmoQ2xxFHnI/AAAAAAAABP0/1LT9f6NulAc/s1600/villa%2B9.jpg', 'Gambar 2'),
(3, 3, 'http://4.bp.blogspot.com/-nR4FvYKeMOU/T3FV0ppy0-I/AAAAAAAAAJk/8urKDDcZgpU/s1600/16062011_031.jpg', 'Gambar 3'),
(3, 4, 'https://2.bp.blogspot.com/-azPFaPzXGho/VyRVVlVUudI/AAAAAAAAGKg/ZKoxO3H_fRgkRN1gu3j7XTfMBaKBTaFMQCLcB', 'Gambar 4'),
(4, 1, 'https://2.bp.blogspot.com/-tSgEMzNp8yA/Ws2K8QiLFOI/AAAAAAAALeQ/OmXZcSBljSAFOsnb-PWiyhBiYtDmF3WwACLcB', 'Gambar 1'),
(4, 2, 'https://1.bp.blogspot.com/-IwnE04jHyoQ/WcoHWVe1NzI/AAAAAAAADBE/H43Djh89JdsJwoq5KD3r5b8ZcHFGxIVEQCLcB', 'Gambar 2'),
(5, 1, 'https://2.bp.blogspot.com/-oXEFzTqToBE/WcoMk0P1AEI/AAAAAAAACH4/Fr6HJ-YdrdQRgxT5jIJ7NvGpUNMDTNtUACLcB', 'Gambar 1'),
(5, 2, 'https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Cangkuang_3.jpg/320px-Cangkuang_3.jpg', 'Gambar 2'),
(5, 3, 'https://ipungaljawi.files.wordpress.com/2012/12/cropped-candi-sewu-klaten-jawa-tengah1.jpg', 'Gambar 3'),
(5, 4, 'http://www.nasionalisme.co/wp-content/uploads/2016/06/Candi_Cangkuang.jpg', 'Gambar 4'),
(6, 1, 'https://4.bp.blogspot.com/-7j6FnBZTsZI/Vs1tB0AibJI/AAAAAAAAAf0/Qwk5D1nzWkc/s1600/situ-bagendit-dari-', 'Gambar 1'),
(6, 2, 'http://2.bp.blogspot.com/-dguEjolc4Z0/UpVx9eT6RmI/AAAAAAAAAKY/ngxuJQLwqFY/w1200-h630-p-k-no-nu/Situ+', 'Gambar 2'),
(6, 3, 'https://3.bp.blogspot.com/-uywSc6-0Lb8/Vs1tdCzjCMI/AAAAAAAAAgI/AsUMhJXQ2rM/s1600/Situ_Bagendit_14287', 'Gambar 3'),
(6, 4, 'https://3.bp.blogspot.com/-AdujSMOjrUM/Vs1s4GkM0II/AAAAAAAAAfw/nk42bSkew24/s1600/282736_situ-bagendi', 'Gambar 4');

-- --------------------------------------------------------

--
-- Table structure for table `has_facility`
--

CREATE TABLE `has_facility` (
  `place_id` int(11) NOT NULL,
  `facility_id` int(11) NOT NULL,
  `description` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `place`
--

CREATE TABLE `place` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `address` varchar(80) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `time_begin` time DEFAULT NULL,
  `day_begin` varchar(10) DEFAULT NULL,
  `time_end` time DEFAULT NULL,
  `day_end` varchar(10) DEFAULT NULL,
  `description` text,
  `contact` text,
  `latitude` float(10,6) DEFAULT NULL,
  `longitude` float(10,6) DEFAULT NULL,
  `link_photo` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `place`
--

INSERT INTO `place` (`id`, `name`, `address`, `price`, `time_begin`, `day_begin`, `time_end`, `day_end`, `description`, `contact`, `latitude`, `longitude`, `link_photo`) VALUES
(1, 'Pantai Santolo', 'Pamalayan, Kecamatan Cikelet, Kab Garut, Indonesia', 3500, '00:00:00', 'Senin', '23:59:00', 'Minggu', 'Pantai Santolo adalah salah satu jejeran pantai selatan di daerah Jawa Barat yang paling bagus setidaknya di kota Garut dan sekitarnya. Tempat ini menjadi alternatif destinasi rekreasi keluarga yang cukup ramai untuk tahun 2018, dipenuhi dengan pasir putih dan deburan ombak yang tidak terlalu kencang membuat pengunjung disini diperbolehkan berenang dengan aman. Banyak spot menarik untuk mengambil foto dan gambar di Pantai Santolo ini, terlebih dengan adanya kawasan peluncuran roket resmi milik Lembaga Penerbangan dan Antariksa Nasional (LAPAN) menjadikan area ini menjadi lebih ramai.', '+6289660271603', -7.650086, 107.687630, 'https://allesgroen.files.wordpress.com/2017/04/darajat-pass.jpg'),
(2, 'Kampung Sampireun', 'Jl. Raya Samarang Kamojang Km. 4, Ciparay, Sukakarya, Garut, ID', 0, '00:00:00', 'Senin', '23:59:00', 'Minggu', 'Kawasa Wisata Kampung Sampireun merupakan resort modern yang mengusung tema alam dan tradisional khas Jawa Barat. Tempat ini sangat cocok dijadikan destinasi wisata utama oleh pengunjung yang ingin berbulan madu dan menikmati suasana perkampungan alami namun disertai dengan fasilitas hotel atau resort berbintang. Terdapat fasilitas restoran dengan aneka kuliner tradisional Jawa Barat dan Indonesia, selain itu ada juga spa yang dapat dinikmati. Yang membuat resort ini semakin terkenal di kalangan pelancong adalah keramahan staffnya yang mencerminkan budaya kesopanan Indonesia, terutama masyarakat Sunda. *Harga tiket tergantung paket.', '+62262542393', -7.202564, 107.816483, 'https://allesgroen.files.wordpress.com/2017/04/wisata-kampung-sampireun.jpg'),
(3, 'Kawah Puncak Darajat', 'Karyamekar, Kecamatan Pasirwangi, Garut, ID', 25000, '00:00:00', 'Senin', '23:59:00', 'Minggu', 'Wisata Kawah Puncak Darajat berada di dataran tinggi Garut yang masih memiliki wilayah alami, asri, dan sejuk, karena itu di tempat ini terdapar sumber mata air panas alami dari perut bumi. Fasilitas yang tersedia disini diantaranya adalah kolam renang air panas, wahana air seperti seluncuran, air tumpah, kolam arus, dan masih banyak lagi yang lainnya. Tidak perlu khawatir mencari tempat makan dan penginapan yang tidak terlalu mahal karena semuanya ada disini mulai dari penginapan bertaraf villa, guest house, homestay, dan hotel atau resort berbintang.', '-', -7.217943, 107.744965, 'https://allesgroen.files.wordpress.com/2017/04/kawah-puncak-darajat.jpg'),
(4, 'Arung Jeram Sungai Cimanuk', 'Jl. Raya Bayongbong Timur, Cigedug No. 119, Blok Dawuan, Panembong, Garut, ID', 0, '08:00:00', 'Senin', '10:00:00', 'Minggu', 'Wisata arung jeram atau rafting kini tersedia di Sungai Cimanuk yang terkenal memiliki arus lumayan kencang untuk aktifitas olahraga ini. Paket wisata arung jeram yang ditawakan disini bermacam-macam dengan harga yang juga beragam, namun dapat disewa untuk family gathering, bersama rekan kerja, dan lain sebagainya.</p><p>Trek dan jalur arung jeram ini cukup unik karena tempatnya yang melewati perumahan warga, kebun-kebun, persawahan, hingga rerimbunan hutan. Arung jeram ini memiliki trek paling tidak sepanjang 7 hingga 10 kilometer dan disediakan instruktur yang juga cukup berpengalaman. *Harga tiket tergantung paket.', '-', -7.280528, 107.845863, 'https://allesgroen.files.wordpress.com/2017/04/arung-jeram-sungai-cimanuk.jpg'),
(5, 'Candi Cangkuang', 'Leuwigoong, Karanganyar, Cangkuang, Kecamatan Leles', 5000, '09:00:00', 'Senin', '17:00:00', 'Minggu', 'Pantai Santolo adalah salah satu jejeran pantai selatan di daerah Jawa Barat yang paling bagus setidaknya di kota Garut dan sekitarnya. Tempat ini menjadi alternatif destinasi rekreasi keluarga yang cukup ramai untuk tahun 2018, dipenuhi dengan pasir putih dan deburan ombak yang tidak terlalu kencang membuat pengunjung disini diperbolehkan berenang dengan aman. Banyak spot menarik untuk mengambil foto dan gambar di Pantai Santolo ini, terlebih dengan adanya kawasan peluncuran roket resmi milik Lembaga Penerbangan dan Antariksa Nasional (LAPAN) menjadikan area ini menjadi lebih ramai.', '+62 813 1677 9909', -7.650086, 107.687630, 'https://allesgroen.files.wordpress.com/2017/04/candi-cangkuang.jpg'),
(6, 'Situ Bagendit', 'Jl. Kyai H. Hasan Arif, Sukamukti, Kecamatan Banyuresmi', 5000, '00:00:00', 'Senin', '23:59:00', 'Minggu', 'Situ Bagendit adalah salah satu destinasi wisata berupa danau alami yang memiliki pemandangan dan keindahan luar biasa. Didukung dengan rimbunnya pepohonan hutan sekitar danau dan air dari danau ini sendiri yang sangat bening dan jernih membuat pengunjung terkesima dengan kealamiannya. Fasilitas yang disediakan di Situ Bagendit ini kebanyakan adalah perahu kecil dan sepeda air guna mengarungi perairan situ yang lumayan luas. Terdapat tempat makan yang ditata rapi di area tertentu luar Situ Bagendit ini bagi wisatawan yang ingin mengisi perut dengan kuliner khas pedesaan masyarakat Sunda.', '-', -7.160584, 107.949097, 'https://allesgroen.files.wordpress.com/2017/04/situ-bagendit.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `review`
--

CREATE TABLE `review` (
  `place_id` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  `name` varchar(60) DEFAULT NULL,
  `email` varchar(254) DEFAULT NULL,
  `message` text,
  `purity_rate` smallint(11) DEFAULT NULL,
  `policy_rate` int(11) DEFAULT NULL,
  `security_rate` int(11) DEFAULT NULL,
  `facility_rate` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `suggestion`
--

CREATE TABLE `suggestion` (
  `place_id` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  `name` varchar(60) DEFAULT NULL,
  `email` varchar(254) DEFAULT NULL,
  `description` text
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `suggestion`
--

INSERT INTO `suggestion` (`place_id`, `id`, `name`, `email`, `description`) VALUES
(1, 1, 'Mufid Jamaluddin', 'mufid.jamaluddin@gmail.com', 'Perlu Ditambah Fasilitas'),
(2, 1, 'Rohmat D', 'mufid.jamaluddin@gmail.com', 'Perlu Ditambah Fasilitas');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `facility`
--
ALTER TABLE `facility`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `gallery`
--
ALTER TABLE `gallery`
  ADD PRIMARY KEY (`place_id`,`id`);

--
-- Indexes for table `has_facility`
--
ALTER TABLE `has_facility`
  ADD PRIMARY KEY (`place_id`,`facility_id`);

--
-- Indexes for table `place`
--
ALTER TABLE `place`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `review`
--
ALTER TABLE `review`
  ADD PRIMARY KEY (`place_id`,`id`);

--
-- Indexes for table `suggestion`
--
ALTER TABLE `suggestion`
  ADD PRIMARY KEY (`place_id`,`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `facility`
--
ALTER TABLE `facility`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `gallery`
--
ALTER TABLE `gallery`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `place`
--
ALTER TABLE `place`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `review`
--
ALTER TABLE `review`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `suggestion`
--
ALTER TABLE `suggestion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

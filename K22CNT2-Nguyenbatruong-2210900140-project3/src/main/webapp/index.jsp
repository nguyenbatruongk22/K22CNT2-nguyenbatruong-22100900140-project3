<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Highlands Coffee</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;700&display=swap" rel="stylesheet">
    <style>
        * { margin: 0; padding: 0; box-sizing: border-box; font-family: 'Roboto', sans-serif; }
        body { background-color: #fff; color: #333; }
        header { background: #8b0000; padding: 15px 0; text-align: center; }
        header img { width: 200px; }
        nav { display: flex; justify-content: center; background: #c8102e; padding: 10px; }
        nav a { color: white; text-decoration: none; padding: 10px 20px; font-weight: bold; }
        nav a:hover { background: rgba(255, 255, 255, 0.2); }
        .banner img { width: 100%; }
        .menu { text-align: center; padding: 40px 20px; }
        .menu h2 { margin-bottom: 20px; }
        .menu-container { display: flex; justify-content: center; gap: 20px; flex-wrap: wrap; }
        .menu-item { text-align: center; }
        .menu-item img { width: 200px; border-radius: 10px; }
        .footer { background: #8b0000; color: white; text-align: center; padding: 20px; margin-top: 30px; }
    </style>
</head>
<body>
    <header>
        <img src="https://upload.wikimedia.org/wikipedia/vi/thumb/c/c9/Highlands_Coffee_logo.svg/1200px-Highlands_Coffee_logo.svg.png" alt="Highlands Coffee Logo">
    </header>
    <nav>
       <li><a href="trangchucontroller">Trang chủ</a></li>
        <li><a href="thucdon">Thực đơn</a></li>
        <li><a href="khuyenmai">Khuyến mãi</a></li>
       <li><a href="hethongcuahang">Hệ thống cửa hàng</a></li>
        <li><a href="lienhe.java">Liên hệ</a></li>
    </nav>
    <div class="banner">
        <img src="https://www.highlandscoffee.com.vn/vnt_upload/news/07_2019/HCO-Tin_tuYYc-BANNER-NEWS-740X314.jpg" alt="Banner">
    </div>
    <section class="menu">
        <h2>Thực đơn nổi bật</h2>
        <div class="menu-container">
            <div class="menu-item">
                <img src="https://img.tripi.vn/cdn-cgi/image/width=700,height=700/https://gcs.tripi.vn/public-tripi/tripi-feed/img/473891JDt/phin-sua-da-highland-coffee-do-uong-ngon-ha-noi.png" alt="Phin Sữa Đá">
                <p>Phin Sữa Đá</p>
            </div>
            <div class="menu-item">
                <img src="https://bizweb.dktcdn.net/100/487/455/products/freeze-kem-may-dau-tam-highlands-coffee-white-bg-1711936881403.jpg?v=1724205053610" alt="Trà Cây Dâu">
                <p>Trà Cây Dâu</p>
            </div>
            <div class="menu-item">
                <img src="https://tknt.vn/images/2022/07/17/freeze-tra-xanh-0.png" alt="Freeze Trà Xanh">
                <p>Freeze Trà Xanh</p>
            </div>
            <div class="menu-item">
                <img src="https://bizweb.dktcdn.net/thumb/1024x1024/100/487/455/products/banh-tiramisu-1698982248311.jpg?v=1724205586610" alt="Bánh Tiramisu">
                <p>Bánh Tiramisu</p>
            </div>
        </div>
        
        
    </section>
    <footer class="footer">
        <p>&copy; 2024 Highlands Coffee. All rights reserved.</p>
    </footer>
</body>
</html>

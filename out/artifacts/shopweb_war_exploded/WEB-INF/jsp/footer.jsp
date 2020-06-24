

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>


<title>JSP Page</title>
</head>

<body>
	<div class="footer">
			<div class="wrap">
			<div class="section group">
				<div class="col_1_of_4 span_1_of_4">
					<h3>Thông tin</h3>
					<p>© 2020. Công ty cổ phần Di Động. GPDKKD: 0303217354 do sở KH & ĐT TP.HCM cấp ngày 02/01/2007. Địa chỉ: 128 Trần Quang Khải, P. Tân Định, Q.1, TP.Hồ Chí Minh. Điện thoại: 18001060. Email: dinhtuantu491996@gmail.com. Xem chính sách sử dụng web</p>
				</div>
				<div class="col_1_of_4 span_1_of_4">
					<h3>Mới hôm nay</h3>
					<p>Chính sách bảo hành.</p>
					<p>Chính sách đổi trả.</p>
					<p>Giao hàng và thanh toán.</p>
				</div>
				<div class="col_1_of_4 span_1_of_4">
					<h3>Vị trí cửa hàng</h3>
					<p>Cầu giấy - Hà Nội.</p>
					<h3>Trực tiếp đặt hàng</h3>
					<p>080-1234-56789</p>
					<p>080-1234-56780</p>
				</div>
				<div class="col_1_of_4 span_1_of_4 footer-lastgrid">
					<h3>Thư viện - Tin tức</h3>
					<form>
						<input type="text"><input type="submit" value="Tìm" />
					</form>
					<h3>Truy cập:</h3>
					 <ul>
					 	<li><a href="#"><img src="img/twitter.png" title="twitter" />Twitter</a></li>
					 	<li><a href="#"><img src="img/facebook.png" title="Facebook" />Facebook</a></li>
					 	<li><a href="#"><img src="img/rss.png" title="Rss" />Rss</a></li>
					 </ul>
				</div>
			</div>
		</div>
		
		<div class="clear"> </div>
		<div class="wrap">
		<div class="copy-right">
			<p>&copy; 2020 Mobile Store. All Rights Reserved | Design by  <a href="">Đinh Tuấn Tú - PH09235</a></p>
		</div>
		</div>
		</div>

</body>

<style>
/* reset */
html,body,div,span,applet,object,iframe,h1,h2,h3,h4,h5,h6,p,blockquote,pre,a,abbr,acronym,address,big,cite,code,del,dfn,em,img,ins,kbd,q,s,samp,small,strike,strong,sub,sup,tt,var,b,u,i,dl,dt,dd,ol,nav ul,nav li,fieldset,form,label,legend,table,caption,tbody,tfoot,thead,tr,th,td,article,aside,canvas,details,embed,figure,figcaption,footer,header,hgroup,menu,nav,output,ruby,section,summary,time,mark,audio,video{margin:0;padding:0;border:0;font-size:100%;font:inherit;vertical-align:baseline;}
article, aside, details, figcaption, figure,footer, header, hgroup, menu, nav, section {display: block;}
ol,ul{list-style:none;margin:0px;padding:0px;}
blockquote,q{quotes:none;}
blockquote:before,blockquote:after,q:before,q:after{content:'';content:none;}
table{border-collapse:collapse;border-spacing:0;}
/* start editing from here */
a{text-decoration:none;}
.txt-rt{text-align:right;}/* text align right */
.txt-lt{text-align:left;}/* text align left */
.txt-center{text-align:center;}/* text align center */
.float-rt{float:right;}/* float right */
.float-lt{float:left;}/* float left */
.clear{clear:both;}/* clear float */
.pos-relative{position:relative;}/* Position Relative */
.pos-absolute{position:absolute;}/* Position Absolute */
.vertical-base{	vertical-align:baseline;}/* vertical align baseline */
.vertical-top{	vertical-align:top;}/* vertical align top */
.underline{	padding-bottom:5px;	border-bottom: 1px solid #eee; margin:0 0 20px 0;}/* Add 5px bottom padding and a underline */
nav.vertical ul li{	display:block;}/* vertical menu */
nav.horizontal ul li{	display: inline-block;}/* horizontal menu */
img{max-width:100%;}
/*end reset*/
body{
	background:#F9F9F9;
}
.wrap{
	width:80%;
	margin:0 auto;
}
.search-bar,.header-top-nav{
	float:right;
}
.search-bar input[type="text"]{
	width: 182px;
	height: 20px;
	margin-right: 0;
	color: #666565;
	background: #fff;
	padding: 3px 5px 3px 10px;
	border: 1px solid #e5e5e5;
	-webkit-box-sizing: content-box;
	-moz-box-sizing: content-box;
	box-sizing: content-box;
	margin: 0;
	outline: none;
}
.search-bar input[type="submit"]{
	margin-right: 0;
	color: #000;
	background: #fff;
	padding: 5px 9px 5px 10px;
	border: 1px solid #e5e5e5;
	margin: 0;
	border-left:none;
	cursor:pointer;
	background:#94CB32;
	font-weight: bold;
}
.search-bar input[type="submit"]:hover{
	background:#181818;
	color:#fff;
}
.search-bar{
	background:#fff;
	margin: 20px 0px 12.5px 0px;
	border-radius:0.3em;
}
.header-top-nav ul li{
	display:inline-block;
	border-right: 1px solid rgba(122, 120, 120, 0.15);
	padding: 0px 13px;
}

.header-top-nav ul li:last-child{
	border:none;
	padding-right:0px;
}
.header-top-nav ul li a,.header-top-nav{
	font-family: 'Open Sans', sans-serif;
	color:#575757;
	display:inline-block;
	font-size: 0.9em;
	font-weight: bold;
}
.header-top-nav ul li a:hover{
	color:#94CB32;
}
.header-top-nav ul li a span{
	color:#D70D87;
}






/*---footer---*/
/*  GRID OF FOUR   ============================================================================= */
.section {
	clear: both;
	padding: 0px;
	margin: 0px;
}
.group:before,
.group:after {
    content:"";
    display:table;
}
.group:after {
    clear:both;
}
.group {
    zoom:1;
}
.col_1_of_4{
	display: block;
	float:left;
	margin: 1% 0 1% 1.6%;
}
.col_1_of_4:first-child { margin-left: 0; } /* all browsers except IE6 and lower */
	
.span_1_of_4 {
	width: 22%;
	padding: 0 0 0 1.5%;
}
.span_1_of_4  h3,.span_1_of_4 ul li a{
	font-family: 'Open Sans', sans-serif;
	color: #575757;
	font-size: 1.2em;
	padding: 6px 0px 0px 0px;
}
.span_1_of_4 ul li img{
	vertical-align:middle;
	padding-right: 5px;
}
.span_1_of_4  h3{
	text-transform: uppercase;
}
.span_1_of_4  p {
	font-size:0.8125em;
	padding:0.5em 0;
	color: #333;
	line-height: 1.5em;
	font-family :verdana, arial, helvetica, helve, sans-serif; 	 
}
.span_1_of_4 ul li a{
	font-size:0.8em;
}
.span_1_of_4 ul li a:hover{
	color:#94CB32;
}
.footer-secondgrid ul{
	margin-top:10px;
}
/***** Media Quries *****/
@media only screen and (max-width: 1024px) {
	.wrap{
		width:95%;
	}	
}
/*  GO FULL WIDTH AT LESS THAN 640 PIXELS */
@media only screen and (max-width: 640px) and (min-width: 480px) {
	.wrap{
		width:95%;
	}
	.col_1_of_4{ 
		margin: 1% 0 1% 0%;
	}
	.span_1_of_4 {
		width:94%;
		padding:3%;  
	}
}

/*  GO FULL WIDTH AT LESS THAN 480 PIXELS */
@media only screen and (max-width: 480px) {
	.wrap{
		width:95%;
	}
	.col_1_of_4{ 
		margin: 1% 0 1% 0%;
	}
	.span_1_of_4 {
		width:92%;
		padding:4%; 
	}
}
/*---footer---*/
.footer{
	background: #181818;
}
.footer-lastgrid input[type="text"]{
	outline:none;
	background: rgb(255, 255, 255);
	border: 1px solid rgb(0, 0, 0);
	border-radius: 0.3em;
	padding:5px 7px;
}
.footer-lastgrid input[type="submit"]{
	background:none;
	border:none;
	font-size: 0.8em;
	font-family: 'Open Sans', sans-serif;
	color:#94CB32;
	font-weight:bold;
	text-transform:uppercase;
	cursor:pointer;
}
.footer-lastgrid ul li{
	display:inline-block;
}
.footer-lastgrid ul {
	margin-top:10px;
}
.footer-lastgrid ul li{
	padding-right:3px;
}
.footer {
	margin-top: 30px;
}
/*---about-us----*/
.about h4{
	color: #575757;
	font-size: 2em;
	font-family: 'Open Sans', sans-serif;
	font-weight: normal;
	margin-top: 7px;
	letter-spacing: -1px;
}
.about h5{
	color:#94CB32;
	font-family: 'Open Sans', sans-serif;
	font-size:0.9em;
}
.about-centre{
	margin:0px 15px;
}
.quites a{
	color: #575757;
	margin-bottom: 0.5em;
	font-size: 1em;
	line-height: 1.2;
	font-family: 'Open Sans', sans-serif;
	font-weight: normal;
	margin-top: 0px;
	letter-spacing: -1px;
	margin-top:10px;
}
.quites a span{
	color:#94CB32;
	text-transform:uppercase;
}
.about-frist li a{
	font-family: 'Open Sans', sans-serif;
	font-size:0.8em;
	color:rgb(155, 155, 155);
	transition: 0.5s ease;
	-o-transition: 0.5s ease;
	-webkit-transition: 0.5s ease;
}
.about-frist li a:hover{
	color:#94CB32;
}
.about-frist ul li{
	line-height: 1.5em;
}
/*  GRID OF THREE   ============================================================================= */
.section {
	clear: both;
	padding: 0px;
	margin: 0px;
}
.group:before,
.group:after {
    content:"";
    display:table;
}
.group:after {
    clear:both;
}
.group {
    zoom:1;
}
.col_1_of_3{
	display: block;
	float:left;
	margin: 1% 0 1% 0%;
}
.col_1_of_3:first-child { margin-left: 0; }

.span_1_of_3 {
	width: 32%;
	padding: 1.5% 2% 0 0;
}
.span_1_of_3  h3{
	color:#575757;
	margin-bottom:0.5em;
	font-size:1.5em;
	line-height: 1.2;
	font-family: 'Open Sans', sans-serif;
	font-weight : normal;
	margin-top: 0px;
	letter-spacing: -1px;
}

.span_1_of_3  p  ,.brand-history p{
	font-family: Arial, Helvetica, sans-serif;
	font-size: 0.8em;
	color: rgb(155, 155, 155);
	line-height: 1.8em;
	margin-bottom: 10px;
}

/***** Media Quries *****/
@media only screen and (max-width: 1024px) {
	.wrap{
		width:95%;
	}	
}
/*  GO FULL WIDTH AT LESS THAN 640 PIXELS */
@media only screen and (max-width: 640px) and (min-width: 480px) {
	.wrap{
		width:95%;
	}
	.col_1_of_3{ 
		margin: 1% 0 1% 0%;
	}
	.span_1_of_3 {
		width:94%;
		padding:3%;  
	}
}

/*  GO FULL WIDTH AT LESS THAN 480 PIXELS */
@media only screen and (max-width: 480px) {
     
     .wrap{
		width:95%;
	}		
	.col_1_of_3{ 
		margin: 1% 0 1% 0%;
	}
	.span_1_of_3 {
		width:92%;
		padding:4%;
	}
}
/*  GRID OF Content and sidebar   ============================================================================= */
.section {
	clear: both;
	padding: 0px;
	margin: 0px;
}
.group:before,
.group:after {
    content:"";
    display:table;
}
.group:after {
    clear:both;
}
.group {
    zoom:1;
}
.cont{
	display: block;
	float:left;
	margin: 1% 0 1% 0;
}
.rsidebar{
	display: block;
	float:left;
} 	
.span_2_of_3 {
	width: 63.1%;
	padding: 1.5% 3.5% 0 0;
}
.span_1_of_3 {
	width: 31.33%;
	padding: 0% 2% 0 0;
}
.span_2_of_3  h3{
	color: #575757;
	margin-bottom:0.5em;
	font-size:1.5em;
	line-height: 1.2;
	font-weight : normal;
	margin-top: 0px;
	letter-spacing: -1px;
	font-family: 'Open Sans', sans-serif;
}
.span_2_of_3 p{
	font-family: Arial, Helvetica, sans-serif;
	font-size: 0.8em;
	color: rgb(155, 155, 155);
	line-height: 1.8em;
	margin-bottom: 10px;
}
.products-info li a.Compar:hover{
	background-position: -39px 29px;
}
/***** Media Quries *****/
@media only screen and (max-width: 1024px) {
	.wrap{
		width:95%;
	}	
}
/*  GO FULL WIDTH AT LESS THAN 640 PIXELS */

@media only screen and (max-width: 640px) and (min-width: 480px) {
	.wrap{
		width:95%;
	}
	.cont{ 
		margin: 1% 0 1% 0%;
	}
	.rsidebar{
		margin:0;
	}
	.span_2_of_3 {
		width:94%;
		padding:3%;  
	}
	.span_1_of_3 {
		width:94%;
		padding:3%; 
	}
}


/*  GO FULL WIDTH AT LESS THAN 480 PIXELS */

@media only screen and (max-width: 480px) {
	.wrap{
		width:95%;
	}
	.cont{ 
		margin: 1% 0 1% 0%;
	}
	.rsidebar{
		margin:0;
	}
	.span_2_of_3 {
		width:92%;
		padding:4%;
	}
	.span_1_of_3 {
		width:92%;
		padding:4%;
	}
}
/*-----back-links----*/
.back-links ul li,.details-categories ul li,.left-value-details{
	display:inline-block;
}
.back-links ul li a,.details-categories ul li a,.details-categories ul li{
	font-family: 'Open Sans', sans-serif;
	color: #575757;
	display: inline-block;
	font-size: 0.9em;
	font-weight: bold;
}
.back-links ul li a:hover,.details-categories ul li a:hover,.active1 a{
	color: #94CB32;
}
.back-links ul li img{
	padding:0px 3px;
}
.back-links{
	padding: 19px 0px 7px 0px;
}
/*---details----*/
#content{
	margin-top:10px;
}
.detalis-image{
	float: left;
    width: 20%;
}
.brand-value,.details-categories{
	float:left;
	margin:2% 0 0 3%;
}
.details-categories ul li a:hover{
	text-decoration:underline;
}
.left-value-details{
	float:left;
	font-weight:normal;
}
.left-value-details ul li{
	display:inline-block;
	font-family: 'Open Sans', sans-serif;
	font-size:0.8em;
}
.left-value-details ul li span{
	text-decoration:line-through;
}
.brand-value{
	font-family: 'Open Sans', sans-serif;
	color: #575757;
	display: inline-block;
	font-weight: bold;
}
.left-value-details ul li h5{
	font-size:2em;
}
.left-value-details{
	float:left;
}
.right-value-details{
	float:right;
	margin-top:5%;
	font-weight:normal;
}
.right-value-details  a{
	color:#D70D87;
}
.brand-value{
	border-bottom:1px solid #e5e5e5;
	width:50%;
	padding-bottom:10px;
}
.brand-value h3{
	border-bottom:1px solid #e5e5e5;
	padding-bottom:10px;
}
.active1  a{
	color:#94CB32;
	text-decoration:underline;
}
.brand-history{
	float:right;
	padding: 10px 0px;
	margin-left: 3%;
}
.brand-history a{
	background: none repeat scroll 0 0 #FFFFFF;
	border: 1px solid #E8E7DC;
	cursor: pointer;
	display: inline-block;
	font: 9px/21px;
	letter-spacing: 2px;
	padding: 10px;
	color: #525049;
	font-family: 'Open Sans', sans-serif;
	text-transform: uppercase;
	margin-left: 0px;
}
.brand-history a:hover{
	background: none repeat scroll 0 0 #F8F8F3;
}
.share ul li{
	display:inline-block;
}
.share{
	float:left;
	margin:1% 0 0 3%;
}
.share ul li img{
	vertical-align:middle;
	margin: 0 6px;
}
.share ul li a{
	font-family: 'Open Sans', sans-serif;
	color: #575757;
	display: inline-block;
	font-size: 0.9em;
	font-weight: bold;
}
.share ul li a:hover{
	color:#94CB32;
}
.brand-history h3{
	font-family: 'Open Sans', sans-serif;
	color: #575757;
	display: inline-block;
	font-size: 0.9em;
}
/*-----*/
.menu_container {
 	margin-top: 5%;
}
.menu_head {
	background: #94CB32;
    color: white;
    cursor: pointer;
    font-family: arial;
    font-size: 14px;
	margin: 0 0 1px 0;
    padding: 7px 11px;
	font-weight: bold;
}
.menu_body {
	background: #fff;
}
.menu_body p{
	font-family: Arial, Helvetica, sans-serif;
	font-size: 0.8em;
	color: rgb(155, 155, 155);
	line-height: 1.8em;
	margin-bottom: 10px;
	padding:10px;
}
.plusminus{
	float:right;
}

/*----pagnation----*/
.pagnation{
	float:right;
	margin-top:10px;
}
.pagnation ul li{
	display:inline-block;
}
.pagnation ul li a{
	background: none repeat scroll 0 0 #FFFFFF;
	border: 1px solid #E8E7DC;
	cursor: pointer;
	display: inline-block;
	font-size: 0.8em;
	padding: 5px 10px;
	color: #525049;
	font-family: 'Open Sans', sans-serif;
	text-transform: uppercase;
	margin-left: 0px;
}
.pagnation ul li a:hover{
	color:#94CB32;
}
/*----error-page-----*/
.error-page{
	text-align:center;
	height:200px;
	padding-bottom:100px;
}
.error-page h3,.error-page h5{
	font-family: 'Open Sans', sans-serif;
	color: #575757;
	font-size:10em;
	padding: 6px 0px 0px 0px;
}
.error-page h5{
	font-size:1.5em;
}
/*----copy-right----*/
.copy-right {
	text-align: center;
	background: #181818;
	padding: 0px 0px 10px 0px;
}
.copy-right p,.copy-right a{
	font-family: 'Open Sans', sans-serif;
	color: #575757;
	display: inline-block;
	font-size: 0.9em;
	font-weight: normal;
}
.copy-right a:hover{
	color:#94CB32;
}
/*----responsive-layouts----*/
@media screen and (max-width: 1366px) {
	.wrap{
		width:90%;
	}
	.span_1_of_4 {
		width: 23%;
		padding: 0px;
	}
}
@media screen and (max-width:1280px){
	.wrap{
		width:90%;
	}
	.products-info ul li {
		padding: 5px;
	}
	.span_1_of_4 {
		width: 24%;
		padding: 0px;
		margin: 4.5px;
	}
}
@media screen and (max-width:1024px){
	.wrap{
		width:90%;
	}
	.images_1_of_4 {
		width: 32%;
		padding-bottom: 10px;
	}
	.images_1_of_4:last-child{
		display:none;
	}
	.span_2_of_3 {
		width: 63%;
	}
	.footer-lastgrid ul li {
		display: block;
		padding: 5px 0px;
	}
	.top-header {
		padding: 7px 0px;
	}
	.header-top-nav ul li {
		padding: 0px 8px;
	}
	.images_1_of_3 h3 {
		font-size:1em;
	}
	.detalis-image-details {
		width: 72%;
	}
}
@media screen and (max-width:800px){
	.wrap{
		width:760px;
	}
	.products-info ul li {
		padding: 0px;
		border:none;
	}
	.images_1_of_3 h3 {
		font-size: 0.9em;
	}
	.span_1_of_4 {
		width: 23%;
	}
	.footer-lastgrid input[type="text"] {
		width: 120px;
	}
	.span_1_of_3 {
		width: 100%;
		padding:0px;
	}
	.about-centre img{
		width:100%;
	}
	.span_2_of_3 {
		width: 100%;
	}
	#wrap ul li {
		width: 47.5%;
	}
	.add-to-cart-button {
		margin-top: 123px;
	}
}
@media screen and (max-width:768px){
	.wrap {
    width: 736px;
}
}
@media screen and (max-width:736px){
	.wrap {
    width: 706px;
}
.top-nav ul li a {
    padding: 10px 13px;
}
}
@media screen and (max-width:667px){
	.wrap {
    width: 640px;
}
.top-nav ul li a {
    padding: 10px 6px;
}
}
@media screen and (max-width:640px){
	.wrap{
		width:90%;
	}
	.logo ,.header-top-nav{
		float:none;
		text-align:center;
	}
	.header-top-nav{
		text-align:left;
	}
	.header-top-nav ul li {
		padding: 0px 3px;
	}
	.images_1_of_3 img{
		width:100%;
	}
	.content-grids {
		width: 100%;
		float: none;
	}
	.images_1_of_4 {
		width: 24.983%;
		margin-right:2%;
	}
	.products-info ul li {
		padding: 4px;
	}
	.products-info ul li:nth-child(2),.products-info ul li:nth-child(3),.products-info ul li:nth-child(4){
		display:none;
	}
	.content-sidebar {
		width:100%;
	}
	.span_1_of_4 {
		width: 47.6%;
	}
	.detalis-image-details {
		width: 64%;
	}
	.top-nav {
    float: right;
    width: 100%;
    text-align: center;
}
.top-nav ul li a {
    padding: 12px 16px;
}
.search-bar, .header-top-nav {
    float: right;
    text-align: center;
    width: 100%;
}
}
@media screen and (max-width:600px){
.images_1_of_4 {
    width: 24.5%;
    margin-right: 2%;
}
}
@media screen and (max-width:568px){
.top-nav ul li a {
    padding: 12px 12px;
}
}
@media screen and (max-width:480px){
	.wrap{
		width:90%;
	}
	.top-nav ul li a {
		padding:6px 4px;
	}
	.header-top-nav ul li a{
		font-size: 0.88em;
	}
	.images_1_of_4 {
		width: 22.85%;
	}
	.span_1_of_4 {
		width: 100%;
	}
	.header-top-nav,.search-bar{
		display:none;
	}
	.top-header {
		margin:0px;
	}
	.detalis-image {
		float: none;
		width: 100%;
		text-align:center;
	}
	.detalis-image-details {
		float:none;
		width: 100%;
	}
	.details-categories{
		margin:0px;
		margin-top:10px;
	}
	.brand-value {
		margin:0px;
		width:100%;
	}
	.brand-history{
		margin:0px;
	}
	.logo{
		padding:20px 0px;
	}
}
@media screen and (max-width:414px){
.images_1_of_4 {
    width: 92%;
}
.images_1_of_4 {
    margin-right: 0%;
}
.top-nav ul li a {
    padding: 6px 2px;
}
a#show_cart {
    width: 90%;
	    padding: 7px 0;
}
}
@media screen and (max-width:384px){
.top-nav ul li a {
    font-size: 0.8em;
}
}
@media screen and (max-width:320px){
.wrap {
    width: 95%;
}
.top-nav ul li a {
    font-size: 0.7125em;
	padding: 6px 1px;
}
}
</style>
</html>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<header>
	<div class="category">
		<ul>
			<li><a><img src="img/hanul.logo.png"></a></li>
			<li><a class="active" href="list.cu">��������</a></li>
			<li><a>�������</a></li>
			<li><a>��������</a></li>
			<li><a>�����</a></li>
			<li><a>����������</a></li>
			<li><a>�ð�ȭ</a></li>
			
		</ul>
	</div>
</header>
<style>
	header {
		border-bottom: 1px solid #ccc;
		display: flex;
		justify-content: space-between;
		/* width: calc(100% - 200px); */
		padding: 0px 100px;
	}
	header div.category ul {
		display: flex;
		font-weight: bold;
	}
	header div.category ul li:not(:last-child) {
		margin-right: 50px;
	}
	header div.category ul li a:hover,
	header div.category ul li a.active {
		color: #0040ff;
	}
	
	a {
		cursor: pointer;
	}
	
	
</style>
<link rel="stylesheet" type="text/css" href="css/common.css">




















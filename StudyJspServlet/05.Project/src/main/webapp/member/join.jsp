<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
/* 
	input:not(:first-child){
	margin-top: 5px;
	}
 */
	table tr:last-child td input[name=address]{
		margin-top: 5px;
	}
	
	.ui-datepicker table tr th:first-child {
	border-right: none;
	}
	
	.ui-datepicker table tr {
	border-bottom: none;
	}
	
	#delete {
		position: relative;
		right: 30px;
		display: none;
	}

</style>
<link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
</head>
<body>
<jsp:include page="/include/layout.jsp"/>
<div class="container-fluid px-4">
	<h3 class="mt-4">회원가입</h3>
	<p>* 는 필수입력 항목입니다</p>
	<form>
		<table class="w-px600">
			<tr>
				<th class="w-px140">* 성명</th>
				<td>
					<input type="text" name="name"/>
				</td>
			</tr>
			<tr>
				<th class="w-px140">* 아이디</th>
				<td>
					<input type="text" name="userid" class="chk"/>
					<a class="btn-fill" id="id_check">아이디 중복확인</a>
					<div class="valid">아이디를 입력하세요(영문소문자,숫자만 입력가능)</div>
				</td>
			</tr>
			<tr>
				<th class="w-px140">* 비밀번호</th>
				<td>
					<input type="password" name="userpw" class="chk"/>
					<div class="valid">비밀번호를 입력하세요(영문대/소문자,숫자를 모두 포함)</div>
				</td>
			</tr>
			<tr>
				<th class="w-px140">* 비밀번호확인</th>
				<td>
					<input type="password" name="userpw_ck" class="chk"/>
					<div class="valid">비밀번호를 다시 입력하세요</div>
				</td>
			</tr>
			<tr>
				<th class="w-px140">* 성별</th>
				<td>
					<label><input type="radio" name="gender" value="남"/>남</label>
					<label><input type="radio" name="gender" value="여" checked/>여</label>
				</td>
			</tr>
			<tr>
				<th class="w-px140">* 이메일</th>
				<td>
					<input type="text" name="email" class="chk"/>
					<div class="valid">이메일을 입력하세요</div>
				</td>
			</tr>
			<tr>
				<th class="w-px140">생년월일</th>
				<td><input type="text" name="birth" readonly/><a id="delete"><i class="font-r fa-solid fa-calendar-xmark"></i></a></td>
			</tr>
			<tr>
				<th class="w-px140">전화번호</th>
				<td><input type="text" name="phone"/></td>
			</tr>
			<tr>
				<th class="w-px140">주소</th>
				<td>
					<a class="btn-fill" id="post">우편번호찾기</a>
					<input type="text" name="post" class="w-px80" readonly/>
					<input type="text" name="address" readonly/>
					<input type="text" name="address"/>
				</td>
			</tr>		
		</table>
	</form>
</div>
<script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src='js/join_check.js'></script>
<script type="text/javascript">
$('#id_check').on('click', function(){
	id_check();
});
//아이디 중복확인처리
function id_check(){
	var $userid= $('[name=userid]');
	//유효한 입력 아이디에 대해서만 중복확인
	var status = join.tag_status( $userid );
	if( status.code=='invalid' ){
		alert( '아이디 중복확인 불필요\n' +  status.desc );
		$userid.focus();
		return;
	}
	
	$.ajax({
		url: 'id_check.mb',
		data: { id: $userid.val() },
		success: function(){
			
		},error: function(req, text){
			alert(text +':' +req.status);
		}
	});
	
}

//입력의 유효성을 판단
$('.chk').on('keyup', function(){
	var status = join.tag_status( $(this) );
	$(this).siblings('div').text( status.desc ).removeClass().addClass(status.code);
});

//만13세까지만 가입 가능
var today = new Date();
var start = today.getFullYear()-100;
today.setFullYear(today.getFullYear() - 13);
today.setDate(today.getDate()-1);
var defaultDay = new Date();
defaultDay.setFullYear(1990);	//1990-07-13일이 있는 달력이 기본으로 보이게
	
$( "[name=birth]" ).datepicker({
	dateFormat: 'yy-mm-dd',
	dayNamesMin: ['일','월','화','수','목','금','토'],
	showMonthAfterYear: true,
	monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
	changeYear: true,
	changeMonth: true,
	//beforeShowDay: before,
	maxDate: today,
	yearRange: start + ':' + today.getFullYear(),
	//yearRange: '1922:2009',
	defaultDate: defaultDay,
});

//특정날짜(오늘)까지만 선택할 수 있게
function before(date) {
	if(date > new Date())	return [false];
	else					return [true];
}

//생년월일을 변경하면 삭제이미지가 보이게
$('[name=birth]').change(function(){
	$('#delete').css('display','inline');
});

//달력삭제 클릭시 생년월일 없애기, 삭제이미지도 안보이게
$('#delete').click(function(){
	$('[name=birth]').val('');
	$('#delete').css('display','none');
});

//$('#post').click(function () {
$('#post').on('click',function () {	
    new daum.Postcode({
        oncomplete: function(data) {
        	console.log(data);
        	$('[name=post]').val(data.zonecode);
        	//R:도로명주소, J:지번주소
        	var address = data.userSelectType == 'R' ? data.roadAddress : data.jibunAddress;
        	if(data.buildingName!='') address += '(' + data.buildingName + ')';
        	$('[name=address]').eq(0).val(address);     	
        }
    }).open();
});


</script>
<jsp:include page="/include/footer.jsp"/>			
</body>
</html>
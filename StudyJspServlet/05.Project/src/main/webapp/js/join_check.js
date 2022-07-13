/**
 * 회원가입이 입력유효성 확인
 */
 
 var join = {//밑에 있는 것들은 속성 : 함수(파라메터)
	tag_status: function( tag ){
		var name = tag.attr('name');
		if(name=='userid')			return this.id_status( tag.val() );
		else if(name=='userpw')		return this.pw_status( tag.val() );
		else if(name=='userpw_ck')	return this.pw_ck_status( tag.val() );
		else if(name=='email')		return this.email_status( tag.val() );
	},
	
	//공백
	space: /\s/g,
	
	//이메일
	email_status: function(email){
		var reg = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
		if(email == '')						return this.common.empty;
		else if(email.match(this.space))	return this.common.space;
		else if(reg.test(email))			return this.email.valid;
		else								return this.email.invalid;
	},
	
	email: {
		valid: {code:'valid', desc:'사용가능한 이메일입니다'},
		invalid: {code:'invalid', desc:'이메일 형식이 아닙니다'}
	},
		
	//비밀번호 다시입력
	pw_ck_status: function(pw_ck){
		//비밀번호와 입력값이 같은지 확인
		if( pw_ck == '' )							return this.common.empty;
		else if(pw_ck==$('[name=userpw]').val())	return this.pw.equal;		
		else										return this.pw.notEqual;		
	},
	
	//비밀번호
	pw_status: function( pw ){
		//영문대소문자,숫자를 모두 포함
		var reg = /[^a-zA-Z0-9]/g, upper = /[A-Z]/g, lower = /[a-z]/g, digit = /[0-9]/g ;
		
		if(pw=='')						return this.common.empty;
		else if(pw.match(this.space))	return this.common.space;
		else if(reg.test(pw))			return this.pw.invalid;
		else if(pw.length < 5)			return this.common.min;
		else if(pw.length > 10)			return this.common.max;
		else if(!upper.test(pw) || !lower.test(pw) || !digit.test(pw))
										return this.pw.lack;
		else							return this.pw.valid;		
	},
	
	pw: {//자세히 하고 싶으면 CASE로 나눠서 하기
		equal: {code:'valid', desc:'비밀번호가 일치합니다'},
		notEqual: {code:'invalid', desc:'비밀번호가 일치하지 않습니다'},
		lack: {code:'invalid', desc:'영문 대/소문자, 숫자를 모두 포함해야 합니다'},
		invalid: {code: 'invalid', desc:'비밀번호는 영문 대/소문자, 숫자만 입력가능합니다'},
		valid: {code:'valid', desc:'사용가능한 비밀번호입니다'}
	},
	
	//아이디
	id_status: function( id ){
		//영문소문자나 숫자외에는 입력불가
		var reg = /[^a-z0-9]/g; 
		if(id=='')						return this.common.empty;
		else if(id.match(this.space))	return this.common.space;
		else if(reg.test(id))			return this.id.invalid;
		else if(id.length < 5)			return this.common.min;
		else if(id.length > 10)			return this.common.max;
		else							return this.id.valid;
	},
	
	id: {
		invalid: {code:'invalid', desc:'영문 소문자, 숫자만 입력하세요'},
		valid: {code:'valid', desc:'사용가능한 아이디입니다'}
		
	},
	
	common: {//공통으로 들어갈 것
		min: {code:'invalid', desc:'최소 5자 이상 입력하세요'},
		max: {code:'invalid', desc:'최대 10자 이하로 입력하세요'},
		space: {code:'invalid', desc:'공백없이 입력하세요'},
		empty: {code:'invalid', desc:'입력하세요'}
	}
	
}//join
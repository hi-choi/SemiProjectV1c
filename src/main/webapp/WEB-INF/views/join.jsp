<%@ page pageEncoding="UTF-8"%>

<h2>회원가입</h2>
<span style="color:red">${error}</span>

<form name="joinfrm" id="joinfrm" method="post">
	<div>
		<label for="userid">아이디 &nbsp;</label><input type="text" name="userid"
			id="userid">
	</div>
	<div>
		<label for="passwd">비밀번호&nbsp;</label><input type="password"
			name="passwd" id="passwd">
	</div>
	<div>
		<label for="chkpwd">비밀번호확인&nbsp;</label><input type="password"
			name="chkpwd" id="chkpwd">
	</div>
	<div>
		<label for="name">이름&nbsp;</label><input type="text" name="name"
			id="name">
	</div>
	<div>
		<label for="email">이메일&nbsp;</label><input type="text" name="email"
			id="email">
	</div>
	<div>
		<label></label>
		<button type="button" id="okbtn">입력완료</button>
		<button type="reset">다시입력</button>
	</div>
</form>
<script>
		var okbtn = document.getElementById('okbtn');
		okbtn.addEventListener('click',checkjoinfrm);
		
		function checkjoinfrm(){
			
			var frm = document.getElementById('joinfrm');
			if (frm.userid.value == '')
				alert('아이디를 입력하세요!');
			else if (frm.passwd.value=='')
				alert('비밀번호를 입력하세요!');
			else if (frm.chkpwd.value=='')
				alert('비밀번호 확인을 입력하세요!');
			else if (frm.chkpwd.value != frm.passwd.value ){
				alert('비밀번호가 서로 일치하지 않습니다!');
			}
			else if (frm.name.value=='')
				alert('이름을 입력하세요!');
			else if (frm.email.value=='')
				alert('이메일을 입력하세요!');
			else{
				frm.action = 'join';
				frm.submit();
			}
		}
	</script>
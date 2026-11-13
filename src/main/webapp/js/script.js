function checkInput(){
	const sno=document.querySelector(".sno");
	const sname=document.querySelector(".sname");
	const saddr=document.querySelector(".saddr");
	if(sno.value==""){
		alert("학교 번호를 입력하세요.");
		sno.focus();
		return false;
	}
	if(sname.value==""){
		alert("학교 이름을 입력하세요.");
		sname.focus();
		return false;
	}
	if(saddr.value==""){
		alert("학교 주소를 입력하세요.");
		saddr.focus();
		return false;
	}
	return true;
}
function checkSports(){
	const sno=document.querySelector(".sno");
	const sname=document.querySelector(".sname");
	const smajor=document.querySelector(".smajor");
	
	if(sno.value==""){
		alert("선수 번호를 입력하세요.");
		sno.focus();
		return false;
	}
	if(sname.value==""){
		alert("선수 이름을 입력하세요.");
		sname.focus();
		return false;
	}
	if(smajor.value==""){
		alert("선수 종목을 입력하세요.");
		smajor.focus();
		return false;
	}
	return true;
}
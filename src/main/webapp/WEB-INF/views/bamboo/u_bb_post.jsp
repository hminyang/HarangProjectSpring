<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ include file="../include/header.jsp"%>
<!-- 해더  삽입  [지우지마세여]------------------------------------------------------------------------------------------------->
<!-- 페이지 헤드 라인 : 제목 -->
<head>
<title>대나무숲</title>

<script>

function fnbbp(){
	
	//alert(CKEDITOR.instances.editor1.getData().length);
	
	if(document.bbpostcomplete.bb_nickname.value ==""||
			CKEDITOR.instances.bb_content.getData() ==""||
			document.bbpostcomplete.bb_title.value ==""){
		
		alert("빠짐없이 입력 해주세요");
		return;
		
	}
	else if(document.bbpostcomplete.bb_nickname.value.length>50){
		
		
		alert("닉네임을 너무 길게 입력하셨습니다. 50글자 이하로 입력 해 주세요.(공백 포함)");
		return;
	}
	else if(document.bbpostcomplete.bb_title.value.length>200){
		
		
		alert("제목을 너무 길게 입력하셨습니다. 200글자 이하로 입력 해 주세요.(공백 포함)");
		return;
	}
	
	
	
	
	else {
		document.bbpostcomplete.submit();
					
	}
	
}








</script>

</head>
<!-- 메인 페이지 구역 , 즉 작업 구역 -->
<div class="content-wrapper">
	<!----------------------------------- 메인페이지 헤더 [작업 제목] ------------------------------------------------------------->
	<section class="content-header">
		<h1>
			대나무숲 <small>학생이 대숲 글 쓰는 곳</small>
		</h1>
		<ol class="breadcrumb">
			<!-- 페이지 기록 : 메인에서 부터 현재 페이지 까지의 경로 나열 -->
			<li><a href="#"><i class="fa fa-dashboard"></i> 메인</a></li>
			<li class="active">대나무숲</li>
		</ol>
	</section>
	<!------------------------------------ 메인페이지 바디 [작업 내용] ------------------------------------------------------------>
	<form action="/bamboo/BB_POST" name="bbpostcomplete" method="post">
	<input type = "hidden" name = "m_id" value = "${sessionScope.member.m_id }">
		
		
		<section class="content">
			<!-- 세로 길이 수정 -->
			<div class="row">
				<!-- 너비 사이즈 수정  : col-->
				<div class="col-md-9">

					<div class='box box-info'>
						<div class='box-header'>
							<h3 class='box-title'>대나무숲 글 등록</h3>
							<br> <br>
							<!-- tools box -->

							<div class="form-group">
								<label>제목</label> <input type="text" class="form-control"
									placeholder="제목을 입력 해 주세요" name="bb_title" id="bb_title" />
							</div>

							<div class="form-group">
								<label>닉네임</label> <input type="text" class="form-control"
									placeholder="닉네임을 입력 해 주세요" name="bb_nickname" />
							</div>








						</div>
						<!-- /.box-header -->





						<div class='box-body pad'>

							<textarea id="bb_content" name="bb_content" rows="10" cols="80"  placeholder="Enter the text...">
                                         
                    </textarea>
						</div>

						<div class="row">
							<div class="col-md-4"></div>
							<div class="col-md-2">
								<a type="button" class="btn btn-block btn-primary"
								href="javascript:fnbbp()">등록</a>
							</div>
							<div class="col-md-2">
								<a class="btn btn-block btn-danger"
									href="/bamboo/BB_LIST">취소</a>
							</div>
						</div>



					</div>
					<!-- /.box -->
				</div>
				<!-- /.col -->
			</div>
			<!-- /.row -->
		</section>
	</form>
	<!-- /. 작업 공간 끝! -->
	<!------------------------------------------------------------------------------------------------------------------->
</div>
<!-- /. 전체를 감싸주는 틀입니다. 지우지 마세여. -->

<!-- 푸터(footer) 삽입 [지우지 마세여] ------------------------------------------------------------------------------------------------------>
<%@ include file="../include/footer.jsp"%>

<!-- CK Editor -->
<script src="../resources/plugins/ckeditor/ckeditor.js"></script>
<!-- jQuery 2.1.3 -->
<script src="../resources/plugins/jQuery/jQuery-2.1.3.min.js"></script>
<!-- Bootstrap 3.3.2 JS -->
<script src="../resources/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<!-- FastClick -->
<script src='../resources/plugins/fastclick/fastclick.min.js'></script>
<!-- AdminLTE App -->
<script src="../resources/dist/js/app.min.js" type="text/javascript"></script>
<!-- AdminLTE for demo purposes -->
<script src="../resources/dist/js/demo.js" type="text/javascript"></script>
<!-- Bootstrap WYSIHTML5 -->
<script
	src="../resources/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"
	type="text/javascript"></script>
<script type="text/javascript">
		
	       // ckeditor setting
	       var ckeditor_config = {
	            resize_enabled : true, // 에디터 크기를 조절함
	            enterMode : CKEDITOR.ENTER_BR , // 엔터키를 <br> 로 적용함.
	            shiftEnterMode : CKEDITOR.ENTER_P ,  // 쉬프트 +  엔터를 <p> 로 적용함.
	            toolbarCanCollapse : true , 
	            removePlugins : "elementspath", // DOM 출력하지 않음
	            filebrowserUploadUrl: '/bamboo/file_upload', // 파일 업로드를 처리 할 경로 설정.
	            // 에디터에 사용할 기능들 정의
	            toolbar : [
	              [ 'Source', '-' , 'NewPage', 'Preview' ],
	              [ 'Cut', 'Copy', 'Paste', 'PasteText', '-', 'Undo', 'Redo' ],
	              [ 'Bold', 'Italic', 'Underline', 'Strike', 'Subscript', 'Superscript'],
	              [ 'JustifyLeft', 'JustifyCenter', 'JustifyRight', 'JustifyBlock' ],
	              '/',
	              [ 'Styles', 'Format', 'Font', 'FontSize' ],
	              [ 'TextColor', 'BGColor' ],
	              [ 'Image', 'Flash', 'Table','SpecialChar' , 'Link', 'Unlink','Youtube']

	            ]
	          };
	       
	       var editor = null;
	       
	       jQuery(function() {
	            // ckeditor 적용
	            editor = CKEDITOR.replace( "bb_content" , ckeditor_config );
	       });


	       // 전송을 위한 체크 함수
	       function form_save(form) {
	            editor.updateElement();

	       }
		
		// Replace the <textarea id="editor1"> with a CKEditor
		// instance, using default configuration.
		//CKEDITOR.replace('editor1');
		//bootstrap WYSIHTML5 - text editor
		//$(".textarea").wysihtml5();
</script>




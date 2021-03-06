<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ include file="../include/header.jsp"%>
<!-- 해더  삽입  [지우지마세여]------------------------------------------------------------------------------------------------->
<!-- 페이지 헤드 라인 : 제목 -->
<head>
	<title>기본 값 페이지</title>
</head>
	<!-- 메인 페이지 구역 , 즉 작업 구역 -->
<div class="content-wrapper">
<!----------------------------------- 메인페이지 헤더 [작업 제목] ------------------------------------------------------------->
<section class="content-header">
	<h1>
		나의 페이지
		<small>나의 중고도서 거래 내역을 알 수 있습니다.</small>
	</h1>
	<ol class="breadcrumb">
		<!-- 페이지 기록 : 메인에서 부터 현재 페이지 까지의 경로 나열 -->
		<li><a href="#"><i class="fa fa-dashboard"></i> 메인</a></li>
		<li class="active">하랑딘24</li>
		<li class="active">마이페이지</li>
	</ol>
</section>
<!------------------------------------ 메인페이지 바디 [작업 내용] ------------------------------------------------------------>
<section class="content">
	<div class="row">
		<div class="col-md-11">
			<!-- 나의 도서 기부 내역 -->
					<div class="box box-success">
						<div class="box-header with-border">
	                		<h3 class="box-title">기부 내역</h3>
							<small>나의 도서 기부 내역입니다. 기부 현 상태를 알 수 있습니다.</small>
						</div><!-- /.box-header -->
							
						<div class="box-body">
							<table class="table table-bordered table-hover dataTable">
								<tr role="row">
									<th style="width: 50px">거래번호</th>
									<th style="width: 40%">도서명</th>
									<th>지은이</th>
									<th>출판사</th>
									<th>신청일</th>
									<th>기부상태</th>
								</tr>

								<c:choose>
                     			 <c:when test="${fn:length(harangdinmain) eq 0}">
                     			</c:when>
                     			 <c:otherwise>
								<c:forEach items="${harangdinmain}" var="i" varStatus="k">
											
									<tr>
										<td>${i.b_num }</td>
										<td>
											<a style="cursor:pointer;" onclick="fnRead('${i.b_num}')">${i.b_name}</a>
										</td>
										<td>${i.b_writer }</td>
										<td>${i.b_pub }</td>
										<td>${i.b_regdate }</td>
										<td>${i.b_iscomplete }</td>
									</tr>
											
								</c:forEach>
							</c:otherwise>
                   		 </c:choose>
							</table>
	               		</div><!-- /.box-body -->
	               			
						<!-- 페이징 버튼 -->
						<div class="box-footer clearfix">
							<ul class="pagination pagination-sm no-margin pull-right">
								<c:if test="${pageMaker.prev}">
									<li><a href="/harangdin/donationList${pageMaker.makeQuery(pageMaker.startPage-1)}">&laquo;</a></li>
								</c:if>
								<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
									<li value="${pageMaker.cri.page == idx ? 'class=active' : ''}">
										<a href="/harangdin/donationList?page=${idx}"> ${idx} </a>
									</li>
								</c:forEach>
									<c:if test="${pageMaker.next && pageMaker.endPage>0}">
										<li><a href="/harangdin/donationList${pageMaker.makeQuery(pageMaker.endPage+1)}">&raquo;</a></li>
								</c:if>
							</ul>							
						</div><!-- 페이징 버튼 -->
					</div><!-- /.box -->  
				</div><!-- /.col -->
			</div>
		</div>
	</div>
</section><!-- /. 작업 공간 끝! -->
<!------------------------------------------------------------------------------------------------------------------->
</div><!-- /. 전체를 감싸주는 틀입니다. 지우지 마세여. -->

<!-- 페이징 관련 폼 ----------------------------------------------------------------------->

<!-- 글 읽기 -->
<form name="read" method="post" action="/harangdin/bdetail">
	<input type="hidden" name="b_num" value="" id="b_num"/>
	<input type="hidden" name="m_id" value="" id="m_id"/>
	<input type="hidden" name="nowPage" value="${paging.nowPage}"/>
	<input type="hidden" name="nowBlock" value="${paging.nowBlock}"/>
</form>
<!-- 페이징 관련 폼 여기까지입니다. ----------------------------------------------------------------------------------- -->

<!-- 푸터(footer) 삽입 [지우지 마세여] ------------------------------------------------------------------------------------------------------>
<%@ include file="../include/footer.jsp"%>

<script>
	///////////////// 페이지 관련 javascript function////////////////////
	function prevPage(){
		document.getElementById("prevPage").submit();
	}
	function nextPage(){
		document.getElementById("nextPage").submit();
	}
	function goPage(nowPage){
		document.getElementById("page").value = nowPage;
		document.getElementById("goPage").submit();
	}
	/////////////////////////////끝//////////////////////////////////
	
	function fnRead(b_num){
		document.getElementById("b_num").value = b_num;
		document.read.submit();
	}
</script>

<!-- --------------------------------------------------------------------------------------------------- -->

 

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
	<body>
	<%@ include file="include/layout.jsp" %>
		<div class="card-body">
        	<table id="datatablesSimple">
	                                   <thead>
	                                       <tr>
	                                           <th>번호</th>
	                                           <th>이름</th>
	                                           <th>성별</th>
	                                           <th>이메일</th>
	                                           <th>핸드폰</th>
	                                       </tr>
	                                   </thead>
	                                   <tfoot>
	                                       <tr>
	                                           <th>번호</th>
	                                           <th>이름</th>
	                                           <th>성별</th>
	                                           <th>이메일</th>
	                                           <th>핸드폰</th>
	                                       </tr>
	                                   </tfoot>
	                                   <tbody>
	                                       <tr>
	                                           <td>Tiger Nixon</td>
	                                           <td>System Architect</td>
	                                           <td>Edinburgh</td>
	                                           <td>61</td>
	                                           <td>2011/04/25</td>
	                                       </tr>
	                                   </tbody>
	    	</table>
		</div>
                        
	<%@ include file="include/footer.jsp" %>
    </body>
</html>

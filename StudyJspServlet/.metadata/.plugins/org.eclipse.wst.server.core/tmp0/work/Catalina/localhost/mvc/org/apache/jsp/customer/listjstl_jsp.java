/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-07-13 00:36:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import customer.CustomerDTO;
import java.util.List;

public final class listjstl_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/include/footer.jsp", Long.valueOf(1656655828988L));
    _jspx_dependants.put("jar:file:/D:/Study_JspServlet/Workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/04.MybatisMVC/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1657094743179L));
    _jspx_dependants.put("/include/header.jsp", Long.valueOf(1657175059492L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("customer.CustomerDTO");
    _jspx_imports_classes.add("java.util.List");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- JSTL 태그를 이용하기 위한 준비 ↑  -->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	#new_btn{\r\n");
      out.write("		position: fixed;\r\n");
      out.write("		right: 20%;\r\n");
      out.write("		top: 20%;\r\n");
      out.write("		z-index: 999;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- $<-동적으로 request에 있는 자원에 접근해서 사용\r\n");
      out.write("  -->\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=CHROME\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>실습용 테마</title>\r\n");
      out.write("    <link rel=\"icon\" href=\"favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/c47106c6a7.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <script src=\"js/ie.js\"></script>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	 <header>\r\n");
      out.write("        <div class=\"inner\">\r\n");
      out.write("            <h1><a href=\"#\">HANUL301</a></h1>\r\n");
      out.write("            <ul id=\"gnb\">\r\n");
      out.write("                <li><a href=\"list.st\">JDBC(학생목록조회)</a></li>\r\n");
      out.write("                <li><a href=\"list.cu\">고객관리(Mybatis)</a></li>\r\n");
      out.write("                <li><a href=\"list.hr\">Mybatis(사원목록조회)과제</a></li>\r\n");
      out.write("                <li><a href=\"list.js\">JSTL사용</a></li>\r\n");
      out.write("                <!--  list.jsp(jstl폴더안에있음)을 연결하세요. -->\r\n");
      out.write("                <li><a href=\"#\">게시판</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("            <ul class=\"util\">\r\n");
      out.write("                <li><a href=\"#\">로그인</a></li>\r\n");
      out.write("                <li><a href=\"#\">회원가입</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	<h1>고객관리 모듈(JSTL)</h1>\r\n");
      out.write("	<button type=\"button\"  id=\"new_btn\" class=\"btn btn-primary\" onclick=\"showModalInsert();\" >신규 고객 추가</button>\r\n");
      out.write("	\r\n");
      out.write("	<table class=\"styled-table\">\r\n");
      out.write("		<thead>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>아이디</th>\r\n");
      out.write("				<th>이름</th>\r\n");
      out.write("				<th>성별</th>\r\n");
      out.write("				<th>이메일</th>\r\n");
      out.write("				<th>핸드폰</th>\r\n");
      out.write("				<th>수정</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</thead>\r\n");
      out.write("		<tbody>\r\n");
      out.write("	\r\n");
      out.write("	");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	\r\n");
      out.write("			</tbody>\r\n");
      out.write("	</table>\r\n");
      out.write("	\r\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">고객 추가</h5>\r\n");
      out.write("        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("          <div class=\"mb-3\">\r\n");
      out.write("            <label for=\"recipient-name\" class=\"col-form-label\">이름</label>\r\n");
      out.write("            <input type=\"text\" name=\"name\" class=\"form-control\" id=\"recipient-name\">\r\n");
      out.write("          </div>\r\n");
      out.write("           <div class=\"mb-3\">\r\n");
      out.write("            <label for=\"recipient-name\" class=\"col-form-label\">성별</label>\r\n");
      out.write("            <input type=\"radio\" checked=\"checked\" name=\"gender\" value=\"남\" />남\r\n");
      out.write("            <input type=\"radio\" name=\"gender\" value=\"여\" />여\r\n");
      out.write("          </div>\r\n");
      out.write("           <div class=\"mb-3\">\r\n");
      out.write("            <label for=\"recipient-name\" class=\"col-form-label\">이메일</label>\r\n");
      out.write("            <input type=\"text\" name=\"email\" class=\"form-control\" id=\"recipient-name\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"mb-3\">\r\n");
      out.write("            <label for=\"recipient-name\" class=\"col-form-label\">핸드폰</label>\r\n");
      out.write("            <input type=\"text\" name=\"phone\" class=\"form-control\" id=\"recipient-name\">\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("        <input type=\"hidden\" name=\"id\"> <!-- ajax를 통해서 전송하기위한 태그  -->\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">닫기</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\" name=\"submit\" onclick=\"addCustomer();\">추가</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"inner\">\r\n");
      out.write("            <div class=\"upper\">\r\n");
      out.write("                <h1>한울직업전문학교</h1>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">Policy</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Terms</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Family Site</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Sitemap</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"lower\">\r\n");
      out.write("                <address>\r\n");
      out.write("                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Quas, facere.<br>\r\n");
      out.write("                    TEL : 062-111-1234 C.P : 010-1234-5678\r\n");
      out.write("                </address>\r\n");
      out.write("                <p>\r\n");
      out.write("                    2022 Hanul &copy; copyright all right reserved.\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		function showModalInsert() {\r\n");
      out.write("			$('#exampleModal').modal('show');//hide 숨김\r\n");
      out.write("			$('[name=submit]').attr('onclick' ,'addCustomer()');\r\n");
      out.write("		}\r\n");
      out.write("		function showModal(id , name , email , phone , gender) {\r\n");
      out.write("			$('[name=submit]').attr('onclick' ,'modifyCustomer()');\r\n");
      out.write("			 $('[name=name]').val(name);\r\n");
      out.write("			 $('[name=id]').val(id); // 수정시 id정보가 필요함.\r\n");
      out.write("			 $(\"[name=gender]\").attr('checked',false);\r\n");
      out.write("			 if(gender == '남'){\r\n");
      out.write("				 $(\"input:radio[name=gender]:input[value='남']\").attr('checked',true);\r\n");
      out.write("			 }else{\r\n");
      out.write("				 $(\"input:radio[name=gender]:input[value='여']\").attr('checked',true);\r\n");
      out.write("			 }\r\n");
      out.write("			/* 보류 => jquery로 나중에 처리  \r\n");
      out.write("			if(gender == '남'){\r\n");
      out.write("				 $('[name=gender]')[0].attr('checked' , false);\r\n");
      out.write("				 $('[name=gender]')[1].attr('checked' , false);\r\n");
      out.write("			 }else{\r\n");
      out.write("				 \r\n");
      out.write("			 } */\r\n");
      out.write("			//  $('[name=gender]').val('');\r\n");
      out.write("			  $('[name=email]').val(email);\r\n");
      out.write("			  $('[name=phone]').val(phone);\r\n");
      out.write("			  \r\n");
      out.write("			  $('#exampleModal').modal('show');\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		function addCustomer() {\r\n");
      out.write("			/* alert( $('[name=name]').val() );  jquery를 이용해서 name속성이 name의 값을 가져옴*/\r\n");
      out.write("			/* ajax<-통신 이용해서 insert.cu를 만들고 해당하는 Servlet까지 값을 전송해보기  */\r\n");
      out.write("			var gender = $('[name=gender]:checked').val();\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url: 'insert.cu',\r\n");
      out.write("				data: {/*request.getParameter로 받아줄것(name) : <- 넣어줄 실제값   */\r\n");
      out.write("					  name:$('[name=name]').val(),\r\n");
      out.write("					  gender:gender,\r\n");
      out.write("					  email:$('[name=email]').val(),\r\n");
      out.write("					  phone:$('[name=phone]').val()\r\n");
      out.write("					  },\r\n");
      out.write("				success: function ( response) {\r\n");
      out.write("					  $('[name=name]').val('');\r\n");
      out.write("					  $('[name=gender]').val('');\r\n");
      out.write("					  $('[name=email]').val('');\r\n");
      out.write("					  $('[name=phone]').val('');\r\n");
      out.write("				},error: function (req,msg) {\r\n");
      out.write("					alert(msg + \" : \");\r\n");
      out.write("				}	  \r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			location.reload();\r\n");
      out.write("			$('#exampleModal').modal('hide');\r\n");
      out.write("			\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		/* addCustomer를 재활용(복붙) \r\n");
      out.write("			바뀌어야할부분 insert=>update 정보추가x , 정보 수정\r\n");
      out.write("			insert.cu => update.cu\r\n");
      out.write("			정보추가시 트리거를 이용해서 id가 자동채번되고있음\r\n");
      out.write("			정보수정시 이미 생성된↑ id를 키값으로 어떤 행이 수정될지를 지정해줘야함.(where 필요)\r\n");
      out.write("		*/\r\n");
      out.write("		function modifyCustomer() {\r\n");
      out.write("			/* alert( $('[name=name]').val() );  jquery를 이용해서 name속성이 name의 값을 가져옴*/\r\n");
      out.write("			/* ajax<-통신 이용해서 insert.cu를 만들고 해당하는 Servlet까지 값을 전송해보기  */\r\n");
      out.write("			var gender = $('[name=gender]:checked').val();\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url: 'update.cu',\r\n");
      out.write("				data: {/*request.getParameter로 받아줄것(name) : <- 넣어줄 실제값   */\r\n");
      out.write("					  id:$('[name=id]').val(),\r\n");
      out.write("					  name:$('[name=name]').val(),\r\n");
      out.write("					  gender:gender,\r\n");
      out.write("					  email:$('[name=email]').val(),\r\n");
      out.write("					  phone:$('[name=phone]').val()\r\n");
      out.write("					  },\r\n");
      out.write("				success: function ( response) {\r\n");
      out.write("					alert(response);\r\n");
      out.write("					  $('[name=name]').val('');\r\n");
      out.write("					  $('[name=gender]').val('');\r\n");
      out.write("					  $('[name=email]').val('');\r\n");
      out.write("					  $('[name=phone]').val('');\r\n");
      out.write("				},error: function (req,msg) {\r\n");
      out.write("					alert(msg + \" : \");\r\n");
      out.write("				}	  \r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			location.reload();\r\n");
      out.write("			$('#exampleModal').modal('hide');\r\n");
      out.write("			\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		/*  addCustomer 평션을 만들고 input type에 들어있는 값들을 콘솔 또는 alert이용해서 띄워보기*/\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /customer/listjstl.jsp(42,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/customer/listjstl.jsp(42,1) '${list}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /customer/listjstl.jsp(42,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("dto");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("		<tr>\r\n");
            out.write("			<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("			<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("			<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.gender}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("			<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("			<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("			<td>\r\n");
            out.write("			<!-- EL문법으로 showModal에 파라메터를 하나 전송 전송 된 파라메터를 alert 으로 출력 -->\r\n");
            out.write("			<button type=\"button\"  class=\"btn btn-secondary\" onclick=\"showModal('");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('\'');
            out.write(',');
            out.write('\'');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('\'');
            out.write(',');
            out.write('\'');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('\'');
            out.write(',');
            out.write('\'');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.phone }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('\'');
            out.write(',');
            out.write('\'');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.gender }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("');\" >정보 수정</button>\r\n");
            out.write("			</td>\r\n");
            out.write("\r\n");
            out.write("		</tr>\r\n");
            out.write("	");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}

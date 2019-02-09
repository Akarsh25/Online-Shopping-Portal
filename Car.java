public class cart extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		String prd = request.getParameter("proid");
	       Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","admin");
        Statement st=con.createStatement();
        ResultSet r=st.executeQuery("select * from product");
        System.out.println(prd);
        while(r.next())
        {
            String prid=r.getString(1);
            String product=r.getString(2);
            String value=r.getString
            		if(prd.equals(prid))
            {	
            	Statement st1=con.createStatement();
                String insert="insert into cart values('"+product+"','"+value+"')";
                int res = st1.executeUpdate(insert);
                if(res>0)
                {
                response.sendRedirect("cart.jsp?a=10");
              return;
              }

public class LOGIN1 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {			
            String username=request.getParameter("name");
            String password=request.getParameter("pass");           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","admin");
            Statement st=con.createStatement();
            ResultSet r=st.executeQuery("select * from user");
            while(r.next())
            {
                String user=r.getString(1);//extracting first column from database
                String pass=r.getString(2);
                String mail=r.getString(3);
                System.out.println("Username :"+mail+"\nPassword :"+pass);
                System.out.println("Username :"+username+"\nPassword :"+password);
              
                if(mail.equals(username) && pass.equals(password))                {	
                    response.sendRedirect("electronics.jsp?a=10");
                    System.out.println("done");
                    return;              
                }
            }        response.sendRedirect("index.jsp?a=10");
}

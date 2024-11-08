package com.user.dao;

public class UserDAO {
	private String jdbcURL="jdbc:mysql://localhost:30006/otbs";
	private String jdbcUserName="root";
	private String jdbcPassword="root";
	
	private static final String INSERT_USER_SQL="INSERT INTO users "+"(uname,email,country,passwd) VALUES "+"(?,?,?,?);";
	private static final String SELECT_USER_BY_ID="SELECT * FROM USERS WHERE ID=?;";
	private static final String SELECT_ALL_USERS="SELECT * FROM USERS;";
	private static final String DELETE_USERS_SQL="DELETE FROM USERS WHERE ID=?;";
	private static final String UPDATE_USERS_SQL="UPDATE USERS SET UNAME=?,EMAIL=?,COUNTRY=?,PASSWORD=?,WHERE ID=?;";
	
	public UserDAO() {
		super();
	}

	
	
	public Connection getConnection() 
	{
		Connection connection=null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(jdbcURL,jdbcUserName, jdbcPassword);
			
		}
		
		catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return connection;
	}
	
	public void insertUser(User user)
	{
		UserDAO dao=new UserDao();
		
		try( Connection connection=dao.getConnection())
		{
			PreparedStatement preparedStatement =connection.preparedStatement(INSERT_USER_SQL);
			
			preparedtatement
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

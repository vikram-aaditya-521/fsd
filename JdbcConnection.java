package jdbc_connection;
import java.sql.*;
public class JdbcConnection{
	public static void main(String...args)throws Exception{
		String query="SELECT * FROM person";
		String url="jdbc:mysql://localhost:3306/test";
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url,"roor","root");
			PreparedStatement ps=conn.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				long id=rs.getLong("id");
				String name=rs.getString("name");
				String email=rs.getString("email");
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
}

//https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.22
<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.22</version>
</dependency>

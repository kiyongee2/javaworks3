package db.person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.JDBCUtil;

public class PersonDAO {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	//자료 삽입
	public void insertPerson(Person person) {
		conn = JDBCUtil.getConnection();
		String sql = "INSERT INTO person(userid, userpw, name, age) VALUES (?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserId());
			pstmt.setString(2, person.getUserPw());
			pstmt.setString(3, person.getName());
			pstmt.setInt(4, person.getAge());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	//자료 조회
	public ArrayList<Person> getList(){
		ArrayList<Person> personList = new ArrayList<>();
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM person";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Person person = new Person();
				person.setUserId(rs.getString("userid"));
				person.setUserPw(rs.getString("userpw"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				
				personList.add(person);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return personList;
	}
}

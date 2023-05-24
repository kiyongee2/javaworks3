package db.person;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		//Person 객체 생성
		Person p1 = new Person("today", "today123", "투데이", 5);
		
		//PersonDAO 객체 생성
		PersonDAO dao = new PersonDAO();
		
		//자료 삽입
		//dao.insertPerson(p1);
		
		//자료 조회
		ArrayList<Person> personList = dao.getList();
		for(int i=0; i<personList.size(); i++) {
			Person person = personList.get(i);
			
			String userid = person.getUserId();
			String userpw = person.getUserPw();
			String name = person.getName();
			int age = person.getAge();
			
			System.out.printf("아이디: %s, 비밀번호: %s, 이름: %s, 나이: %d\n", 
					userid, userpw, name, age);
		}
	}

}

package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentStreamTest {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("콩쥐", 90),
			new Student("팥쥐", 70),	
			new Student("흥부", 80)	
		);
		
		//전체 조회
		for(Student std : list)
			System.out.println(std.getName() + ", " + std.getScore());
		System.out.println("==================================");
		
		//stream 사용 - 전체 조회
		Stream<Student> stream = list.stream();
		stream.forEach(student -> {
			String name = student.getName();
			int score = student.getScore();
			System.out.println(name + ", " + score);
		});
		System.out.println("==================================");
		
		//map()을 사용 - 학생의 이름만 출력
		stream = list.stream();  //stream 객체를 다시 생성
		stream.map(s -> s.getName()).forEach(str -> System.out.println(str));
		
		//mapToInt() - 학생의 점수만 출력
		stream = list.stream();
		stream.mapToInt(s -> s.getScore()).forEach(val -> System.out.println(val));
		System.out.println("==================================");
		
		//filter()를 사용 - 점수가 90 이상인 학생의 이름 출력
		list.stream().filter(s -> s.getScore() >= 90)
		             .map(s -> s.getName())
		             .forEach(str -> System.out.println(str));	
	}
}

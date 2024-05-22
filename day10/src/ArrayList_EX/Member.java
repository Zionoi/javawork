package ArrayList_EX;

public class Member {
	private String name;
	private int age;
	private String gender;

	
	Member(){}
	Member(String title, int age, String gender){
		this.name = title;
		this.age = age;
		this.gender = gender;
	}

	String getName() {
		return this.name;
	}
	int getAge() {
		return this.age;
	}
	String getGender() {
		return this.gender;
	}
	void setTitle(String name) {
		this.name = name;
	}
	void setAuthor(int age) {
		this.age = age;
	}
	void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "제목 : "+ name + "\n나이 : " + age + "\n성별 : " + gender;
	}



}

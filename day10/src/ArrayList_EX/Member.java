package ArrayList_EX;

public class Member {
	String name;
	int age;
	String gender;

	
	Member(){}
	Member(String title, int i, String gender){
		this.name = title;
		this.age = i;
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
	void setTitle() {
		this.name = name;
	}
	void setAuthor() {
		this.age = age;
	}
	void setGender() {
		this.gender = gender;
	}
	
	public String toString() {
		return "제목 : "+ name + "\n나이 : " + age + "\n성별 : " + gender;
	}



}

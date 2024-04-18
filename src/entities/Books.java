package entities;

public class Books {

	private String title;
	private String author;
	private Integer age;
	
	public Books(String title, String author, Integer age) {
		this.title = title;
		this.author = author;
		this.age = age;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
}

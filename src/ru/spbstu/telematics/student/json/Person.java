package ru.spbstu.telematics.student.json;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
	private int id;
	private String name;
	private String[] neighbours = { "Vasily", "Ivan", "Tamara" };
	private Person friend;
	private Integer age;
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(String[] neighbours) {
		this.neighbours = neighbours;
	}

	public Person getFriend() {
		return friend;
	}

	public void setFriend(Person friend) {
		this.friend = friend;
	}
	

}

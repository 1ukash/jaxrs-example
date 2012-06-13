package ru.spbstu.telematics.student.json;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class Example {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Person p = new Person();
		p.setId(10);
		p.setName("Larisa");
		
		Person friend = new Person();
		friend.setId(11);
		friend.setName("Fedor");
		friend.setNeighbours(new String[] {"Semen"});
		p.setFriend(friend);
		
		
		ObjectMapper mapper = new ObjectMapper();
		String r = mapper.writeValueAsString(p);
		System.out.println(r);
		Person p2 = mapper.readValue(r, Person.class);
		System.out.println(p);
	}
}

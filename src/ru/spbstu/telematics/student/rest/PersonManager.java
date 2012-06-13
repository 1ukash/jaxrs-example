package ru.spbstu.telematics.student.rest;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ru.spbstu.telematics.student.json.Person;

@Path("/people")
public class PersonManager {
	
	private static ConcurrentHashMap<Integer, Person> map = new ConcurrentHashMap<Integer, Person>();
	private static AtomicInteger counter = new AtomicInteger();
	
	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Person getPerson(@PathParam("id") Integer id) {
		return map.get(id);
	}
	
	@PUT
	@Path("/{name}/{age}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Person savePerson(@PathParam("name") String name, @PathParam("age") Integer age) {
		Person p = new Person();
		p.setName(name);
		p.setAge(age);
		int id = counter.incrementAndGet();
		p.setId(id);
		map.put(id, p);
		return p;
	}

}

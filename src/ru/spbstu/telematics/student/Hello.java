package ru.spbstu.telematics.student;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Hello {
	private String msg = "Hello,";

	public Hello() {
	}

	@WebMethod
	public String sayHello(@WebParam(name="name") String name) {
		return msg + name;
	}

}

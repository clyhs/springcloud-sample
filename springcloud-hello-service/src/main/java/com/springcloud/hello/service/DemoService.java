package com.springcloud.hello.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.hello.bean.Foo;

@RestController
public class DemoService {

	@RequestMapping("/getfoo")
	public Foo getFoo(){
		Foo f = new Foo();
		f.setField1("11111111");
		f.setField2("aaaaaaaa");
		f.setField3("AAAAAAAA");
		f.setField4("!@#@$@$$");
		f.setField5("我我我我我我");
		f.setField6("22222222");
		f.setField7("bbbbbbbb");
		f.setField8("他他他他他他");
		return f;
	}
}

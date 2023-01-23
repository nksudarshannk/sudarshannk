package com.example.withoutapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.withoutapi.Repository.Srepo;
import com.example.withoutapi.model.SModel;

@SpringBootTest
class WithoutapiApplicationTests {
@Autowired
Srepo srepo;
	@Test
	public void textCreate() {
		SModel u=new SModel();
		u.setId(4);
		u.setName("dsfb");
		srepo.save(u);
	}
	@Test
	public void testReadAll() {
		Iterable<SModel>List=srepo.findAll();
	}
	@Test
	public void textUpdate() {
		SModel u=srepo.findById(4).get();
		u.setId(4);
		u.setName("ddd");
		srepo.save(u);
	
	}
	@Test
	public void textDelete() {
		srepo.deleteById(4);
	}

}

package com.example.restapiMysql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.restapiMysql.Repository.Srepo;
import com.example.restapiMysql.model.SModel;

@SpringBootTest
class RestapiMysqlApplicationTests {
@Autowired
Srepo srepo;
	@Test
	public void testCreate() {
		SModel u=new SModel();
		u.setId(1);
		u.setName("nfnnfnf");
		srepo.save(u);
	}
	@Test
	public void testReadAll() {
		Iterable<SModel>List=srepo.findAll();
	}
	@Test
	public void testUpdate() {
		SModel u=srepo.findById(1).get();
		u.setName("ffffff");
		srepo.save(u);
	}
	@Test
	public void testdelete() {
		srepo.deleteById(12);
	}

}

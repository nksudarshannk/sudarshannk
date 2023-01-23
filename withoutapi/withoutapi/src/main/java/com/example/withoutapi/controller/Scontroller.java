package com.example.withoutapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.withoutapi.Repository.Srepo;
import com.example.withoutapi.model.SModel;

@Controller
public class Scontroller {
@Autowired
Srepo srepo;

@RequestMapping("index")
public String index() {
	return "index.jsp";
}
@RequestMapping("/addemp")
public String addemp(SModel smodel) {
	srepo.save(smodel);
	return "index.jsp";
}
@RequestMapping("/getemp")
public ModelAndView getemp(@RequestParam int id) {
	ModelAndView mv=new ModelAndView ("display.jsp");
	SModel smodel=srepo.findById(id).orElse(new SModel());
	mv.addObject(smodel);
	return mv;
}
@RequestMapping("/delemp")
public ModelAndView delemp(@RequestParam int id) {
ModelAndView mv=new ModelAndView("delete.jsp"); 
SModel smodel=srepo.findById(id).orElse(new SModel());
srepo.deleteById(id);
mv.addObject(smodel);
return mv;

}
@RequestMapping("/updemp")
public ModelAndView updemp(SModel smodel)  {
ModelAndView mv=new ModelAndView("update.jsp"); 
 smodel=srepo.findById(smodel.getId()).orElse(new SModel());
mv.addObject(smodel);
return mv;

}}
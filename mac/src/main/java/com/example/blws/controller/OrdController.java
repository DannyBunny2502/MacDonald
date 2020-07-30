package com.example.blws.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.blws.domain.EmpVO;
import com.example.blws.service.EmpService;

@Controller
public class OrdController {
	@Autowired
	private EmpService empService;
	
	@GetMapping("/order")
	public String selectOrdList(Model model) throws Exception{
		System.out.println("selectOrdList in");
		List<EmpVO> ordList = empService.selectOrdList();
		model.addAttribute("orderList", ordList);
		//System.out.println(ordList);
		return "matplace/matplace";
	}
	@GetMapping("/material")
	public String selectMtrList(Model model) throws Exception{
		List<EmpVO> mtrList = empService.selectMtrList();
		model.addAttribute("materialList", mtrList);
		return "matplace/matplace";
	}
	@GetMapping("/matstore")
	public String selectMatsList(Model model) throws Exception{
		List<EmpVO> matsList = empService.selectMatsList();
		List<EmpVO> menuList = empService.selectMenuList();
		model.addAttribute("matstoreList", matsList);
		model.addAttribute("menuList", menuList);
		return "matplace/matplace";
	}
	@RequestMapping(value="/saveMatstore", method=RequestMethod.POST)
	public void saveMats(HttpServletRequest request, HttpServletResponse response) throws Exception{
		System.out.println("Save Matstore!");
		Map<String, String> matsMap = new HashMap();
		matsMap.put("mtrName", request.getParameter("mtrName"));
		matsMap.put("strGubunCode", request.getParameter("strGubunCode"));
		matsMap.put("strDist", request.getParameter("strDist"));
		matsMap.put("strQnt", request.getParameter("strQnt"));
		empService.saveMats(matsMap);
	}
	
}

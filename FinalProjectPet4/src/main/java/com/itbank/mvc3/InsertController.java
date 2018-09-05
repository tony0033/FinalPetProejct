package com.itbank.mvc3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertController {

	@Autowired
	MemberDAO memdao;
	
	@Autowired
	BbsDAO bbsdao;
	
	@RequestMapping("insert2.do")
	public String insert2( MemberDTO memberDTO) {
		memdao.insert(memberDTO);
		return "insertResult";
	}
	
	
	@RequestMapping("bbsinsert.do")
	public String insert(BbsDTO bbsDTO) {
		bbsdao.insert(bbsDTO);
		return "insertResult";
	}
}









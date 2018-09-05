package com.itbank.mvc3;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {

	@Autowired
	SqlSessionTemplate myBatis;
	
	
	public void insert(BbsDTO dto) {
		myBatis.insert("bbsSQL.insert", dto);
	}

	public void delete(BbsDTO dto) {
		myBatis.delete("bbsSQL.delete", dto);
	}

	public void update(BbsDTO dto) {
		myBatis.update("bbsSQL.update", dto);
	}

	public BbsDTO select(BbsDTO dto) {
		return myBatis.selectOne("bbsSQL.select", dto);
	}

	public List<BbsDTO> selectAll() {
		return myBatis.selectList("bbsSQL.selectAll");
	}
}

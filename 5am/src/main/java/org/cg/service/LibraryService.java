package org.cg.service;

import java.util.List;

import org.cg.domain.Criteria;
import org.cg.domain.LibraryVO;


public interface LibraryService {
	
	public void create(LibraryVO vo) throws Exception;
	public LibraryVO read(Integer lno) throws Exception;
	public void update(LibraryVO vo) throws Exception;
	public void delete(Integer lno) throws Exception;
	
	public List<LibraryVO> getList(Criteria cri)throws Exception;
	public Integer getTotal(Criteria cri) throws Exception;
	
}

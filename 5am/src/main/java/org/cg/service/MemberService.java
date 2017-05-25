package org.cg.service;

import java.util.List;

import org.cg.domain.Criteria;
import org.cg.domain.MQuestionVO;
import org.cg.domain.MemberVO;

public interface MemberService {
	
	public int totalCount();
	
	public void regist(MemberVO vo);
	
	public List<MemberVO> listAll(Criteria cri);

	public void update(MemberVO vo);
		
	public void delete(MemberVO vo);
	
	public List<MQuestionVO> qlistAll(Criteria cri);

	


}

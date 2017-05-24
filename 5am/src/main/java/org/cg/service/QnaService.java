package org.cg.service;

import java.util.List;

import org.cg.domain.Criteria;
import org.cg.domain.QuestionVO;

public interface QnaService {

	public List<QuestionVO> getQList(Criteria cri);
	
	public int getTotal();
}

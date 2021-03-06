package com.harang.web.repository;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.harang.web.domain.Criteria;
import com.harang.web.domain.D_ApplyDTO;
import com.harang.web.domain.DaetaDTO;
import com.harang.web.domain.DaetaReplyDTO;
import com.harang.web.domain.MemberDTO;
import com.harang.web.domain.P_ApplyDTO;
import com.harang.web.domain.ParttimeDTO;
import com.harang.web.domain.ParttimeReplyDTO;
import com.harang.web.domain.SearchCriteria;

@Repository
public class ParttimeDaoImpl implements ParttimeDao {
	
	@Autowired
	private SqlSession sqlSession;
	private static final String namespace = "com.harang.mapper.parttime-mapper";
	
	@Override
	public List<ParttimeDTO> getParttimeList(SearchCriteria cri) {
		return sqlSession.selectList(namespace+".getParttimeList", cri);
	}

	@Override
	public List<ParttimeDTO> getMyParttimeList(SearchCriteria cri) {
		// params : m_id, searchCriteria
		return sqlSession.selectList(namespace+".getMyParttimeList", cri);
	}

	@Override
	public List<DaetaDTO> getDaetaList(SearchCriteria cri) {
		return sqlSession.selectList(namespace+".getDaetaList", cri);
	}

	@Override
	public List<DaetaDTO> getMyDaetaList(SearchCriteria cri) {
		return sqlSession.selectList(namespace+".getMyDaetaList",cri);
	}

	@Override
	public int getParttimeCnt_apply(String p_num) {
		return sqlSession.selectOne(namespace+".getParttimeCnt_apply", p_num);
	}

	@Override
	public int getDaetaCnt_apply(String d_num) {
		return sqlSession.selectOne(namespace+".getDaetaCnt_apply", d_num);
	}

	@Override
	public ParttimeDTO getParttime(String p_num) {
		return sqlSession.selectOne(namespace+".getParttime", p_num);
	}

	@Override
	public DaetaDTO getDaeta(String d_num) {
		return sqlSession.selectOne(namespace+".getDaeta", d_num);
	}

	@Override
	public void counterUp_Parttime(String p_num) {
		sqlSession.update(namespace+".counterUp_Parttime", p_num);
	}

	@Override
	public void counterUp_Daeta(String d_num) {
		sqlSession.update(namespace+".counterUp_Daeta", d_num);
	}

	@Override
	public MemberDTO getMember(String m_id) {
		return sqlSession.selectOne(namespace+".getMember", m_id);
	}

	@Override
	public void createParttimeResume(P_ApplyDTO p_apply) {
		sqlSession.insert(namespace+".createParttimeResume", p_apply);
	}

	@Override
	public void createDaetaResume(D_ApplyDTO d_apply) {
		sqlSession.insert(namespace+".createDaetaResume", d_apply);
	}

	@Override
	public void deleteParttime(String p_num) {
		sqlSession.delete(namespace+".deleteParttime", p_num);
	}

	@Override
	public void deleteDaeta(String d_num) {
		sqlSession.delete(namespace+".deleteDaeta", d_num);
	}

	@Override
	public void deleteParttimeApply(String p_num) {
		sqlSession.delete(namespace+".deleteParttimeApply", p_num);
	}

	@Override
	public void deleteDaetaApply(String d_num) {
		sqlSession.delete(namespace+".deleteDaetaApply", d_num);
	}

	@Override
	public List<P_ApplyDTO> getParttimeApplyList(String p_num) {
		return sqlSession.selectList(namespace+".getParttimeApplyList", p_num);
	}

	@Override
	public List<D_ApplyDTO> getDaetaApplyList(String d_num) {
		return sqlSession.selectList(namespace+".getDaetaApplyList", d_num);
	}

	@Override
	public List<P_ApplyDTO> getMyParttimeApplyList(SearchCriteria cri) {
		return sqlSession.selectList(namespace+".getMyParttimeApplyList", cri);
	}

	@Override
	public List<D_ApplyDTO> getMyDaetaApplyList(SearchCriteria cri) {
		return sqlSession.selectList(namespace+".getMyDaetaApplyList", cri);
	}

	@Override
	public List<P_ApplyDTO> getParttimeApply(HashMap<String, Object> params) {
		return sqlSession.selectList(namespace+".getParttimeApply", params);
	}

	@Override
	public List<D_ApplyDTO> getDaetaApply(HashMap<String, Object> params) {
		return sqlSession.selectList(namespace+".getDaetaApply", params);
	}

	@Override
	public void updateParttimeChoice(HashMap<String, Object> params) {
		sqlSession.update(namespace+".updateParttimeChoice", params);
	}

	@Override
	public void updateDaetaChoice(HashMap<String, Object> params) {
		sqlSession.update(namespace+".updateDaetaChoice", params);
	}

	@Override
	public void deleteParttimeApply(HashMap<String, Object> params) {
		sqlSession.delete(namespace+".deleteParttimeApply", params);
	}

	@Override
	public void deleteDaetaApply(HashMap<String, Object> params) {
		sqlSession.delete(namespace+".deleteDaetaApply", params);
	}

	@Override
	public void insertParttime(ParttimeDTO parttime) {
		sqlSession.insert(namespace+".insertParttime", parttime);
	}

	@Override
	public void insertDaeta(DaetaDTO daeta) {
		sqlSession.insert(namespace+".insertDaeta", daeta);
	}

	@Override
	public void updateParttime(ParttimeDTO parttime) {
		sqlSession.update(namespace+".updateParttime", parttime);
	}

	@Override
	public void updateDaeta(DaetaDTO daeta) {
		sqlSession.update(namespace+".updateDaeta", daeta);
	}

	@Override
	public List<String> getPicked(String d_num) {
		return sqlSession.selectList(namespace+".getPicked", d_num);
	}

	@Override
	public void updateDaetaMember(D_ApplyDTO d_apply) {
		sqlSession.update(namespace+".updateDaetaMember", d_apply);
	}

	@Override
	public void report(D_ApplyDTO d_apply) {
		sqlSession.update(namespace+".report", d_apply);
	}

	@Override
	public List<ParttimeReplyDTO> getParttimeReplyList(String p_num) {
		return sqlSession.selectList(namespace+".getParttimeReplyList", p_num);
	}

	@Override
	public List<DaetaReplyDTO> getDaetaReplyList(String d_num) {
		return sqlSession.selectList(namespace+".getDaetaReplyList", d_num);
	}

	@Override
	public void insertParttimeReply(ParttimeReplyDTO p_reply) {
		sqlSession.insert(namespace+".insertParttimeReply", p_reply);
	}

	@Override
	public void insertDaetaReply(DaetaReplyDTO d_reply) {
		sqlSession.insert(namespace+".insertDaetaReply", d_reply);
		
	}

	@Override
	public void deleteParttimeReply(String pr_num) {
		sqlSession.delete(namespace+".deleteParttimeReply", pr_num);
	}

	@Override
	public void deleteDaetaReply(String dr_num) {
		sqlSession.delete(namespace+".deleteDaetaReply", dr_num);
	}

	@Override
	public int countParttimeList() {
		return sqlSession.selectOne(namespace+".countParttimeList");
	}

	@Override
	public int countDaetaList() {
		return sqlSession.selectOne(namespace+".countDaetaList");
	}

	@Override
	public int countMyParttimeList(String m_id) {
		return sqlSession.selectOne(namespace+".countMyParttimeList", m_id);
	}

	@Override
	public int countMyDaetaList(String m_id) {
		return sqlSession.selectOne(namespace+".countMyDaetaList", m_id);
	}

	@Override
	public int countMyParttimeApplyList(String m_id) {
		return sqlSession.selectOne(namespace+".countMyParttimeApplyList", m_id);
	}

	@Override
	public int countMyDaetaApplyList(String m_id) {
		return sqlSession.selectOne(namespace+".countMyDaetaApplyList", m_id);
	}

}

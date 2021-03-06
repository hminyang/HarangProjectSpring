package com.harang.web.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harang.web.domain.Criteria;
import com.harang.web.domain.D_ApplyDTO;
import com.harang.web.domain.DaetaDTO;
import com.harang.web.domain.DaetaReplyDTO;
import com.harang.web.domain.MemberDTO;
import com.harang.web.domain.P_ApplyDTO;
import com.harang.web.domain.ParttimeDTO;
import com.harang.web.domain.ParttimeReplyDTO;
import com.harang.web.domain.SearchCriteria;
import com.harang.web.repository.ParttimeDao;

@Service
public class ParttimeServiceImpl implements ParttimeService {
	
	@Autowired
	ParttimeDao parttimeDao;
	
	@Override
	public List<ParttimeDTO> getParttimeList(SearchCriteria cri) {
		return parttimeDao.getParttimeList(cri);
	}

	@Override
	public List<ParttimeDTO> getMyParttimeList(SearchCriteria cri) {
		return parttimeDao.getMyParttimeList(cri);
	}

	@Override
	public List<DaetaDTO> getDaetaList(SearchCriteria cri) {
		return parttimeDao.getDaetaList(cri);
	}

	@Override
	public List<DaetaDTO> getMyDaetaList(SearchCriteria cri) {
		return parttimeDao.getMyDaetaList(cri);
	}

	@Override
	public int getParttimeCnt_apply(String p_num) {
		return parttimeDao.getParttimeCnt_apply(p_num);
	}

	@Override
	public int getDaetaCnt_apply(String d_num) {
		return parttimeDao.getDaetaCnt_apply(d_num);
	}

	@Override
	public ParttimeDTO getParttime(String p_num) {
		return parttimeDao.getParttime(p_num);
	}

	@Override
	public DaetaDTO getDaeta(String d_num) {
		return parttimeDao.getDaeta(d_num);
	}

	@Override
	public void counterUp_Parttime(String p_num) {
		parttimeDao.counterUp_Parttime(p_num);
	}

	@Override
	public void counterUp_Daeta(String d_num) {
		parttimeDao.counterUp_Daeta(d_num);
	}

	@Override
	public MemberDTO getMember(String m_id) {
		return parttimeDao.getMember(m_id);
	}

	@Override
	public void createParttimeResume(P_ApplyDTO p_apply) {
		parttimeDao.createParttimeResume(p_apply);
	}

	@Override
	public void createDaetaResume(D_ApplyDTO d_apply) {
		parttimeDao.createDaetaResume(d_apply);
	}

	@Override
	public void deleteParttime(String p_num) {
		parttimeDao.deleteParttime(p_num);
	}

	@Override
	public void deleteDaeta(String d_num) {
		parttimeDao.deleteDaeta(d_num);
	}

	@Override
	public void deleteParttimeApply(String p_num) {
		parttimeDao.deleteParttimeApply(p_num);
	}

	@Override
	public void deleteDaetaApply(String d_num) {
		parttimeDao.deleteDaetaApply(d_num);
	}

	@Override
	public List<P_ApplyDTO> getParttimeApplyList(String p_num) {
		return parttimeDao.getParttimeApplyList(p_num);
	}

	@Override
	public List<D_ApplyDTO> getDaetaApplyList(String d_num) {
		return parttimeDao.getDaetaApplyList(d_num);
	}

	@Override
	public List<P_ApplyDTO> getMyParttimeApplyList(SearchCriteria cri) {
		return parttimeDao.getMyParttimeApplyList(cri);
	}

	@Override
	public List<D_ApplyDTO> getMyDaetaApplyList(SearchCriteria cri) {
		return parttimeDao.getMyDaetaApplyList(cri);
	}

	@Override
	public List<P_ApplyDTO> getParttimeApply(HashMap<String, Object> params) {
		return parttimeDao.getParttimeApply(params);
	}

	@Override
	public List<D_ApplyDTO> getDaetaApply(HashMap<String, Object> params) {
		return parttimeDao.getDaetaApply(params);
	}

	@Override
	public void updateParttimeChoice(HashMap<String, Object> params) {
		parttimeDao.updateParttimeChoice(params);
	}

	@Override
	public void updateDaetaChoice(HashMap<String, Object> params) {
		parttimeDao.updateDaetaChoice(params);
	}

	@Override
	public void deleteParttimeApply(HashMap<String, Object> params) {
		parttimeDao.deleteParttimeApply(params);
	}

	@Override
	public void deleteDaetaApply(HashMap<String, Object> params) {
		parttimeDao.deleteDaetaApply(params);
	}

	@Override
	public void insertParttime(ParttimeDTO parttime) {
		parttimeDao.insertParttime(parttime);
	}

	@Override
	public void insertDaeta(DaetaDTO daeta) {
		parttimeDao.insertDaeta(daeta);
	}

	@Override
	public void updateParttime(ParttimeDTO parttime) {
		parttimeDao.updateParttime(parttime);
	}

	@Override
	public void updateDaeta(DaetaDTO daeta) {
		parttimeDao.updateDaeta(daeta);
	}

	@Override
	public List<String> getPicked(String d_num) {
		return parttimeDao.getPicked(d_num);
	}

	@Override
	public void updateDaetaMember(D_ApplyDTO d_apply) {
		parttimeDao.updateDaetaMember(d_apply);
	}

	@Override
	public void report(D_ApplyDTO d_apply) {
		parttimeDao.report(d_apply);
	}

	@Override
	public List<ParttimeReplyDTO> getParttimeReplyList(String p_num) {
		return parttimeDao.getParttimeReplyList(p_num);
	}

	@Override
	public List<DaetaReplyDTO> getDaetaReplyList(String d_num) {
		return parttimeDao.getDaetaReplyList(d_num);
	}

	@Override
	public void insertParttimeReply(ParttimeReplyDTO p_reply) {
		parttimeDao.insertParttimeReply(p_reply);
	}

	@Override
	public void insertDaetaReply(DaetaReplyDTO d_reply) {
		parttimeDao.insertDaetaReply(d_reply);
	}

	@Override
	public void deleteParttimeReply(String pr_num) {
		parttimeDao.deleteParttimeReply(pr_num);
	}

	@Override
	public void deleteDaetaReply(String dr_num) {
		parttimeDao.deleteDaetaReply(dr_num);
	}

	@Override
	public int countParttimeList() {
		return parttimeDao.countParttimeList();
	}

	@Override
	public int countDaetaList() {
		return parttimeDao.countDaetaList();
	}

	@Override
	public int countMyParttimeList(String m_id) {
		return parttimeDao.countMyParttimeList(m_id);
	}

	@Override
	public int countMyDaetaList(String m_id) {
		return parttimeDao.countMyDaetaList(m_id);
	}

	@Override
	public int countMyParttimeApplyList(String m_id) {
		return parttimeDao.countMyParttimeApplyList(m_id);
	}

	@Override
	public int countMyDaetaApplyList(String m_id) {
		return parttimeDao.countMyDaetaApplyList(m_id);
	}

}

package com.harang.web.repository;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.harang.web.domain.PgMemberDTO;
import com.harang.web.domain.PlaygroundDTO;
import com.harang.web.domain.ScheduleDTO;
import com.harang.web.domain.SearchCriteria;
import com.harang.web.domain.SrMemberDTO;
import com.harang.web.domain.StudyroomDTO;

public interface FacilDao {
	public List<PgMemberDTO> reserPgListAll(SearchCriteria cri);
	public List<SrMemberDTO> reserSrListAll(SearchCriteria cri);
	
	public int reserPgListAllCount(SearchCriteria cri);
	public int reserSrListAllCount(SearchCriteria cri);

	public List<PgMemberDTO> reserPgList(SearchCriteria cri);
	public List<SrMemberDTO> reserSrList(SearchCriteria cri);
	
	public void userReserPg(PgMemberDTO pgmdto);
	public void userReserSr(SrMemberDTO srmdto);
	
	public List<PgMemberDTO> schedulePgListLoad();
	public List<SrMemberDTO> scheduleSrListLoad();
	
	public List<ScheduleDTO> scheduleToPgList();
	public List<ScheduleDTO> scheduleToSrList();
	
	public List<PlaygroundDTO> schduleTypePgLoadAjax();
	public List<StudyroomDTO> schduleTypeSrLoadAjax();
	
	public List<PlaygroundDTO> schduleNamePgLoadAjax(String pg_type);
	//public List<PlaygroundDTO> testchduleNamePgLoadAjax(PlaygroundDTO pgdto);
	public List<StudyroomDTO> schduleNameSrLoadAjax(String sr_type);
	
	public List<PlaygroundDTO> loadPgList(SearchCriteria cri);
	public List<StudyroomDTO> loadSrList(SearchCriteria cri);
	
	public List<PlaygroundDTO> schdulePgNumAjax(PlaygroundDTO pgdto);
	public List<StudyroomDTO> schduleSrNumAjax(StudyroomDTO srdto);
	
	public List<PgMemberDTO> loadPgTimecodeAjax(PgMemberDTO pgmdto);
	public List<SrMemberDTO> loadSrTimecodeAjax(SrMemberDTO srmdto);
	
	public void facilPgDel(String pg_num);
	public void facilSrDel(String sr_num);
	
	public void facilPgModi(PlaygroundDTO pgdto);
	public void facilSrModi(StudyroomDTO srdto);
	
	public void facilPgAdd(PlaygroundDTO pgdto);
	public void facilSrAdd(StudyroomDTO srdto);
	
	public void schdulePgAdd(PgMemberDTO pgmdto);
	public void schduleSrAdd(SrMemberDTO srmdto);
	
	public PgMemberDTO selectPgReser(String pgm_num);
	public SrMemberDTO selectSrReser(String srm_num);
	
	public void deletePgReser(String pgm_num);
	public void deleteSrReser(String srm_num);
}

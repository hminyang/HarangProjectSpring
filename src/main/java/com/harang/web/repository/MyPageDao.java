package com.harang.web.repository;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.harang.web.domain.CertiMemberDTO;
import com.harang.web.domain.LessonDTO;
import com.harang.web.domain.MemberDTO;
import com.harang.web.domain.RecordDTO;
import com.harang.web.domain.SearchCriteria;
import com.harang.web.domain.ZipDTO;

public interface MyPageDao {
	
	//해더 관련
	public List<RecordDTO> pointListHeader(String m_id);
	
	//포인트 페이지 관련
	public List<RecordDTO> pointListSearch(SearchCriteria cri);
	public int pointPagingNum(String m_id);
	public List<MemberDTO> apointMember(SearchCriteria cri);
	public int apointMemberCount(SearchCriteria cri);
	
	//스펙리스트 페이지 관련
	public List<CertiMemberDTO> achallengeList(SearchCriteria cri);
	public int achallengePage(SearchCriteria cri);
	public List<CertiMemberDTO> uchallengeList(SearchCriteria cri);
	public int uchallengePage(SearchCriteria cri);	
	public void uchallenge_challenge(CertiMemberDTO certi);
	public void uchallenge_rechallenge(CertiMemberDTO certi);
	public List<CertiMemberDTO> specListJson(SearchCriteria cri);
	public int specListJsonCount(SearchCriteria cri);
	public String specInsert(CertiMemberDTO certi);
	public String specUpdateAll(CertiMemberDTO certi);
	public String specUpdateName(CertiMemberDTO certi);
	public String specUpdateAgency(CertiMemberDTO certi);
	public String specUpdatePoint(CertiMemberDTO certi);
	public String specDelete(CertiMemberDTO certi);
	
	//주소 목록
	public List<ZipDTO> sidoList();
	public List<ZipDTO> gugunList(ZipDTO zip);
	public List<ZipDTO> dongList(ZipDTO zip);
	
	//유저 리스트 불러오기
	public List<MemberDTO> userList();
	public List<MemberDTO> memberList(SearchCriteria cri);
	public MemberDTO memberData(String m_id);
	public int memberListCount(SearchCriteria cri);
	
	//내 정보 수정
	public void updateMyinfo(MemberDTO member);
	
	//포인트 제로 학비 감면  관련
	public int pointZero(RecordDTO record);
	
	//시간표 관련 
	public List<LessonDTO> timeTalbeLesson(SearchCriteria cri);
	public List<LessonDTO> lessonList(SearchCriteria cri);
	public int lessonCount(SearchCriteria cri);
	public String enrollCheck(LessonDTO lesson);
	public String deleteCheck(LessonDTO lesson);
	
	
}


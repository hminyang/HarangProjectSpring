package com.harang.web.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.harang.web.domain.MemberDTO;
import com.harang.web.domain.MessageDTO;
import com.harang.web.domain.SearchCriteria;

@Repository
public class MessageDaoImpl implements MessageDao {
	
	@Autowired
	private SqlSession sqlSession;
	private static final String namespace = "com.harang.mapper.message-mapper";
	
	@Override
	public MemberDTO getMember(String m_id) {
		return sqlSession.selectOne(namespace+".getMember", m_id);
	}
	@Override
	public List<String> getMember_id(String m_name) {
		return sqlSession.selectList(namespace+".getMember_id", m_name);
	}
	@Override
	public void postMessage(MessageDTO message) {
		sqlSession.insert(namespace+".postMessage", message);
	}
	@Override
	public List<MessageDTO> getGivenMessageList(SearchCriteria cri) {
		return sqlSession.selectList(namespace+".getGivenMessageList", cri);
	}
	@Override
	public List<MessageDTO> getSentMessageList(SearchCriteria cri) {
		return sqlSession.selectList(namespace+".getSentMessageList", cri);
	}
	@Override
	public List<MessageDTO> getToMeMessageList(SearchCriteria cri) {
		return sqlSession.selectList(namespace+".getToMeMessageList", cri);
	}
	@Override
	public int getGivenMessageListCount(SearchCriteria cri) {
		return sqlSession.selectOne(namespace+".getGivenMessageListCount", cri);
	}
	@Override
	public int getSentMessageListCount(SearchCriteria cri) {
		return sqlSession.selectOne(namespace+".getSentMessageListCount", cri);
	}
	@Override
	public int getToMeMessageListCount(SearchCriteria cri) {
		return sqlSession.selectOne(namespace+".getToMeMessageListCount",cri);
	}
	@Override
	public MessageDTO getMessage(String t_num) {
		return sqlSession.selectOne(namespace+".getMessage", t_num);
	}
	@Override
	public void deleteGivenMessage_first(String t_num) {
		sqlSession.delete(namespace+".deleteGivenMessage_first", t_num);
	}
	@Override
	public void deleteSentMessage_first(String t_num) {
		sqlSession.delete(namespace+".deleteSentMessage_first", t_num);
	}
	@Override
	public void deleteMessage(String t_num) {
		sqlSession.delete(namespace+".deleteMessage", t_num);
	}
	@Override
	public void readMessage(String t_num) {
		sqlSession.update(namespace+".readMessage", t_num);
	}
	@Override
	public int getNotReadMessage(String m_id) {
		return sqlSession.selectOne(namespace+".getNotReadMessage", m_id);
	}
	@Override
	public int getNotReadMessage_toMe(String m_id) {
		return sqlSession.selectOne(namespace+".getNotReadMessage_toMe", m_id);
	}
	@Override
	public List<MessageDTO> getGivenMessageListHeader(String m_id) {
		return sqlSession.selectList(namespace+".getGivenMessageListHeader", m_id);
	}
	

}

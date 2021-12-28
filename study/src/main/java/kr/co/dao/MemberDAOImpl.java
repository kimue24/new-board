package kr.co.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject SqlSession sql;
	
	//회원가입
	
	@Override
	public void register(MemberVO vo) throws Exception {
		sql.insert("memberMapper.register", vo);
	}
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return sql.selectOne("memberMapper.login", vo);
	}
	
	//서비스에서 보낸 파라미터들을 memeberUpdate(MemberVO vo) 에 담습니다.
	@Override
	public void memberUpdate(MemberVO vo) throws Exception {
		sql.update("memberMapper.memberUpdate", vo);
	}
	
	//업데이트와 마찬가지
	@Override
	public void memberDelete(MemberVO vo) throws Exception {
		// MemberVO에 담긴 값들을 보내줍니다.
		// 그럼 xml에서 memberMapper.memberDelete에 보시면
		//  #{userId}, #{userPass}에 파라미터값이 매칭이 되겠지요.
		sql.delete("memberMapper.memberDelete", vo);
	}
	
	//패스워드 체크
	@Override
	public int passChk(MemberVO vo) throws Exception {
		int result = sql.selectOne("memberMapper.passChk", vo);
		return result;
	}

}

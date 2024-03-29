package org.jhj.myInfo.persistence;

import org.apache.ibatis.session.SqlSession;
import org.jhj.myImfo.domain.GameRecordVO;
import org.jhj.myImfo.domain.GameResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GameRecordDAOImpl implements GameRecordDAO {

	@Autowired
	private SqlSession sqlSession;
	private static final String namespace = "org.jhj.myInfo.mappers.gameRecordMapper";
	
	@Override
	public void insert(GameResultVO gameRecord) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace + ".insertGameRecord", gameRecord);
	}

	@Override
	public GameRecordVO selectScissor() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".selectScissor");
	}

	@Override
	public GameRecordVO selectRock() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".selectRock");
	}

	@Override
	public GameRecordVO selectPaper() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".selectPaper");
	}

	@Override
	public int count() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".selectTotal");
	}


}

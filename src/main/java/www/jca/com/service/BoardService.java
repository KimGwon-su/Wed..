package www.jca.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import www.jca.com.dao.BoardDAO;
import www.jca.com.vo.Board;

@Component("boardService")
public class BoardService implements DataService<Board>{
	@Autowired
	BoardDAO dao;
	
	@Override
	public int insert(Board input) {
		return dao.insert(input);
	}

	@Override
	public int update(Board input) {
		return dao.update(input);
	}

	@Override
	public int delete(Board input) {
		return dao.delete(input);
	}

	@Override
	public List<Board> select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Board> select(Board input) {
		return dao.select(input);
	}

	@Override
	public Board selectOne(Board input) {
		return dao.selectOne(input);
	}

	@Override
	public int count(Board input) {
		return dao.count(input);
	}

}

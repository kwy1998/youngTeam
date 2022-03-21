package com.example.demo.dao;

import java.util.List;

import com.example.demo.vo.BoardVO;

public interface BoardDAO {

	void insertBoardGo(BoardVO b);
	void insertBoardOf(BoardVO b);
	void insertBoardQa(BoardVO b);
	List<BoardVO> getBoardListGo(BoardVO b);
	List<BoardVO> getBoardListOf(BoardVO b);
	List<BoardVO> getBoardListQa(BoardVO b);
	int getListCountGo(BoardVO b);
	int getListCountOf(BoardVO b);
	int getListCountQa(BoardVO b);
	void updateHit(int board_no);
	BoardVO getBoardCont(int board_no);
	void updateLevel(BoardVO rb);
	void replyBo(BoardVO rb);
	void editBoard(BoardVO eb);
	void delBoard(int board_no);
}

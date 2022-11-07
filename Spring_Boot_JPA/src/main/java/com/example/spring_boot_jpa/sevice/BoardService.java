package com.example.spring_boot_jpa.sevice;

import com.example.spring_boot_jpa.repository.BoardRepository;
import com.example.spring_boot_jpa.vo.BoardRequestVO;
import com.example.spring_boot_jpa.vo.BoardResponseVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public Long save(BoardRequestVO boardSaveVO) {
        return boardRepository.save(boardSaveVO.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<BoardResponseVO> findAll() {
        return boardRepository.findAll().stream().map(BoardResponseVO::new).collect(Collectors.toList());
    }

    public BoardResponseVO findById(Long id) {
        return new BoardResponseVO(boardRepository.findById(id).get());
    }

    public int updateBoard(BoardRequestVO boardRequestVO) {
        return boardRepository.updateBoard(boardRequestVO);
    }

    public void deleteBuId(Long id) {
        boardRepository.deleteById(id);
    }
}

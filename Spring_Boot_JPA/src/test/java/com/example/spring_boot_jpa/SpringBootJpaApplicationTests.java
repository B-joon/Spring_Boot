package com.example.spring_boot_jpa;

import com.example.spring_boot_jpa.sevice.BoardService;
import com.example.spring_boot_jpa.vo.BoardRequestVO;
import com.example.spring_boot_jpa.vo.BoardResponseVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootJpaApplicationTests {

    @Autowired
    private BoardService boardService;

    @Test
    void contextLoads() {
        BoardRequestVO boardSaveVO = new BoardRequestVO();

        boardSaveVO.setTitle("제목입니다.");
        boardSaveVO.setContent("내용입니다.");
        boardSaveVO.setRegisterId("작성자");

        Long result = boardService.save(boardSaveVO);

        if (result > 0) {
            System.out.println("# Success save() ~");
            findAll();
            findById(result);
        } else {
            System.out.println("# Fail Save() ~");
        }
    }
    void findAll() {
        List<BoardResponseVO> list = boardService.findAll();

        if (list != null) {
            System.out.println("# Success findAll() : " + list.toString());
        } else {
            System.out.println("# Fail findAll() ~");
        }
    }
    void findById(Long id) {
        BoardResponseVO info = boardService.findById(id);

        if (info != null) {
            System.out.println("# Success findById() : " + info.toString());
        } else {
            System.out.println("# Fail findById() ~");
        }
    }

    void updateBoard(Long id) {
        BoardRequestVO boardRequestVO = new BoardRequestVO();

        boardRequestVO.setId(id);
        boardRequestVO.setTitle("업데이트 제목");
        boardRequestVO.setContent("업데이트 내용");
        boardRequestVO.setRegisterId("작성자");

        int result = boardService.updateBoard(boardRequestVO);

        if (result > 0) {
            System.out.println("# Success updateBoard() ~");
        } else {
            System.out.println("# Fail updateBoard() ~");
        }
    }
}

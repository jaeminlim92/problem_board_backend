package com.my.board.project.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * packageName    : com.my.board.project.vo
 * fileName       : boardVo
 * author         : jaeminlim
 * date           : 2022/01/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/05        jaeminlim       최초 생성
 */
@Getter
@Setter
@ToString
public class boardVo {
    private String boardId;
    private String boardNm;
    private String boardCntn;
}

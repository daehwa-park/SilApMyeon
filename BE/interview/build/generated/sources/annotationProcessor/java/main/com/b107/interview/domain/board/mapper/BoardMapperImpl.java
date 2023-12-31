package com.b107.interview.domain.board.mapper;

import com.b107.interview.domain.board.dto.BoardRequest;
import com.b107.interview.domain.board.entity.Board;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-13T21:19:28+0900",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 11.0.15 (ojdkbuild)"
)
@Component
public class BoardMapperImpl implements BoardMapper {

    @Override
    public Board boardRequestToBoard(BoardRequest boardRequest) {
        if ( boardRequest == null ) {
            return null;
        }

        Board board = new Board();

        board.setBoardTitle( boardRequest.getTitle() );
        board.setBoardContent( boardRequest.getContent() );
        board.setReportId( boardRequest.getReportId() );

        return board;
    }
}

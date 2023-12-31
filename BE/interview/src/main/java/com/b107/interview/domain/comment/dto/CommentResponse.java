package com.b107.interview.domain.comment.dto;

import com.b107.interview.domain.comment.entity.Comment;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentResponse {
    private final Long commentId;
    private final String content;
    private final String nickname;
    private final String profileImg;
    private final Long userid;
    private final LocalDateTime createdDate;

    public CommentResponse(Comment comment){
        this.commentId = comment.getCommentId();
        this.content = comment.getCommentContent();
        this.nickname = comment.getUser().getUserNickname();
        this.profileImg = comment.getUser().getUserProfileUrl();
        this.userid = comment.getUser().getUserId();
        this.createdDate = comment.getCreatedTime();
    }



}

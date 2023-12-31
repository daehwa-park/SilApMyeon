import React from "react";
import { Link } from "react-router-dom";
import "../Card/CardStyle.css";

function Card({ card }) {
  const date = card.createdTime.substring(0, 10);
  return (
    <div className="card">
      <div className="cardMain">
        <div className="title">{card.title}</div>
        <div className="line"></div>
        <div className="cardMiddle">
          <div className="content">{card.content}</div>
          <div className="smallInfo">
            <div className="date">{date}</div>
            <div className="hits">조회수 {card.hit}</div>
          </div>
          <div className="info">
            <div className="user">
              <img className="boardImg" src={card.imgUrl}></img>
              <div className="nickname">{card.nickname}</div>
            </div>
            <div className="commentsCnt">댓글 {card.commentCnt}</div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Card;

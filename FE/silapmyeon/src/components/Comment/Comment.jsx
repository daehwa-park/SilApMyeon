import React from "react";
import "../Comment/CommentStyle.css";
import { axiosAuth } from "../../api/settingAxios";
import { useRecoilState } from "recoil";
import { UserAtom } from "../../Recoil/UserAtom";

function Comment({ comment }) {
  const [userValue, setUserValue] = useRecoilState(UserAtom);
  //댓글 삭제하기
  const handleDelete = async () => {
    const confirmed = window.confirm("해당 댓글을 삭제하시겠습니까?");

    if (confirmed) {
      const reqUrl = "/comments/" + comment.commentId;
      await axiosAuth
        .delete(reqUrl)
        .then((response) => {
          console.log("댓글 삭제 완료");
          window.location.reload();
        })
        .catch((error) => {
          console.error("댓글 삭제 오류 발생", error, comment.commentId);
        });
    }
  };

  return (
    <div className="comment" style={{ marginBottom: "30px" }}>
      <div className="commentUser">
        <img className="commentImg" src={comment.profileImg}></img>
        <div className="commentNickname">{comment.nickname}</div>
      </div>
      <div
        className="commentContent"
        style={{
          display: "flex",
          marginLeft: "20px",
          marginTop: "20px",
          height: "150px",
        }}
      >
        {comment.content}
      </div>
      <div style={{ display: "flex" }}>
        {comment.userid === userValue.userId && (
          <div
            style={{ margin: "5px", marginLeft: "auto" }}
            onClick={handleDelete}
          >
            삭제
          </div>
        )}
      </div>
    </div>
  );
}

export default Comment;

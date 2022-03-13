<template>
    <div>
      <!--  form 안에 input 에서 엔터키를 쳐서 form 이 submit 되는것도 막을 수 있다 -->
      <table>
        <tr>
          <td>게시물 번호</td>
          <td>
            <input type="text" :value="board.boardNo" readonly/>
          </td>
        </tr>
        <tr>
          <td>제목</td>
          <td>
            <input type="text" :value="board.title" readonly/>
          </td>
        </tr>
        <tr>
          <td>작성자</td>
          <td>
            <input type="text" :value="board.writer" disabled/>
          </td>
        </tr>
        <tr>
          <td>본문</td>
          <td>
            <textarea cols="50" rows="20" :value="board.content" readonly></textarea>
          </td>
        </tr>
        <tr>
          <td>등록일자</td>
          <td>
            <input type="text" :value="board.regDate" readonly/>
          </td>
        </tr>
      </table>


    </div>
</template>

<script>
export default {
  name: "BoardRead",
  props: {
    board:{
      type: Object,
      require: true
    }
  }
}
</script>

<style scoped>

</style>
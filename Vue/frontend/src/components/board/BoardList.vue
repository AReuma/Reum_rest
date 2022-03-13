<template>
 <!--board의 값들을 어떻게 보여줄것인가를 결정 -->
  <div>
    <h3>게시물목록</h3>
    <table border="1">
      <tr>
        <th align="center" width="100">번호</th>
        <th align="center" width="320">제목</th>
        <th align="center" width="100">작성자</th>
        <th align="center" width="220">등록일자</th>
      </tr>

      <tr v-if="!boards || (Array.isArray(boards) && boards.length ===0 )">
        <td colspan="4">
          현재 등록된 게시물이 없습니다.
        </td>
      </tr>

      <tr v-else v-for="board in boards" :key="board.boardNo">
        <td>
          {{board.boardNo}}
        </td>
        <td>
          <router-link :to="{name: 'BoardReadPage', params: {boardNo: board.boardNo.toString()}}">
          {{board.title}}
          </router-link>
        </td>
        <td>
          {{board.writer}}
        </td>
        <td>
          {{board.regDate}}
        </td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  name: "BoardList",
  props: {
    boards: {
      type: Array
    }
  }
}
</script>

<style scoped>

</style>
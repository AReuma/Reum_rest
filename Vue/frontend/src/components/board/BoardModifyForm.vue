<template>
  <div>
    <form @submit.prevent="onSubmit()">
      <!-- 요청하면 onSubmit로 가세요 -->
      <!--  form 안에 input 에서 엔터키를 쳐서 form 이 submit 되는것도 막을 수 있다 -->
      <table>
        <tr>
          <td>게시물 번호</td>
          <td>
            <input type="text" :value="board.boardNo" disabled/>
          </td>
        </tr>
        <tr>
          <td>제목</td>
          <td>
            <input type="text" v-model="title" />
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
            <textarea cols="50" rows="20" v-model="content" ></textarea>
          </td>
        </tr>
        <tr>
          <td>등록일자</td>
          <td>
            <input type="text" :value="board.regDate" disabled/>
          </td>
        </tr>
      </table>

      <div>
        <button type="submit">수정완료</button>
        <router-link :to="{name: 'BoardReadPage', params: {boardNo: board.boardNo.toString()}}">
          돌아가기
        </router-link>
      </div>
    </form>
  </div>
</template>

<script>
export default {
  name: "BoardModifyForm",
  props: {
    board:{
      type: Object,
      require: true
    }
  },
  data() {
    return{
      title: '',
      content: ''
    }
  },
  methods: {
    onSubmit() {
      const {title, content} = this
      this.$emit('submit', {title, content})
    }
  },
  created() {
    this.title = this.board.title
    this.content = this.board.content
  }
}
</script>

<style scoped>

</style>
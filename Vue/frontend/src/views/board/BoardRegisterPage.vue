<template>
  <div align="center">
    <h2>게시물 작성</h2>
    <board-register-form @submit="onSubmit"/>
    <!-- onSubmit 함수 어떤게 실행이 될까?
         일단 boardRegisterForm 먼저 갔다가
         해당 onSubmit 함수 실행 -->
  </div>
</template>

<script>
import axios from "axios";
import BoardRegisterForm from "@/components/board/BoardRegisterForm";

export default {
  name: "BoardRegisterPage",
  components: {
    BoardRegisterForm
  },
  methods: {
    onSubmit(payload) {
      const {title, content, writer} = payload
      axios.post('http://localhost:7777/48th/vueboard/register', { title, writer, content })
          .then(() => {
            alert('게시물 등록 성공!')

            this.$router.push({
              name: 'BoardListPage'
            })
          })
          .catch(() => {
            alert('문제 발생!')
          })
    }
  }
}
</script>

<style scoped>

</style>
<template>
  <div align="center">
    <h2>vue + spring 게시물 수정</h2>
    <board-modify-form v-if="board" :board="board" @submit="onSubmit"></board-modify-form>
    <p v-else>로딩중... </p>
  </div>
</template>

<script>
import {mapActions, mapState} from "vuex";
import axios from "axios";
import BoardModifyForm from "@/components/board/BoardModifyForm";
export default {
  name: "BoardModifyPage",
  components: {
    BoardModifyForm
  },
  props: {
    boardNo: {
      type: String,
      require: true
    }
  },
  computed: {
    ...mapState(['board'])
  },
  methods: {
    ...mapActions(['fetchBoard']),
    onSubmit (payload){
      const { title, content } = payload // 수정 안하는것

      axios.put(`http://localhost:7777/49th/vueboard/${this.boardNo}`, {title, content})
      .then(res => {
        alert('수정 완료')
        this.$router.push({
          name: 'BoardReadPage',
          params: {boardNo: res.data.boardNo.toString()}
        })
      })
      .catch(() => {
        alert('수정 실패')
      })
    }
  },
  created() {
    //처음 이 객체를 만들때
    this.fetchBoard(this.boardNo)
    .catch(() => {
      alert('게시물 db 조회 실패')
      this.$router.back()
    })
  }
}
</script>

<style scoped>

</style>
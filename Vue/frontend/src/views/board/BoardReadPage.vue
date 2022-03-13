<template>
  <div align="center">
    <h2>vue + spring 게시판 읽기 </h2>

    <board-read v-if="board" :board="board"></board-read>
    <p v-else>로딩중... </p>
    <router-link :to="{name: 'BoardModifyPage', params: {boardNo}}"> 게시물 수정 </router-link>

    <button @click="onDelete">삭제</button>
    <router-link :to="{ name: 'BoardListPage'}">게시물 보기</router-link>

  </div>
</template>

<script>
import {mapActions, mapState} from "vuex";
import BoardRead from "@/components/board/BoardRead";
import axios from "axios";

export default {
  name: "BoardReadPage",
  props: {
    boardNo: {
      type: String,
      require: true // 반드시 있어야하는 정보를 표시
    }
  },
  components: {
    BoardRead
  },
  computed: {
    ...mapState(['board'])
  },
  created() {
    this.fetchBoard(this.boardNo).catch(() => {
      alert(('게시물 요청 실패'))
      this.$router.push()
    })
  },
  methods: {
    ...mapActions(['fetchBoard']),
    onDelete () {
      const {boardNo} = this.board
      axios.delete(`http://localhost:7777/49th/vueboard/${boardNo}`)
      .then(() => {
        alert('삭제 성공')
        this.$router.push({name: 'BoardListPage'})
      })
      .catch(() => {
        alert('삭제 실패')
      })
    }
  }
}
</script>

<style scoped>

</style>
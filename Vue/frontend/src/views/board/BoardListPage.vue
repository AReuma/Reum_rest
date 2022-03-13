<template>
  <div id="board">
    <h2> Vue + Spring 게시판 </h2>
    <router-link :to="{ name: 'BoardRegisterPage'}">게시물 작성 </router-link>
    <!-- 로컬 컴포넌트로 등록했기 때문에 board-list 태그를 사용가능함.  -->
    <board-list :boards="boards"/>
    <!-- v-bind:boards="boards" -->
  </div>
</template>

<script>
import BoardList from "@/components/board/BoardList";
import {mapActions, mapState} from "vuex";

export default {
  name: "BoardListPage",
  components: {
    BoardList
  },
  computed: {
    ...mapState(['boards'])
  },
  mounted() {
    this.fetchBoardList(); // this.fetchBoardList를 호출함.
    // boardList값을 state가 가지고 있다.
  },
  methods: {
    // methods에는 method를 사용하기 위해서.. boardlist에 있는 내용을 가지고오는 함수를 만드는거랑 동일함.
    ...mapActions(['fetchBoardList'])
    // actions에 있는 fetchBoardList와 매핑해라
  }
}
</script>

<style scoped>

</style>
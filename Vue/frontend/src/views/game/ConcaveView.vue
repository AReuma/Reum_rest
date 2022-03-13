<template>
  <div>
    <div>{{turn}}님의 턴입니다.</div>

    <!--판을 클릭하는 상황을 고려 -->
    <table-component :table-data="tableData"
                     :turn="turn"
                     :winner="winner"
                     v-on:updateTurn="updateTurn"
                     v-on:updateTableData="updateTableData"
                     v-on:updateWinner="updateWinner">
    </table-component>
    <div v-if="winner">{{winner}}님의 승리</div>
  </div>
</template>

<script>

import TableComponent from "@/components/game/TableComponent";

export default {
  name: "ConcaveView",
  data() {
    return{
      turn: 'O',
      winner: '',
      tableData: [
          ['', '', ''],
          ['', '', ''],
          ['', '', '']
      ]
    }
  },
  components: {
    TableComponent
  },
  methods:{
    updateTurn(val){
      this.turn = val
    },
    updateTableData(){
      this.tableData = [
        ['', '', ''],
        ['', '', ''],
        ['', '', '']
      ]
    },
    updateWinner(val) {
      this.winner = val
    }
  }
}
</script>

<style scoped>

</style>
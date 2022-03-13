<template>
    <form @submit.prevent="onSubmit">
      <!--  form 안에 input 에서 엔터키를 쳐서 form 이 submit 되는것도 막을 수 있다 -->
      <table>
        <tr>
          <td>제목</td>
          <td>
            <input type="text" v-model="title"/>
          </td>
        </tr>
        <tr>
          <td>작성자</td>
          <td>
            <input type="text" v-model="writer"/>
          </td>
        </tr>
        <tr>
          <td>본문</td>
          <td>
            <textarea cols="50" rows="20" v-model="content"></textarea>
          </td>
        </tr>
      </table>

      <div>
        <button type="submit">등록</button>
        <router-link :to="{name: 'BoardListPage' }">취소</router-link>
      </div>

    </form>
</template>

<script>
export default {
  name: "BoardRegisterForm",
  data (){
    return {
      title: '제목을 작성하세요',
      writer: '작성자',
      content: '본문',
    }
  },
  methods: {
    onSubmit () {
      const { title, writer, content } = this
      this.$emit('submit', { title, writer, content })
    }
  }
}
</script>

<style scoped>

</style>
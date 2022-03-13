<template>
  <div class="home">
    <div id="header">

      <router-link :to="{name: 'BoardListPage'}">BoardListPage</router-link>
      <router-link :to="{ name: 'ConcaveView' }">&nbsp;삼목&nbsp;</router-link>

    </div>
  </div>
</template>

<script>
// @ is an alias to /src
//import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'HomeView',
  components: {
    //HelloWorld
  }
}
</script>

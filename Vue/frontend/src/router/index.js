import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/HomeView.vue'

import BoardListPage from '@/views/board/BoardListPage.vue'
import BoardRegisterPage from '@/views/board/BoardRegisterPage.vue'
import BoardReadPage from "@/views/board/BoardReadPage";
import BoardModifyPage from "@/views/board/BoardModifyPage";

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/boardList',
    name: 'BoardListPage',
    component: BoardListPage
  },
  {
    path: '/boardRegister',
    name: 'BoardRegisterPage',
    component: BoardRegisterPage
  },
  {
    path: '/boardRead/:boardNo',
    name: 'BoardReadPage',
    components: {
      default: BoardReadPage
    },
    props: {
      //자동으로 하겠다
      default: true
    }
  },
  {
    path: '/boardModify/:boardNo',
    name: 'BoardModifyPage',
    components: {
      default: BoardModifyPage
    },
    props: {
      default: true
    }
  }

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router

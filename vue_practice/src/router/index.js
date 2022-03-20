import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'
import TestView from '@/views/TestView.vue'

import BoardListPage from '@/views/board/BoardListPage.vue'
import BoardRegisterPage from '@/views/board/BoardRegisterPage.vue'
import BoardReadPage from '@/views/board/BoardReadPage.vue'
import BoardModifyPage from '@/views/board/BoardModifyPage.vue'

import CoverFlowTest from '@/views/ui/CoverFlowTest.vue'
import AwesomeSwiper from '@/views/ui/AwesomeSwiper.vue'
import VeutifyImageTestPage from '@/views/ui/VeutifyImageTestPage.vue'

import VueFileUploadPage from '@/views/fileUpload/VueFileUploadPage.vue'


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/test',
    name: 'Test',
    component: TestView
  },
  {
    path: '/boardlist',
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
  },
  {
    path: '/CoverFlowTest',
    name: 'CoverFlowTest',
    component: CoverFlowTest
  },
  {
    path: '/AwesomeSwiper',
    name: 'AwesomeSwiper',
    component: AwesomeSwiper
  },
  {
    path: '/VueFileUploadTest',
    name: 'VueFileUploadPage',
    component: VueFileUploadPage
  },
  {
    path: '/VeutifyImageTest',
    name: 'VeutifyImageTestPage',
    component: VeutifyImageTestPage
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router

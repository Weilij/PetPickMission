import { createRouter, createWebHistory } from 'vue-router'
import MissionMain from '../pages/MissionMain.vue'

export default createRouter({
  history: createWebHistory(),
  routes: [{ path: '/', component: MissionMain, name: 'missions' }],
})
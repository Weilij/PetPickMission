import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap'                 
import './assets/styles.css'
import { createApp } from 'vue'
import { createPinia } from 'pinia'
import App from './App.vue'
import router from './router'

createApp(App).use(router).use(createPinia()).mount('#app')
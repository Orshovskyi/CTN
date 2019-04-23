import Vue from 'vue'
import Vuetify from 'vuetify'
import "api/resource"
import {connect} from "./util/ws";
import App from 'pages/App.vue'
import 'vuetify/dist/vuetify.min.css'

if (frontendData.profile) {
    connect();
}
Vue.use(Vuetify)


new Vue({
    el: '#app',
    render: a => a(App)
})

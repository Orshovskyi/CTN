import Vue from 'vue'


const ctns = Vue.resource('/ctn{/id}')

export default {
    add: ctn => ctns.save({}, ctn),
    update: ctn => ctns.update({id: ctn.id}, ctn),
    remove: id => ctns.remove({id})
}
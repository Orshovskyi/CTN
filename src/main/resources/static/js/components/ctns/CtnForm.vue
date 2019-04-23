<template>
    <v-layout row>
        <v-text-field
                label="New message"
                placeholder="Write something"
                v-model="type_id"
        />
        <v-btn @click="save">
            Save
        </v-btn>
    </v-layout>
</template>

<script>
    import ctnsApi from 'api/ctns'

    export default {
        props: ['ctns', 'ctnAttr'],
        data() {
            return {
                type_id: '',
                id: ''
            }
        },
        watch: {
            ctnAttr(newVal, oldVal) {
                this.type_id = newVal.type_id
                this.id = newVal.id
            }
        },
        methods: {
            save() {
                const ctn = {
                    id: this.id,
                    type_id: this.type_id
                }
                if (this.id) {
                    ctnsApi.update(ctn).then(result =>
                        result.json().then(data => {
                            const index = this.ctns.findIndex(item => item.id === data.id)
                            this.ctns.splice(index, 1, data)
                        })
                    )
                } else {
                    ctnsApi.add(ctn).then(result =>
                        result.json().then(data => {
                            const index = this.ctns.findIndex(item => item.id === data.id)
                            if (index > -1) {
                                this.ctns.splice(index, 1, data)
                            } else {
                                this.ctns.push(data)
                            }
                        })
                    )
                }
                this.type_id = ''
                this.id = ''
            }
        }
    }
</script>

<style>
</style>
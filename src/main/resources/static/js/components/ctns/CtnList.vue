
<template>
    <v-layout  align-space-around justify-start column >
        <ctn-form :ctns="ctns" :ctnAttr="ctn" />
        <ctn-row v-for="ctn in sortedCtns"
                     :key="ctn.id"
                     :ctn="ctn"
                     :editCtn="editCtn"
                     :deleteCtn="deleteCtn"
                     :ctns="ctns" />
    </v-layout>
</template>

<script>
    import CtnRow from 'components/ctns/CtnRow.vue'
    import CtnForm from 'components/ctns/CtnForm.vue'
    import ctnsApi from 'api/ctns'
    export default {
        props: ['ctns'],
        components: {
            CtnForm,
            CtnRow
        },
        data() {
            return {
                ctn: null
            }
        },
        computed: {
            sortedCtns() {
                return this.ctns.sort((a, b) => -(a.id - b.id))
            }
        },
        methods: {
            editCtn(ctn) {
                this.ctn = ctn
            },
            deleteCtn(ctn) {
                ctnsApi.remove(ctn.id).then(result => {
                    if (result.ok) {
                        this.ctns.splice(this.ctns.indexOf(ctn), 1)
                    }
                })
            }
        }
    }
</script>

<style>
</style>
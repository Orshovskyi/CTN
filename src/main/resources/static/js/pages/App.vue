<template>

    <v-app>

        <v-toolbar app>
            <v-toolbar-title>City Telephone Network</v-toolbar-title>
            <v-spacer></v-spacer>
            <span v-if="profile">{{profile.name}}</span>
            <v-btn v-if="profile" icon href="/logout">
                <v-icon>exit_to_app</v-icon>
            </v-btn>
        </v-toolbar>
        <v-content>
            <v-container v-if="!profile">
                Потрібно авторизуватись через
                <a href="/login">Google</a>
            </v-container>
            <v-container v-if="profile">
                <ctns-list :ctns="ctns"/>
            </v-container>
        </v-content>
    </v-app>
</template>

<script>
    import CtnsList from 'components/ctns/CtnList.vue'
    import {addHandler} from 'util/ws'

    export default {
        components: {
            CtnsList
        },
        data() {
            return {
                ctns: frontendData.ctns,
                profile: frontendData.profile
            }
        },
        created() {
            addHandler(data => {
                if (data.objectType === 'MESSAGE') {
                    const index = this.ctns.findIndex(item => item.id === data.body.id)

                    switch (data.eventType) {
                        case 'CREATE':
                        case 'UPDATE':
                            if (index > -1) {
                                this.ctns.splice(index, 1, data.body)
                            } else {
                                this.ctns.push(data.body)
                            }
                            break
                        case 'REMOVE':
                            this.ctns.splice(index, 1)
                            break
                        default:
                            console.error(`Looks like the event type if unknown "${data.eventType}"`)
                    }
                } else {
                    console.error(`Looks like the object type if unknown "${data.objectType}"`)
                }
            })
        }
    }
</script>

<style>
</style>
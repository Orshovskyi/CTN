<template>


    <!--v-app id="inspire">
        <v-data-table
          :headers="headers"
          :rows-per-page-items='[20, 5, {text: "Огласите весь список, пжлста", value: -1}]'
          :items="desserts"
          class="elevation-1"
        >
          <template slot="items" slot-scope="props">

            <td class="text-xs-right">{{ ctn.id }}</td>
            <td class="text-xs-right">{{ ctn.type_id}}</td>

          </template>
        </v-data-table>
      </v-app-->

      <div>
              <i>({{ ctn.id }})</i> {{ ctn.type_id }}
              <span style="position: absolute; right: 0">
                  <input type="button" value="Edit" @click="edit" />
                  <input type="button" value="X" @click="del" />
              </span>
        </div>
</template>

<script>
export default {
 props: ['ctn', 'editCtn', 'deleteCtn', 'ctns'],
    methods: {
        edit () {
            this.editCtn(this.ctn)
        },
        del() {
           this.deleteCtn(this.ctn)
        }
    }
}
</script>

<style scoped>

</style>
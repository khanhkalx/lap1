<script setup>

const msg="hello bố"
const rawHtml = '<span style="color:red">This should be red.</span>'
const object ={
  id: 'concho',
  class: 'btn',
  style:{
    color: 'red'
  }
}
import {ref} from 'vue'
const count = ref(0)

function increment() {
  count.value++
}
</script>

<template>
  <h1>Syntax</h1>
  <p>Message: {{ msg }}</p>
  <p>Using v-html directive: <span v-html="rawHtml"></span></p>
  <button v-bind="object">click-kick</button>
  <Button @click="increment">Number:{{ count }}</Button>
</template>



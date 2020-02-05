<template>
  <div class="donations">
    <div class="formConatainer">
        <inputFormText fieldName="name" v-model="name"/>
        <inputFormText fieldName="surname" v-model="surname"/>
        <inputFormText fieldName="amount" v-model="amount"/>
        <inputFormText fieldName="currency" v-model="currency"/>
    </div>
    <button v-on:click="createDonation" class="generalButton">Create</button>
  </div>
</template>

<script>
import axios from "./axios";
import inputFormText from "./InputFormText";

export default {
  name: "CreateDonation",
  data() {
    return {
      name: "",
      surname: "",
      amount: "",
      currency: ""
    };
  },
  methods: {
    createDonation() {
        console.log(this.name);
      axios
        .donate(this.name, this.surname, this.amount, this.currency)
        .then(response => {
          window.location.href = "/";
        })
        .catch(er => {});
    }
  },
  components: { inputFormText }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>
@import "../css/donations.css";
h1,
h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>

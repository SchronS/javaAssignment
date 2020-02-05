<template>
  <div class="donations">
    <p class="welcomeText">{{msg}}</p>
    <router-link to="/createDonation" tag="button" class="generalButton">Create</router-link>
    <router-link to="/showDonations" tag="button" class="generalButton">Data</router-link>
  </div>
</template>

<script>
import axios from "./axios";

export default {
  name: "Donations",
  data() {
    return {
      msg: "Welcome to Dragontale donations!"
    };
  },
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

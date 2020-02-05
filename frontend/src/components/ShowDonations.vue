<template>
  <div class="donations">
    <button v-on:click="callDonations" class="generalButton spacer">Data</button>
    <button v-on:click="saveAsCSV" v-if="seen" class="generalButton spacer">Export to CSV</button>
    <div class="donationContainer">
      <div class="donationHead" v-if="seen">
        <donationCell v-bind:cell="'Name'"></donationCell>
        <donationCell v-bind:cell="'Surname'"></donationCell>
        <donationCell v-bind:cell="'Amount'"></donationCell>
        <donationCell v-bind:cell="'Currency'"></donationCell>
      </div>
      <div v-for="donation in backendResponse" :key="donation.id" class="donationEntry">
        <donationCell v-bind:cell="donation.name"></donationCell>
        <donationCell v-bind:cell="donation.surname"></donationCell>
        <donationCell v-bind:cell="donation.amount"></donationCell>
        <donationCell v-bind:cell="donation.currency"></donationCell>
      </div>
    </div>
  </div>
</template>

<script>
import axios from "./axios";

export default {
  name: "ShowDonations",
  data() {
    return {
      seen: false,
      backendResponse: ""
    };
  },
  methods: {
    callDonations() {
      this.seen = true;
      axios
        .donations()
        .then(response => {
          this.backendResponse = response.data;
        })
        .catch(error => {
          this.errors.push(error);
        });
    },
    saveAsCSV() {
      let csvContent = "data:text/csv;charset=utf-8,"
      const { parse } = require("json2csv");
      const fields = ["name", "surname", "amount", "currency"];
      const opts = { fields };
      const csv = parse(this.backendResponse, opts);
      csvContent += csv;
      var encodedUri = encodeURI(csvContent);
      var link = document.createElement("a");
      link.setAttribute("href", encodedUri);
      link.setAttribute("download", "DonationsData.csv");
      document.body.appendChild(link);
      link.click();
    }
  }
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

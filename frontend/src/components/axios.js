import axios from 'axios'

const Axios = axios.create({
  baseURL: '/api',
  timeout: 1000
})

export default {
  donations () {
    return Axios.get('/donations')
  },
  donate (name,surname,amount,currency) {
    var formData = new FormData();
    formData.append('name',name);
    formData.append('surname',surname);
    formData.append('amount',amount);
    formData.append('currency',currency);
    
    return Axios({
      method: 'post',
      url: '/donate',
      data: formData,
      headers: {'Content-Type': 'multipart/form-data' }
    })
  }
}

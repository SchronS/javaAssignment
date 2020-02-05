import Vue from 'vue'
import Router from 'vue-router'
import Donations from '@/components/Donations'
import CreateDonation from '@/components/CreateDonation'
import ShowDonations from '@/components/ShowDonations'

Vue.use(Router)

const router = new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      component: Donations
    },
    {
      path: '/createDonation',
      component: CreateDonation
    },
    {
      path: '/showDonations',
      component: ShowDonations
    }
  ]
})

export default router;

import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import ruyuantongji from '@/views/modules/ruyuantongji/list'
    import liliaoxinxi from '@/views/modules/liliaoxinxi/list'
    import tijianxinxi from '@/views/modules/tijianxinxi/list'
    import jiankangdangan from '@/views/modules/jiankangdangan/list'
    import hulifangan from '@/views/modules/hulifangan/list'
    import hulijilu from '@/views/modules/hulijilu/list'
    import ruzhuxinxi from '@/views/modules/ruzhuxinxi/list'
    import zhusuxinxi from '@/views/modules/zhusuxinxi/list'
    import tijiantongji from '@/views/modules/tijiantongji/list'
    import xiangmuleixing from '@/views/modules/xiangmuleixing/list'
    import yonghu from '@/views/modules/yonghu/list'
    import hetongxinxi from '@/views/modules/hetongxinxi/list'
    import huli from '@/views/modules/huli/list'
    import yisheng from '@/views/modules/yisheng/list'
    import xinlizixun from '@/views/modules/xinlizixun/list'
    import jiankangpinggu from '@/views/modules/jiankangpinggu/list'
    import xiangmuxinxi from '@/views/modules/xiangmuxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/ruyuantongji',
        name: '入院统计',
        component: ruyuantongji
      }
      ,{
	path: '/liliaoxinxi',
        name: '理疗信息',
        component: liliaoxinxi
      }
      ,{
	path: '/tijianxinxi',
        name: '体检信息',
        component: tijianxinxi
      }
      ,{
	path: '/jiankangdangan',
        name: '健康档案',
        component: jiankangdangan
      }
      ,{
	path: '/hulifangan',
        name: '护理方案',
        component: hulifangan
      }
      ,{
	path: '/hulijilu',
        name: '护理记录',
        component: hulijilu
      }
      ,{
	path: '/ruzhuxinxi',
        name: '入住信息',
        component: ruzhuxinxi
      }
      ,{
	path: '/zhusuxinxi',
        name: '住宿信息',
        component: zhusuxinxi
      }
      ,{
	path: '/tijiantongji',
        name: '体检统计',
        component: tijiantongji
      }
      ,{
	path: '/xiangmuleixing',
        name: '项目类型',
        component: xiangmuleixing
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/hetongxinxi',
        name: '合同信息',
        component: hetongxinxi
      }
      ,{
	path: '/huli',
        name: '护理',
        component: huli
      }
      ,{
	path: '/yisheng',
        name: '医生',
        component: yisheng
      }
      ,{
	path: '/xinlizixun',
        name: '心理咨询',
        component: xinlizixun
      }
      ,{
	path: '/jiankangpinggu',
        name: '健康评估',
        component: jiankangpinggu
      }
      ,{
	path: '/xiangmuxinxi',
        name: '项目信息',
        component: xiangmuxinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;

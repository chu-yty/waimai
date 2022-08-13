function loginApi(data) {
    return $axios({
      'url': '/user/login',
      'method': 'post',
      data
    })
  }
function logincodeApi(data){
    return $axios({
        'url': '/user/email',
        'method': 'post',
        params: { email: data.email }
    })
}

function loginoutApi() {
  return $axios({
    'url': '/user/loginout',
    'method': 'post',
  })
}

  
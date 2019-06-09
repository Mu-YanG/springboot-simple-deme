获取验证码：

请求链接：http://10.221.253.183:9080/getVerification/{id}

请求方式：get

请求参数： id  时间戳  （该id 作为图片和数据校验，不允许重复）

 

返回参数：

min： 小图的路径

background： 大图的路径

code： 0正常请求 ，180011 服务器异常不做返回(id 重复 不做返回)

返回参数示例

{

         "data": {

"min": "https://nfs.t.nxin.com/verification/b00c0907cc90472eb5b79354f0e5b31c_min.png",

"background": "https://nfs.t.nxin.com/verification/b00c0907cc90472eb5b79354f0e5b31c_background.png",

         },

         "code": 0,

         "error": ""

}

 

 

 

 

校验验证码：

请求连接:http://10.221.253.183:9080/checkVerification/{id}/{x}

请求方式:get

请求参数：

            id  ：（该id 作为图片和数据校验，不允许重复） ： 

            x ： 小图位移的 x 轴距离

请求示例:

http://10.221.253.183:9080/checkVerification/4fbcca174c18462bab85699543e6900c/233

详解：

校验有效时间：3分钟 ，超过三分钟 校验失败

x坐标检验范围配置为 x 加减正负5 ，在该校验范围内code 值为0 验证成功

返回参数:

Code 值为 180010 时，服务器异常 不做返回

Code 值为 0 时，验证成功

Code 值为 180002时，验证失败请重试

Code 值为 180001时，验证超时请重新发生验证码

返回参数示例：

{

    "data": "验证成功",

    "code": 0,

    "error": ""

}

{

    "data": "验证失败请重试",

    "code": 180002,

    "error": ""

}

{

    "data": "验证超时请重新发生验证码",

    "code": 180001,

    "error": ""

}
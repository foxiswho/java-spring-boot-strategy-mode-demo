# java-spring-boot-strategy-mode-demo
java-spring-boot-strategy-mode-demo,使用设计模式，避免过多的或不用if.else,switch

策略模式案例


# 支付宝
```SHELL
http://localhost:8080/alipay
```
输出
```SHELL
{"no":"N1556172818764","payId":10000,"form":"这是支付宝表单"}
```


# 微信支付
```SHELL
http://localhost:8080/wechat
```
输出
```SHELL
{"no":"N1556172909399","payId":10001,"form":"这是微信表单"}
```

# 通联支付
```SHELL
http://localhost:8080/allinpay
```
输出
```SHELL
{"no":"N1556172950228","payId":10002,"form":"这是通联表单"}
```


# IF ELSE 方式
## 支付宝
```SHELL
http://localhost:8080/old/alipay
```
输出
```SHELL
{"no":"N1556172818764","payId":10000,"form":"这是 ifelse.switch 支付宝表单"}
```

## 微信支付
```SHELL
http://localhost:8080/old/wechat
```
输出
```SHELL
{"no":"N1556172909399","payId":10001,"form":"这是 ifelse.switch 微信表单"}
```

## 通联支付
```SHELL
http://localhost:8080/old/allinpay
```
输出
```SHELL
{"no":"N1556172950228","payId":10002,"form":"这是 ifelse.switch 通联表单"}
```

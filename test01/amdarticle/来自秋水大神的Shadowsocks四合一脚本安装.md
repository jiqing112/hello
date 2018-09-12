# 来自秋水大神的Shadowsocks四合一脚本安装

恭喜秋水逸冰大神解锁GFW认证

![PcyCdg.md.png](https://s1.ax1x.com/2018/08/12/PcyCdg.md.png)

~~~
 wget --no-check-certificate -O shadowsocks-all.sh https://raw.githubusercontent.com/teddysun/shadowsocks_install/master/shadowsocks-all.sh

 chmod +x shadowsocks-all.sh
 ./shadowsocks-all.sh 2>&1 | tee shadowsocks-all.log
~~~



## 卸载

~~~
./shadowsocks-all.sh uninstall
~~~

## 启动

启动脚本后面的参数含义，从左至右依次为：启动，停止，重启，查看状态。

 ~~~
Shadowsocks-Python 版：
/etc/init.d/shadowsocks-python start | stop | restart | status

ShadowsocksR 版：
/etc/init.d/shadowsocks-r start | stop | restart | status

Shadowsocks-Go 版：
/etc/init.d/shadowsocks-go start | stop | restart | status

Shadowsocks-libev 版：
/etc/init.d/shadowsocks-libev start | stop | restart | status
 ~~~


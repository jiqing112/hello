#!/bin/bash
#试着学习写sh脚本，就是写把命令写进取，增加变量数组运算符配合命令的操作阿
touch lala.txt

git add lala.txt
git commit -m "增加lala.txt"
git add *.sh
git commit -m "把这脚本也提交上去"
git pull origin master:
git push origin master
rm -rf lala.txt

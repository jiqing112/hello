#!/bin/bash
touch lala.txt

git add lala.txt
git commit -m "增加lala.txt"
git add *.sh
git commit -m "把这脚本也提交上去"
git pull origin master:
git push origin master
rm -rf lala.txt

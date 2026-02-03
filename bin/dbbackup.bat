@echo off

echo 正在备份 Oracle 数据库，请稍等……    

rem 以下变量根据实际情况配置
set curdir=D:\profile\dbbackup
set username=user_flcs
set password=user_flcs
set sid=orcl

if not exist "%curdir%" mkdir %curdir%

del %curdir%\%username%7.dmp /f/q
del %curdir%\%username%7.log /f/q

ren %curdir%\%username%6.dmp %username%7.dmp 
ren %curdir%\%username%5.dmp %username%6.dmp 
ren %curdir%\%username%4.dmp %username%5.dmp 
ren %curdir%\%username%3.dmp %username%4.dmp 
ren %curdir%\%username%2.dmp %username%3.dmp 
ren %curdir%\%username%1.dmp %username%2.dmp 
ren %curdir%\%username%.dmp  %username%1.dmp 


ren %curdir%\%username%6.log %username%7.log 
ren %curdir%\%username%5.log %username%6.log 
ren %curdir%\%username%4.log %username%5.log 
ren %curdir%\%username%3.log %username%4.log 
ren %curdir%\%username%2.log %username%3.log 
ren %curdir%\%username%1.log %username%2.log 
ren %curdir%\%username%.log  %username%1.log 

rem 开始导出
exp %username%/%password%@%sid% file=%curdir%\%username%.dmp log=%curdir%\%username%.log grants=y owner=%username%

echo 任务完成!

pause
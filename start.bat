rem AspectJ needs access to its jar before running so you need to pass it on classpath

set _path=c:\Users\toks\.m2\repository\org\aspectj\aspectjrt\1.8.7\aspectjrt-1.8.7.jar;./target/classes

java -cp "%_path%;./target/classes" biz.letsweb.aspecting.App

pause
# Modules intro

### Compile SimpleMathFuncs and module-info (from the mymodapp directory):
`javac -d appmodules/appfuncs appsrc/appfuncs/appfuncs/simplefuncs/SimpleMathFuncs.java`
`javac -d appmodules/appfuncs appsrc/appfuncs/module-info.java`

OR (simpler one liner)

`javac -d appmodules/appfuncs appsrc/appfuncs/module-info.java appsrc/appfuncs/appfuncs/simplefuncs/SimpleMathFuncs.java`


### Compile MyModAppDemo and module-info (from the mymodapp directory):
`javac --module-path appmodules -d appmodules/appstart \
appsrc/appstart/module-info.java \
appsrc/appstart/appstart/mymodappdemo/MyModAppDemo.java`

### Run:

`java --module-path appmodules -m appstart/appstart.mymodappdemo.MyModAppDemo`


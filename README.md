# android-frame
对android的交代-atlas容器化框架

************************************** 热更新使用文档 ***************************************

1、 app的build.gradle的语句"version = getEnvValue("versionName", "1.0.0");"中修改想要生成的app的versionName（默认为1.0.0）

    app目录下执行../gradlew clean assembleDebug 生成apk  (windows 环境的命令为 ..\gradlew.bat clean assembleDebug  以下类同)

2、 app目录下执行../gradlew publish 将跟apk同目录的ap文件发布到仓库,此时ap的版本是1.0.0

3、 手机上安装生成的apk，同时进到动态部署界面（侧边栏里面划开点击进入),且手机连接电脑adb（确保adb devices可见）

///////////////////////////////^^^^^^^准备工作^^^^^^^^^^////////////////////////

4、 进行一些想要的修改（不支持manifest的修改）

5、 app工程目录下执行../gradlew clean assembleDebug -DapVersion=1.0.0 -DversionName=1.0.1,
    其中apVersion为之前打的完整apk的版本，newVersion为此次动态部署要生成的新的版本号，
    例如命令 ../gradlew clean assembleDebug -DapVersion=1.0.0 -DversionName=1.0.1

6、 检查build/output/tpatch-debug 目录下文件是否生成，然后执行下面的命令(以下为mac下的命令，windows请修改文件分隔符)
    adb push build/outputs/tpatch-debug/update-1.0.0.json /sdcard/Android/data/com.taobao.demo/cache/update-1.0.0.json
    (根据你手机的当前版本推送对应版本的update-**.json,和对应的tpatch文件)
    adb push build/outputs/tpatch-debug/patch-1.0.1@1.0.0.tpatch /sdcard/Android/data/com.taobao.demo/cache/patch-1.0.1@1.0.0.tpatch

7、 点击动态部署页面红色按钮执行动态部署

8、 后续继续做想要的修改，我们要变成1.0.2 (某个bundle做动态部署的时候请更新版本号，因为差量会基于版本号对比)
	../gradlew clean assembleDebug -DapVersion=1.0.0 -DversionName=1.0.2   这时候会生成两个  patch-1.0.2@1.0.0.tpatch  patch-1.0.2@1.0.1.tpatch

	根据你目前的app版本，重复6步骤，推送对应版本的update-**.json,和对应的tpatch文件。

9、 后续继续做想要的修改，我们要变成1.0.3 (某个bundle做动态部署的时候请更新版本号，因为差量会基于版本号对比)
	../gradlew clean assembleDebug -DapVersion=1.0.0 -DversionName=1.0.3   这时候会生成三个  patch-1.0.3@1.0.2.tpatch  patch-1.0.3@1.0.1.tpatch  patch-1.0.3@1.0.0.tpatch

	根据你目前的app版本，重复6步骤，推送对应版本的update-**.json,和对应的tpatch文件。

10、 如果做了多次动态部署后，需要从头开始测试，请先清楚AtlasDemo根目录下的hisTpatch文件夹。

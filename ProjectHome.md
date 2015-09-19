| ![http://images.cnblogs.com/cnblogs_com/echozhjun/hs-logo-128.png](http://images.cnblogs.com/cnblogs_com/echozhjun/hs-logo-128.png) | _在项目开发过程中免不了日志记录，而现在几乎所有的项目都不再是一个人完成了，所以一个项目组里每个开发人员都在不断的log.debug，log.info……然后某一天，因为要开发的新功能或者要调试出现的某个Bug，你将日志级别提升到了debug或者info，突然发现在Console里瞬间就跑下了一大片的日志，而你不得不在大量充斥着众多开发人员的繁杂的日志里找到那属于自己的几条信息，Oh my god！能不能只显示我自己的日志呢？那么，本系统将解决您的问题。_ |
|:------------------------------------------------------------------------------------------------------------------------------------|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

基于开发人员的日志记录系统，从此你可以选择的去看某个或者某几个开发者的日志。

# Introduction #

如果你以前用Apache commons logging来做日志，那么使用起来几乎用法是一样的：

# User guide #

1，首先当然是将最新的hslog.jar包加入classpath。

2，调用的实例代码：
```
import org.apache.commons.logging.Log;

import com.hundsun.log.LogFactory;
import com.hundsun.log.LogIdentifier;

public class Main {
	public static void main(String[] args) {
		LogIdentifier identifier = LogFactory.getIdentifier("echozhjun");
		// 创建一个被标记的Log
		Log log = LogFactory.getLog(Main.class, identifier);
		// 也可以直接传入名称构建被标记的Log
		// Log log = LogFactory.getLog(Main.class, "echozhjun");
		log.debug("message 1.");
		// 创建一个还被标记但是可以在使用的时候在标记的Log
		Log log2 = LogFactory.getLog(Main.class);
		// 此处的日志和不参与标记，和以前一样
		log2.debug("message 2.");
	}
}
```
只需要在构造Log的时候增加一个参数。

通常为：System.getProperty("user.name");

然后在classpath下面增加：hslog.properties文件：
```
hslog.user=echozhjun,echo
```
那么配置的用户的日志将被执行。如果该文件不存在则全部日志将被执行。
**基于开发人员的日志记录系统，从此你可以选择的去看某个或者某几个开发者的日志。**

# Introduction #
如果你以前用Apache commons logging来做日志，那么使用起来几乎用法是一样的：
# User guide #
1，首先当然是将hslog-1.0-test.jar包加入classpath。

2，调用的实例代码：
```
import org.apache.commons.logging.Log;

import com.hundsun.log.LogFactory;
import com.hundsun.log.LogIdentifier;

public class Main {
	public static void main(String[] args) {
		LogIdentifier identifier = LogFactory.getIdentifier("zhangjun");
		// 创建一个被标记的Log
		Log log = LogFactory.getLog(Main.class, identifier);
		// 也可以直接传入名称构建被标记的Log
		// Log log = LogFactory.getLog(Main.class, "zhangjun");
		log.debug("message 1.");
		// 创建一个还被标记但是可以在使用的时候在标记的Log
		Log log2 = LogFactory.getLog(Main.class);
		// 此处的日志和不参与标记，和以前一样
		log2.debug("message 2.");
	
	}
}

```

只需要在构造Log的时候增加一个参数，参数的一半是开发人员的用户名。

通常为：System.getProperty("user.name");

然后在classpath下面增加：hslog.properties文件：

hslog.user=echo1,echo2

那么配置的用户的日志将被执行。如果该文件不存在则全部日志将被执行。
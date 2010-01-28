package com.hundsun.log;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;

/**
 * @author zhangjun
 * 
 */
public class LogIdentifier {

	private String name;

	public LogIdentifier() {
	}

	public LogIdentifier(String name) {
		this.name = name;
	}

	public String getIdentifier() {
		return name;
	}

	public void setIdentifier(String name) {
		this.name = name;
	}

	public boolean check() {
		Properties config = getConfig();
		if (config.isEmpty()) {
			return true;
		}
		String[] users = config.getProperty("hslog.user").split(",");
		for (int i = 0; i < users.length; i++) {
			if (name.equals(users[i])) {
				return true;
			}
		}
		return false;
	}

	private Properties getConfig() {
		ClassLoader loader = LogIdentifier.class.getClassLoader();
		URL url = loader.getResource("hslog.properties");
		Properties config = new Properties();
		try {
			config.load(new FileInputStream(url.getFile()));
		} catch (Exception e) {
		}
		return config;
	}

}

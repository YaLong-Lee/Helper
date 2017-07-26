package helper;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * 配置文件帮助类
 */
public class ConfigHelper {
	/**
	 * 获取config.properties文件中的配置响应值
	 * @param keyString
	 * @return 
	 */
	public static String getConfig(String key){
		String value = "";
		String path = "./config/config.properties";
		try {
			PropertiesConfiguration prop = new PropertiesConfiguration(path);
			 configvalue = prop.getString(key);
			return value;
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
		return value;
	}
}

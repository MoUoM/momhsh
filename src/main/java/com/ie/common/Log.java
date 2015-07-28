/**
 * Copy Right Information   : Forsoft 
 * Project                  : ICS
 * JDK version used         : jdk1.6
 * Comments                 : 打印输出日志
 * Version                  : 1.0
 * create date              : 2008.4.15
 * author                   ：
*/
package com.ie.common;

import org.apache.log4j.Logger;

public class Log {

	private static Logger log = Logger.getLogger(Log.class);
	private Log() {
		super();
	}
	
	/**
	 * Description :打印开关为True时，打印输出日志 
	 * @param :String
	 * @return :String
	 */
	public static void log(Object str) {
		StackTraceElement stack[] = (new Throwable()).getStackTrace();
		for (int i = 0; i < stack.length; i++) {
			if (i == 1) {
				log.info("(" + stack[i].getFileName() + ":"
						+ stack[i].getLineNumber() + ") "
						+ stack[i].getMethodName() + ":" + str);
				break;
			}
		}
	}

}


package com.offcn.wode;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>国内手机号码归属地查询WEB服务</strong>，提供最新的国内手机号码段归属地数据，每月更新。<br />
 * 使用本站 WEB 服务请注明或链接本站：
 * <a href="http://www.webxml.com.cn/" target="_blank">http://www.webxml.com.cn/
 * </a> 感谢大家的支持！<br />
 * &nbsp;
 * 
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
* MobileCodeWS service = new MobileCodeWS();
* MobileCodeWSSoap portType = service.getMobileCodeWSSoap();
* portType.getMobileCodeInfo(...);
 * </pre>
 * </p>
 * 
 */
@WebServiceClient(name = "MobileCodeWS", targetNamespace = "http://WebXml.com.cn/", wsdlLocation = "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl")
public class MobileCodeWS extends Service {

	private final static URL MOBILECODEWS_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(com.offcn.wode.MobileCodeWS.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.offcn.wode.MobileCodeWS.class.getResource(".");
			url = new URL(baseUrl, "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");
		} catch (MalformedURLException e) {
			logger.warning(
					"Failed to create URL for the wsdl Location: 'http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		MOBILECODEWS_WSDL_LOCATION = url;
	}

	public MobileCodeWS(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public MobileCodeWS() {
		super(MOBILECODEWS_WSDL_LOCATION, new QName("http://WebXml.com.cn/", "MobileCodeWS"));
	}

	/**
	 * 
	 * @return returns MobileCodeWSSoap
	 */
	@WebEndpoint(name = "MobileCodeWSSoap")
	public MobileCodeWSSoap getMobileCodeWSSoap() {
		return super.getPort(new QName("http://WebXml.com.cn/", "MobileCodeWSSoap"), MobileCodeWSSoap.class);
	}

	/**
	 * 
	 * @return returns MobileCodeWSSoap
	 */
	@WebEndpoint(name = "MobileCodeWSSoap12")
	public MobileCodeWSSoap getMobileCodeWSSoap12() {
		return super.getPort(new QName("http://WebXml.com.cn/", "MobileCodeWSSoap12"), MobileCodeWSSoap.class);
	}

	/**
	 * 
	 * @return returns MobileCodeWSHttpGet
	 */
	@WebEndpoint(name = "MobileCodeWSHttpGet")
	public MobileCodeWSHttpGet getMobileCodeWSHttpGet() {
		return super.getPort(new QName("http://WebXml.com.cn/", "MobileCodeWSHttpGet"), MobileCodeWSHttpGet.class);
	}

	/**
	 * 
	 * @return returns MobileCodeWSHttpPost
	 */
	@WebEndpoint(name = "MobileCodeWSHttpPost")
	public MobileCodeWSHttpPost getMobileCodeWSHttpPost() {
		return super.getPort(new QName("http://WebXml.com.cn/", "MobileCodeWSHttpPost"), MobileCodeWSHttpPost.class);
	}

}

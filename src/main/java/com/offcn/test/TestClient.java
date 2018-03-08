package com.offcn.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class TestClient {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		CloseableHttpClient client=HttpClients.createDefault();
		HttpPost post=new HttpPost("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx");
		StringBuilder sb=new StringBuilder();
		sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
		sb.append("<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">");
		sb.append("<soap12:Body>");
		sb.append("<getMobileCodeInfo xmlns=\"http://WebXml.com.cn/\">");
		sb.append("<mobileCode>13621281588</mobileCode>");
		sb.append("<userID></userID>");
		sb.append("</getMobileCodeInfo>");
		sb.append("</soap12:Body");
		sb.append("</soap12:Envelope>");
		
		StringEntity entity=new StringEntity(sb.toString(),"utf-8");
		post.setEntity(entity);
		
		post.setHeader("Content-Type","application/soap+xml;charset=utf-8");
		HttpResponse response=client.execute(post);
		HttpEntity e=response.getEntity();
		System.out.println("------------------");
		System.out.println(response.getStatusLine());
		InputStream in=e.getContent();
		byte sss[]=new byte[(int) e.getContentLength()];
		in.read(sss);
		System.out.println(new String(sss,"utf-8"));
		System.out.println("----------------------");
		client.close();
	}
}

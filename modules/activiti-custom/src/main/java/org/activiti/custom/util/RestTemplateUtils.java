package org.activiti.custom.util;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

public class RestTemplateUtils {

    private static class SingletonRestTemplate {
        static final RestTemplate INSTANCE = new RestTemplate();
    }

    private RestTemplateUtils() {

    }

    /**
     * 单例实例
     */
    public static RestTemplate getInstance() {
        return SingletonRestTemplate.INSTANCE;
    }

    public static String post(String url, String data, String token) throws Exception {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> formEntity = new HttpEntity<String>(data, headers);
        return RestTemplateUtils.getInstance().postForObject(url, formEntity, String.class);
    }


    public static String post(String url, String data, String token, String platformCode, String tenantCode) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> formEntity = new HttpEntity<String>(data, headers);
        return RestTemplateUtils.getInstance().postForObject(url, formEntity, String.class);
    }

    /**
     * get根据url获取对象
     */
    public String get(String url) {
        return RestTemplateUtils.getInstance().getForObject(url, String.class, new Object[]{});
    }

    /**
     * getById根据ID获取对象
     */
    public String getById(String url, String id) {
        return RestTemplateUtils.getInstance().getForObject(url, String.class, id);
    }

    /**
     * post提交对象
     */
    public String post(String url, String data) {
        return RestTemplateUtils.getInstance().postForObject(url, null, String.class, data);
    }

    /**
     * put修改对象
     */
    public void put(String url, String data) {
        RestTemplateUtils.getInstance().put(url, null, data);
    }

}
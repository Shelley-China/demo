package com.example.demo.util;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class HttpClientFactory {

    public static CloseableHttpClient lenovoIDHttpClient;
    public static CloseableHttpClient thirdPartClient;

    static {
        try {
            lenovoIDHttpClient = HttpClients
                    .custom()
                    .setSSLSocketFactory(createIgnoreSSLSocketFactory())
                    .setRedirectStrategy(new LaxRedirectStrategy())
                    .setDefaultRequestConfig(
                            RequestConfig
                                    .custom()
                                    .setConnectTimeout(60000)
                                    .setSocketTimeout(60000)
                                    .setConnectionRequestTimeout(60000)
                                    .build())
                    .setConnectionManager(createConnectionManager())
                    .build();
            //创建一个客户端
            SSLContext sslContext = SSLContext.getInstance("SSL");
            // set up a TrustManager that trusts everything
            sslContext.init(null, new TrustManager[]{new X509TrustManager() {
                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                @Override
                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }

                @Override
                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }}, new SecureRandom());
            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext);
            thirdPartClient = HttpClients
                    .custom()
                    //.addInterceptorLast(new HttpClientRequestInterceptor())
                    //.addInterceptorLast(new HttpClientResponseInterceptor())
                    //.setRetryHandler(new HttpClientRetryHandler())
                    //.setServiceUnavailableRetryStrategy(new HttpClientServiceUnavailableRetryStrategy())
                    .setSSLSocketFactory(sslsf)
                    .setRedirectStrategy(new LaxRedirectStrategy())
                    .setDefaultRequestConfig(
                            RequestConfig
                                    .custom()
                                    .setConnectTimeout(60000)
                                    .setSocketTimeout(60000)
                                    .setConnectionRequestTimeout(60000)
                                    .build())
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static CloseableHttpClient createHttpClient() {
        return HttpClients
                .custom()
                //.addInterceptorLast(new HttpClientRequestInterceptor())
                //.addInterceptorLast(new HttpClientResponseInterceptor())
                //.setRetryHandler(new HttpClientRetryHandler())
                //.setServiceUnavailableRetryStrategy(new HttpClientServiceUnavailableRetryStrategy())
                .setRedirectStrategy(new LaxRedirectStrategy())
                .setDefaultRequestConfig(
                        RequestConfig
                                .custom()
                                .setConnectTimeout(60000)
                                .setSocketTimeout(60000)
                                .setConnectionRequestTimeout(60000)
                                .build())
                .build();
    }

    public static CloseableHttpClient createIgnoreSSLHttpClient() throws Exception {
        //创建一个客户端
        SSLContext sslContext = SSLContext.getInstance("SSL");
        // set up a TrustManager that trusts everything
        sslContext.init(null, new TrustManager[]{new X509TrustManager() {
            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            @Override
            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }}, new SecureRandom());
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext);
        return HttpClients
                .custom()
                //.addInterceptorLast(new HttpClientRequestInterceptor())
                //.addInterceptorLast(new HttpClientResponseInterceptor())
                //.setRetryHandler(new HttpClientRetryHandler())
                //.setServiceUnavailableRetryStrategy(new HttpClientServiceUnavailableRetryStrategy())
                .setSSLSocketFactory(sslsf)
                .setRedirectStrategy(new LaxRedirectStrategy())
                .setDefaultRequestConfig(
                        RequestConfig
                                .custom()
                                .setConnectTimeout(60000)
                                .setSocketTimeout(60000)
                                .setConnectionRequestTimeout(60000)
                                .build())
                .build();
    }

    /**
     * 忽略SSL
     *
     * @return
     * @throws Exception
     */
    public static SSLConnectionSocketFactory createIgnoreSSLSocketFactory() throws Exception {
        //创建一个客户端
        SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null,
                new TrustStrategy() {
                    // 信任所有
                    @Override
                    public boolean isTrusted(X509Certificate[] chain,
                                             String authType) throws CertificateException {
                        return true;
                    }
                }).build();
        // ALLOW_ALL_HOSTNAME_VERIFIER:这个主机名验证器基本上是关闭主机名验证的,实现的是一个空操作，并且不会抛出javax.net.ssl.SSLException异常。
        return new SSLConnectionSocketFactory(
                sslContext, new String[]{"TLSv1"}, null,
                SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
    }

    /**
     * 创建连接池
     *
     * @return
     */
    public static PoolingHttpClientConnectionManager createConnectionManager() {
        PoolingHttpClientConnectionManager connManager
                = new PoolingHttpClientConnectionManager();
        //最大连接数
        connManager.setMaxTotal(200);
        //默认的每个路由的最大连接数
        connManager.setDefaultMaxPerRoute(100);
        return connManager;
    }
}

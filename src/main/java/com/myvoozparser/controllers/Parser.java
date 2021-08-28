package com.myvoozparser.controllers;

import org.apache.http.NameValuePair;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.message.BasicNameValuePair;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    private Parser() {

    }

    public static void executePostRequest() throws UnsupportedEncodingException {
        HttpClient client = HttpClientBuilder.create().build();


        HttpPost post = new HttpPost("https://lk.ugatu.su/raspisanie/#timetable");

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("username", "John"));
        params.add(new BasicNameValuePair("password", "pass"));

        CookieStore cookieStore = new BasicCookieStore();
        BasicClientCookie clientCookie = new BasicClientCookie("name", "Raju");

        post.setEntity(new UrlEncodedFormEntity(params));

        cookieStore.addCookie(clientCookie);

        post.setHeader("Cookie", "csrftoken="+ "DDHwAje6jsG7qwNFoQNZcvOU697GKagZv64Uaof1t0j2QZTegH67Zpcom4bdOepZ");
        post.setHeader("Cookie", "sessionid="+ "0z57k3a5ll2fdfg4a34qirjeh6ixjoga");
        System.out.println();



    }
}



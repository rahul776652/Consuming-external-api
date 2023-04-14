package com.example.api.Service.Impl;

import com.example.api.Output.PostOfficeDetailsBean;
import com.example.api.Output.PostOfficeResponseBean;
import com.example.api.Services.PostalService;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PostalServiceImplementation implements PostalService {


    @Autowired
    RestTemplate restTemplate;

    //    public PostOfficeResponseBean fetchPostOfficeDetailsByCity(String cityValue){
//       String url ="https://api.postalpincode.in/postoffice/{city}";
//       url = url.replace("{city}",cityValue);
//        System.out.println("url is "+url);
//        ResponseEntity<PostOfficeResponseBean[]> postalResponseEntity=
//        restTemplate.getForEntity(url,PostOfficeResponseBean[].class );
//        System.out.println("Response Status Code is :"+postalResponseEntity.getStatusCode());
//        PostOfficeResponseBean[] responseBeansArray = postalResponseEntity.getBody();
//        for (PostOfficeResponseBean responseBean : responseBeansArray){
//            List<PostOfficeDetailsBean> postOfficeDetailsBeanList = responseBean.getPostOffice();
//            for (PostOfficeDetailsBean pob : postOfficeDetailsBeanList){
//                System.out.println(pob.getName()+" "+pob.getCountry()+" "+pob.getPincode());
//            }
//        }
//        return responseBeansArray[0];
//    }
    public PostOfficeResponseBean fetchPostOfficeDetailsByCity(String cityValue) {
        String url = String.format("https://api.postalpincode.in/postoffice/%s", cityValue);
        PostOfficeResponseBean[] responseBeansArray = restTemplate.getForObject(url, PostOfficeResponseBean[].class);
        return responseBeansArray != null && responseBeansArray.length > 0 ? responseBeansArray[0] : null;
    }

//    public PostOfficeResponseBean fetchPostOfficeDetailsByCity(String cityValue){
//        String url = String.format("https://api.postalpincode.in/postoffice/%s", cityValue);
//        PostOfficeResponseBean[] responseBeansArray = restTemplate.getForObject(url, PostOfficeResponseBean[].class);
//        if (responseBeansArray != null && responseBeansArray.length > 0) {
//            return responseBeansArray[0];
//        } else {
//            return null;
//        }
//    }

}

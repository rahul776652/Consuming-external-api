package com.example.api.Services;

import com.example.api.Output.PostOfficeResponseBean;

public interface PostalService {
    public PostOfficeResponseBean fetchPostOfficeDetailsByCity(String city);
}

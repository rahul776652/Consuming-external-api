package com.example.api.Controller;

import com.example.api.Output.PostOfficeResponseBean;
import com.example.api.Services.PostalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/postal")
public class PostDetailsController {
    @Autowired
    private PostalService PostalServiceImplementation;

    @GetMapping(value = "/byCity", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PostOfficeResponseBean> getPostalByCity(@RequestParam("city") String city) {
        PostOfficeResponseBean postResponses = PostalServiceImplementation.fetchPostOfficeDetailsByCity(city);
        HttpStatus status = postResponses != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(postResponses, status);
    }


}

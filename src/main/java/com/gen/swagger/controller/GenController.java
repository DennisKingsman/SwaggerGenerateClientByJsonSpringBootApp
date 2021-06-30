package com.gen.swagger.controller;

import io.swagger.client.api.DocControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gen/swagger/docApi")
public class GenController {

    private DocControllerApi docControllerApi;

    @Autowired
    public void setDocControllerApi(DocControllerApi docControllerApi) {
        this.docControllerApi = docControllerApi;
    }

    @GetMapping("/get")
    public Object getDocApi(@RequestParam(name = "docId") Long docId) {
        return docControllerApi.getDocumentUsingGET(docId);
    }

    @DeleteMapping("/delete")
    public Long deleteDocApi(@RequestParam(name = "docId") Long docId) {
        return docControllerApi.deleteDocUsingDELETE(docId);
    }

    //todo ect

}

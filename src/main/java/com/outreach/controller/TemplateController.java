package com.outreach.controller;

import com.outreach.model.Template;
import com.outreach.service.impl.TemplateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/templates")
public class TemplateController {

    @Resource
    TemplateService service;

    @GetMapping("template/{id}")
    public Template getTemplate(@PathVariable String id){
        return service.getTemplateById(id);
    }
}

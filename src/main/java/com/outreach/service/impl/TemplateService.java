package com.outreach.service.impl;

import com.outreach.model.Template;
import com.outreach.service.ITemplateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = {"Template"})
public class TemplateService implements ITemplateService {
    private static final Logger log = LoggerFactory.getLogger(TemplateService.class);

    @Override
    @Cacheable(key="#id")
    public Template getTemplateById(String id) {
        log.info("Getting customer information for id "+id);
        return Template.builder()
                .templateId("id-"+id)
                .templateCode("code-00"+id)
                .templateVersion("version-0"+id)
                .templateName("QC")
                .build();
    }
}

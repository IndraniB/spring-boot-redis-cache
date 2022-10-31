package com.outreach.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Template implements Serializable {

    private String templateId;
    private String templateCode;
    private String templateVersion;
    private String templateName;
}

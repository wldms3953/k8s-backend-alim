package com.welab.k8s_backend_alim.event.consumer.message.user;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SiteUserInfoEvent {
    public static final String Topic = "userinfo";
    private String action;
    private String userId;
    private String phoneNumber;
    private LocalDateTime eventTime;
}

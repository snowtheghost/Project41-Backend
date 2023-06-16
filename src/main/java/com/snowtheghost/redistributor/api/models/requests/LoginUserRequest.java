package com.snowtheghost.redistributor.api.models.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class LoginUserRequest {

    @JsonProperty
    private String email;

    @JsonProperty
    private String password;
}

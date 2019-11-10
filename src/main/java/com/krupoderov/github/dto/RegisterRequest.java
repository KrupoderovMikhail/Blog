package com.krupoderov.github.dto;

import lombok.Data;

/**
 * Created by Krupoderov Mikhail on Nov, 2019
 */
@Data
public class RegisterRequest {

    private String username;
    private String password;
    private String email;
}

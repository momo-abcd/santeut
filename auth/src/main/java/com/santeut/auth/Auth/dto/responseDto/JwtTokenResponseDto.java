package com.santeut.auth.Auth.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtTokenResponseDto {
    private String grantType;
    private String accessToken;
    private String refreshToken;
}

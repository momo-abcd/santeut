package com.santeut.auth.domain.dto.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequestDto {

    private String userNickname;
    private String userLoginId;
    private String userPassword;
    private String userBirth;
    private String userProfile;
    private String userGender;
}

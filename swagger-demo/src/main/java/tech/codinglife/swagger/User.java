package tech.codinglife.swagger;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class User {
    private String id;

    private String name;

    @ApiModelProperty("出生日期")
    private Instant dob;

    @ApiModelProperty("性别")
    private Gender gender;
}

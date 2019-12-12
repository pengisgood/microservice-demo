package tech.codinglife.swagger;

import de.pentabyte.springfox.ApiEnum;

public enum Gender {
    @ApiEnum("男")
    MALE,
    @ApiEnum("女")
    FEMLE,
    @ApiEnum("其他")
    OTHER
}

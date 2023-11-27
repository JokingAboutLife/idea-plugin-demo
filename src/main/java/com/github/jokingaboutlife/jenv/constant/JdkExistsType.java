package com.github.jokingaboutlife.jenv.constant;

import javax.swing.*;

public enum JdkExistsType {
    OnlyInJEnv("Only exists in jEnv", null),
    // The following belong to IDEA
    OnlyInIDEA("Only exists in IDEA", null),
    Both("Exist in jEnv and IDEA", null),
    OnlyMajorVersionMatch("Not jEnv, but Java major version exist in jEnv", null),
    OnlyNameNotMatch("Same one, but different name", null),
    ;

    private final String description;
    private final Icon icon;

    JdkExistsType(String description, Icon icon) {
        this.description = description;
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public Icon getIcon() {
        return icon;
    }

}

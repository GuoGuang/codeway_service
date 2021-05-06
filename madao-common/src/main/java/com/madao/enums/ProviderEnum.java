package com.madao.enums;

public enum ProviderEnum {

    /**
     * QQ
     */
    QQ(1),

    /**
     * 微信
     */
    WE_CHAT(2),

    /**
     * GITHUB
     */
    GITHUB(3),

    /**
     * Phone
     */
    PHONE(4);

    private final Integer value;

    ProviderEnum(Integer value) {
        this.value = value;
    }
	public int getValue() {
		return value;
	}
}

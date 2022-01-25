package br.com.paulorjuniorp.personapi.util;

import br.com.paulorjuniorp.personapi.dto.request.PhoneDto;
import br.com.paulorjuniorp.personapi.entity.Phone;
import br.com.paulorjuniorp.personapi.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "1199999-9999";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDto createFakeDTO() {
        return PhoneDto.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}

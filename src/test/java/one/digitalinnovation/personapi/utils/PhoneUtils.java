package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.entity.Phone;
import one.digitalinnovation.personapi.enums.PhoneType;
import org.h2.util.NetUtils;

public class PhoneUtils {
    private static final String PHONE_NUMBER = "9999999-9999";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .id(PHONE_ID)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .id(PHONE_ID)
                .build();
    }
}

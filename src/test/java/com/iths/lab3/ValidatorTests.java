package com.iths.lab3;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ValidatorTests {

    //Phone number validation tests

    @Test
    @DisplayName("Testing valid phone number formatting")
    void validPhoneNumber(){
        boolean result = Validator.isPhoneNumberValid("0701234567");
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Phone number not starting with 0")
    void noZerAtStart(){
        boolean result = Validator.isPhoneNumberValid("701234567");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Phone number shorter than 6 digits")
    void shortPhoneNumber(){
        boolean result = Validator.isPhoneNumberValid("12345");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Phone number longer than 10 digits")
    void longPhoneNumber(){
        boolean result = Validator.isPhoneNumberValid("07012345678");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Phone number that includes characters")
    void phoneNumberWithCharacters(){
        boolean result = Validator.isPhoneNumberValid("070-123456");
        Assertions.assertFalse(result);
    }

    // Email validation tests

    @Test
    @DisplayName("Entering a valid email address")
    void validEmailAddress(){
        boolean result = Validator.isEmailValid("name@domain.com");
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Entering address without \".\" in the top domain")
    void emailWithoutPunctuation(){
        boolean result = Validator.isEmailValid("name@domaincom");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Entering address without @ sign")
    void emailWithoutAtSign(){
        boolean result = Validator.isEmailValid("namedomain.com");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Entering address with a subdomain")
    void emailWithSubDomain(){
        boolean result = Validator.isEmailValid("name@subdomain.domain.com");
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Entering address without local part")
    void noLocalPart(){
        boolean result = Validator.isEmailValid("@domain.com");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Entering a different character instead of @")
    void usingWrongCharacterAsAtSign() {
        boolean result = Validator.isEmailValid("name£domain.com");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Entering address with other character then dot to separate the domains")
    void wrongCharacterToSeparateDomains() {
        boolean result = Validator.isEmailValid("name@domain,com");
        Assertions.assertFalse(result);
    }
}

package com.example.demo3.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AccountUtils {

    /**
     * Spain iso code.
     */
    private static final String SPAIN_ISO_CODE = "ES";
    /**
     * Max Iban length.
     */
    private static final int IBAN_LENGHT = 34;
    /**
     * Pattern Iban.
     */
    private static final String IBAN_PATTERN = "^([A-Z]{2})*(\\d{22,32})";
    /**
     * Conversion table for check iban.
     */
    private static final String CONVERSION_TABLE_ISOCODE_ES_VALUE = "1428";

    /**
     * Check iban format an check digit of IBAN at BICFromIBAN endpoint.
     *
     * @param iban Code IBAN.
     * @return boolean true belongs to Minsait endpoints, false not belongs to Minsait endpoints.
     */
    public boolean checkIbanValidate(final String iban) {
        return checkIbanFormat(iban) && checkDigitIban(iban);
    }

    private boolean checkIbanFormat(final String iban) {
        if (!iban.startsWith(SPAIN_ISO_CODE)) {
            log.error("iban {} dont start with Spain ISO code {}", iban, SPAIN_ISO_CODE);
            return false;
        } else if (iban.length() > IBAN_LENGHT) {
            log.error("iban {} don't have correct length {}", iban, IBAN_LENGHT);
            return false;
        } else if (!iban.matches(IBAN_PATTERN)) {
            log.error("iban {} don't have correct format {}", iban);
            return false;
        } else {
            return true;
        }
    }

    /**
     * Check IBAN check digit.
     *
     * @param iban number of IBAN account.
     * @return true if IBAN format is correct.
     */
    private boolean checkDigitIban(final String iban) {

        String checkDigitAccountNumber = iban.substring(2, 4);
        String accountBankNumber = iban.substring(4, iban.length());

        String actualCheckNumber = accountBankNumber.concat(CONVERSION_TABLE_ISOCODE_ES_VALUE).concat(checkDigitAccountNumber);
        int modPartialCheckNumber = 0;
        while (actualCheckNumber.length() > 9) {
            String partialCheckNumber = actualCheckNumber.substring(0, 9);
            modPartialCheckNumber = Integer.parseInt(partialCheckNumber) % 97;
            actualCheckNumber = String.valueOf(modPartialCheckNumber).concat(actualCheckNumber.substring(9));
        }
        modPartialCheckNumber = Integer.parseInt(actualCheckNumber) % 97;
        return modPartialCheckNumber == 1;
    }
}

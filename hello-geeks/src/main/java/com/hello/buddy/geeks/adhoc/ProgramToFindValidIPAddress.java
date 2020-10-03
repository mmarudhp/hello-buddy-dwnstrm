package com.hello.buddy.geeks.adhoc;

import java.util.Arrays;
import java.util.List;

public class ProgramToFindValidIPAddress {

    public boolean isValidIPAddress(String input) {
        if (input != null) {
            List<String> ipAddressBlocks = Arrays.asList(input.split("."));

            if (ipAddressBlocks.size() == 4) {
                boolean valid = true;
                for (String ipBlocks : ipAddressBlocks) {
                    valid = valid && Integer.parseInt(ipBlocks) < 256;
                }
                return valid;
            }
        }
        return false;
    }
}

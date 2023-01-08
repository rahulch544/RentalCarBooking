package org.example.bean;

import lombok.Data;
import org.example.constants.LicenseType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class License {
    private final String licenseId;
    Set<LicenseType> licenseTypeSet;

    public License(String licenseId){
        this.licenseId = licenseId;
        licenseTypeSet = new HashSet<>();
    }

    public Boolean addLicenseType(LicenseType licenseType){
        return licenseTypeSet.add(licenseType);
    }

}

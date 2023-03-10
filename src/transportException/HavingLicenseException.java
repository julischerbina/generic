package transportException;

import Driver.Driver;

public class HavingLicenseException extends Exception {
    public HavingLicenseException() {
       super();
        System.out.println("Укажите тип прав");
        }
    }


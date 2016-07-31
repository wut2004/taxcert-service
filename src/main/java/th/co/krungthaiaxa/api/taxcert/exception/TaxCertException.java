package th.co.krungthaiaxa.api.taxcert.exception;

/**
 * Created by Wuttichai on 7/31/2016 AD.
 */
public class TaxCertException extends RuntimeException{
    public TaxCertException() {
    }

    public TaxCertException(String message) {
        super(message);
    }

    public TaxCertException(String message, Throwable cause) {
        super(message, cause);
    }

    public TaxCertException(Throwable cause) {
        super(cause);
    }

    public TaxCertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

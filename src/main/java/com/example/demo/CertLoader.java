package com.example.demo;

/*import com.orange.clara.cloud.boot.ssl.CertificateFactory;
import com.orange.clara.cloud.boot.ssl.DefaultTrustStoreAppender;
import com.orange.clara.cloud.boot.ssl.TrustStoreInfo;
*/
public class CertLoader {

   /* public static final String SSL_TRUST_STORE_SYSTEM_PROPERTY = "javax.net.ssl.trustStore";
    public static final String SSL_TRUST_STORE_PASSWORD_SYSTEM_PROPERTY = "javax.net.ssl.trustStorePassword";

    static {
        String[] certs = {
            System.getenv("TRUSTED_CA_CERTIFICATE")
        };

        for (String cert : certs) {
            DefaultTrustStoreAppender trustStoreAppender = new DefaultTrustStoreAppender();
            TrustStoreInfo trustStoreInfo = trustStoreAppender.append(CertificateFactory.newInstance(cert));
            System.setProperty(SSL_TRUST_STORE_SYSTEM_PROPERTY, trustStoreInfo.getTrustStorefFile().getAbsolutePath());
            System.setProperty(SSL_TRUST_STORE_PASSWORD_SYSTEM_PROPERTY, trustStoreInfo.getPassword());
        }
    }*/
}
package com.konakart.app;

import com.konakart.appif.*;

/**
 *  The KonaKart Custom Engine - AddCustomerNotifications - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class AddCustomerNotifications
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public AddCustomerNotifications(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public void addCustomerNotifications(NotificationOptionsIf options) throws KKException
     {
         kkEng.addCustomerNotifications(options);
     }
}

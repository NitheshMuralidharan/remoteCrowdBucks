package com.konakart.app;

/**
 *  The KonaKart Custom Engine - GetStatusText - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class GetStatusText
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public GetStatusText(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public String getStatusText(int statusId, int languageId) throws KKException
     {
         return kkEng.getStatusText(statusId, languageId);
     }
}

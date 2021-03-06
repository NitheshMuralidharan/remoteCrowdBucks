package com.konakart.app;

/**
 *  The KonaKart Custom Engine - UpdateManufacturerViewedCount - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class UpdateManufacturerViewedCount
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public UpdateManufacturerViewedCount(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public void updateManufacturerViewedCount(int manufacturerId, int languageId) throws KKException
     {
         kkEng.updateManufacturerViewedCount(manufacturerId, languageId);
     }
}

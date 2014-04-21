package com.konakart.app;

import com.konakart.appif.*;

/**
 *  The KonaKart Custom Engine - GetExpression - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class GetExpression
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public GetExpression(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public ExpressionIf getExpression(String sessionId, int expressionId, String expressionName) throws KKException
     {
         return kkEng.getExpression(sessionId, expressionId, expressionName);
     }
}
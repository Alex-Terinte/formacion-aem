package com.mysite.core.util;

import com.adobe.cq.dam.cfm.ContentElement;
import com.adobe.cq.dam.cfm.ContentFragment;
import com.mysite.core.resources.ResourceConstants;

public class Utils {
    public static String getCfElementContentString(ContentFragment cf, String name) {
        ContentElement cfElement = cf.getElement(name);

        return cfElement != null
                ? cfElement.getContent()
                : ResourceConstants.EMPTY;
    }
}

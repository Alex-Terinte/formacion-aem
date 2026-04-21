/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.mysite.components.components__002d__custom.cards;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class cards__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_templates = null;
Collection var_collectionvar2_list_coerced$ = null;
_global_model = renderContext.call("use", com.mysite.core.models.CardsManual.class.getName(), obj());
_global_templates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("\n\n");
{
    Object var_templatevar0 = renderContext.getObjectModel().resolveProperty(_global_templates, "placeholder");
    {
        Object var_templateoptions1_field$_isempty = renderContext.getObjectModel().resolveProperty(_global_model, "empty");
        {
            java.util.Map var_templateoptions1 = obj().with("isEmpty", var_templateoptions1_field$_isempty);
            callUnit(out, renderContext, var_templatevar0, var_templateoptions1);
        }
    }
}
out.write("\n\n<section class=\"album-cards\">\n    ");
{
    Object var_collectionvar2 = renderContext.getObjectModel().resolveProperty(_global_model, "cards");
    {
        long var_size3 = ((var_collectionvar2_list_coerced$ == null ? (var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2)) : var_collectionvar2_list_coerced$).size());
        {
            boolean var_notempty4 = (var_size3 > 0);
            if (var_notempty4) {
                {
                    long var_end7 = var_size3;
                    {
                        boolean var_validstartstepend8 = (((0 < var_size3) && true) && (var_end7 > 0));
                        if (var_validstartstepend8) {
                            out.write("<div class=\"album-cards__grid\">");
                            if (var_collectionvar2_list_coerced$ == null) {
                                var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2);
                            }
                            long var_index9 = 0;
                            for (Object card : var_collectionvar2_list_coerced$) {
                                {
                                    boolean var_traversal11 = (((var_index9 >= 0) && (var_index9 <= var_end7)) && true);
                                    if (var_traversal11) {
                                        out.write(" \n        <article class=\"album-cards__card\">\n            <div class=\"album-cards__thumbnail\">\n                ");
                                        {
                                            Object var_testvariable12 = renderContext.getObjectModel().resolveProperty(card, "imageUrl");
                                            if (renderContext.getObjectModel().toBoolean(var_testvariable12)) {
                                                out.write("<img class=\"album-cards__thumbnail-img\"");
                                                {
                                                    Object var_attrvalue13 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(card, "imageUrl"), "uri");
                                                    {
                                                        boolean var_shoulddisplayattr16 = ((!"".equals(var_attrvalue13)) && (!((Object)false).equals(var_attrvalue13)));
                                                        if (var_shoulddisplayattr16) {
                                                            out.write(" src");
                                                            {
                                                                boolean var_istrueattr15 = (var_attrvalue13.equals(true));
                                                                if (!var_istrueattr15) {
                                                                    out.write("=\"");
                                                                    out.write(renderContext.getObjectModel().toString(var_attrvalue13));
                                                                    out.write("\"");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    Object var_attrvalue17 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(card, "imageAlt"), "text");
                                                    {
                                                        boolean var_shoulddisplayattr20 = ((!"".equals(var_attrvalue17)) && (!((Object)false).equals(var_attrvalue17)));
                                                        if (var_shoulddisplayattr20) {
                                                            out.write(" alt");
                                                            {
                                                                boolean var_istrueattr19 = (var_attrvalue17.equals(true));
                                                                if (!var_istrueattr19) {
                                                                    out.write("=\"");
                                                                    out.write(renderContext.getObjectModel().toString(var_attrvalue17));
                                                                    out.write("\"");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                out.write(" loading=\"lazy\"/>");
                                            }
                                        }
                                        out.write("\n                ");
                                        {
                                            boolean var_testvariable21 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(card, "imageUrl")));
                                            if (var_testvariable21) {
                                                out.write("<div class=\"album-cards__thumbnail-placeholder\">\n                    <span>Thumbnail</span>\n                </div>");
                                            }
                                        }
                                        out.write("\n            </div>\n            <div class=\"album-cards__body\">\n                ");
                                        {
                                            Object var_testvariable22 = renderContext.getObjectModel().resolveProperty(card, "description");
                                            if (renderContext.getObjectModel().toBoolean(var_testvariable22)) {
                                                out.write("<p class=\"album-cards__description\">");
                                                {
                                                    String var_23 = (("\n                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(card, "description"), "html"))) + "\n                ");
                                                    out.write(renderContext.getObjectModel().toString(var_23));
                                                }
                                                out.write("</p>");
                                            }
                                        }
                                        out.write("\n                <footer class=\"album-cards__footer\">\n                    ");
                                        {
                                            Object var_testvariable24 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(card, "viewLink")) ? renderContext.getObjectModel().resolveProperty(card, "viewLink") : renderContext.getObjectModel().resolveProperty(card, "editLink")));
                                            if (renderContext.getObjectModel().toBoolean(var_testvariable24)) {
                                                out.write("<div class=\"album-cards__actions\">\n                        ");
                                                {
                                                    Object var_testvariable25 = renderContext.getObjectModel().resolveProperty(card, "viewLink");
                                                    if (renderContext.getObjectModel().toBoolean(var_testvariable25)) {
                                                        out.write("<a class=\"album-cards__action-btn\"");
                                                        {
                                                            Object var_attrvalue26 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(card, "viewLink"), "uri");
                                                            {
                                                                boolean var_shoulddisplayattr29 = ((!"".equals(var_attrvalue26)) && (!((Object)false).equals(var_attrvalue26)));
                                                                if (var_shoulddisplayattr29) {
                                                                    out.write(" href");
                                                                    {
                                                                        boolean var_istrueattr28 = (var_attrvalue26.equals(true));
                                                                        if (!var_istrueattr28) {
                                                                            out.write("=\"");
                                                                            out.write(renderContext.getObjectModel().toString(var_attrvalue26));
                                                                            out.write("\"");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        out.write(">\n                            View\n                        </a>");
                                                    }
                                                }
                                                out.write("\n                        ");
                                                {
                                                    Object var_testvariable30 = renderContext.getObjectModel().resolveProperty(card, "editLink");
                                                    if (renderContext.getObjectModel().toBoolean(var_testvariable30)) {
                                                        out.write("<a class=\"album-cards__action-btn\"");
                                                        {
                                                            Object var_attrvalue31 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(card, "editLink"), "uri");
                                                            {
                                                                boolean var_shoulddisplayattr34 = ((!"".equals(var_attrvalue31)) && (!((Object)false).equals(var_attrvalue31)));
                                                                if (var_shoulddisplayattr34) {
                                                                    out.write(" href");
                                                                    {
                                                                        boolean var_istrueattr33 = (var_attrvalue31.equals(true));
                                                                        if (!var_istrueattr33) {
                                                                            out.write("=\"");
                                                                            out.write(renderContext.getObjectModel().toString(var_attrvalue31));
                                                                            out.write("\"");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        out.write(">\n                            Edit\n                        </a>");
                                                    }
                                                }
                                                out.write("\n                    </div>");
                                            }
                                        }
                                        out.write("\n                    ");
                                        {
                                            Object var_testvariable35 = renderContext.getObjectModel().resolveProperty(card, "readingTime");
                                            if (renderContext.getObjectModel().toBoolean(var_testvariable35)) {
                                                out.write("<span class=\"album-cards__reading-time\">");
                                                {
                                                    String var_36 = (("\n                        " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(card, "readingTime"), "text"))) + " mins\n                    ");
                                                    out.write(renderContext.getObjectModel().toString(var_36));
                                                }
                                                out.write("</span>");
                                            }
                                        }
                                        out.write("\n                </footer>\n            </div>\n        </article>\n    ");
                                    }
                                }
                                var_index9++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar2_list_coerced$ = null;
}
out.write("\n</section>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


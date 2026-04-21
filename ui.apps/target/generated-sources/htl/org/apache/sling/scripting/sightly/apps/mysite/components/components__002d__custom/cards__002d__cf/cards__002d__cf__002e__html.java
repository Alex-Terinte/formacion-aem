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
package org.apache.sling.scripting.sightly.apps.mysite.components.components__002d__custom.cards__002d__cf;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class cards__002d__cf__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_templates = null;
Collection var_collectionvar3_list_coerced$ = null;
_global_model = renderContext.call("use", com.mysite.core.models.Cards.class.getName(), obj());
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
out.write("\n\n");
{
    boolean var_testvariable2 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "empty")));
    if (var_testvariable2) {
        out.write("<section class=\"album-cards\">\n    ");
        {
            Object var_collectionvar3 = renderContext.getObjectModel().resolveProperty(_global_model, "cards");
            {
                long var_size4 = ((var_collectionvar3_list_coerced$ == null ? (var_collectionvar3_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar3)) : var_collectionvar3_list_coerced$).size());
                {
                    boolean var_notempty5 = (var_size4 > 0);
                    if (var_notempty5) {
                        {
                            long var_end8 = var_size4;
                            {
                                boolean var_validstartstepend9 = (((0 < var_size4) && true) && (var_end8 > 0));
                                if (var_validstartstepend9) {
                                    out.write("<div class=\"album-cards__grid\">");
                                    if (var_collectionvar3_list_coerced$ == null) {
                                        var_collectionvar3_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar3);
                                    }
                                    long var_index10 = 0;
                                    for (Object card : var_collectionvar3_list_coerced$) {
                                        {
                                            boolean var_traversal12 = (((var_index10 >= 0) && (var_index10 <= var_end8)) && true);
                                            if (var_traversal12) {
                                                out.write(" \n        <article class=\"album-cards__card\">\n            <div class=\"album-cards__thumbnail\">\n                ");
                                                {
                                                    Object var_testvariable13 = renderContext.getObjectModel().resolveProperty(card, "image");
                                                    if (renderContext.getObjectModel().toBoolean(var_testvariable13)) {
                                                        out.write("<img class=\"album-cards__thumbnail-img\"");
                                                        {
                                                            Object var_attrvalue14 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(card, "image"), "uri");
                                                            {
                                                                boolean var_shoulddisplayattr17 = ((!"".equals(var_attrvalue14)) && (!((Object)false).equals(var_attrvalue14)));
                                                                if (var_shoulddisplayattr17) {
                                                                    out.write(" src");
                                                                    {
                                                                        boolean var_istrueattr16 = (var_attrvalue14.equals(true));
                                                                        if (!var_istrueattr16) {
                                                                            out.write("=\"");
                                                                            out.write(renderContext.getObjectModel().toString(var_attrvalue14));
                                                                            out.write("\"");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        out.write(" alt=\"\" loading=\"lazy\"/>");
                                                    }
                                                }
                                                out.write("\n                ");
                                                {
                                                    boolean var_testvariable18 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(card, "image")));
                                                    if (var_testvariable18) {
                                                        out.write("<div class=\"album-cards__thumbnail-placeholder\">\n                    <span>Thumbnail</span>\n                </div>");
                                                    }
                                                }
                                                out.write("\n            </div>\n            <div class=\"album-cards__body\">\n                ");
                                                {
                                                    Object var_testvariable19 = renderContext.getObjectModel().resolveProperty(card, "description");
                                                    if (renderContext.getObjectModel().toBoolean(var_testvariable19)) {
                                                        out.write("<p class=\"album-cards__description\">");
                                                        {
                                                            String var_20 = (("\n                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(card, "description"), "html"))) + "\n                ");
                                                            out.write(renderContext.getObjectModel().toString(var_20));
                                                        }
                                                        out.write("</p>");
                                                    }
                                                }
                                                out.write("\n                <footer class=\"album-cards__footer\">\n                    ");
                                                {
                                                    Object var_testvariable21 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(card, "viewLink")) ? renderContext.getObjectModel().resolveProperty(card, "viewLink") : renderContext.getObjectModel().resolveProperty(card, "editLink")));
                                                    if (renderContext.getObjectModel().toBoolean(var_testvariable21)) {
                                                        out.write("<div class=\"album-cards__actions\">\n                        <a class=\"album-cards__action-btn\" href=\"#\">\n                            View\n                        </a>\n                        <a class=\"album-cards__action-btn\" href=\"#\">\n                            Edit\n                        </a>\n                    </div>");
                                                    }
                                                }
                                                out.write("\n                    ");
                                                {
                                                    Object var_testvariable22 = renderContext.getObjectModel().resolveProperty(card, "readingTime");
                                                    if (renderContext.getObjectModel().toBoolean(var_testvariable22)) {
                                                        out.write("<span class=\"album-cards__reading-time\">");
                                                        {
                                                            String var_23 = (((("\n                        " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(card, "readingTime"), "text"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(card, "readingUnitTime"), "text"))) + "\n                    ");
                                                            out.write(renderContext.getObjectModel().toString(var_23));
                                                        }
                                                        out.write("</span>");
                                                    }
                                                }
                                                out.write("\n                </footer>\n            </div>\n        </article>\n    ");
                                            }
                                        }
                                        var_index10++;
                                    }
                                    out.write("</div>");
                                }
                            }
                        }
                    }
                }
            }
            var_collectionvar3_list_coerced$ = null;
        }
        out.write("\n</section>");
    }
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


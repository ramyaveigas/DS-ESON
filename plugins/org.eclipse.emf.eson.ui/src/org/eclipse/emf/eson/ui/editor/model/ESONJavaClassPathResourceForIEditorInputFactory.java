package org.eclipse.emf.eson.ui.editor.model;

import org.eclipse.core.resources.IStorage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.eson.validation.ESONResourceValidationUtils;
import org.eclipse.xtext.ui.editor.model.JavaClassPathResourceForIEditorInputFactory;

/**
 * DS-11537
 * @author atripod
 */
public class ESONJavaClassPathResourceForIEditorInputFactory extends JavaClassPathResourceForIEditorInputFactory {

    @Override
    protected boolean isValidationDisabled(URI uri, IStorage storage) {
        boolean disabled = super.isValidationDisabled(uri, storage);
        if (!disabled) {
            disabled = ESONResourceValidationUtils.isValidationDisabled(uri);
        }
        return disabled;
    } 
}

/*
 * #%L
 * org.eclipse.emf.eson
 * %%
 * Copyright (C) 2017 Michael Vorburger and others.
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */
package org.eclipse.emf.eson.validation;

import org.eclipse.emf.common.util.URI;

/**
 * DS-11537: first implementation with hardcoded folder. Later we'll
 * add an extension point to determine if a resource should be validated
 * or not depending on its location in the project models
 * 
 * @author atripod
 */
public final class ESONResourceValidationUtils {

    private static String CORE_FOLDER = "core";
    
    public static boolean isValidationDisabled(URI uri) {
        
        String[] segments = uri.segments();
        if (segments.length < 3) {
            // invalid model uri (this could happens in some unit tests)
            return false;
        }
        
        boolean validationDisabled = uri.segment(2).equals(CORE_FOLDER);

        return validationDisabled;
    }

}

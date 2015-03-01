/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package griffon.builder.javafx.factory

import griffon.javafx.support.typicons.TypIcon
import griffon.plugins.typicons.TypIconFont
import groovyx.javafx.factory.LabeledFactory

/**
 * @author Andres Almiray
 */
public class TypIconFactory extends LabeledFactory {
    TypIconFactory() {
        super(TypIcon)
    }

    public Object newInstance(FactoryBuilderSupport builder, Object name, Object value, Map attributes) {
        def iconName = attributes.remove('icon') ?: value
        if (!iconName) {
            throw new IllegalArgumentException("In $name you must define a node value or icon:")
        }

        String iconSize = attributes.remove('size') ?: '16'

        if (iconName instanceof CharSequence) {
            TypIcon icon = new TypIcon(iconName.toString())
            icon.iconSize = iconSize.toInteger()
            return icon
        } else if (iconName instanceof TypIconFont) {
            TypIcon icon = new TypIcon((TypIconFont) iconName)
            icon.iconSize = iconSize.toInteger()
            return icon
        }

        throw new IllegalArgumentException("$name cannot parse $iconName as a typicons icon description.")
    }
}

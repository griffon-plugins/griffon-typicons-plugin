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
package griffon.javafx.support.typicons;

import griffon.core.editors.PropertyEditorResolver;
import griffon.plugins.typicons.TypIconFont;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import javax.annotation.Nonnull;
import java.beans.PropertyEditor;

import static griffon.plugins.typicons.TypIconFont.invalidDescription;
import static griffon.util.GriffonClassUtils.requireState;
import static griffon.util.GriffonNameUtils.requireNonBlank;
import static java.util.Objects.requireNonNull;

/**
 * @author Andres Almiray
 */
public class TypIcon extends Text {
    private static final String TYPICON_SET = "META-INF/resources/typicons/2.0.7/fonts/typicons.ttf";
    private static final String ERROR_FONT_TYPICON_NULL = "Argument 'typIcon' must not be null";

    private static final String TYPICON_FONT_FAMILY;

    static {
        Font font = Font.loadFont(Thread.currentThread().getContextClassLoader().getResource(TYPICON_SET).toExternalForm(), 16);
        TYPICON_FONT_FAMILY = font.getFamily();
    }

    private TypIconFont typIcon;
    private int iconSize;
    private Color iconColor;

    public TypIcon() {
        this(TypIconFont.AT);
    }

    public TypIcon(@Nonnull TypIconFont typIcon) {
        this.typIcon = requireNonNull(typIcon, ERROR_FONT_TYPICON_NULL);
        getStyleClass().add("typicons-icon");
        setText(String.valueOf(typIcon.getCode()));
        setStyle("-fx-font-family: '" + TYPICON_FONT_FAMILY + "';");
        setIconSize(16);
        setIconColor(Color.BLACK);
    }

    public TypIcon(@Nonnull String description) {
        this(TypIconFont.findByDescription(description));
        resolveSize(description);
        resolveColor(description);
    }

    @Nonnull
    public TypIconFont getTypIconFont() {
        return typIcon;
    }

    public void setTypIcon(@Nonnull TypIconFont typIcon) {
        this.typIcon = requireNonNull(typIcon, ERROR_FONT_TYPICON_NULL);
        setText(String.valueOf(typIcon.getCode()));
    }

    public void setTypIcon(@Nonnull String description) {
        requireNonBlank(description, "Argument 'description' must not be blank");
        setTypIcon(TypIconFont.findByDescription(description));
        resolveSize(description);
        resolveColor(description);
    }

    public void setIconSize(int size) {
        requireState(size > 0, "Argument 'size' must be greater than zero.");
        setStyle(getStyle() + " -fx-font-size: " + size + "px;");
        this.iconSize = size;
    }

    public int getIconSize() {
        return iconSize;
    }


    public void setIconColor(@Nonnull Color color) {
        requireNonNull(color, "Argument 'color' must not be null");
        setFill(color);
        this.iconColor = color;
    }

    @Nonnull
    public Color getIconColor() {
        return iconColor;
    }

    private void resolveSize(String description) {
        String[] parts = description.split(":");
        if (parts.length > 1) {
            try {
                setIconSize(Integer.parseInt(parts[1]));
            } catch (NumberFormatException e) {
                throw invalidDescription(description, e);
            }
        } else {
            setIconSize(16);
        }
    }

    private void resolveColor(String description) {
        String[] parts = description.split(":");
        if (parts.length > 2) {
            PropertyEditor editor = PropertyEditorResolver.findEditor(Color.class);
            editor.setValue(parts[2]);
            Color color = (Color) editor.getValue();
            if (color != null) {
                setIconColor(color);
            }
        }
    }
}

package com.ceciltechnology.viii28stw.frontend.enumeration;

import com.ceciltechnology.viii28stw.frontend.util.I18nFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Plamedi L. Lusembo
 */

@AllArgsConstructor
@Getter
public enum DialogType {

    INFORMATION('I', I18nFactory.getInstance().getResourceBundle().getString("dialog.type.description.information")),
    WARNING('W', I18nFactory.getInstance().getResourceBundle().getString("dialog.type.description.warning")),
    ERROR('E', I18nFactory.getInstance().getResourceBundle().getString("dialog.type.description.error")),
    CONFIRMATION('C', I18nFactory.getInstance().getResourceBundle().getString("dialog.type.description.confirmation"));

    private final char id;
    private final String description;

}

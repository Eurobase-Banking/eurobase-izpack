/*
 * IzPack - Copyright 2001-2012 Julien Ponge, All Rights Reserved.
 *
 * http://izpack.org/
 * http://izpack.codehaus.org/
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

package com.izforge.izpack.api;

/**
 * Enum with identifier of frames
 */
public enum GuiId
{

    BUTTON_NEXT("nextButton"), BUTTON_HELP("HelpButton"), BUTTON_PREV("prevButton"), BUTTON_QUIT("quitButton"),
    BUTTON_LANG_OK("okButtonLang"), COMBO_BOX_LANG_FLAG("comboBox-lang-flag"), DIALOG_PICKER("dialogPicker"), LICENCE_NO_RADIO("LicenceNoRadio"), LICENCE_YES_RADIO("LicenceYesRadio"), FINISH_PANEL_AUTO_BUTTON("finishPanel_autoButton"), FINISH_PANEL_FILE_CHOOSER("finishPanelFileChooser"), LICENCE_TEXT_AREA("licenceTextArea"), INFO_PANEL_TEXT_AREA("InfoPanelTextArea"), XINFO_PANEL_TEXT_AREA("XInfoPanelTextArea"), SHORTCUT_CREATE_CHECK_BOX("shortcutCreateCheckBox"), HTML_INFO_PANEL_TEXT("htmlInfoPanelText"), SIMPLE_FINISH_LABEL("simpleFinishLabel"), FINISH_PANEL_LABEL("finishLabel"), HELLO_PANEL_LABEL("helloPanelLabel"), SIMPLE_FINISH_UNINSTALL_LABEL("simpleFinishUninstallLabel"),
    HELP_WINDOWS("helpWindows"), BUTTON_BROWSE("browseButton"), PATH_SELECTION_PANEL_FILE_CHOOSER("pathSelectionPanelFileChooser"), PATH_SELECTION_PANEL_PATH_TEXT_FIELD("pathSelectionPanelPathTextField");

    public String id;

    GuiId(String id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return id;
    }

}

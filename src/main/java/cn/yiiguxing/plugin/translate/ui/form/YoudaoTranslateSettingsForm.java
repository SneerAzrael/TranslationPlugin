package cn.yiiguxing.plugin.translate.ui.form;

import cn.yiiguxing.plugin.translate.ConstantsKt;
import cn.yiiguxing.plugin.translate.trans.Lang;
import com.intellij.icons.AllIcons;
import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.ComboBox;
import com.intellij.ui.components.JBPasswordField;
import com.intellij.ui.components.JBTextField;
import com.intellij.ui.components.labels.ActionLink;
import com.intellij.ui.components.labels.LinkLabel;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * YoudaoApiPanel
 * <p>
 * Created by Yii.Guxing on 2017/11/8
 */
public class YoudaoTranslateSettingsForm {

    private JPanel mContentPanel;
    private ComboBox<Lang> mPrimaryLanguage;
    private JBTextField mAppIdField;
    private JBPasswordField mAppKeyField;
    @SuppressWarnings("FieldCanBeLocal")
    private LinkLabel mGetApiKeyLink;

    private void createUIComponents() {

        mGetApiKeyLink = new ActionLink("", AllIcons.Ide.Link, new AnAction() {
            @Override
            public void actionPerformed(AnActionEvent anActionEvent) {
                BrowserUtil.browse(ConstantsKt.YOUDAO_AI_URL);
            }
        });
        mGetApiKeyLink.setPaintUnderline(false);
    }

    @NotNull
    public final JPanel getContentPanel() {
        return mContentPanel;
    }

    @NotNull
    public final ComboBox<Lang> getPrimaryLanguage() {
        return mPrimaryLanguage;
    }

    @NotNull
    public final JBTextField getAppIdField() {
        return mAppIdField;
    }

    @NotNull
    public final JBPasswordField getAppKeyField() {
        return mAppKeyField;
    }
}

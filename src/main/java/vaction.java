import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;


public class vaction extends AnAction {


    @Override
    public void actionPerformed( AnActionEvent event) {
        Messages.showMessageDialog("Hello","My plagin window",Messages.getInformationIcon());

    }
}
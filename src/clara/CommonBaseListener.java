package clara;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Maia on 3/27/2017.
 */

//Must be declared as abstract or implement
public abstract class CommonBaseListener implements ActionListener {
    private static boolean active = true;
    public static void setActive(boolean active){
        CommonBaseListener.active = active;
    }

    protected abstract void doPerformAction(ActionEvent e);

    @Override
    public final void actionPerformed(ActionEvent e){
        if (active){
            doPerformAction(e);
        }
    }

}

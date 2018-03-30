package hr.foi.rsc.lifeline.mvp.presenters;

import android.app.Activity;

/**
 * Created by dino on 22/11/14.
 */
public interface LoginPresenter extends BasePresenter {

    void authenticateUser(String username, String password);

    void authenticateUserFb(Activity activity);

    void authenticateUserTwitter(Activity activity);

    void resetPassword(String email);
}

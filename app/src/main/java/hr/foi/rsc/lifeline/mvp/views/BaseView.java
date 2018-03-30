package hr.foi.rsc.lifeline.mvp.views;

/**
 * Created by dino on 22/11/14.
 */
public interface BaseView {

    void showProgress();

    void hideProgress();

    void showError(String message);
}

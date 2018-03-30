package hr.foi.rsc.lifeline.mvp.presenters;

/**
 * Created by dino on 23/11/14.
 */
public interface ProfilePresenter extends BasePresenter {

    void saveData(String name, String surname, String address, String bloodType, String sex,
                  String additional, String rhType);

    void saveData(String address, String additional);
}

package com.basePackage_khaled.Meditor;

public class Button extends UIControl {
    private boolean isEnabled;



    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
       // owner.changed(this);
        notifyObserver();
    }
}

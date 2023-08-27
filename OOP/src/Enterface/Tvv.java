package Enterface;

interface  TVRemote {
   public void colr();
    public void PowerButton();
}

interface  SmartTvRemote extends TVRemote {

}

public class Tvv implements TVRemote {
    @Override
    public void colr() {

    }

    @Override
    public void PowerButton() {

    }
}

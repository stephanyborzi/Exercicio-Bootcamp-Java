public class Iphone implements MusicPlayer, Phone, WebBrowser {
    @Override
    public void playMusic(){
        System.out.println("Playing music on iphone");
    }
    @Override
    public void pauseMusic(){
        System.out.println("Pausing music on iphone");
    }
    @Override
    public void stopMusic(){
        System.out.println("Stopping music on iphone");
    }
    @Override
    public void makeCall(String phoneNumber){
        System.out.println("Calling" + phoneNumber + "on Iphone");
    }
    @Override
    public void receiveCall(){
        System.out.println("Receinving call on Iphone");
    }
    @Override
    public void endCall() {
        System.out.println("Ending call on iPhone");
    }

    @Override
    public void openPage(String url) {
        System.out.println("Opening " + url + " on iPhone");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page on iPhone");
    }

    @Override
    public void bookmarkPage(String url) {
        System.out.println("Bookmarking " + url + " on iPhone");
    }
}

public class Principal {
    public static void main(String[] args) {
        Iphone myiPhone =  new Iphone();
        System.out.println("Teste seu reprodutos musical: ");
        myiPhone.playMusic();
        myiPhone.pauseMusic();
        myiPhone.stopMusic();

        System.out.println("\nTeste do Aparelho Telefônico:");
        myiPhone.makeCall("123-456-7890");
        myiPhone.receiveCall();
        myiPhone.endCall();

        System.out.println("\nTeste do Navegador na Internet:");
        myiPhone.openPage("https://www.example.com");
        myiPhone.refreshPage();
        myiPhone.bookmarkPage("https://www.example.com");
    }
}

iPhone Simulation Project
Este projeto simula as funcionalidades básicas de um iPhone, incluindo reprodução de música, chamadas telefônicas e navegação na web.

Estrutura do Projeto
O projeto é composto pelas seguintes classes e interfaces:

Interfaces

MusicPlayer: Define os métodos para reprodução de música (playMusic(), pauseMusic(), stopMusic()).
Phone: Define os métodos para chamadas telefônicas (makeCall(String phoneNumber), receiveCall(), endCall()).
WebBrowser: Define os métodos para navegação na web (openPage(String url), refreshPage(), bookmarkPage(String url)).
Classe

Iphone: Implementa as interfaces MusicPlayer, Phone e WebBrowser. Contém a lógica para cada método definido nas interfaces.
Principal: Classe principal que cria uma instância de Iphone e testa suas funcionalidades.

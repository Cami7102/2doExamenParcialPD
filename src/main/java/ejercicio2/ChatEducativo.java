package ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class ChatEducativo implements Canal{
    Map<Chat, String> map = new HashMap<Chat, String>();

    public void addToChat(Chat chat){
        map.put(chat, String.valueOf(chat.getEstudiantes()));
    }

    @Override
    public void send(String msg, Chat chat) {
        Chat emisor = (Chat) chat;
        for(Chat c : map.keySet()){
            if(!emisor.getEstudiantes().equals(c.getEstudiantes())){
                if(emisor.getDocentes().equals(c.getDocentes()) && c.getAdministrativos().equals(c.getAdministrativos())){
                    c.received(msg);
                }else if(!emisor.getAdministrativos().equals(c.getAdministrativos())){
                    c.received(msg);
                }else if(emisor.getEstudiantes().equals(c.getEstudiantes())&& c.getAdministrativos().equals(c.getAdministrativos()) && c.getDocentes().equals(c.getDocentes())){
                    c.received(msg);
                }else if(!emisor.getDocentes().equals(c.getDocentes())){
                    c.received(msg);
                }else if(emisor.getAdministrativos().equals(c.getAdministrativos()) && c.getEstudiantes().equals(c.getEstudiantes())){
                    c.received(msg);
                }
            }
        }
    }
}

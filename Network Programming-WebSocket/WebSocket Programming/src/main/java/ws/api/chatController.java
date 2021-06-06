package ws.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin
public class chatController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    //@SendTo("/topic")
    //@SendToUser("/topic")
    public void chatEndpoint(@Payload wsMessage ws_message){
        System.out.println(ws_message);
        messagingTemplate.convertAndSend("/topic", ws_message);
    }














}

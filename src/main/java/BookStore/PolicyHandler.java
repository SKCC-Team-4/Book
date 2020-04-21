package BookStore;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverOrdered_BookChange(@Payload Ordered ordered){

        if(ordered.isMe()){
            System.out.println("##### listener BookChange : " + ordered.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverOrderChanged_BookChange(@Payload OrderChanged orderChanged){

        if(orderChanged.isMe()){
            System.out.println("##### listener BookChange : " + orderChanged.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverOrderCanceled_BookChange(@Payload OrderCanceled orderCanceled){

        if(orderCanceled.isMe()){
            System.out.println("##### listener BookChange : " + orderCanceled.toJson());
        }
    }

}

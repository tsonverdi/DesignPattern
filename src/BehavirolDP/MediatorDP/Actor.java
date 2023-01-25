package BehavirolDP.MediatorDP;

public interface Actor {

    void receiveMessage(String message);

    void sendMessage(String topic,String message);

}
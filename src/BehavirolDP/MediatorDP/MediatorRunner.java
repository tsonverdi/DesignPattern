package BehavirolDP.MediatorDP;

public class MediatorRunner {

    public static void main(String[] args) {
        MediatorRunner mediatorRunner = new MediatorRunner();
        mediatorRunner.mediatorDemo();
    }
    void mediatorDemo(){
        MessageDispatcher dispatcher = new MessageDispatcher(); //Daitici olusturduk

        Actor actor1 = new MessageActor("Actor 1",dispatcher);//Actorlere de isim ve daitici atadim
        Actor actor2 = new MessageActor("Actor 2",dispatcher);
        Actor actor3 = new MessageActor("Actor 3",dispatcher);
        Actor actor4 = new MessageActor("Actor 4",dispatcher);

        dispatcher.register("Topic 1",actor1);//actorlere register methodu ile topiclerini atadim. Yani actrolar hangi konularda ise kaydoldular
        dispatcher.register("Topic 2",actor2);
        dispatcher.register("Topic 3",actor3);
        dispatcher.register("Topic 4",actor4);

        actor1.sendMessage("Topic 2","Message for Topic 2");//Actor 1 messajlarini gonderdi.
        actor1.sendMessage("Topic 3","Message for Topic 3");
        actor1.sendMessage("Topic 4","Message for Topic 4");
    }

}

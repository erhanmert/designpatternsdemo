package observer;

import observer.interfaces.Observer;
import observer.model.EmailTopic;
import observer.model.EmailTopicSubscriber;

public class Main {
    public static void main(String [] args){
        EmailTopic emailTopic = new EmailTopic();

        Observer firstObserver = new EmailTopicSubscriber("firstObserver");
        Observer secondObserver = new EmailTopicSubscriber("secondObserver");
        Observer thirdObserver = new EmailTopicSubscriber("thirdObserver");

        emailTopic.register(firstObserver);
        emailTopic.register(secondObserver);
        emailTopic.register(thirdObserver);

        firstObserver.setSubject(emailTopic);
        secondObserver.setSubject(emailTopic);
        thirdObserver.setSubject(emailTopic);

        firstObserver.update();
       thirdObserver.update();

        emailTopic.postMessage("hello subscribers");
    }
}

package DesignPattern.Behavioral.ObserverPattern;


/**
 * The Observer Pattern is a design pattern where an object (called the subject) keeps a list of other objects (called observers)
 * that want to be notified when something changes in the subject. When the subject changes, it automatically notifies all its observers.
 *
 * Easy-to-Remember Definition:
 * "If one object changes, it automatically tells other objects that are interested."
 *
 * This pattern is like a news publisher and subscribers. When the news is updated, all subscribers get the latest news.
 */

public class ObserverPattern {

    public static void main(String[] args) {

        NewsChannel newsChannel=new NewsChannel();

        Subscriber subscriber1=new Subscriber("piyush");
        Subscriber subscriber2=new Subscriber("Ranjan");

        newsChannel.registeryObserver(subscriber1);
        newsChannel.registeryObserver(subscriber2);

        newsChannel.setNews("Blast On Israil");

        newsChannel.removeObserver(subscriber2);

        newsChannel.setNews("our subscriber ranjan removed");

    }
}

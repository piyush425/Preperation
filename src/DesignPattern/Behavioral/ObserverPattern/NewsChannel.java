package DesignPattern.Behavioral.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Subject{

    private String news;

    private List<Observer> observerList;

    public NewsChannel() {
        this.observerList=new ArrayList<>();
    }

    @Override
    public void registeryObserver(Observer observer) {

        observerList.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {

        observerList.remove(observer);

    }

    @Override
    public void notifyObserver() {

        for (Observer observer:observerList){
            observer.update(news);
        }


    }

    public void  setNews(String news){
        this.news=news;
        notifyObserver();

    }
}

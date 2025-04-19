// Mini Java Project: JavaLearningApp
// This project demonstrates fundamentals, data structures, concurrency, and JVM concepts
import java.util.*;

class User {
    private String name;
    private List<String> completedTopics = new ArrayList<>();
    public User(String name) { this.name = name; }
    public void completeTopic(String topic) {
        completedTopics.add(topic);
        System.out.println(name + " completed: " + topic);
    }
    public void showProgress() {
        System.out.println("Progress for " + name + ": " + completedTopics);
    }
}

class TopicThread extends Thread {
    private String topic;
    private User user;
    public TopicThread(User user, String topic) {
        this.user = user;
        this.topic = topic;
    }
    public void run() {
        user.completeTopic(topic);
    }
}

public class JavaLearningApp {
    public static void main(String[] args) throws InterruptedException {
        User me = new User("Tanyer");
        String[] topics = {"Java Fundamentals", "Data Structures", "Concurrency", "JVM Internals"};
        List<TopicThread> threads = new ArrayList<>();
        for (String topic : topics) {
            TopicThread t = new TopicThread(me, topic);
            threads.add(t);
            t.start();
        }
        for (Thread t : threads) {
            t.join();
        }
        me.showProgress();
        System.out.println("All topics completed! Ready for more advanced Java.");
    }
}

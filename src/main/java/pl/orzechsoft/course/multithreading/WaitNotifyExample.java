package pl.orzechsoft.course.multithreading;

class Chat {

  boolean flag = false;

  public synchronized void question(String msg) {
    if (flag) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println(msg);
    flag = true;
    notify();
  }

  public synchronized void answer(String msg) {
    if (!flag) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println(msg);
    flag = false;
    notify();
  }
}

class T1 implements Runnable {

  Chat chat;
  String[] s1 = {"Hi", "How are you ?", "I am also doing fine!"};

  public T1(Chat chat) {
    this.chat = chat;
    new Thread(this, "Question").start();
  }

  public void run() {
    for (int i = 0; i < s1.length; i++) {
      chat.question(s1[i]);
    }
  }
}

class T2 implements Runnable {

  Chat chat;
  String[] s2 = {"Hi", "I am good, what about you?", "Great!"};

  public T2(Chat chat) {
    this.chat = chat;
    new Thread(this, "Answer").start();
  }

  public void run() {
    for (int i = 0; i < s2.length; i++) {
      chat.answer(s2[i]);
    }
  }
}

public class WaitNotifyExample {

  public static void main(String[] args) {
    Chat chat = new Chat();
    new T1(chat);
    new T2(chat);
  }
}

package chapter06;
class Game {

    int n;
    boolean var = false;

    synchronized int pong() {
        if (!var) 
         {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        System.out.println("<--Pong ");
        var = false;
        try{
        Thread.sleep(1000);
        }
        catch(Exception e) {
        
        }
        notify();
        return n;
    }

    synchronized void ping() {
        if (var) { // if var = true
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        //this.n = n;
        var = true; // setting value to true
        System.out.println("Ping--> ");
        try{
        Thread.sleep(1000);
        }
        catch(Exception e) {
        }
        notify();
    }
}

class Player1 implements Runnable {

    Game q;

    Player1(Game q) {
        this.q = q;
        System.out.println("Player 1 ready...");
        new Thread(this, "Player1").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.pong();
        }
    }
}

class Player2 implements Runnable {

    Game q;

    Player2(Game q) {
        this.q = q;
        System.out.println("Player 2 ready...");
        new Thread(this, "Player2").start();
    }
    public void run() {
        while (true) {
            q.ping();
        }
    }
}

class Play {

    public static void main(String args[]) {
        Game q = new Game();
        System.out.println("Ping Pong Game");
        new Player1(q);
        new Player2(q);

    }
}
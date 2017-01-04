package kz.kaznitu.lessons.models.toshiba;


import kz.kaznitu.lessons.interfaces.Hand;

public class ToshibaHand implements Hand {
    public ToshibaHand() {
    }

    public void catchSomething(){
        System.out.println("Catched from Toshiba!");
    }

}
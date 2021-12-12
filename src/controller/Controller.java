package controller;

import model.Model;
import view.View;

import java.util.concurrent.BlockingQueue;

public class Controller {
    BlockingQueue<Message> queue;
    Model model;
    View view;

    public Controller(BlockingQueue<Message> queue, Model model, View view){
        this.queue = queue;
        this.model = model;
        this.view = view;
    }

    public void mainLoop(){
        while(view.isDisplayable()){
            Message message = null;
            try{
                message = queue.take();
            }catch (InterruptedException e){

            }
            if(message.getClass() == UpdatedMessage.class){
                UpdatedMessage updated = (UpdatedMessage) message;
                model.setValR(updated.getValR());
                model.setValG(updated.getValG());
                model.setValB(updated.getValB());
                view.updateView(model.getValR(),model.getValG(), model.getValB());
            }else if(message.getClass() == ResetMessage.class){
                view.updateView(model.getValR(),model.getValG(),model.getValB());
            }
        }
    }
}

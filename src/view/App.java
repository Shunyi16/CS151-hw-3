package view;

import controller.Controller;
import controller.Message;
import model.Model;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class App {


    public static void main(String[] args) {

        BlockingQueue<Message> queue = new LinkedBlockingDeque<>();
        Model model = new Model();
        View view = new View(queue);
        Controller controller = new Controller( queue, model, view);
        controller.mainLoop();

    }
}

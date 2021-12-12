package controller;

public class UpdatedMessage implements Message{
    int numRed;
    int numGreen;
    int numBlue;

    public UpdatedMessage(int red, int green, int blue) {
        this.numRed = red;
        this.numGreen = green;
        this.numBlue = blue;
    }

    public int getValR(){
        return numRed;
    }

    public int getValG(){
        return numGreen;
    }

    public int getValB(){
        return numBlue;
    }


}

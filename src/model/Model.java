package model;

public class Model {
    int numRed, numGreen, numBlue;

    public void setValR(int numR){
        if(numR == 0) {
            this.numRed = 0;
        }else if (numR != numRed && numR > 0){
            this.numRed = numR;
        }
    }

    public void setValG(int numG){
        if(numG == 0) {
            this.numGreen = 0;
        }else if (numG != numGreen && numG > 0){
            this.numGreen = numG;
        }
    }

    public void setValB(int numB){
        if(numB == 0) {
            this.numBlue = 0;
        }else if (numB != numBlue && numB > 0){
            this.numBlue = numB;
        }
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

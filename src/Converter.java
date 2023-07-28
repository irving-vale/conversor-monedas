public class Converter {
    private boolean isEnd = false;


    public void processConver(Iconverter strategy){
        strategy.calculaConversion();
    }


    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd() {
        isEnd = true;
    }
}

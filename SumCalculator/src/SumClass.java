public class SumClass {
    private double firstNumber;
    private double secondNumber;
    public double getAdditionResult() {
        return getFirstNumber() + getSecondNumber();
    }
    public double getMultiplicationResult() {
        return getFirstNumber()*getSecondNumber();
    }
    public double getSubtractionResult() {
        return getFirstNumber()-getSecondNumber();
    }
    public double getDivisionResult() {
        if(getSecondNumber() == 0) return 0;
        return getFirstNumber()/getSecondNumber();
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }

}

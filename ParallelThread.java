package Ques02B;

public class ParallelThread implements Runnable{

    private Calculation myCalc;
    private int start;
    private int end;

    
    public ParallelThread(Calculation myCalc, int start, int end) {
        this.myCalc = myCalc;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

        synchronized(ParallelThread.class)
        {
            myCalc.Factorial(start, end);
        }
        
    }

    
    
}

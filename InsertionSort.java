
/**
 * Write a description of class InsertionSort here.
 * 
 * @author Simon Gebert 
 * @version 2017-02-19
 */
public class InsertionSort extends BasicSort implements ISorter
{
    int curI, curK;
    
    /**
     * Constructor
     */
    public InsertionSort(SortCanvas p )
    {
        super(p);        
    }

    /**
     * sorts the data loaded in canvas
     * to animate and highlight the process, use
     *   canvas.hlA, canvas.hlB, canvas.hlC, canvas.hlD : assign index of element to be highlighted by eihter color A,B,C or D).
     *   canvas.redraw() : force redraw of the canvas (changes will be updated on canvas).
     *   canvas.delay() : canvas will be redrawn about every 60fps. Delay redraw for (initially) 1 second. 
     *                    canvas.delay(period: int) will delay for period milliseconds.
     *   cavas.reset() : reset highlighted entries to none.
     */
    public void sort(){
        int[] data = canvas.getData();
         curI = 0;
         curK = 1;
         
         while (curK < data.length) {
            if(data[curK]   > data[curI]) {
                swap(curK,curI);
                canvas.redraw();
                while(curI > 0){
                    if(data[curI] < data[curI-1]){
                        swap(curI, curI-1);
                        canvas.redraw();
                        curI = curI -1;
                        
                    }
                }
            }   
                curI = curK;
                curK= curK +1;
            
            }
        
        //TODO: implement sort algorithm. You may use curI, curK as loop variables or define your own attributes.
        canvas.reset();
        canvas.redraw();
    }

}

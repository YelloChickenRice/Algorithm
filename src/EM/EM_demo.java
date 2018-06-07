
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.*;
public class EM_demo{
    private double p[][];
    private int inputData[][];
    private Worker[] workers;

    private int worker_num=5;
    private int pic_num=10;
    private int mark_num=3;

    public EM_demo(){
        init();
    }
    public void init(){
        p=new double[pic_num][mark_num];    //五张图片三个标注
        workers=new Worker[worker_num];   //五个工人
        for(int i=0;i<worker_num;i++){
            workers[i]=new Worker(mark_num);
        }
        inputData=new int[pic_num][worker_num];
        File data=new File("data");
        BufferedReader bf=new BufferedReader(new FileReader(data));
        for(int i=0;i<pic_num;i++){
            String oneline=bf.readLine();
            int[] oneMarkData=oneline.split(" ");
            for(int m=0;m<mark_num;m++){
                inputData[i][m]=oneMarkData[m];
            }
        }
    }    
    
    public void E_step(){
        // TODO
    }

    public void M_step(){
        // TODO
    }

    public void printResult(){
        // TODO
    }

    public static void main(String[] args) {
        EM_demo em_demo=new EM_demo();
        em_demo.printResult();
        System.out.print("Success!");
    }

}

class Worker{

    private double workerData[][];
    private int mark_num;
    worker(int i){
        workerData=new double[i][i];
        mark_num=i;
        init();
    }
    private void init(){
        for(int count_i=0;count_i<mark_num;count_i++){
            for(int count_j=0;count_j<mark_num;count_j++){
                if(count_i==count_j){
                    workerData[count_i][count_j]=1;
                }else{
                    workerData[count_i][count_j]=0;
                }
            }
        }
    }
}
package Z_New_era.H_Threads.A_ThreadsCreate;

public class Counter extends Thread{

    public String name;
    public Counter(String name){
        this.name = name;

    }

    @Override
    public void run() {

        System.out.println(this.name + " Çalıştı !");

        for (int i = 0 ; i < 100 ; i++){
            System.out.println(this.name+ " : " + i+ ",");
        }
    }
}

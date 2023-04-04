public class complex {
int r;
int i;
    complex(int real,int img){
    r=real;
    i=img;
    }
    void display(){

    System.out.println(r+"+"+i+"i");
    }
    static void add(int r1,int i1,int r2,int i2 ){
        r1=r1+r2;
        i1=i1+i2;
        System.out.println("After Addition = "+r1+"+"+i1+"i");
    }
    public static void main(String[] args) {
 System.out.println("Name: SARANYA MOHAN\n Regno: SJC22MCA-2049 \n Course Code:20MCA132\n Date: 24/03/2023");
        complex first=new complex(5,4);
        complex second=new complex(7,9);
        System.out.println("Complex Numbers are:");
        first.display();
        second.display();
        add(first.r,first.i,second.r,second.i);
    }
    
}


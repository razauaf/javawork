package bubble.java;
public class BubbleJava {
    public static void main(String[] args) {
int array[]={-112,-115,11,6,9};
int a,b,t;
int size=5;
//for(int i=0;i<size;i++)
//System.out.println( " "   +array[i]);
for( a=0;a<size;a++){
        for(b=size-1;b>a;b--){
              if(array[b-1]>array[b]){
                  t=array[b-1];
                     array[b-1]=array[b];
                         array[b]=t;
                          }
                              }
                                  }
              for(int i=0;i<size;i++)
                  System.out.println(" "+array[i]); 

}
}
    
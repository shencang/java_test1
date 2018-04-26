public class Text3_and {
    long num;
    public long display(long get){
        num=get;
        long result=0;

        for(int i = 1;i<10;i++){
            num= (num*10+get);
            result=result+num;
        }

        return result+get;
    }
}

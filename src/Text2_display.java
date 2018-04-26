public class Text2_display {

    int line;

    public void display(int line){
        this.line= line;
        int num=0;
        for(int i=0;i<=this.line;i++){
            for (int j=0;j<=i;j++){
                if (j==i){
                    System.out.println();
                }
                else{
                    System.out.print("*");
                }
            }

        }

    }
}

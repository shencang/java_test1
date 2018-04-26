public class Test1_grade {

    public String grade(int data){

        if(data<=100&&data>=90){
            return "优";
        }
        if(data<=89&&data>=80){
            return "良";
        }
        if(data<=79&&data>=70){
            return "中";
        }
        if(data<=69&&data>=60){
            return "及格";
        }
        if(data<60){
            return "不及格";
        }

        return "有错误";
    }
}

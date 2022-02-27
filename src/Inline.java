import java.util.ArrayList;

public class Inline {
    ArrayList<String> context=new ArrayList<>();
    String func_name;
    boolean is_delete=false;
    int start;
    int end;
    int del_start;
    int del_end;
    Inline(String func_name,ArrayList<String> context,int start,int end){
        this.context=context;
        this.func_name=func_name;
        this.start=start;
        this.end=end;
    }
    Inline(){}
}

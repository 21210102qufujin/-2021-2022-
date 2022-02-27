import java.util.ArrayList;

public class Symbol {
    String old_name;
    String new_name;
    int num;
    int layer;
    boolean isconst;
    //var,void_func,i32_func,one_array,two_array,func_one_array,func_two_array
    String type="var";
    int array1=0;
    int array2=0;
    int array_long_for_two;
    ArrayList<Funcfparam> params=new ArrayList<>();
    Boolean is_connect=true;
    Symbol(String old_name, String new_name, int layer) {
        this.old_name = old_name;
        this.new_name = new_name;
        this.num = 0;
        this.layer = layer;
        this.isconst = false;
    }
    Symbol(){}

}

public class Symbol {
    String old_name;
    String new_name;
    int num;
    int layer;
    boolean isconst;

    Symbol(String old_name, String new_name, int layer) {
        this.old_name = old_name;
        this.new_name = new_name;
        this.num = 0;
        this.layer = layer;
        this.isconst = false;
    }
}

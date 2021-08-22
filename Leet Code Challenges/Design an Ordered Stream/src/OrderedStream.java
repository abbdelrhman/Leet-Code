import java.util.ArrayList;
import java.util.List;

class OrderedStream {

    private int lo = 1;
    private String[] vals;

    public OrderedStream(int n) {
        vals = new String[n+1];
    }

    public List<String> insert(int idKey, String value) {
        vals[idKey] = value;

        ArrayList<String > retList = new ArrayList<>();
        while (lo < vals.length && vals[lo] != null) {
            retList.add(vals[lo++]);
        }
        return retList;
    }
}

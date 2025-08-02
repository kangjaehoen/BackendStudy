package finalkeyword;

import java.util.ArrayList;
import java.util.List;

public class ListObject {
    private final List<String> list;

    public ListObject(List<String> list){
        this.list = new ArrayList<>(list);
    }

    public List<String> getList(){
        return new ArrayList<>(list);
    }
}
